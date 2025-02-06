package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DesenvolvedorSeniorTest {

    @Test
    public void deveRetornarSatisfatorio() {
        DesenvolvedorSenior dev = new DesenvolvedorSenior();
        dev.setTarefasConcluidas(10);
        dev.setBugsCorrigidos(5);
        assertEquals("Satisfatório", dev.verificarDesempenho());
    }

    @Test
    public void deveRetornarInsatisfatorio() {
        DesenvolvedorSenior dev = new DesenvolvedorSenior();
        dev.setTarefasConcluidas(9);
        dev.setBugsCorrigidos(1);
        assertEquals("Insatisfatório", dev.verificarDesempenho());
    }

    @Test
    public void deveRetornarInformacoes() {
        DesenvolvedorSenior dev = new DesenvolvedorSenior();
        dev.setTarefasConcluidas(9);
        dev.setBugsCorrigidos(1);
        dev.setNome("Mariana");
        dev.setId(5);
        assertEquals("DesenvolvedorSenior{id=5, nome='Mariana', resultado=Insatisfatório}", dev.getInfo());
    }
}
