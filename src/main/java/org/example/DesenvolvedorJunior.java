package org.example;

public class DesenvolvedorJunior extends Desenvolvedor {

    public String verificarDesempenho() {
        if (this.calcularDesempenho() >= 10) {
            return "Satisfatório";
        } else {
            return "Insatisfatório";
        }
    }


}