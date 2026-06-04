package Rpg;

public class Personagem{

    protected String nome;
    protected int deslocamento;
    protected int cd;
    protected int pv;
    protected int pm;
    protected int idade;
    protected int altura;

    public Personagem(String nome, int deslocamento, int cd, int pv, int pm,
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

class Atributos{

    protected int pontosDeAtributos = 20;
    protected int[] atributos = new int[6];

    public int[] getAtributos() {
        return atributos;
    }

    public void setAtributos(int[] atributos) {
        this.atributos = atributos;
    }

    public void atributosHumano(){
        this.pontosDeAtributos += 2;
    }
    public void atributosElfo(){
        this.atributos[4] += 4;
        this.atributos[1] += 2;
        this.atributos[2] -= 2;
    }

    public void atributosAnao(){
        this.atributos[2] += 4;
        this.atributos[3] += 2;
        this.atributos[1] -= 2;
    }
}