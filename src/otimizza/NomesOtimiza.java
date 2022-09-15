package otimizza;

public class NomesOtimiza {
    public String retornaNome(String[] nomes){
        String nomeCompleto = "";
        for (int i = 0; i < nomes.length; i++) {
            nomeCompleto = nomeCompleto.concat(nomes[i] + " ");
        }
        return nomeCompleto;
    }

    public static void main(String[] args) {
        NomesOtimiza nomesOtimiza = new NomesOtimiza();
        String s = nomesOtimiza.retornaNome(new String[]{"CARLOS", "EDUARDO","Da", "PEREIRA", "MELO"});
        System.out.println(s);
    }
}
