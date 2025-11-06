package atividadee1;

class PessoaFisica extends Pessoa {
    private String CPF;
    private String RG;

    public PessoaFisica(String nome, int idade, String endereco, String CPF, String RG) {
        super(nome, idade, endereco);
        this.CPF = CPF;
        this.RG = RG;
    }

    
    public void showData() {
        super.showData();
        System.out.println(" - CPF: " + CPF + " - RG: " + RG);
    }
}
