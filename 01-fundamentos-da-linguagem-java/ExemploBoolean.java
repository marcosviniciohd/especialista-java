public class ExemploBoolean {
    public static void main(String[] args) {
        boolean compraAprovada = true;
        boolean clienteBloqueado = false;

        System.out.println(compraAprovada);
        System.out.println(clienteBloqueado);

        if (compraAprovada && !clienteBloqueado) {
            System.out.println("Compra pode ser realizada.");
        } else {
            System.out.println("Compra não pode ser realizada.");
        }
    }
}
