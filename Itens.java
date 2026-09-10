package Rpg;

public class Itens extends Classe{

    protected String armaSimples;
    protected boolean armaSimplesVerificador = true;
    protected String armaSimplesEscolhida;
    protected String armaMarcial;
    protected boolean armaMarcialVerificador = true;
    protected String armaMarcialEscolhida;
    protected String armadura;
    protected boolean armaduraVerificador = true;
    protected String armaDuraEscolhida;
    protected String leitorItem;

    public String getArmaSimples() {
        return armaSimples;
    }

    public void setArmaSimples(String armaSimples) {
        this.armaSimples = armaSimples;
    }

    public String getArmaSimplesEscolhida() {
        return armaSimplesEscolhida;
    }

    public void setArmaSimplesEscolhida(String armaSimplesEscolhida) {
        this.armaSimplesEscolhida = armaSimplesEscolhida;
    }

    public boolean isArmaSimplesVerificador() {
        return armaSimplesVerificador;
    }

    public void setArmaSimplesVerificador(boolean armaSimplesVerificador) {
        this.armaSimplesVerificador = armaSimplesVerificador;
    }

    public String getArmaMarcial() {
        return armaMarcial;
    }

    public void setArmaMarcial(String armaMarcial) {
        this.armaMarcial = armaMarcial;
    }

    public String getArmaMarcialEscolhida() {
        return armaMarcialEscolhida;
    }

    public void setArmaMarcialEscolhida(String armaMarcialEscolhida) {
        this.armaMarcialEscolhida = armaMarcialEscolhida;
    }

    public boolean isArmaMarcialVerificador() {
        return armaMarcialVerificador;
    }

