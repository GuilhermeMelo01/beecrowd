package injecaodependencia;

import injecaodependencia.modelo.Cliente;
import injecaodependencia.notificacao.Notificador;
import injecaodependencia.notificacao.NotificadorSMS;
import injecaodependencia.service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente("João","joao@gmai.com", "8950485908");
        Cliente maria = new Cliente("Maria","mariazz@hotmail.com", "8942778392");

        Notificador notificador = new NotificadorSMS();

        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);
    }
}
