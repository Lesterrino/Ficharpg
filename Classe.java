package Rpg;

public class Classe extends Personagem{

    protected int periciasEspaços;

    public int getPericiasEspaços() {
        return periciasEspaços;
    }

    public void setPericiasEspaços(int periciasEspaços) {
        this.periciasEspaços = periciasEspaços;
    }

    public void barbaro() {
        vidaPontos = 24 + getModConstituição();
        magiaPontos = 6 + getModConstituição();
        periciasEspaços = 8;
    }
}
