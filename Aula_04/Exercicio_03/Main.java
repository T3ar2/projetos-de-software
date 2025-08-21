    import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        
        Set<String> bomdia =  new HashSet<String>();
        bomdia.add("Joao");
        bomdia.add("Maria");
        bomdia.add("Pedro");
        bomdia.add("Ana");
        bomdia.add("Lucas");
        System.out.println(bomdia);
        System.out.println(bomdia.contains("Ana"));
        bomdia.remove("Ana");
        System.out.println(bomdia);

    }
}
