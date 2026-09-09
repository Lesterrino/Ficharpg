package Rpg;

import java.util.ArrayList;

public class Pericia extends Itens{

    protected int acrobacia = modDestreza;
    protected int adestramento = modCarisma;
    protected int atletismo = modForca;
    protected int atuacao = modCarisma;
    protected int cavalgar = modDestreza;
    protected int conhecimento = modInteligencia;
    protected int cura = modSabedoria;
    protected int diplomacia = modCarisma;
    protected int enganacao = modCarisma;
    protected int fortitude = modConstituicao;
    protected int furtividade = modDestreza;
    protected int guerra = modInteligencia;
    protected int iniciativa = modDestreza;
    protected int intimidacao = modCarisma;
    protected int intuicao = modSabedoria;
    protected int investigacao = modInteligencia;
    protected int jogatina = modCarisma;
    protected int ladinagem = modDestreza;
    protected int luta = modForca;
    protected int misticismo = modInteligencia;
    protected int nobreza = modInteligencia;
    protected int oficio = modInteligencia;
    protected int percepcao = modSabedoria;
    protected int pilotagem = modDestreza;
    protected int pontaria = modDestreza;
    protected int reflexos = modDestreza;
    protected int religiao = modSabedoria;
    protected int sobrevivencia = modSabedoria;
    protected int vontade = modSabedoria;
    protected String periciaSwitch;
    protected boolean periciaValida = false;

    public String getPericiaSwitch() {
        return periciaSwitch;
    }

    public void setPericiaSwitch(String periciaSwitch) {
        this.periciaSwitch = periciaSwitch;
    }

    public boolean isPericiaValida() {
        return periciaValida;
    }

    public void setPericiaValida(boolean periciaValida) {
        this.periciaValida = periciaValida;
    }

    public void bonusPericia(String periciaSwitch) {
        switch(periciaSwitch) {
            case "acrobacia":
                if (classeDoJogador.equals("barbaro")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    acrobacia += 2;
                    periciaValida = true;
                }
                break;
            case "adestramento":
                if (classeDoJogador.equals("bardo") || classeDoJogador.equals("ladino")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    adestramento += 2;
                    periciaValida = true;
                }
                break;
            case "atletismo":
                if (classeDoJogador.equals("bardo")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    atletismo += 2;
                    periciaValida = true;
                }
                break;
            case "atuacao", "atuação", "atuacão", "atuaçao":
                if (classeDoJogador.equals("bardo")) {
                    System.out.println("Digite uma perícia da lista acima!");
                    periciaValida = false;
                } else if (classeDoJogador.equals("barbaro")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    atuacao += 2;
                    periciaValida = true;
                }
                break;
            case "cavalgar":
                cavalgar +=2;
                periciaValida = true;
                break;
            case "conhecimento":
                if (classeDoJogador.equals("barbaro")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    conhecimento += 2;
                    periciaValida = true;
                }
                break;
            case "cura":
                if (classeDoJogador.equals("barbaro") || classeDoJogador.equals("bardo")
                || classeDoJogador.equals("ladino")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    cura += 2;
                    periciaValida = true;
                }
                break;
            case "diplomacia":
                if (classeDoJogador.equals("barbaro")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    diplomacia += 2;
                    periciaValida = true;
                }
                break;
            case "enganacao", "enganação", "enganaçao", "enganacão":
                if (classeDoJogador.equals("barbaro")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    enganacao += 2;
                    periciaValida = true;
                }
                break;
            case "fortitude":
                if (classeDoJogador.equals("barbaro")) {
                    System.out.println("Digite uma perícia da lista acima!");
                    periciaValida = false;
                } else if (classeDoJogador.equals("bardo") || classeDoJogador.equals("ladino")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    fortitude += 2;
                    periciaValida = true;
                }
                break;
            case "furtividade":
                if (classeDoJogador.equals("barbaro")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    furtividade += 2;
                    periciaValida = true;
                }
                break;
            case "guerra":
                if (classeDoJogador.equals("barbaro") || classeDoJogador.equals("bardo")
                || classeDoJogador.equals("ladino")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    guerra += 2;
                    periciaValida = true;
                }
                break;
            case "iniciativa":
                iniciativa +=2;
                periciaValida = true;
                break;
            case "intimidacao", "intimidação", "intimidaçao", "intimidacão":
                if (classeDoJogador.equals("bardo")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    intimidacao += 2;
                    periciaValida = true;
                }
                break;
            case "intuicao", "intuição", "intuicão", "intuiçao":
                if (classeDoJogador.equals("barbaro")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    intuicao += 2;
                    periciaValida = true;
                }
                break;
            case "investigacao", "investigação", "investigacão":
                if (classeDoJogador.equals("barbaro")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    investigacao += 2;
                    periciaValida = true;
                }
                break;
            case "jogatina":
                if (classeDoJogador.equals("barbaro")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    jogatina += 2;
                    periciaValida = true;
                }
                break;
            case "ladinagem":
                if (classeDoJogador.equals("ladino")) {
                    System.out.println("Digite uma perícia da lista acima!");
                    periciaValida = false;
                } else if (classeDoJogador.equals("barbaro")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    ladinagem += 2;
                    periciaValida = true;
                }
                break;
            case "luta":
                if (classeDoJogador.equals("barbaro")) {
                    System.out.println("Digite uma perícia da lista acima!");
                    periciaValida = false;
                } else {
                    luta += 2;
                    periciaValida = true;
                }
                break;
            case "misticismo":
                if (classeDoJogador.equals("barbaro") || classeDoJogador.equals("ladino")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    misticismo += 2;
                    periciaValida = true;
                }
                break;
            case "nobreza":
                if (classeDoJogador.equals("barbaro") || classeDoJogador.equals("ladino")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    nobreza += 2;
                    periciaValida = true;
                }
                break;
            case "oficio", "ofício":
                if (classeDoJogador.equals("bardo")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    oficio += 2;
                    periciaValida = true;
                }
                break;
            case "percepcao", "percepção", "percepcão":
                percepcao +=2;
                periciaValida = true;
                break;
            case "pilotagem":
                if (classeDoJogador.equals("barbaro") || classeDoJogador.equals("bardo")) {
                    System.out.println("Digite uma perícia da lista da SUA classe!");
                    periciaValida = false;
                } else {
                    pilotagem += 2;
                    periciaValida = true;
                }
                break;
            case "pontaria":
                pontaria +=2;
                periciaValida = true;
                break;
            case "reflexos", "reflexo":
                if (classeDoJogador.equals("ladino") || classeDoJogador.equals("bardo")) {
                    System.out.println("Digite uma perícia da lista acima!");
                    periciaValida = false;
                } else if (classeDoJogador.equals("barbaro")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    reflexos += 2;
                    periciaValida = true;
                }
                break;
            case "religiao", "religião":
                if (classeDoJogador.equals("barbaro") || classeDoJogador.equals("ladino")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                religiao +=2;
                periciaValida = true;
                }
                break;
            case "sobrevivencia", "sobrevivência":
                if (classeDoJogador.equals("bardo") || classeDoJogador.equals("ladino")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                sobrevivencia +=2;
                periciaValida = true;
                }
                break;
            case "vontade":
                if (classeDoJogador.equals("ladino")) {
                    System.out.println("Digite uma perícia da lista da sua classe!");
                    periciaValida = false;
                } else {
                    vontade += 2;
                    periciaValida = true;
                }
                break;
            default:
                System.out.println("Digite corretamente a perícia desejada");
                periciaValida = false;
                break;
        }
    }

