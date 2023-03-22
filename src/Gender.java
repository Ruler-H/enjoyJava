public enum Gender {
    MALE("XY"),
    FAMALE("XX");

    private String chromosome;

    @Override
    public String toString() {
        return "Gender{" +
                "chromosome='" + chromosome + '\'' +
                '}';
    }

    public void print() {
        System.out.println("염색체 : " + chromosome);
    }

    private Gender(String Chromosome) {
        this.chromosome = Chromosome;
    }
}
