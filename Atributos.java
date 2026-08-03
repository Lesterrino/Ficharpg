package Rpg;

public class Atributos extends Classe {

    protected boolean avaliacaoProximaEtapa;
    protected boolean avaliacaoAtributo;
    protected boolean avaliacaoDefinirAtributo;
    protected String nomeAtributo;
    protected int valorAtributo;
    protected String valorStringAtributo;
    protected int valorIntAtributo;
    protected int custoDePontos;
    protected boolean avaliacaoCompraDePontos;
    protected int forcaAntes;
    protected int destrezaAntes;
    protected int constituicaoAntes;
    protected int sabedoriaAntes;
    protected int inteligenciaAntes;
    protected int carismaAntes;
    protected int pontoAntes;

    public boolean isAvaliacaoProximaEtapa() {
        return avaliacaoProximaEtapa;
    }

    public void setAvaliacaoProximaEtapa(boolean avaliacaoProximaEtapa) {
        this.avaliacaoProximaEtapa = avaliacaoProximaEtapa;
    }

    public boolean isAvaliacaoAtributo() {
        return avaliacaoAtributo;
    }

    public void setAvaliacaoAtributo(boolean avaliacaoAtributo) {
        this.avaliacaoAtributo = avaliacaoAtributo;
    }

    public boolean isAvaliacaoDefinirAtributo() {
        return avaliacaoDefinirAtributo;
    }

    public void setAvaliacaoDefinirAtributo(boolean avaliacaoDefinirAtributo) {
        this.avaliacaoDefinirAtributo = avaliacaoDefinirAtributo;
    }

    public String getNomeAtributo() {
        return nomeAtributo;
    }

