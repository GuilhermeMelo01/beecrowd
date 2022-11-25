package injecaodependencia.notificacao;

import injecaodependencia.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);
}
