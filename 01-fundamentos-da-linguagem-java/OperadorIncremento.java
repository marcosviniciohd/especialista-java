

public class OperadorIncremento {
    public static void main(String[] args) {
        int totalDownloads = 10;
        totalDownloads += 1;

        totalDownloads++;
        System.out.println(totalDownloads);

        //int novoTotalDownloads = totalDownloads++;
        int novoTotalDownloads = ++totalDownloads;



        System.out.println("Total Download: " + totalDownloads);
        System.out.println("Novo Total Download: " + novoTotalDownloads);
    }
}
