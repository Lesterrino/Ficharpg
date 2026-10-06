package Rpg;

public class Panteao extends Personagem {

    protected String deusesDigitado;
    protected String deusSelecionado;
    protected boolean validadorDeus = false;

    public String getDeusesDigitado() {
        return deusesDigitado;
    }

    public void setDeusesDigitado(String deusesDigitado) {
        this.deusesDigitado = deusesDigitado;
    }

    public String getDeusSelecionado() {
        return deusSelecionado;
    }

    public void setDeusSelecionado(String deusSelecionado) {
        this.deusSelecionado = deusSelecionado;
    }

    public boolean isValidadorDeus() {
        return validadorDeus;
    }

    public void setValidadorDeus(boolean validadorDeus) {
        this.validadorDeus = validadorDeus;
    }

    public void listaDeuses() {
        System.out.println("Nesta etapa você irá escolher se irá ou não servir a algum deus." +
                "\nEscolha um (ou nenhum) dentre os deuses da lista abaixo:" +
                "\n--- Nimb" + "\nDevotos de Nimb são loucos (ou agem como se fossem), não conseguindo convencer " +
                "\nninguém de coisa alguma. Você sofre –5 em testes de perícias baseadas em Carisma. Além disso, no" +
                "\ninício de cada cena de ação, role 1d6. Com um resultado 1, você fica confuso até o fim da cena.\n" +
                "\n--- Marah" + "\nSeus devotos não podem causar dano ou impor condições e só podem recorrer a ações" +
                "\ncomo proteger, curar, fugir, render-se ou aceitar a morte.\n" + "\n--- Azgher" + "\nSeus devotos " +
                "\ndevem manter o rosto sempre coberto (a não ser na presença do sumo sacerdote ou de seu funeral) e" +
                "\ndevem doar o dízimo, em moedas de ouro, de toda recompensa conquistada");
    }

    public void escolhaDeuses(String deusesDigitado) {
        switch (deusesDigitado) {
            case "nimb":
                deusSelecionado = "Você serve a NIMB!";
                validadorDeus = true;
                System.out.println("Poderes Concedidos:" + "\n- Poder Oculto (2PM e uma ação de movimento):" +
                "\nRole 1d6 para receber +4 em Força ou Destreza ou Constituição." + "\n- Sorte dos Loucos (1PM):" +
                "\nRole novamente um  recém realizado. Caso falhe, perca 1d6 PM." + "\n- Transmissão da Loucura:" +
                "\nVocê pode lançar Sussurros insanos (CD Carisma).teste.");
                break;
            case "marah":
                deusSelecionado = "Você serve a MARAH";
                validadorDeus = true;
                System.out.println("Poderes Concedidos:" + "\n- Aura de Paz (2PM):" + "\nInimigos tem que fazer um" +
                "teste de Vontade (CD Carisma) para tentar te atacar dentro da aura" + "\n- Palavras de Bondade:" +
                "\nSabe e pode lançar Enfeitiçar." + "\n- Talento Artístico:" + "\n+2 em Atuação e Diplomacia");
                break;
            case "azgher":
                deusSelecionado = "Você serve a AZGHER";
                validadorDeus = true;
                System.out.println("Poderes Concedidos:" + "\n- Espada Solar (1PM):" +
                "\n+1 em testes de ataque e dano." + "\n- Habitante do Deserto:" + "\nResistência a fogo 5. " +
                "Pode criar água suficiente para um odre." + "\n- Inimigo de Tenebra:" +
                "\n+1d6 de dano contra mortos-vivos");
                break;
            case "nenhum":
                deusSelecionado = "Você não serve a deus algum";
                validadorDeus = true;
                break;
            default:
                System.out.println("Tente digitar novamente...");
        }
    }

    public void Nimb() {

    }

    public void Marah() {

    }

    public void Azgher() {

    }

}
