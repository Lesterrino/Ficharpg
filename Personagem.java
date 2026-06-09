package Rpg;

public class Personagem {

    protected String raça;
    protected int deslocamento;
    protected int cd;
    protected int vidaPontos;
    protected int magiaPontos;
    protected int pontosDeAtributos = 20;
    protected int força;
    protected int destreza;
    protected int constituição;
    protected int sabedoria;
    protected int inteligência;
    protected int carisma;

    public Personagem(String raça, int deslocamento, int cd, int pv, int pm) {
        this.raça = raça;
        this.deslocamento = deslocamento;
        this.cd = cd;
        this.vidaPontos = pv;
        this.magiaPontos = pm;
    }

    public Personagem() {}

    public String getRaça() {
        return raça;
    }

    public void setRaça(String nome) {
        this.raça = nome;
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
        return vidaPontos;
    }

    public void setPv(int pv) {
        this.vidaPontos = pv;
    }

    public int getPm() {
        return magiaPontos;
    }

    public void setPm(int pm) {
        this.magiaPontos = pm;
    }

    public int getPontosDeAtributos() {
        return pontosDeAtributos;
    }

    public void setPontosDeAtributos(int pontosDeAtributos) {
        this.pontosDeAtributos = pontosDeAtributos;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituição() {
        return constituição;
    }

    public void setConstituição(int constituição) {
        this.constituição = constituição;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getInteligência() {
        return inteligência;
    }

    public void setInteligência(int inteligência) {
        this.inteligência = inteligência;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public void atributosHumano() {
        this.pontosDeAtributos += 2;
    }

    public void atributosElfo() {
        this.inteligência += 4;
        this.destreza += 2;
        this.constituição -= 2;
    }

    public void atributosAnao() {
        this.constituição += 4;
        this.sabedoria += 2;
        this.destreza -= 2;
    }
}
