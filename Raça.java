package Rpg;

public abstract class Raça{

    protected String nome;
    protected int deslocamento;
    protected int cd;
    protected int pv;
    protected int pm;
    protected int idade;
    protected int altura;

    public Raça(String nome, int deslocamento, int cd, int pv, int pm,
                    int idade, int altura){
        this.nome = nome;
        this.deslocamento = deslocamento;
        this.cd = cd;
        this.pv = pv;
        this.pm = pm;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(int deslocamento) {
        this.deslocamento = deslocamento;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getPm() {
        return pm;
    }

    public void setPm(int pm) {
        this.pm = pm;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}