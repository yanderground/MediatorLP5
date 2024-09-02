package org.example;

public class Pessoa {

    public String elogiarSuporte(String mensagem) {
        return AtendimentoCliente.getInstancia().receberElogioSuporte(mensagem);
    }

    public String reclamarSuporte(String mensagem) {
        return AtendimentoCliente.getInstancia().receberReclamacaoSuporte(mensagem);
    }

    public String sugerirSuporte(String mensagem) {
        return AtendimentoCliente.getInstancia().receberSugestaoSuporte(mensagem);
    }
}