    public void periciasIntroducao() {
        System.out.println("Parabéns! Você agora terá de escolher as suas perícias." +
                "\nNesta fase, você deve escolher as habilidades que acredita que fazem sentido" +
                "para seu personagem e lhe ajudarão durante a jornada");
    }

    public void ladino() {
        ladinoBase();
        ladinagem += 2;
        reflexos += 2;
    }

    public void ladinoPericias() {
        System.out.println("Você escolheu e classe... Ladino!" +
                "\nE sendo um ladino, você é naturalmente proficiente em:" +
                "\nLadinagem e Reflexos." +
                "\nAgora, escolha 8 perícias entre as perícias a seguir:" +
                "\nAcrobacia - Atletismo - Atuação - Cavalgar - Conhecimento" +
                "\nDiplomacia  -  Enganação   -   Furtividade  -  Iniciativa" +
                "\nIntimidação - Intuição  -  Investigação - Jogatina - Luta" +
                "\nOfício    -   Percepção    -    Pilotagem   -    Pontaria");
    }

    public void barbaro() {
        barbaroBase();
        fortitude += 2;
        luta += 2;
    }

    public void barbaroPericias() {
        System.out.println("Você escolheu a classe... Barbaro!" +
                "\nE sendo um barbaro, você é naturalmente proficiente em:" +
                "\nFortitude e Luta." +
                "\nAgora, escolha 4 perícias entre as perícias a seguir:" +
                "\nAdestramento    -    Atletismo    -    Cavalgar" +
                "\nIniciativa  - Intimidação - Ofico -  Percepção" +
                "\nPontaria    -    Sobrevivência    -    Vontade");
    }

    public void bardo() {
        bardoBase();
        atuacao += 2;
        reflexos += 2;
    }

    public void bardoPericias() {
        System.out.println("Você escolheu a classe... Bardo!" +
                "\nE sendo um bardo. você é naturalmente proficiente em:" +
                "\nAtuação e Reflexos." +
                "\nAcrobacia - Cavalgar - Conhecimento - Diplomacia" +
                "\nEnganação - Furtividade - Iniciativa -  Intuição" +
                "\nInvestigação  -  Jogatina  -  Ladinagem  -  Luta" +
                "\nMisticismo  - Nobreza  -  Percepção  -  Pontaria" +
                "\n       Religião         -         Vontade       ");
    }

}
