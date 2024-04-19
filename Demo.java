public class Demo {
    public static void main(String[] args) {
        System.out.println("Helllo");

        for (int i = 0; i < 10; i++) {
            // continu // unreachable
            System.out.println("hii");
            // continue;
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }

            System.out.println("hii " + i);

        }
    }
}
