package Rpg;

import org.w3c.dom.ls.LSOutput;

public class Classe extends Personagem {

    protected int vidaPontos;
    protected int magiaPontos;
    protected int modForça = Math.floorDiv(força -10, 2);
    protected int modDestreza = Math.floorDiv(destreza -10, 2);
    protected int modConstituição = Math.floorDiv(constituição -10, 2);
    protected int modSabedoria = Math.floorDiv(sabedoria -10, 2);
    protected int modInteligencia = Math.floorDiv(inteligência -10, 2);
    protected int modCarisma = Math.floorDiv(carisma -10, 2);
    protected int periciasEspaços;

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

    public int getModForça() {
        return modForça;
    }

    public void setModForça(int modForça) {
        this.modForça = modForça;
    }

    public int getModDestreza() {
        return modDestreza;
    }

    public void setModDestreza(int modDestreza) {
        this.modDestreza = modDestreza;
    }

    public int getModConstituição() {
        return modConstituição;
    }

    public void setModConstituição(int modConstituição) {
        this.modConstituição = modConstituição;
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

    public int getPericiasEspaços() {
        return periciasEspaços;
    }

    public void setPericiasEspaços(int periciasEspaços) {
        this.periciasEspaços = periciasEspaços;
    }

    public int calculoModificador(int numAtributo) {
        return (numAtributo - 10) / 2;
    }

    public void barbaro() {
        vidaPontos = 24 + getModConstituição();
        magiaPontos = 3;
        periciasEspaços = 4;
    }

    public void bardo() {
        vidaPontos = 12 + getModConstituição();
        magiaPontos = 4;
        periciasEspaços = 6;
    }

    public void ladino() {
        vidaPontos = 12 + getModConstituição();
        magiaPontos = 4;
        periciasEspaços = 8;
    }

    /*public void stats() {
        System.out.println(getVidaPontos());
        System.out.println(getMagiaPontos());
        System.out.println(getPericiasEspaços());
        System.out.println(getForça());
        System.out.println(getDestreza());
        System.out.println(getConstituição());
        System.out.println(getSabedoria());
        System.out.println(getInteligência());
        System.out.println(getCarisma());
    }*/
}
