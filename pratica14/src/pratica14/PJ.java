package pratica14;

public class PJ extends Pessoa {
    private String CNPJ;
    private String IE;

    public PJ() {
        super();
        CNPJ = "";
        IE = "";
    }

    public PJ(String nome, String telefone, String endereco, String CNPJ, String IE) {
        super(nome, telefone, endereco);
        this.CNPJ = CNPJ;
        this.IE = IE;
    }

    @Override
    public String toString() {
        return super.toString() + ", CNPJ: " + CNPJ + ", IE: " + IE;
    }

    // Métodos getters e setters adicionados
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }
}


