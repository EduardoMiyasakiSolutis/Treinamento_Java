public class ExercicioExtra {

    public static void main(String[] args) {

        double x = 13;
        double y = 0;

        while (y != 1.0) {
            if (x % 2 == 0) {
                y = x / 2;
            } else {
                y = 3 * x + 1;
            }
            x = y;
        System.out.println(y);
        }
    }
}
