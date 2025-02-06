package org.example;


public abstract class Desenvolvedor {

    private int id;
    protected String nome;
    private int tarefasConcluidas;
    private int bugsCorrigidos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTarefasConcluidas() {
        return tarefasConcluidas;
    }

    public void setTarefasConcluidas(int tarefasConcluidas) {
        this.tarefasConcluidas = tarefasConcluidas;
    }

    public int getBugsCorrigidos() {
        return bugsCorrigidos;
    }

    public void setBugsCorrigidos(int bugsCorrigidos) {
        this.bugsCorrigidos = bugsCorrigidos;
    }

    public int calcularDesempenho() {
        return (this.tarefasConcluidas * 2) + this.bugsCorrigidos;
    }

    public abstract String verificarDesempenho();

    public String getTipo() {
        return "Desenvolvedor";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarDesempenho() +
                '}';
    }

}