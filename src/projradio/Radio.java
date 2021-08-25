package projradio;

public class Radio {

    private String nome;
    private double estacao;
    private int volume;
    
    public Radio(){
        this.volume=50;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getEstacao() {
        return estacao;
    }

    public void setEstacao(double estacao) {
        this.estacao = estacao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void trocarEstacao(String nome, double estacao) {
        this.estacao = estacao;
        this.nome = nome;
    }

    public void aumentarVolume() {
        this.volume += 5;
    }

    public void diminuirVolume() {
        this.volume -= 5;
    }

    @Override
    public String toString() {
        return "\nDados do Rádio\n"
                + "Nome: " + nome + "\n"
                + "Estação: " + estacao + "\n"
                + "Volume: " + volume;
    }

}
