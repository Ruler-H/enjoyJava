package com.example.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressExam {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getLocalHost(); // 내 컴퓨터의 IP 정보
            System.out.println(ia.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            InetAddress[] iaArray = InetAddress.getAllByName("www.google.com");
            for (InetAddress ia : iaArray) {
                System.out.println(ia.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
