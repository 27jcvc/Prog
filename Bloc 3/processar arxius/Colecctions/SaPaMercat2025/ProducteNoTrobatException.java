public class ProducteNoTrobatException extends Exception {
    String missatge;

    public ProducteNoTrobatException(String missatge) {
        this.missatge = missatge;
    }

}
