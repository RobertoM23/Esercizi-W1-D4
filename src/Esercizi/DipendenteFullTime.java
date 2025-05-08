package Esercizi;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String matricola, double stipendio, String dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    public double calculateSalary() {
        return getStipendio();
    }
}