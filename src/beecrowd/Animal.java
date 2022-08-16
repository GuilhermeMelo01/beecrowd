package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String opcao1, opcao2, opcao3, animal = "";

        opcao1 = scanner.nextLine();
        opcao2 = scanner.nextLine();
        opcao3 = scanner.nextLine();

        if (opcao1.equals("vertebrado")) {
            if (opcao2.equals("ave")) {
                if (opcao3.equals("carnivoro")) {
                    animal = "aguia";
                } else if (opcao3.equals("onivoro")) {
                    animal = "pomba";
                }
            } else if (opcao2.equals("mamifero")) {
                if (opcao3.equals("onivoro")) {
                    animal = "homem";
                } else if (opcao3.equals("herbivoro")) {
                    animal = "vaca";
                }
            }
        } else if (opcao1.equals("invertebrado")) {
            if (opcao2.equals("inseto")) {
                if (opcao3.equals("hematofago")) {
                    animal = "pulga";
                } else if (opcao3.equals("herbivoro")){
                    animal = "lagarta";
                }
            } else if (opcao2.equals("anelideo")) {
                if (opcao3.equals("hematofago")) {
                    animal = "sanguessuga";
                } else if (opcao3.equals("onivoro")) {
                    animal = "minhoca";
                }
            }
        }

        System.out.println(animal);
    }
}
