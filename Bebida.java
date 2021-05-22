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
        if ((bAlcOol = true) && (bCliMai = true)){
            nQtdEst--;
        }
        if ((bAlcOol = true) && (bCliMai = false)){
            System.out.println("volte daqui uns anos, kiddo.");
        }
    }
    //--- F ---- Definição de Métodos ------//
}
