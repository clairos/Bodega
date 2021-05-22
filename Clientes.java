public class Clientes {
    //--- I ---- Definição de Variáveis ----//
    private int nCodCli;
    private String aNomCli;
    private int nCpfCli;
    private boolean bCliMai;
    private boolean bFiaDoo;
    //--- F ---- Definição de Variáveis ----//

    //--- I ---- Construtores --------------//
    public Clientes(int nCodCli, String aNomCli, int nCpfCli, boolean bCliMai, boolean bFiaDoo) {
        this.nCodCli = nCodCli;
        this.aNomCli = aNomCli;
        this.nCpfCli = nCpfCli;
        this.bCliMai = bCliMai;
        this.bFiaDoo = bFiaDoo;
    }
    public Clientes(){
    }
    //--- F ---- Construtores --------------//

    //--- I ---- Getters & Setters ---------//
    public int getNCodCli() {
        return this.nCodCli;
    }

    public void setNCodCli(int nCodCli) {
        this.nCodCli = nCodCli;
    }

    public String getANomCli() {
        return this.aNomCli;
    }

    public void setANomCli(String aNomCli) {
        this.aNomCli = aNomCli;
    }

    public int getNCpfCli() {
        return this.nCpfCli;
    }

    public void setNCpfCli(int nCpfCli) {
        this.nCpfCli = nCpfCli;
    }

    public boolean isBCliMai() {
        return this.bCliMai;
    }

    public boolean getBCliMai() {
        return this.bCliMai;
    }

    public void setBCliMai(boolean bCliMai) {
        this.bCliMai = bCliMai;
    }

    public boolean isBFiaDoo() {
        return this.bFiaDoo;
    }

    public boolean getBFiaDoo() {
        return this.bFiaDoo;
    }

    public void setBFiaDoo(boolean bFiaDoo) {
        this.bFiaDoo = bFiaDoo;
    }
    //--- F ---- Getters & Setters ---------//
}