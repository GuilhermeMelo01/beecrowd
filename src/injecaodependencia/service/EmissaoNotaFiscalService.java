package injecaodependencia.service;

import injecaodependencia.modelo.Cliente;
import injecaodependencia.modelo.Produto;
import injecaodependencia.notificacao.Notificador;

public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador){
        this.notificador = notificador;
    }

    public void emitirNota(Cliente cliente, Produto produto){
        // TODO emite nota fiscal aqui...

        notificador.notificar(cliente, "Nota fiscal do produto " + produto.getNome() + " foi emitida!");
    }

}
