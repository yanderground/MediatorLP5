package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarSuporte() {
        Cliente cliente = new Cliente();
        assertEquals("O Atendimento ao Cliente agradece seu contato.\n" +
                        "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Suporte agradece o elogio: Atendimento rápido e eficiente",
                cliente.elogiarSuporte("Atendimento rápido e eficiente"));
    }

    @Test
    void deveReclamarSuporte() {
        Cliente cliente = new Cliente();
        assertEquals("O Atendimento ao Cliente agradece seu contato.\n" +
                        "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Suporte vai investigar o problema relacionado à reclamação: Produto não chegou no prazo",
                cliente.reclamarSuporte("Produto não chegou no prazo"));
    }

    @Test
    void deveSugerirSuporte() {
        Cliente cliente = new Cliente();
        assertEquals("O Atendimento ao Cliente agradece seu contato.\n" +
                        "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Suporte vai avaliar a sugestão: Incluir mais opções de pagamento",
                cliente.sugerirSuporte("Incluir mais opções de pagamento"));
    }
}
