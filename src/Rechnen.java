public class Rechnen {
    public static void main(String[] args) {

        float a = 0.124f;
        float summe = 0;
        for (int i=0; i < 10_000_000; i++)
            summe += a;

        System.out.println(summe);
    }
}
