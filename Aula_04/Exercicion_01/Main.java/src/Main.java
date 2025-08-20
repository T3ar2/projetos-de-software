import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        String[] nomes = new String[3];

        for (int i = 1; i < nomes.length; i++) {

            nomes[i] = "Nome";
            System.out.println(nomes[i]);
        }

        ArrayList<String> nomesList = new ArrayList<>();
        nomesList.add("Nicollas");
        nomesList.add("Minecraft");
        nomesList.add("Luiz-Kawai");

        System.out.println(nomesList);
    }
}