    public void setNomeAtributo(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public int getValorAtributo() {
        return valorAtributo;
    }

    public void setValorAtributo(int valorAtributo) {
        this.valorAtributo = valorAtributo;
    }

    public String getValorStringAtributo() {
        return valorStringAtributo;
    }

    public void setValorStringAtributo(String valorStringAtributo) {
        this.valorStringAtributo = valorStringAtributo;
    }

    public int getValorIntAtributo() {
        return valorIntAtributo;
    }

    public void setValorIntAtributo(int valorIntAtributo) {
        this.valorIntAtributo = valorIntAtributo;
    }

    public int getCustoDePontos() {
        return custoDePontos;
    }

    public void setCustoDePontos(int custoDePontos) {
        this.custoDePontos = custoDePontos;
    }

    public int getPontosDeAtributos() {
        return pontosDeAtributos;
    }

    public void setPontosDeAtributos(int pontosDeAtributos) {
        this.pontosDeAtributos = pontosDeAtributos;
    }

    public int getPontoAntes(String nomeAtributo) {
        switch(nomeAtributo.toLowerCase()) {
            case "forca":
                return forcaAntes;
            case "destreza":
                return destrezaAntes;
            default:
                return 0;
        }
    }

    public void setPontoAntes(String nomeAtributo, int pontoAntes) {
        switch(nomeAtributo.toLowerCase()) {
            case "forca":
                forcaAntes = pontoAntes;
                break;
            case "destreza":
                destrezaAntes = pontoAntes;
                break;
        }
    }

    public void avaliarAtributoDigitado(String nomeAtributo) {
        switch (nomeAtributo.trim().toLowerCase()) {
            case "força", "forca", "forsa", "strenght", "for":
                System.out.println("Você escolheu o atributo... FORÇA!");
                System.out.println("Quantos pontos deseja colocar nesse atributo?");
                setNomeAtributo("forca");
                avaliacaoAtributo = true;
                avaliacaoDefinirAtributo = false;
                break;
            case "destreza", "desterza", "dexterity", "des":
                System.out.println("Você escolheu o atributo... DESTREZA!");
                System.out.println("Quantos pontos deseja colocar nesse atributo?");
                setNomeAtributo("destreza");
                avaliacaoAtributo = true;
                avaliacaoDefinirAtributo = false;
                break;
            case "constituição", "con", "constitution", "constituicao":
                System.out.println("Você escolheu o atributo... CONSTITUIÇÃO!");
                System.out.println("Quantos pontos deseja colocar nesse atributo?");
                setNomeAtributo("constituicao");
                avaliacaoAtributo = true;
                avaliacaoDefinirAtributo = false;
                break;
            case "sabedoria", "sab", "wisdom":
                System.out.println("Você escolheu o atributo... SABEDORIA!");
                System.out.println("Quantos pontos deseja colocar nesse atributo?");
                setNomeAtributo("sabedoria");
                avaliacaoAtributo = true;
                avaliacaoDefinirAtributo = false;
                break;
            case "inteligencia", "inteligência", "int", "intelligence":
                System.out.println("Você escolheu o atributo... INTELIGENCIA!");
                System.out.println("Quantos pontos deseja colocar nesse atributo?");
                setNomeAtributo("inteligencia");
                avaliacaoAtributo = true;
                avaliacaoDefinirAtributo = false;
                break;
            case "carisma", "car", "charisma":
                System.out.println("Você escolheu o atributo... CARISMA");
                System.out.println("Quantos pontos deseja colocar nesse atributo?");
                setNomeAtributo("carisma");
                avaliacaoAtributo = true;
                avaliacaoDefinirAtributo = false;
                break;
            default:
                System.out.println("Digite um atributo válido!");
        }
    }

    public void definirAtributo(String nomeAtributo, int valorAtributo) {
        if (nomeAtributo.equals("forca")) {
            setForca2(0);
            setForca2(getForca() + valorAtributo);
            setModForca(Math.floorDiv(getForca2() - 10, 2));
            System.out.println(valorAtributo + " + seu bônus de classe = " +
                    getForca2() + "(" + getModForca() + ")");
            avaliacaoDefinirAtributo = true;
            avaliacaoAtributo = false;
            pontosDeAtributos += custoDePontos - forcaAntes;
            forcaAntes = custoDePontos;
        } else if (nomeAtributo.equals("destreza")) {
            setDestreza2(0);
            setDestreza2(getDestreza() + valorAtributo);
            setModDestreza(Math.floorDiv(getDestreza2() - 10, 2));
            System.out.println(valorAtributo + " + seu bônus de classe = " +
                    getDestreza2() + "(" + getModDestreza() + ")");
            avaliacaoDefinirAtributo = true;
            avaliacaoAtributo = false;
            pontosDeAtributos += custoDePontos - destrezaAntes;
            destrezaAntes = custoDePontos;
        } else if (nomeAtributo.equals("constituicao")) {
            setConstituicao2(0);
            setConstituicao2(getConstituicao() + valorAtributo);
            setModConstituicao(Math.floorDiv(getConstituicao2() - 10, 2));
            System.out.println(valorAtributo + " + seu bônus de classe = " +
                    getConstituicao2() + "(" + getModConstituicao() + ")");
            avaliacaoDefinirAtributo = true;
            avaliacaoAtributo = false;
            pontosDeAtributos += custoDePontos - constituicaoAntes;
            constituicaoAntes = custoDePontos;
        } else if (nomeAtributo.equals("sabedoria")) {
            setSabedoria2(0);
            setSabedoria2(getSabedoria() + valorAtributo);
            setModSabedoria(Math.floorDiv(getSabedoria2() - 10, 2));
            System.out.println(valorAtributo + " + seu bônus de classe = " +
                    getSabedoria2() + "(" + getModSabedoria() + ")");
            avaliacaoDefinirAtributo = true;
            avaliacaoAtributo = false;
            pontosDeAtributos += custoDePontos - sabedoriaAntes;
            sabedoriaAntes = custoDePontos;
        } else if (nomeAtributo.equals("inteligencia")) {
            setInteligencia2(0);
            setInteligencia2(getInteligencia() + valorAtributo);
            setModInteligencia(Math.floorDiv(getInteligencia2() - 10, 2));
            System.out.println(valorAtributo + " + seu bônus de classe = " +
                    getInteligencia2() + "(" + getModInteligencia() + ")");
            avaliacaoDefinirAtributo = true;
            avaliacaoAtributo = false;
            pontosDeAtributos += custoDePontos - inteligenciaAntes;
            inteligenciaAntes = custoDePontos;
        } else if (nomeAtributo.equals("carisma")) {
            setCarisma2(0);
            setCarisma2(getCarisma() + valorAtributo);
            setModCarisma(Math.floorDiv(getCarisma2() - 10, 2));
            System.out.println(valorAtributo + " + seu bônus de classe = " +
                    getCarisma2() + "(" + getModCarisma() + ")");
            avaliacaoDefinirAtributo = true;
            avaliacaoAtributo = false;
            pontosDeAtributos += custoDePontos - carismaAntes;
            carismaAntes = custoDePontos;
        } else {
            avaliacaoDefinirAtributo = false;
        }
    }

    public void proximaEtapa() {
        if (forca2 > 4 && destreza2 > 4 && constituicao2 > 4 &&
                sabedoria2 > 4 && inteligencia2 > 4 && carisma2 > 4) {
            avaliacaoProximaEtapa = true;
            System.out.println("\nTodos os seus atributos foram definidos!");
        } else {
            System.out.println("\nDefina os demais atributos...");
        }
    }

    public void exibirAtributos() {
        System.out.println("\nForça: " + getForca2() + "(" + getModForca() + ")");
        System.out.println("Destreza: " + getDestreza2() + "(" + getModDestreza() + ")");
        System.out.println("Constituição: " + getConstituicao2() + "(" + getModConstituicao() + ")");
        System.out.println("Sabedoria: " + getSabedoria2() + "(" + getModSabedoria() + ")");
        System.out.println("Inteligência: " + getInteligencia2() + "(" + getModInteligencia() + ")");
        System.out.println("Carisma: " + getCarisma2() + "(" + getModCarisma() + ")");
    }

    public void calculoCustoDePontos() {
        try {
            valorIntAtributo = Integer.parseInt(valorStringAtributo);
            if (valorIntAtributo > 7 && valorIntAtributo < 19) {
                if (valorIntAtributo <= 14) {
                    custoDePontos = -valorIntAtributo + 10;
                    compraDePontos();
                } else if (valorIntAtributo == 15) {
                    custoDePontos = -valorIntAtributo + 9;
                    compraDePontos();
                } else if (valorIntAtributo == 16) {
                    custoDePontos = -valorIntAtributo + 8;
                    compraDePontos();
                } else if (valorIntAtributo == 17) {
                    custoDePontos = -valorIntAtributo + 6;
                    compraDePontos();
                } else if (getValorIntAtributo() == 18) {
                    custoDePontos = -valorIntAtributo + 4;
                    compraDePontos();
                }
            } else {
                System.out.println("Escolha um valor entre 8 e 18!!!");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Digite um valor válido!");
        }
    }

    public void compraDePontos() {
        pontoAntes = getPontoAntes(nomeAtributo);
        if (pontosDeAtributos + custoDePontos >= 0) {
            definirAtributo(nomeAtributo, valorIntAtributo);
            setPontoAntes(nomeAtributo, custoDePontos);
            System.out.println("Pontos restantes para comprar atributos: " +
                    getPontosDeAtributos());
        } /*else if (nomeAtributo.equals("forca") && forcaAntes!= 0 &&
                pontosDeAtributos + custoDePontos <= 0) {
                pontosDeAtributos -= forcaAntes;
                forcaAntes = 0;
                definirAtributo(nomeAtributo, valorIntAtributo);
                System.out.println("Pontos restantes para comprar atributos: "
                        + getPontosDeAtributos());*/
        else if (pontoAntes != 0 && pontosDeAtributos + custoDePontos - pontoAntes >= 0) {
                //pontosDeAtributos += custoDePontos - pontoAntes;
                definirAtributo(nomeAtributo, valorIntAtributo);
                setPontoAntes(nomeAtributo, custoDePontos);
                System.out.println("Pontos restantes para comprar atributos: " +
                    getPontosDeAtributos());
        } else {
            System.out.println("Não foi possível fazer a matemática" +
                    "\nSeus pontos restantes para comprar atributos são apenas: "
                    + getPontosDeAtributos());
            System.out.println("Digite outro valor!");
        }
    }
}


