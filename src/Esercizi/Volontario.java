package Esercizi;

public class Volontario implements CheckIn {
    private String nome;
    private int eta;
    private String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    public void checkIn() {
        System.out.println("Esercizi.Volontario " + nome + " ha iniziato il servizio.");
    }
}