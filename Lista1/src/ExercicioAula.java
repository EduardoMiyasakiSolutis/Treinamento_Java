public class ExercicioAula {

    public static void main(String[] args) {
        int qtdeIrmaos = 0;
        char sexo='F';
        double minhaAltura = 1.65;
        String meuNome="Rosi Teixeira";
        final int MES_NASCIMENTO = 12;

        System.out.println("Olá! Meu nome é " + meuNome);
        System.out.println("Sexo : " + sexo);
        System.out.println("Altura : " + minhaAltura);
        System.out.println("Mes de Nascimento : " + MES_NASCIMENTO);
        System.out.println("Quantidade de irmãos : " + qtdeIrmaos);

        String sexoEmString = String.valueOf(sexo);
        float alturaEmFloat = Float.valueOf(String.valueOf(minhaAltura));
    }
}