    public void setArmaMarcialVerificador(boolean armaMarcialVerificador) {
        this.armaMarcialVerificador = armaMarcialVerificador;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public String getArmaDuraEscolhida() {
        return armaDuraEscolhida;
    }

    public void setArmaDuraEscolhida(String armaDuraEscolhida) {
        this.armaDuraEscolhida = armaDuraEscolhida;
    }

    public boolean isArmaduraVerificador() {
        return armaduraVerificador;
    }

    public void setArmaduraVerificador(boolean armaduraVerificador) {
        this.armaduraVerificador = armaduraVerificador;
    }

    public String getLeitorItem() {
        return leitorItem;
    }

    public void setLeitorItem(String leitorItem) {
        this.leitorItem = leitorItem;
    }

    public void mensagemItensPrimarios() {
        System.out.println("\nAgora vamos ver quais itens irão lhe acompanhar nessa jornada" +
                            "\ne quais itens você poderá escolher para lhe acompanharem.\n" +
                            "\nSeus itens iniciais são:\n" +
                            "\n(1) Uma mochila;" +
                            "\n(1) Um saco de dormir;" +
                            "\n(1) Um traje de viajante;");
    }

    public void armaSimplesMensagem() {
        System.out.println("Da lista abaixo, escolha uma arma simples:" +
                            "\nAdaga  -  Espada curta  -  Foice  -  Manopla  -  Clava" +
                            "\nLança   -   Maça   -   Bordão   -   Pique   -   Tacape" +
                            "\nArco curto   -   Besta  leve   -   Azagaia   -   Funda");
    }

    public void escolherArmaSimples(String leitorItem) {
        switch (leitorItem) {
            case "adaga":
                armaSimples = "Adaga - 1d4 de dano";
                armaSimplesEscolhida = "adaga";
                break;
            case "espada curta":
                armaSimples = "Espada curta 1d6 de dano";
                armaSimplesEscolhida = "espada curta";
                break;
            case "foice":
                armaSimples = "Foice - 1d6 de dano";
                armaSimplesEscolhida = "foice";
                break;
            case "manopla":
                armaSimples = "Manopla - 1d3 de dano";
                armaSimplesEscolhida = "manopla";
                break;
            case "clava":
                armaSimples = "Clava - 1d6 de dano";
                armaSimplesEscolhida = "clava";
                break;
            case "lanca", "lança":
                armaSimples = "Lança - 1d6 de dano";
                armaSimplesEscolhida = "lança";
                break;
            case "maca", "maça":
                armaSimples = "Maça - 1d8 de dano";
                armaSimplesEscolhida = "maça";
                break;
            case "bordao", "bordão":
                armaSimples = "Bordão - 1d6 de dano";
                armaSimplesEscolhida = "bordão";
                break;
            case "pique":
                armaSimples = "Pique - 1d8 de dano";
                armaSimplesEscolhida = "pique";
                break;
            case "tacape":
                armaSimples = "Tacape - 1d10 de dano";
                armaSimplesEscolhida = "tacape";
                break;
            case "arco curto":
                armaSimples = "Arco curto - 1d6 de dano";
                armaSimplesEscolhida = "arco curto";
                break;
            case "besta leve":
                armaSimples = "Besta leve - 1d8 de dano";
                armaSimplesEscolhida = "besta leve";
                break;
            case "azagaia":
                armaSimples = "Azagaia - 1d6 de dano";
                armaSimplesEscolhida = "azagaia";
                break;
            case "funda":
                armaSimples = "Funda - 1d4 de dano";
                armaSimplesEscolhida = "funda";
                break;
            default:
                System.out.println("Digite corretamente o nome do item.");
                armaSimplesVerificador = false;
        }
    }

    public void armaMarcialMensagem() {
        System.out.println("Da lista abaixo, escolha uma arma marcial:" +
                            "\nEscudo leve  -  Machadinha  -  Cimitarra  -  Florete" +
                            "\nEscudo pesado - Espada longa   -  Mangual - Picareta" +
                            "\nMachado de  batalha - Martelo de guerra  -  Tridente" +
                            "\nAlabarda  -  Alfange   -   Gadanho  -  Lança montada" +
                            "\nMachado de guerra    -   Montante    -    Arco longo" +
                            "\n                    Besta pesada                    ");
    }

    public void escolherArmaMarcial(String leitorItem) {
        switch(leitorItem) {
            case "escudo leve":
                armaMarcial = "Escudo leve - 1d4 de dano";
                armaMarcialEscolhida = "escudo leve";
                break;
            case "machadinha":
                armaMarcial = "Machadinha - 1d6 de dano";
                armaMarcialEscolhida = "machadinha";
                break;
            case "cimitarra":
                armaMarcial = "Cimitarra - 1d6 de dano";
                armaMarcialEscolhida = "cimitarra";
                break;
            case "escudo pesado":
                armaMarcial = "Escudo pesado - 1d6 de dano";
                armaMarcialEscolhida = "escudo pesado";
                break;
            case "espada longa":
                armaMarcial = "Espada longa - 1d8 de dano";
                armaMarcialEscolhida = "espada longa";
                break;
            case "florete":
                armaMarcial = "Florete - 1d6 de dano";
                armaMarcialEscolhida = "florete";
                break;
            case "machado de batalha":
                armaMarcial = "Machado de batalha - 1d8 de dano";
                armaMarcialEscolhida = "machado de batalha";
                break;
            case "mangual":
                armaMarcial = "Mangual - 1d8 de dano";
                armaMarcialEscolhida = "mangual";
                break;
            case "martelo de guerra":
                armaMarcial = "Martelo de guerra - 1d8 de dano";
                armaMarcialEscolhida = "martelo de guerra";
                break;
            case "picareta":
                armaMarcial = "Picareta - 1d6 de dano";
                armaMarcialEscolhida = "picareta";
                break;
            case "tridente":
                armaMarcial = "Tridente - 1d8 de dano";
                armaMarcialEscolhida = "tridente";
                break;
            case "alabarda":
                armaMarcial = "Alabarda - 1d10 de dano";
                armaMarcialEscolhida = "alabarda";
                break;
            case "alfange":
                armaMarcial = "Alfange - 2d4 de dano";
                armaMarcialEscolhida = "alfange";
                break;
            case "gadanho":
                armaMarcial = "Gadanho - 2d4 de dano";
                armaMarcialEscolhida = "gadanho";
                break;
            case "lanca montada", "lança montada":
                armaMarcial = "Lança montada - 1d8 de dano";
                armaMarcialEscolhida = "lança montada";
                break;
            case "machado de guerra":
                armaMarcial = "Machado de guerra - 1d12 de dano";
                armaMarcialEscolhida = "machado de guerra";
                break;
            case "montante":
                armaMarcial = "Montante - 2d6 de dano";
                armaMarcialEscolhida = "montante";
                break;
            case "arco longo":
                armaMarcial = "Arco longo - 1d8 de dano";
                armaMarcialEscolhida = "arco longo";
                break;
            case "besta pesada":
                armaMarcial = "Besta pesada - 1d12 de dano";
                armaMarcialEscolhida = "besta pesada";
                break;
            default:
                System.out.println("Digite corretamente uma das armas da lista!");
                armaMarcialVerificador = false;
        }
    }

    public void armaduraMensagem() {
        System.out.println("Agora você irá escolher uma armadura!" +
                "\nDa lista abaixo, escolha uma entre:" +
                "\nArmadura de couro - Couro batido - Gibão de peles");
    }

    public void escolherArmadura(String leitorItem) {
        switch (leitorItem){
            case "armadura de couro":
                armadura = "Armadura de couro (CA +2)";
                armaDuraEscolhida = "armadura de couro";
                break;
            case "couro batido":
                armadura = "Couro batido (CA +3)";
                armaDuraEscolhida = "couro batido";
                break;
            case "gibão de peles", "gibao de peles", "gibão de pele", "gibao de pele":
                armadura = "Gibão de peles (CA +4)";
                armaDuraEscolhida = "gibão de peles";
                break;
            default:
                System.out.println("Digite corretamente a armadura desejada!");
                armaduraVerificador = false;
        }
    }

    public void listaFinalItens() {
        if (classeDoJogador.equals("ladino")) {
            System.out.println("Maravilha! Você escolheu todos os seus itens, sendo eles:" +
                    "\n(1) Uma mochila" +
                    "\n(1) Um saco de dormir" +
                    "\n(1) Um traje de viajanta" +
                    "\n(1) " + armaSimplesEscolhida +
                    "\n(1) " + armaDuraEscolhida
            );
        } else if (classeDoJogador.equals("bardo")) {
            System.out.println("Maravilha! Você escolheu todos os seus itens, sendo eles:" +
                    "\n(1) Uma mochila" +
                    "\n(1) Um saco de dormir" +
                    "\n(1) Um traje de viajante" +
                    "\n(1) " + armaSimplesEscolhida +
                    "\n(1) " + armaMarcialEscolhida +
                    "\n(1) " + armaDuraEscolhida
            );
        } else {
            System.out.println("Maravilha! Você escolheu todos os seus itens, sendo eles:" +
                    "\n(1) Uma mochila" +
                    "\n(1) Um saco de dormir" +
                    "\n(1) Um traje de viajanta" +
                    "\n(1) " + armaSimplesEscolhida +
                    "\n(1) " + armaMarcialEscolhida +
                    "\n(1) " + armaDuraEscolhida +
                    "\n(1) Um escudo leve"
            );
        }
    }
}


