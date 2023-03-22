package com.example.webServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws Exception{
        // 클라이언트가 접속할 때까지 대기
        ServerSocket serverSocket = new ServerSocket(10000);
        System.out.println("1");
        try {
            while (true) {
                Socket clientSocket = serverSocket.accept(); // 대기
                System.out.println("2");

                ClientThread ct = new ClientThread(clientSocket);
                ct.start();
            }
        }finally {
            serverSocket.close();
        }
    }
}

class ClientThread extends Thread {
    private Socket clientSocket;

    public ClientThread(Socket clinetSocket) {
        this.clientSocket = clinetSocket;
    }

    public void run(){
        try {
            InputStream in = clientSocket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream));

            // http://localhost:10000/hello 라고 요청하면
            // GET /hello HTTP/1.1이라고 요청이 전달됨
            String firstLine = br.readLine();
            String msg = "";
            if (firstLine.indexOf("/hello") >= 0) {
                msg = "hello";
            } else if (firstLine.indexOf("/hi") >= 0) {
                msg = "hi";
            }

            String line = null;
            while (!(line = br.readLine()).equals("")) {
                System.out.println(line);
            }

            pw.println("HTTP/1.1 200 OK");
            pw.println("name:kim");
            pw.println("email.urstory@gmail.com");
            pw.println();

            // GET /hello HTTP/1.1 의 요청이 왔을 때 /pf.png에 대한 파일을 읽어서 출력한다.
            pw.println("<html>");
            pw.println(msg + " !!!!");
            pw.println("</html>");
            pw.flush();
            br.close();
            pw.close();
            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}