package Esercizi;

public class Main {
    public static void main(String[] args) {
        Dipendente d1 = new DipendenteFullTime("A001", 2000, "PRODUZIONE");
        Dipendente d2 = new DipendentePartTime("B002", 0, "VENDITE", 80, 15);
        Dipendente d3 = new Dirigente("C003", 3000, "AMMINISTRAZIONE");

        Volontario v1 = new Volontario("Luca", 25, "CV1");
        Volontario v2 = new Volontario("Anna", 30, "CV2");

        CheckIn[] persone = {d1, d2, d3, v1, v2};

        for (CheckIn p : persone) {
            p.checkIn();
        }

        double totale = 0;
        for (CheckIn p : persone) {
            if (p instanceof Dipendente dip) {
                totale += dip.calculateSalary();
                System.out.println("Matricola: " + dip.getMatricola() + " - Salario: " + dip.calculateSalary());
            }
        }

        System.out.println("Totale stipendi: " + totale);
    }
}