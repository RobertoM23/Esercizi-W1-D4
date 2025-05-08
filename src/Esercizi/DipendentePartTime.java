package Esercizi;

public class DipendentePartTime extends Dipendente {
    private final int oreLavorate;
    private final double pagaOraria;

    public DipendentePartTime(String matricola, double stipendioBase, String dipartimento, int ore, double paga) {
        super(matricola, stipendioBase, dipartimento);
        this.oreLavorate = ore;
        this.pagaOraria = paga;
    }

    public double calculateSalary() {
        return oreLavorate * pagaOraria;
    }
}