public class Bebida {
    //--- I ---- Definição de Variáveis ----//
    int nCodPro;
    String aDesPro;
    int nQtdMls;
    float fPreBas;
    int nQtdEst;
    int nEntEst;
    int nSaiEst;
    boolean bAlcOol;
    //--- F ---- Definição de Variáveis ----//

    //--- I ---- Definição de Métodos ------//
    public void compraBebida(){
        this.nEntEst = nEntEst;
        nQtdEst = nQtdEst + nEntEst;
    }

    public void vendeBebida(){
        Clientes bCliMai = new Clientes();
        if (bAlcOol = true){
            if(bCliMai = true){
            nQtdEst--;
            }
            else{
                System.out.println("tente de novo daqui uns anos, kiddo.");
            }
        }
        else{
            nQtdEst--;
        }
    }
    //--- F ---- Definição de Métodos ------//
}
