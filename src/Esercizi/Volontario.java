package Esercizi;

public class Volontario implements CheckIn {
    private final String nome;

    public Volontario(String nome, int ignoredEta, String ignoredCv) {
        this.nome = nome;
    }

    public void checkIn() {
        System.out.println("Esercizi.Volontario " + nome + " ha iniziato il servizio.");
    }
}