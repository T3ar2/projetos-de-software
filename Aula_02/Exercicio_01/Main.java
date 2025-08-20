public class Main {
    public static void main(String[] args) {
        Cachorro chachorro = new Cachorro();
        Gato gato = new Gato();
        Passaro passaro = new Passaro();
        Animal animal = new Animal();

        chachorro.emitirSom();
        gato.emitirSom();
        passaro.emitirSom();
        animal.emitirSom();
    }
}