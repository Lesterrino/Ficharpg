package Rpg;
import java.util.ArrayList;
import java.util.Arrays;

public class Magias extends Origem{

    protected String escolhaEscolaMagiaLeitor;
    protected String escolhaEscolaMagia;
    protected boolean escolaValida;
    protected boolean abjuracaoValida = false;
    protected boolean adivinhacaoValida = false;
    protected boolean convocacaoValida = false;
    protected boolean encantamentoValida = false;
    protected boolean evocacaoValida = false;
    protected boolean ilusaoValida = false;
    protected boolean necromanciaValida = false;
    protected boolean transmutacaoValida = false;
    protected String magia;
    protected String magia1;
    protected String magia2;
    protected ArrayList <String> magiaJogador = new ArrayList<>();
    protected int magiaQuantidade;

    public String getEscolhaEscolaMagiaLeitor() {
        return escolhaEscolaMagiaLeitor;
    }

    public void setEscolhaEscolaMagiaLeitor(String escolhaEscolaMagiaLeitor) {
        this.escolhaEscolaMagiaLeitor = escolhaEscolaMagiaLeitor;
    }

    public String getEscolhaEscolaMagia() {
        return escolhaEscolaMagia;
    }

    public void setEscolhaEscolaMagia(String escolhaEscolaMagia) {
        this.escolhaEscolaMagia = escolhaEscolaMagia;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public String getMagia1() {
        return magia1;
    }

    public void setMagia1(String magia1) {
        this.magia1 = magia1;
    }

    public String getMagia2() {
        return magia2;
    }

    public void setMagia2(String magia2) {
        this.magia2 = magia2;
    }

    public ArrayList<String> getMagiaJogador() {
        return magiaJogador;
    }

    public void setMagiaJogador(ArrayList<String> magiaJogador) {
        this.magiaJogador = magiaJogador;
    }

    public void setMagiaQuantidade(int magiaQuantidade) {
        this.magiaQuantidade = magiaJogador.size();
    }

    public int getMagiaQuantidade() {
        return magiaQuantidade;
    }

    public void escolhaEscolaMagia(String escolhaEscolaMagiaLeitor) {
        switch (escolhaEscolaMagiaLeitor) {
            case "abjuracao", "abjuraçao", "abjuração", "abjuracão":
                escolhaEscolaMagia = "abjuracao";
                escolaValida = true;
                abjuracaoValida = true;
                break;
            case "adivinhacao", "adivinhaçao", "adivinhação", "adivinhacão":
                escolhaEscolaMagia = "adivinhacao";
                escolaValida = true;
                adivinhacaoValida = true;
                break;
            case "convocacao", "convocaçao", "convocação", "convocacão":
                escolhaEscolaMagia = "convocacao";
                escolaValida = true;
                convocacaoValida = true;
                break;
            case "encantamento":
                escolhaEscolaMagia = "encantamento";
                escolaValida = true;
                encantamentoValida = true;
                break;
            case "evocacao", "evocaçao", "evocação", "evocacão":
                escolhaEscolaMagia = "evocacao";
                escolaValida = true;
                evocacaoValida = true;
                break;
            case "ilusao", "ilusão":
                escolhaEscolaMagia = "ilusão";
                escolaValida = true;
                ilusaoValida = true;
                break;
            case "necromancia":
                escolhaEscolaMagia = "necromancia";
                escolaValida = true;
                necromanciaValida = true;
                break;
            case "transmutacao", "transmutaçao", "transmutação", "transmutacão":
                escolhaEscolaMagia = "transmutacao";
                escolaValida = true;
                transmutacaoValida = true;
                break;
            default:
                System.out.println("Digite corretamente o nome da escola de magia!");
                escolaValida = false;
                break;
        }
    }

    public void listaEscolasMagia() {
        System.out.println("Você escolheu a classe BARDO!" +
                "\nSendo assim, você deve escolher 3 escolas de magia" +
                "\nde onde você aprenderá magias que usará em sua aventura.\n" +
                "\nEssas escolas são:" +
                "\nAbjuração  -  Adivinhação  -  Convocação  -  Encantamento" +
                "\n  Evocação  -  Ilusão  -  Necromancia  -  Transmutação\n" +
                "\nDigite o nome de três escolas, uma por vez.");
    }

    public void magiasEscolasMensagem() {
        if (abjuracaoValida){
            System.out.println("\nVocê pode aprender as seguintes magias da escola Abjuração:" +
                    "\nAlarme - Armadura Arcana - Resistência a Energia - Tranca Arcana");
        } if (adivinhacaoValida) {
            System.out.println("\nVocê pode aprender as seguintes magias da escola Adivinhação:" +
                    "\nAviso - Compreensão - Concentração - Visão Mística");
        } if (convocacaoValida) {
            System.out.println("\nVocê pode aprender as seguintes magias da escola Convocação:" +
                    "\nÁrea escorregadia - Conjurar monstro - Névoa - Teia");
        } if (encantamentoValida) {
            System.out.println("\nVocê pode aprender as seguintes magias da escola Encantamento:" +
                    "\nAdaga Mental - Enfeitiçar - Hipnotismo - Sono");
        } if (evocacaoValida) {
            System.out.println("\nVocê pode aprender as seguintes magias da escola Evocação:" +
                    "\nExplosão de chama - Luz - Seta infalível de Talude - Toque chocante");
        } if (ilusaoValida) {
            System.out.println("\nVocê pode aprender as seguintes magias da escola Ilusão:" +
                    "\nCriar ilusão - Disfarce ilusório - Imagem espelhada - Leque cromático");
        } if (necromanciaValida) {
            System.out.println("\nVocê pode aprender as seguintes magias da escola Necromância:" +
                    "\nAmedrontar - Escuridão - Raio do enfraquecimento - Vitalidade fantasma");
        } if (transmutacaoValida) {
            System.out.println("\nVocê pode aprender as seguintes magias da escola Transutação" +
                    "\nArma mágica - Primor Atlético - Queda suave - Transmutar objetos");
        }
        System.out.println("\nLembre-se: Escolha apenas DUAS magias dentre todas" +
                " as opções disponíveis acima!");
    }

    public void magias2(String magia) {
        switch (magia) {
            case "alarme", "armadura arcana", "resistencia a energia", "tranca arcana":
                if (abjuracaoValida && !magiaJogador.contains(magia)) {
                    magiaJogador.add(magia);
                } else {
                    System.out.println("\nDigite uma magia das escolas que você escolheu e sem repetição!!!");
                }
                break;
            case "aviso", "compreensao", "concentracao", "visao mistica":
                if (adivinhacaoValida && !magiaJogador.contains(magia)) {
                    magiaJogador.add(magia);
                } else {
                    System.out.println("\nDigite uma magia das escolas que você escolheu e sem repetição!!!");
                }
                break;
            case "area escorregadia", "conjurar monstro", "nevoa", "teia":
                if (convocacaoValida && !magiaJogador.contains(magia)) {
                    magiaJogador.add(magia);
                } else {
                    System.out.println("\nDigite uma magia das escolas que você escolheu e sem repetição!!!");
                }
                break;
            case "adaga mental", "enfeiticar", "hipnotismo", "sono":
                if (encantamentoValida && !magiaJogador.contains(magia)) {
                    magiaJogador.add(magia);
                } else {
                    System.out.println("\nDigite uma magia das escolas que você escolheu e sem repetição!!!");
                }
                break;
            case "explosao de chama", "luz", "seta infalivel", "toque chocante":
                if (evocacaoValida && !magiaJogador.contains(magia)) {
                    magiaJogador.add(magia);
                } else {
                    System.out.println("\nDigite uma magia das escolas que você escolheu e sem repetição!!!");
                }
                break;
            case "criar ilusao", "disfarce ilusorio", "imagem espelhada", "leque cromatico":
                if (ilusaoValida && !magiaJogador.contains(magia)) {
                    magiaJogador.add(magia);
                } else {
                    System.out.println("\nDigite uma magia das escolas que você escolheu e sem repetição!!!");
                }
                break;
            case "amedrontar", "escuridao", "raio do enfraquecimento", "vitalidade fantasma":
                if (necromanciaValida && !magiaJogador.contains(magia)) {
                    magiaJogador.add(magia);
                } else {
                    System.out.println("\nDigite uma magia das escolas que você escolheu e sem repetição!!!");
                }
                break;
            case "arma magica", "primor atletico", "queda suave", "transmutar objetos":
                if (transmutacaoValida && !magiaJogador.contains(magia)) {
                    magiaJogador.add(magia);
                } else {
                    System.out.println("Digite uma magia das escolas que você escolheu e sem repetição!!!");
                }
                break;
            default:
                System.out.println("Digite corretamente a magia desejada!!!");
        }
        magiaQuantidade = magiaJogador.size();
    }

}
