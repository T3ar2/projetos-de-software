import java.util.*;

public class    Main {
    public static void main(String[] args) {

        String[] nomes = new String[3];

        for (int i = 1; i < nomes.length; i++) {

            nomes[i] = "Nome";
            System.out.println(nomes[i]);
        }

        System.out.println("Começo do ArrayList:");
        ArrayList<String> nomesList = new ArrayList<>();
        nomesList.add("Nicollas");
        nomesList.add("Minecraft");
        nomesList.add("Luiz-Kawai");

        System.out.println(nomesList);
        System.out.println(nomesList.get(0));
        System.out.println(nomesList.contains("Minecraft"));

        System.out.println("Começo do Set:");
        Set<String> coisas = new HashSet<String>();
        coisas.add("Sword");
        coisas.add("Shield");
        coisas.add("Bastãozão");
        System.out.println(nomesList.contains("Minecraft"));

        System.out.println();
        System.out.println("Começo do Map:");
        Map<Integer, String> alunos = new HashMap<>();
        alunos.put(12, "Pedro");
        alunos.put(15, "Cleitin");
        alunos.put(18, "João");
        System.out.println(alunos);
        System.out.println(alunos.get(15));

    }
}