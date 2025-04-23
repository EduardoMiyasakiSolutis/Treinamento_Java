package bcdadosnew;

public class ChamadasBancoNovo {

    public static void main(String[] args) {
        Conexao abn = new Conexao();
        AcessoBancoNovo access = new AcessoBancoNovo(abn);
//        access.criarTabela();
//        System.out.println("");
//
//        access.inserirRegTab();
//        System.out.println("");
//
//        access.alteraRegistro();
//        System.out.println("");

        access.deletaRegistro();
        System.out.println("");
    }
}
