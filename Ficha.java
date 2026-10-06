package Rpg;
import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Olá! Seja bem-vindo ao nosso pequeno grande projeto.
public class Ficha {
    public static void main(String[] args) {

        //Instanciamento do objeto(perDoJogador) que usaremos para executar todos os métodos de Ficha
        Atributos perDoJogador = new Atributos();
        Scanner Usuario = new Scanner(System.in);

        System.out.println("Olá! Seja bem-vindo(a) ao seu criador de ficha de RPG.");
        System.out.println("\nPrimeiro vamos decidir qual será a raça do seu personagem.");
        System.out.println("\nO que você quer ser?");
        System.out.println("\nHumano   -   Elfo   -   Anão");
        /*
        O conjunto de três opções será algo recorrente no programa.
        A intenção é de trabalhar cada um dos aspectos da ficha sempre
        com a variedade de três opções, mas não mais do que isso pois
        sabíamos que poderíamos nos perder em meio a tantas opções
        oferecidas pelo livro.
         */
        String raca = "";
        boolean racaEscolhida = false;

        /*
        Algo a ser notado com frequência também são os "loops".
        Optamos por usá-los como verificadores de o jogador poder
        passar para a próxima etapa ou precisar digitar novamente
        para escolher dentre as opções oferecidas.
         */
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
        /*
        Dentro deste e dos outros "loops", sempre haverá
        a verificação de um booleano, que a priori será "= false",
        para que o "loop" só se quebre quando este booleano for
        verdadeiro, sendo necessário que o jogador digite uma
        opção válida para que o valor verdadeiro seja dado ao
        booleano e este possa ser verificado pelo "loop"
         */

        System.out.println("Seu personagem é um... " + raca + "!!!");
        System.out.println("\nAgora você irá escolher qual a sua classe!");
        System.out.println("Ela definirá suas habilidades, pontos de vida, pontos de mana e estilo de jogo.");
        System.out.println("\nPense em como você pretende jogar e digite uma das opções abaixo:");
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
        System.out.println("Digite um número entre 8 e 18 para cada um dos seus atributos");
        System.out.println("TABELA DE CUSTO DE PONTOS:");
        System.out.println("Pontos       -       Custo");
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

        //Esta parte da lógica está contida em Atributos
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
                    /*
                    A origem artesão propõe que o jogador ainda escolha um ofício
                    o que nos levou a criar um loop dentro do loop.
                     */
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
                    /*
                    A origem do Criminoso segue a mesma lógica de artesão
                    já que o jogador tem que escolher entre dois kits diferentes
                     */
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
            /*
            Durante a escolha de perícias nos deparamos com algumas questões.
            1º: o jogador precisa escolher um número limitado de perícias e
            esse número difere de classe pra classe.
            2º: o jogador escolhe perícias que são permitidas de acordo com
            a classe.
            3º: ter uma lógica que mantenha o fluxo do for em caso do usuário
            digitar algo inválido ou uma perícia repetida.
            4º: Não repetir mensagens no terminal, principalmente ao término
            da escolha de perícias.
             */
            for(int contador = 0; contador < 8; contador +=1) {
                periciaEscolhida = Usuario.nextLine().toLowerCase();
                perDoJogador.setPericiaSwitch(periciaEscolhida);
                perDoJogador.bonusPericia(perDoJogador.getPericiaSwitch());
                if (!perDoJogador.isPericiaValida()) {
                    contador -= 1;
                } else if (periciasEscolhidas.contains(periciaEscolhida)) {
                    contador -= 1;
                    System.out.println("Digite uma perícia da lista e que não seja repetida!");
                } else if (contador < 7) {
                        periciasEscolhidas.add(periciaEscolhida);
                        System.out.println("Prossiga escolhendo as demais perícias da lista.");
                } else {
                    periciasEscolhidas.add(periciaEscolhida);
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
                if (!perDoJogador.isPericiaValida()) {
                    contador -= 1;
                } else if (periciasEscolhidas.contains(periciaEscolhida)) {
                    contador -= 1;
                    System.out.println("Digite uma perícia da lista e que não seja repetida!");
                } else if (contador < 5) {
                        periciasEscolhidas.add(periciaEscolhida);
                        System.out.println("Prossiga escolhendo as demais perícias da lista.");
                } else {
                    periciasEscolhidas.add(periciaEscolhida);
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
                if (!perDoJogador.isPericiaValida()) {
                    contador -= 1;
                } else if (periciasEscolhidas.contains(periciaEscolhida)) {
                    contador -= 1;
                    System.out.println("Digite uma perícia da lista e que não seja repetida!");
                } else if (contador < 3) {
                        periciasEscolhidas.add(periciaEscolhida);
                        System.out.println("Prossiga escolhendo as demais perícias da lista.");
                } else {
                    periciasEscolhidas.add(periciaEscolhida);
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

        /*
        Determinados itens e armaduras são possíveis de escolher
        segundo a classe escohlida pelo usuário.
         */
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
            /*
            não há comando pois a classe ladino não pode ter
            armas marciais. Sendo assim, caso seja um bárbaro
            ou um bardo, a lógica segue para o else
             */
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

        ArrayList <String> listaEscolaDigitada = new ArrayList<>();
        String digitarEscola;

        /*
        Durante a escolha de escola de magias nos deparamos
        com problemas semelhantes aos da escolha de perícias.
        O jogador tem que digitar até três escolas e o fluxo do
        for precisa ser reajustado em caso do usuário digitar
        algo inválido ou repetido
         */
        if (perDoJogador.getClasseDoJogador().equals("bardo")) {
            perDoJogador.listaEscolasMagia();
            for (int escolaContador = 0; escolaContador < 3; escolaContador++) {
                digitarEscola = Usuario.nextLine().toLowerCase();
                perDoJogador.setEscolhaEscolaMagiaLeitor(digitarEscola);
                perDoJogador.escolhaEscolaMagia(perDoJogador.getEscolhaEscolaMagiaLeitor());
                if (!perDoJogador.escolaValida) {
                    escolaContador--;
                } else if (listaEscolaDigitada.contains(perDoJogador.getEscolhaEscolaMagia())) {
                        System.out.println("Digite uma escola válida e que não seja repetida!");
                    escolaContador--;
                } else if (escolaContador < 2) {
                    listaEscolaDigitada.add(perDoJogador.getEscolhaEscolaMagia());
                    System.out.println("Prossiga escolhendo as demais escolas");
                } else {
                    listaEscolaDigitada.add(perDoJogador.getEscolhaEscolaMagia());
                    System.out.println(listaEscolaDigitada);
                }
            }
            /*
            Aqui precisamos averiguar se o usuário digitou uma magia
            que seja condizente com a escola de magia que ele escolheu,
            se não digitou uma magia repetida ou algo inválido para que
            sejam preenchidos os dois espaços de magia disponíveis.
             */
            String magiaLeitor;
            perDoJogador.magiasEscolasMensagem();
            while (perDoJogador.getMagiaQuantidade() < 2) {
                magiaLeitor = Usuario.nextLine().toLowerCase();
                perDoJogador.setMagia(magiaLeitor);
                perDoJogador.magias2(perDoJogador.getMagia());
            }
            System.out.println("Você possui as magias: " + perDoJogador.magiaJogador);
            }


        String deusesLeitor;
        perDoJogador.listaDeuses();
        System.out.println("\nDigite o nome do deus a quem deseja servir ou digite \"nenhum\" caso não queira" +
                "\nservir a algum Deus.");
        while(!perDoJogador.isValidadorDeus()) {
            deusesLeitor = Usuario.nextLine().toLowerCase();
            perDoJogador.setDeusesDigitado(deusesLeitor);
            perDoJogador.escolhaDeuses(perDoJogador.getDeusesDigitado());
        }
        System.out.println(perDoJogador.getDeusSelecionado());
    }
}