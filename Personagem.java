package Rpg;

public class Personagem {

    protected String raca;
    protected int deslocamento;
    protected int cd;
    protected int vidaPontos;
    protected int magiaPontos;
    protected int pontosDeAtributos = 20;
    protected int pontosDeAtributos1 = 20;
    protected int forca;
    protected int destreza;
    protected int constituicao;
    protected int sabedoria;
    protected int inteligencia;
    protected int carisma;
    protected int forca2;
    protected int destreza2;
    protected int constituicao2;
    protected int sabedoria2;
    protected int inteligencia2;
    protected int carisma2;
    protected String racaPersonagem;

    public Personagem(String raca, int deslocamento, int cd, int pv, int pm) {
        this.raca = raca;
        this.deslocamento = deslocamento;
        this.cd = cd;
        this.vidaPontos = pv;
        this.magiaPontos = pm;
    }

    public Personagem() {}

    public String getRaca() {
        return raca;
    }

    public void setRaca(String nome) {
        this.raca = nome;
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

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getForca2() {
        return forca2;
    }

    public void setForca2(int forca2) {
        this.forca2 = forca2;
    }

    public int getDestreza2() {
        return destreza2;
    }

    public void setDestreza2(int destreza2) {
        this.destreza2 = destreza2;
    }

    public int getConstituicao2() {
        return constituicao2;
    }

    public void setConstituicao2(int constituicao2) {
        this.constituicao2 = constituicao2;
    }

    public int getSabedoria2() {
        return sabedoria2;
    }

    public void setSabedoria2(int sabedoria2) {
        this.sabedoria2 = sabedoria2;
    }

    public int getInteligencia2() {
        return inteligencia2;
    }

    public void setInteligencia2(int inteligencia2) {
        this.inteligencia2 = inteligencia2;
    }

    public int getCarisma2() {
        return carisma2;
    }

    public void setCarisma2(int carisma2) {
        this.carisma2 = carisma2;
    }

    public String getRacaPersonagem() {
        return racaPersonagem;
    }

    public void setRacaPersonagem(String racaPersonagem) {
        this.racaPersonagem = racaPersonagem;
    }

    public void atributosHumano(){
        this.pontosDeAtributos += 2;
    }

    public void atributosElfo() {
        this.inteligencia += 4;
        this.destreza += 2;
        this.constituicao -= 2;
    }

    public void atributosAnao() {
        this.constituicao += 4;
        this.sabedoria += 2;
        this.destreza -= 2;
    }
}
