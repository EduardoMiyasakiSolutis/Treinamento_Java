public class Teste {
    public static void main(String[] args) {

        try {
            args[0] = "5";
            args[1] = "10";
            if (args.length > 0) {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                System.out.println("Resultado:" + num1 / num2);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("a");
        }
    }

}

