public class Clientes {
    //--- I ---- Definição de Variáveis ----//
    private int nCodCli;
    private String aNomCli;
    private int nCpfCli;
    private boolean bCliMai;
    private boolean bFiaDoo;
    //--- F ---- Definição de Variáveis ----//

    //--- I ---- Construtores --------------//
    public Clientes(int codigo, String nome, int cpf, boolean adulto, boolean fiado) {
        this.nCodCli = codigo;
        this.aNomCli = nome;
        this.nCpfCli = cpf;
        this.bCliMai = adulto;
        this.bFiaDoo = fiado;
    }
    public Clientes(){
    }
    //--- F ---- Construtores --------------//

    //--- I ---- Getters & Setters ---------//
    public int getNCodCli() {
        return this.nCodCli;
    }

    public void setNCodCli(int codigo) {
        this.nCodCli = codigo;
    }

    public String getANomCli() {
        return this.aNomCli;
    }

    public void setANomCli(String nome) {
        this.aNomCli = nome;
    }

    public int getNCpfCli() {
        return this.nCpfCli;
    }

    public void setNCpfCli(int cpf) {
        this.nCpfCli = cpf;
    }

    public boolean isBCliMai() {
        return this.bCliMai;
    }

    public boolean getBCliMai() {
        return this.bCliMai;
    }

    public void setBCliMai(boolean adulto) {
        this.bCliMai = adulto;
    }

    public boolean isBFiaDoo() {
        return this.bFiaDoo;
    }

    public boolean getBFiaDoo() {
        return this.bFiaDoo;
    }

    public void setBFiaDoo(boolean fiado) {
        this.bFiaDoo = fiado;
    }    
    //--- F ---- Getters & Setters ---------//
}