package exercicios.slide;

public class ProgramaBranco {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente1.setNome("Eduardo");
        cliente2.setNome("Fernando");

        conta1.setNumero("123");
        conta1.setPrimeiroTitular(cliente1);
        conta1.setSegundoTitular(cliente2);
        conta1.setSaldo(100.0);
        System.out.println(conta1.getSaldo());
        conta1.debito(50);
        conta1.credito(100);
        System.out.println(conta1.getSaldo());
    }
}
