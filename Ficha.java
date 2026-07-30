package Rpg;
import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;
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
                    break;
                case "elfo", "elfa", "elf", "elfico":
                    perDoJogador.atributosElfo();
                    racaEscolhida = true;
                    break;
                case "anao", "anão":
                    perDoJogador.atributosAnao();
                    racaEscolhida = true;
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
                    perDoJogador.barbaro();
                    classeEscolhida = true;
                    break;
                case "bardo", "bard", "bardoo":
                    perDoJogador.bardo();
                    classeEscolhida = true;
                    break;
                case "ladino", "ladinho", "Rogue", "Thief":
                    perDoJogador.ladino();
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
        }
    }
