import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Amanda");
        nomes.add("Arthur");
        nomes.add("Alice");
        nomes.add("Antônio");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Daniel");
        nomes.add("Erica");
        nomes.add("Fábio");
        nomes.add("Gabriela");
        nomes.add("Henrique");
        nomes.add("Isabela");
        nomes.add("João");
        nomes.add("Larissa");
        nomes.add("Marcelo");
        nomes.add("Natália");
        nomes.add("Otávio");
        nomes.add("Paula");
        nomes.add("Rafael");

        System.out.println(nomes);

        Iterator<String> iterator = nomes.iterator();

       while (iterator.hasNext()) {
            String nome = iterator.next();
            if (nome.startsWith("A") || nome.startsWith("a")) {
                iterator.remove();
            }
        }
        System.out.println(nomes);
    }
}