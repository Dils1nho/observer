class PessoaJuridica extends Pessoa {
    private String CNPJ;

    public PessoaJuridica(String nome, int idade, String endereco, String CNPJ) {
        super(nome, idade, endereco);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

   
    public void showData() {
        super.showData();
        System.out.println("CNPJ: " + CNPJ);
    }
}