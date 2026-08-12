package Rpg;

public class Classe extends Origem {

    protected int vidaPontos;
    protected int magiaPontos;
    protected int modForca;
    protected int modDestreza;
    protected int modConstituicao;
    protected int modSabedoria;
    protected int modInteligencia;
    protected int modCarisma;
    protected int periciasEspacos;

    public int getVidaPontos() {
        return vidaPontos;
    }

    public void setVidaPontos(int vidaPontos) {
        this.vidaPontos = vidaPontos;
    }

    public int getMagiaPontos() {
        return magiaPontos;
    }

    public void setMagiaPontos(int magiaPontos) {
        this.magiaPontos = magiaPontos;
    }

    public int getModForca() {
        return modForca;
    }

    public void setModForca(int modForca) {
        this.modForca = modForca;
    }

    public int getModDestreza() {
        return modDestreza;
    }

    public void setModDestreza(int modDestreza) {
        this.modDestreza = modDestreza;
    }

    public int getModConstituicao() {
        return modConstituicao;
    }

    public void setModConstituicao(int modConstituicao) {
        this.modConstituicao = modConstituicao;
    }

    public int getModSabedoria() {
        return modSabedoria;
    }

    public void setModSabedoria(int modSabedoria) {
        this.modSabedoria = modSabedoria;
    }

    public int getModInteligencia() {
        return modInteligencia;
    }

    public void setModInteligencia(int modInteligencia) {
        this.modInteligencia = modInteligencia;
    }

    public int getModCarisma() {
        return modCarisma;
    }

    public void setModCarisma(int modCarisma) {
        this.modCarisma = modCarisma;
    }

    public int getPericiasEspacos() {
        return periciasEspacos;
    }

    public void setPericiasEspacos(int periciasEspacos) {
        this.periciasEspacos = periciasEspacos;
    }

    public int calculoModificador(int numAtributo) {
        return (numAtributo - 10) / 2;
    }

    public void barbaro() {
        vidaPontos = 24 + getModConstituicao();
        magiaPontos = 3;
        periciasEspacos = 4;
    }

    public void bardo() {
        vidaPontos = 12 + getModConstituicao();
        magiaPontos = 4;
        periciasEspacos = 6;
    }

    public void ladino() {
        vidaPontos = 12 + getModConstituicao();
        magiaPontos = 4;
        periciasEspacos = 8;
    }
}
