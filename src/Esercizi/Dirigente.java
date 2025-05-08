package Esercizi;

public class Dirigente extends Dipendente {
    public Dirigente(String matricola, double stipendio, String dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    public double calculateSalary() {
        return getStipendio() * 1.2;
    }
}