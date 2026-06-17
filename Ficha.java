package Rpg;
import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ficha {
    public static void main(String[] args) {

    Classe perDoJogador = new Classe();

    Scanner Usuario = new Scanner(System.in);

    System.out.println("Olá! Seja bem vindo(a) ao seu criador de ficha de RPG.");

    System.out.println("\nPrimeiro vamos decidir qual será a raça" +
                        " do seu personagem.");

    System.out.println("\nO que você quer ser?");

    System.out.println("\nHumano   -   Elfo   -   Anão");

    String raça = "";

    boolean raçaEscolhida = false;

    while (!raçaEscolhida) {
        raça = Usuario.nextLine().trim().toLowerCase();

        switch (raça) {
            case "humano", "umano", "human":
                perDoJogador.atributosHumano();
                raçaEscolhida = true;
                break;
            case "elfo", "elfa", "elf", "elfico":
                perDoJogador.atributosElfo();
                raçaEscolhida = true;
                break;
            case "anao", "anão":
                perDoJogador.atributosAnao();
                raçaEscolhida = true;
                break;
            default:
                System.out.println("Tente digitar novamente");
        }
    }

    System.out.println("Seu personagem é um... " + raça + "!!!");

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
    }
}