package Rpg;
import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ficha {
    public static void main(String[] args) {

        Atributos perDoJogador = new Atributos();

        Scanner Usuario = new Scanner(System.in);

        System.out.println("Olá! Seja bem vindo(a) ao seu criador de ficha de RPG.");
        System.out.println("\nPrimeiro vamos decidir qual será a raça" +
                " do seu personagem.");
        System.out.println("\nO que você quer ser?");
        System.out.println("\nHumano   -   Elfo   -   Anão");
        String raca = "";

        boolean racaEscolhida = false;

        while (!racaEscolhida) {
            raca = Usuario.nextLine().trim().toLowerCase();

            switch (raca) {
                case "humano", "umano", "human":
                    perDoJogador.atributosHumano();
                    racaEscolhida = true;
                    perDoJogador.setRacaPersonagem("humano");
                    break;
                case "elfo", "elfa", "elf", "elfico":
                    perDoJogador.atributosElfo();
                    racaEscolhida = true;
                    perDoJogador.setRacaPersonagem("elfo");
                    break;
                case "anao", "anão":
                    perDoJogador.atributosAnao();
                    racaEscolhida = true;
                    perDoJogador.setRacaPersonagem("anao");
                    break;
                default:
                    System.out.println("Tente digitar novamente");
            }
        }

        System.out.println("Seu personagem é um... " + raca + "!!!");
        System.out.println("\nAgora você irá escolher qual a sua classe!");
        System.out.println("Ela definirá suas habilidas, pontos de vida," +
                " pontos de mana e estilo de jogo.");
        System.out.println("");
        System.out.println("Pense em como você pretende jogar e digite uma das opções abaixo:");
        System.out.println("\nBárbaro   -   Bardo   -   Ladino");

        String classe = "";
        boolean classeEscolhida = false;

        while (!classeEscolhida) {
            classe = Usuario.nextLine().trim().toLowerCase();
            switch (classe) {
                case "barbaro", "berseker", "barbarian", "barbáro", "bárbaro":
                    perDoJogador.barbaroBase();
                    classeEscolhida = true;
                    break;
                case "bardo", "bard", "bardoo":
                    perDoJogador.bardoBase();
                    classeEscolhida = true;
                    break;
                case "ladino", "ladinho", "Rogue", "Thief":
                    perDoJogador.ladinoBase();
                    classeEscolhida = true;
                    break;
                default:
                    System.out.println("Tente digitar novamente...");
            }
            System.out.println("A classe escolhida foi... " + classe + "!!!");
        }

        System.out.println("\nAgora nós vamos determinar seus pontos de atributos!!!");
        System.out.println("\nDigite um número entre 8 e 18 para cada um dos seus atributos");
        System.out.println("\nTABELA DE CUSTO DE PONTOS:");
        System.out.println("\nPontos       -       Custo");
        System.out.println("  8          -         +2 ");
        System.out.println("  9          -         +1 ");
        System.out.println("  10         -          0 ");
        System.out.println("  11         -         -1 ");
        System.out.println("  12         -         -2 ");
        System.out.println("  13         -         -3 ");
        System.out.println("  14         -         -4 ");
        System.out.println("  15         -         -6 ");
        System.out.println("  16         -         -8 ");
        System.out.println("  17         -         -11");
        System.out.println("  18         -         -14");
        System.out.println("Qual atributo deseja escolher primeiro?");

        String digitar = "";
        String digitarAtributo;

        while (!perDoJogador.avaliacaoProximaEtapa) {
            while (!perDoJogador.avaliacaoAtributo) {
                digitar = Usuario.nextLine().trim().toLowerCase();
                perDoJogador.avaliarAtributoDigitado(digitar);
            }
            while (!perDoJogador.avaliacaoDefinirAtributo) {
                digitarAtributo = Usuario.nextLine();
                perDoJogador.setValorStringAtributo(digitarAtributo);
                perDoJogador.calculoCustoDePontos();
            }
        perDoJogador.proximaEtapa();
        }

        perDoJogador.exibirAtributos();

        String digitarOrigem = "";
        String digitarOficio;
        String digitarCriminoso;
        ArrayList <String> periciasEscolhidas = new ArrayList<>();

        System.out.println("\nMaravilha! Seus pontos de atributos foram definidos." +
                            "\nAgora você irá escolher qual a sua ORIGEM." +
                            "\n..." + "\n..." + "\n..." + "\nEscolha entre:" +
                            "\nArtesão    -    A prova de tudo    -    Criminoso");

        digitarOrigem = Usuario.nextLine().toLowerCase();

        while (!perDoJogador.origemEscolhida) {
            if (digitarOrigem.equals("artesao")) {
                while (!perDoJogador.oficioEscolhido) {
                    System.out.println("Escolha um ofício dentre as opções a seguir:" + "\n" +
                            "\nAlquimista - Carpinteiro - Escriba - Engenhoqueiro - Joalheiro");
                    digitarOficio = Usuario.nextLine();
                    perDoJogador.setKitOficioEscolhido(digitarOficio);
                    perDoJogador.kitDeOficio();
                    periciasEscolhidas.add("vontade");
                }
                perDoJogador.artesao();
            } else if (digitarOrigem.equals("a prova de tudo")) {
                perDoJogador.aProvaDeTudo();
            } else if (digitarOrigem.equals("criminoso")) {
                while (!perDoJogador.criminosoEscolhido) {
                    System.out.println("Você tem duas opções de Kit de Criminoso para escolher:" +
                            "\nKit de Ladrão    -    Kit de Disfarce");
                    digitarCriminoso = Usuario.nextLine();
                    perDoJogador.setKitCriminosoEscolhido(digitarCriminoso);
                    perDoJogador.kitCriminoso();
                    periciasEscolhidas.add("furtividade");
                    periciasEscolhidas.add("enganacao");
                    periciasEscolhidas.add("ladinagem");
                }
                perDoJogador.criminoso();
            } else {
                System.out.println("Digite uma origem válida!" + " Escolha entre:" +
                                    "\nArtesão    -    A prova de tudo    -    Criminoso");
                digitarOrigem = Usuario.nextLine().toLowerCase();
            }
        }

        String periciaEscolhida;
        perDoJogador.periciasIntroducao();
        if(perDoJogador.getClasseDoJogador().equals("ladino")) {
            perDoJogador.ladinoPericias();
            for(int contador = 0; contador < 8; contador +=1) {
                periciaEscolhida = Usuario.nextLine().toLowerCase();
                perDoJogador.setPericiaSwitch(periciaEscolhida);
                perDoJogador.bonusPericia(perDoJogador.getPericiaSwitch());
                if (!perDoJogador.isPericiaValida() || periciasEscolhidas.contains(periciaEscolhida)) {
                    contador -= 1;
                    System.out.println("Digite uma perícia da lista e que não seja repetida!");
                } else if (contador < 7) {
                        periciasEscolhidas.add(periciaEscolhida);
                        System.out.println("Prossiga escolhendo as demais perícias da lista.");
                    } else {
                        System.out.println("Você escolheu suas 8 perícias." +
                                "\nA seguir mostramos a lista de todas as perícias que você possui:");
                        periciasEscolhidas.add("ladinagem");
                        periciasEscolhidas.add("reflexos");
                }
            }
        } else if (perDoJogador.getClasseDoJogador().equals("bardo")) {
            perDoJogador.bardoPericias();
            for(int contador = 0; contador < 6; contador +=1) {
                periciaEscolhida = Usuario.nextLine().toLowerCase();
                perDoJogador.setPericiaSwitch(periciaEscolhida);
                perDoJogador.bonusPericia(perDoJogador.getPericiaSwitch());
                if (!perDoJogador.isPericiaValida() || periciasEscolhidas.contains(periciaEscolhida)) {
                    contador -= 1;
                    System.out.println("Digite uma perícia da lista e que não seja repetida!");
                } else if (contador < 5) {
                        periciasEscolhidas.add(periciaEscolhida);
                        System.out.println("Prossiga escolhendo as demais perícias da lista.");
                    } else {
                        System.out.println("Você escolheu suas 6 perícias." +
                                "\nA seguir mostramos a lista de todas as perícias que você possui:");
                        periciasEscolhidas.add("atuacao");
                        periciasEscolhidas.add("reflexos");
                }
            }
        } else if (perDoJogador.getClasseDoJogador().equals("barbaro")) {
            perDoJogador.barbaroPericias();
            for (int contador = 0; contador < 4; contador += 1) {
                periciaEscolhida = Usuario.nextLine().toLowerCase();
                perDoJogador.setPericiaSwitch(periciaEscolhida);
                perDoJogador.bonusPericia(perDoJogador.getPericiaSwitch());
                if (!perDoJogador.isPericiaValida() || periciasEscolhidas.contains(periciaEscolhida)) {
                    contador -= 1;
                    System.out.println("Digite uma perícia da lista e que não seja repetida!");
                } else if (contador < 3) {
                        periciasEscolhidas.add(periciaEscolhida);
                        System.out.println("Prossiga escolhendo as demais perícias da lista.");
                } else {
                        System.out.println("Você escolheu suas 4 perícias." +
                                "\nA seguir mostramos a lista de todas as perícias que você possui:");
                        periciasEscolhidas.add(periciaEscolhida);
                        periciasEscolhidas.add("fortitude");
                        periciasEscolhidas.add("luta");
                }
            }
        }

        System.out.println(periciasEscolhidas);

        perDoJogador.mensagemItensPrimarios();
        perDoJogador.armaSimplesMensagem();
        String digitarItem = "";

        do {
            digitarItem = Usuario.nextLine().toLowerCase();
            perDoJogador.setLeitorItem(digitarItem);
            perDoJogador.setArmaSimplesVerificador(true);
            perDoJogador.escolherArmaSimples(perDoJogador.getLeitorItem());
            if (perDoJogador.isArmaSimplesVerificador()) {
                System.out.println(perDoJogador.getArmaSimples());
            }
        } while (!perDoJogador.isArmaSimplesVerificador());

        if (perDoJogador.getClasseDoJogador().equals("ladino")) {

        } else {
            perDoJogador.armaMarcialMensagem();
            do {
                digitarItem = Usuario.nextLine().toLowerCase();
                perDoJogador.setLeitorItem(digitarItem);
                perDoJogador.setArmaMarcialVerificador(true);
                perDoJogador.escolherArmaMarcial(perDoJogador.getLeitorItem());
                if (perDoJogador.isArmaMarcialVerificador()) {
                    System.out.println(perDoJogador.getArmaMarcial());
                }
            } while (!perDoJogador.isArmaMarcialVerificador());
        }

        perDoJogador.armaduraMensagem();
        do {
            digitarItem = Usuario.nextLine().toLowerCase();
            perDoJogador.setLeitorItem(digitarItem);
            perDoJogador.setArmaduraVerificador(true);
            perDoJogador.escolherArmadura(perDoJogador.getLeitorItem());
            if (perDoJogador.isArmaduraVerificador()) {
                System.out.println(perDoJogador.getArmadura());
            }
        } while (!perDoJogador.isArmaduraVerificador());

        perDoJogador.listaFinalItens();
    }
}
