public class ConversaoLongParaInt {
    public static void main(String[] args) {
        long x = 10;
        // int y =  x; // Erro de compilação
        int y = (int) x; // Conversão explícita
        System.out.println(x);
        System.out.println(y);
    }
    
}
