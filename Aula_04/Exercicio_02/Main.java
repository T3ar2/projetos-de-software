import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }

        for (int i = 0; i < 10; i++){
            if (lista.get(i) % 2 == 0 ) {
                System.out.println(lista.get(i));
            }
        }
    }
}