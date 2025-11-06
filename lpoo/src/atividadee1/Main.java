package atividadee1;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoafisica = new PessoaFisica("Luis", 35, "Feira de Santana", "123.456.789-00", "0672598-29");
        PessoaJuridica pessoajuridica = new PessoaJuridica("Empresa Y", 10, "Salvador", "12.345.678/0001-99");

        System.out.println("DADOS PESSOA FISICA:");
        pessoafisica.showData();

        System.out.println("\nDADOS PESSOA JURIDICA:");
        pessoajuridica.showData();
    }
}
