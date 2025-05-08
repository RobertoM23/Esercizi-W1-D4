package Esercizi;

public abstract class Dipendente implements CheckIn {
    private String matricola;
    private double stipendio;
    private String dipartimento;

    public Dipendente(String matricola, double stipendio, String dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();

    public void checkIn() {
        System.out.println("Esercizi.Dipendente " + matricola + " ha fatto check-in.");
    }
}