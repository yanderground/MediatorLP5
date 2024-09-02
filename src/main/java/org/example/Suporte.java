package org.example;

public class Suporte implements Departamento {

    private static Suporte instancia = new Suporte();

    private Suporte() {}

    public static Suporte getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Suporte vai investigar o problema relacionado à reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Suporte agradece o elogio: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Suporte vai avaliar a sugestão: " + mensagem;
    }
}
