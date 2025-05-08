package Esercizi;

public abstract class Dipendente implements CheckIn {
    private final String matricola;
    private final double stipendio;

    public Dipendente(String matricola, double stipendio, String ignoredDipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public abstract double calculateSalary();

    public void checkIn() {
        System.out.println("Esercizi.Dipendente " + matricola + " ha fatto check-in.");
    }

}