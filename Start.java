class Start {

    public static void main(String[] args) {
        double risultatoSomma = somma(5, 3);
        double risultatoSottrazione = sottrai(5, 3);

        System.out.println("Somma: " + risultatoSomma);
        System.out.println("Sottrazione: " + risultatoSottrazione);
    }

    static double somma(double a, double b) {
        return a + b;
    }

    static double sottrai(double a, double b) {
        return a - b;
    }
}
