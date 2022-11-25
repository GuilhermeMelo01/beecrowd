package injecaodependencia.notificacao;

import injecaodependencia.modelo.Cliente;

public class NotificadorSMS implements Notificador {
    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através do telefone %s: %s\n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }

}
