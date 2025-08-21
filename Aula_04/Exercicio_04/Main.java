import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Sabonete", 10);
        mapa.put("Shampoo", 25);
        mapa.put("Condicionador", 22);
        mapa.put("Creme Dental", 8);
        mapa.put("Escova de Dente", 12);
        mapa.put("Fio Dental", 5);
        mapa.put("Desodorante", 15);
        mapa.put("Hidratante Corporal", 30);
        mapa.put("Protetor Solar", 45);
        mapa.put("Alcool em Gel", 18);

        System.out.println(mapa);


        for(Map.Entry<String,Integer> entrada: mapa.entrySet()){
            if (entrada.getValue() > 10){
                System.out.println(entrada);
            }
        }
    }
}