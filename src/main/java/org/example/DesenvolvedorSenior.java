package org.example;

public class DesenvolvedorSenior extends Desenvolvedor {

    public String verificarDesempenho() {
        if (this.calcularDesempenho() >= 20) {
            return "Satisfatório";
        } else {
            return "Insatisfatório";
        }
    }

    @Override
    public String getTipo() {
        return "DesenvolvedorSenior";
    }
}