package Rpg;

import java.sql.SQLOutput;

public class Origem extends Personagem{

    protected String alquimista = "Frascos vazios, pinças, reagentes básicos e bico de respiração";
    protected String carpinteiro = "Um martelo, pregos e um serrote";
    protected String escriba = "Pergaminhos em branco, tinta e pena";
    protected String engenhoqueiro = "Chaves de fenda, alicate, engrenagens e óculos de proteção";
    protected String joalheiro = "Uma lente de aumento e balança de precisão";
    protected String kitOficioEscolhido;
    protected boolean oficioEscolhido = false;
    protected String kitCriminosoEscolhido;
    protected boolean criminosoEscolhido = false;
    protected boolean origemEscolhida = false;

    public String getKitCriminosoEscolhido() {
        return kitCriminosoEscolhido;
    }

    public void setKitCriminosoEscolhido(String kitCriminosoEscolhido) {
        this.kitCriminosoEscolhido = kitCriminosoEscolhido;
    }

    public String getKitOficioEscolhido() {
        return kitOficioEscolhido;
    }

    public void setKitOficioEscolhido(String kitOficioEscolhido) {
        this.kitOficioEscolhido = kitOficioEscolhido;
    }

    public void criminoso() {
        System.out.println("\nAlém disso, a origem CRIMINOSO lhe concede os seguintes benefícios:" +
                "\nPerícias: Enganação, Furtividade, Ladinagem." + "\nPoder - Punguista: " +
                "Você pode fazer testes de Ladinagem para sustento," + "como a perícia Ofício." +
                "\nPoder - Venefício: Não pode se envenenar acidentalmente. +2 para inimigos " +
                "resistirem ao seu veneno.");
        origemEscolhida = true;
    }

    public void kitCriminoso() {
        if (kitCriminosoEscolhido.equals("kit de ladrao")) {
            System.out.println("Você selecionou o KIT DE LADRÃO" +
                                "\nEste kit lhe concede os seguintes itens:" +
                                "gazuas, arames e outras pequenas ferramentas guardadas em" + "\num estojo de couro. " +
                                "Um personagem sem este kit sofre penalidade de –5 em testes de Ladinagem para " +
                                "abrir fechaduras e sabotar.");
            criminosoEscolhido = true;
        } else if (kitCriminosoEscolhido.equals("kit de disfarce")) {
            System.out.println("cosméticos, tinta para cabelo e alguns apêndices simples (como narizes falsos). " +
                                "Um personagem sem este kit sofre penalidade de –5 em testes de Enganação para " +
                                "fazer um disfarse.");
            criminosoEscolhido = true;
        } else {
            System.out.println("Digite um kit válido!!!");
        }
    }

    public void aProvaDeTudo() {
        System.out.println("Você escolheu o kit A prova de tudo!!!" + "\nVocê não sofre " +
                            "penalidade em deslocamento e Sobrevivência por clima ruim e " +
                            "por terreno difícil natural.");
        origemEscolhida = true;
    }

    public void artesao() {
        System.out.println("\n" + "Além disso, a classe Artesão lhe concede os seguintes bônus:" +
                            "\nVocê recebe um item que possa fabricar de até T$50" +
                            "\nVocê recebe a Perícia: VONTADE" +
                            "\nPoder - Fruto do trabalho: Quando passa em um teste de Ofício para" +
                            " sustento, você recebe o dobro do dinheiro." +
                            "\nPoder - Sortudo (3PM): Role novamente um teste recém realizado.");
        origemEscolhida = true;
    }

    public void kitDeOficio() {
        switch (kitOficioEscolhido.toLowerCase()) {
            case "alquimista":
                System.out.println("Você escolheu o ofício ALQUIMISTA!" +
                                    "\nSeu kit de alquimista lhe concede:" + "\n" + alquimista);
                oficioEscolhido = true;
                break;
            case "carpinteiro":
                System.out.println("Você escolheu o ofício CARPINTEIRO!" +
                                    "\nSeu kit de carpinteiro lhe concede:" + "\n" + carpinteiro);
                oficioEscolhido = true;
                break;
            case "escriba":
                System.out.println("Você escolheu o ofício ESCRIBA!" +
                                    "\nSeu kit de escriba lhe concede:" + "\n" + escriba);
                oficioEscolhido = true;
                break;
            case "engenhoqueiro":
                System.out.println("Você escolheu o ofício ENGENHOQUEIRO!" +
                                    "\nSeu kit de engenhoqueiro lhe concede:" + "\n" + engenhoqueiro);
                oficioEscolhido = true;
                break;
            case "joalheiro":
                System.out.println("Você escolheu o ofício JOALHEIRO!" +
                                    "\nSeu kit de joalheiro lhe concede:" + "\n" + joalheiro);
                oficioEscolhido = true;
                break;
            default:
                System.out.println("Digite um ofício válido!!!");
                break;
        }
    }
}
