package lambda.test;

import lambda.core.Cliente;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClienteLambdaTest {
    public static void main(String[] args) {
        List<Cliente> clientes = Arrays.asList(
                new Cliente("1234567890", "João", 19),
                new Cliente("5452352552", "Marcos", 43),
                new Cliente("5234522646", "Miguel", 43),
                new Cliente("1234562430", "Carlos", 23),
                new Cliente("1205470450", "Guilherme", 20),
                new Cliente("3454567890", "Flavio", 18),
                new Cliente("1254235490", "Santos", 18),
                new Cliente("1234567542", "Alfredo", 22),
                new Cliente("1276522311", "Tavares", 18));

        List<Cliente> collect = clientes.stream()
                .sorted(Comparator.comparing(Cliente::getNome)).toList();

    }
}
