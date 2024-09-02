package org.example;
public class AtendimentoCliente{

    private static AtendimentoCliente instancia = new AtendimentoCliente();

    private AtendimentoCliente() {}

    public static AtendimentoCliente getInstancia() {
        return instancia;
    }

    public String receberElogioSuporte(String mensagem) {
        return "O Atendimento ao Cliente agradece seu contato.\n" +
                "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Suporte.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoSuporte(String mensagem) {
        return "O Atendimento ao Cliente agradece seu contato.\n" +
                "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Suporte.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoSuporte(String mensagem) {
        return "O Atendimento ao Cliente agradece seu contato.\n" +
                "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Suporte.getInstancia().receberSugestao(mensagem);
    }
}
