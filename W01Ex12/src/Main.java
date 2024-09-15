public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
    System.out.println("TONG CAC SO LA BOI SO CUA 7 TU 1 DEN 100 LA:"+sum);
    }
}