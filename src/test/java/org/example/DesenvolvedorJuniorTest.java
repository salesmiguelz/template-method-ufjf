package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DesenvolvedorJuniorTest {

    @Test
    public void deveRetornarSatisfatorio() {
        DesenvolvedorJunior dev = new DesenvolvedorJunior();
        dev.setTarefasConcluidas(5);
        dev.setBugsCorrigidos(2);
        assertEquals("Satisfatório", dev.verificarDesempenho());
    }

    @Test
    public void deveRetornarInsatisfatorio() {
        DesenvolvedorJunior dev = new DesenvolvedorJunior();
        dev.setTarefasConcluidas(4);
        dev.setBugsCorrigidos(1);
        assertEquals("Insatisfatório", dev.verificarDesempenho());
    }

    @Test
    public void deveRetornarInformacoes() {
        DesenvolvedorJunior dev = new DesenvolvedorJunior();
        dev.setTarefasConcluidas(4);
        dev.setBugsCorrigidos(1);
        dev.setNome("Lucas");
        dev.setId(3);
        assertEquals("Desenvolvedor{id=3, nome='Lucas', resultado=Insatisfatório}", dev.getInfo());
    }
}