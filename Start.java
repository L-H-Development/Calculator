class Start {

    public static void main(String[] args) {
        System.out.println("Somma: " + somma(5, 3));
        System.out.println("Sottrazione: " + sottrai(5, 3));
        System.out.println("Moltiplicazione: " + moltiplica(5, 3));
        System.out.println("Divisione: " + dividi(6, 3));
    }

    static double somma(double a, double b) {
        return a + b;
    }

    static double sottrai(double a, double b) {
        return a - b;
    }

    static double moltiplica(double a, double b) {
        return a * b;
    }

    static double dividi(double a, double b) {
        return a / b;
    }
}
