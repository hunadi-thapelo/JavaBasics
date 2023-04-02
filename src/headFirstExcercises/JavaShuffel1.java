package headFirstExcercises;

public class JavaShuffel1 {
    public static void main(String[] args) {
        int x = 3;

        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }

            if (x == 2) {
                System.out.print("b c");
            }

            if (x == 1) {
                System.out.println("d");
                x = x - 1;
                break;
            }
            x= x - 1;
            System.out.print("-");
        }

    }

}
