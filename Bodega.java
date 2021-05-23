import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Bodega{
    public static void main(String[] args){
        //--- I ---- horsie ----------------//
        System.out.println(""" 
        ......................................+o:.......................................................................
..........................dyso/.....sNMMyshdddhs/...............................................................
..........................ysshdho:-dMMMMMMMMMMNNmh..............................................................
...........................ysNMNyhNMMMMMMMMMMMMMMNdo-...........................................................
..............so/..........-hMMMmNMMMMMMMMMMMMMMMMMMNh:.........................................................
..............dssy+-...-o:.:NMMMMMMMMMMMMMMMMMMMMMMMMMNs........................................................
..............hssssys/-yMmsNMMMMMMMMMMMMMMMMMMMMMMMMMNds........................................................
..............+ysshysyymMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNs.......................................................
...............hsssyhyssydmMMMMMMMMMMMMMNmdmNMMMMMMMMNmmd-......................................................
.............../hssssyhysssydMMMMMMMmmddyssssyhmNNMNMm:.........................................................
................oysssssyhyysshNMNNmdssssssssssyyyyhy/-..........................................................
.................+ysssssydhyssymyyyssssssssssssyysssy/..........................................................
..................:sysssssdsssshyyyyssssssssdsyysssssys/.....-/oyys/-...........................................
..............----.oMNdyssyssssyyyssssssssssss-/osyssssyso++sdmmmNNNd/..........................................
..............ymmmmNMMMMNmhysssyysssyysssssssss` .:ossyssyddmNNNmmmNNd/.........................................
...............+NMMMMMMMMmossyyyyyssssssssssssss`   `.ohhhdNNNmNNmmmmmy.........................................
................:mMMMMMMMhoosyyyyyysssyyyyysssssy. `-/oohhdmNNNmmmmmdmd.........................................
.................:NMMMMMMhooosyyyyyyssysssssssysyhsdms:soyyyhdNmmdmmdds.........................................
............./+oo+yMMMMMMdooosssyyyyyyyssssyhhhdmNNNNNdd:.yysyydddddd+..........................................
.............hNMMMMMMMMMNsoooossssyyyyyyyyhdmmmmmmNNNNmdysshsssssyyyyyo:........................................
............../mMMMMMMMMdsooossssssyyyyyhdmNNNNmmmmmNNNdhssssssooshyyssys/-.....................................
...............-dMMMMMMMyssssssssssssssddNNmmNNNNmmddmmddsssssoooshhossssyyo-...................................
.................dMMMMMMyssssssssssyyhydmNNNNmmmNNmddddmdssssssssossy:./oyssyo-.................................
.................-mMMMMMdsyyyssyyyyssyyydmNNNNmddmmmddmmyssssssssssssyo` `:+ysys:...............................
................../MMMMMNdysyyydyssssoosshdmNmmmmddmmmhysssssssosssssssy-    -oyhs:.............................
.............+mNNmdMMMMMyssssssydssossssssshhdmmmdhhysssssssssssssssssssy+     `:shs-...........................
..............+mMMMMMMMMdysssssshysssssssssssssssssssssssssssssssssssssssys`      .+ds-.........................
................+NMMMMMMMdsssssssdssssssssssssssssssssssssssssssssssssssssyy.        /h+........................
.................-hMMMMMMmssssssssdsssssssssssssssssssssssssssssssssssssssssh:         `:/:.....................
...................oMMMMMNNssssssssdyssssssssssssssssssssmsssssssssssssssssssy+           +:....................
................:oyymMMMMMMhssssssssdysssssssssssssssssssmsssssssssssssssssyhyys   :/-``..+o....................
................/yNMMMMMMMMdssssssssshhysssssssssssssssshhsssssssssssssssshhsymMmho:.:o-...-o:..................
..................-omMMMMMMmsssssssshyshhyssssssssssssshdsssssssssssssssssdyshMMMMMMh--s-....+/.................
....................-oNMMMMMNysssssssyhysshhhyyyyyyhhhhhhhhhyyssssssssyysssdsshmNMMMMd.::.....o-................
......................:dMMMMMmssyssssssyhyyysssyyyyyysssssssyyhhhhhyhdysssssssssymMMMd........-s................
....................+shdMMMMMNssyyyysssssssyhhhhhhhhyooosssssssssshodsssyhhhyysssssyyh........-s................
....................+ymMMMMMMNdsyyyyysssssssssssssssooooossssssoooshosyhhyyssyhhyysssys......:o-................
......................-/hMMMMMMyssyyssssssoooooosooooooosssssssossssy--oyyssssssyyyhhyd:::/+y:..................
........................./NMMMMhssysssssssoooooossssoosooooooooossssyy-.-+syyyssyhdhyyyyyyd+o/..................
........................+hNMMMMdsssyyyyssssooooooooooooooooooosssssssyy....-://++/:--://:::s/o+.................
........................+ydNMMMhssssyyyysssoooooooooooosooooosssssssssys:-.................-sos/................
...........................:sNMysssssyyyysssooooooooossssssssssssssssssydyyyo/:.............-o`//...............
.............................:dsssssssysssssoooooossssssssssssssssssssoshdyssyyyo:...........-+`+/..............
..............................ohsssssssssoosooooossssssssssssssssssssoossdmmhyssyyyo:.........-syh/.............
///::::-------..............-ohmyyysssssssssssssssssssssssssssssssssooososmNyddysssyyy/-.......-yyy.............
sssssssssssooooooo++++++++/+hyyhmyyyysssssssssssssssssssssssssssssssoooooomdhmddhsssssyyo........-..............
sssssssssssssssssssssssssssmssshmdhyyyyssysyssssssssssssssssssssssssooooshmyymsshmysssssm/......................
ssssssssssssssssssssssssssyNsssssyhddhhyyyyyssyyysssssssssssssooooooosshdhydmhyyhdddssshdh-.....................
ssssssssssssssssssssssssssmhdhyssssssyhhddhyyyyyyysssssssssssssssssyhhhdyyddysyydhhddysNyyd/....................
+++ooooooooooooooooooooosyNhhdmmhyssssssssyhhddhhyyyysyyyyyhhhddhhhdssyymdyhysysdyssydhyhhhd+...................
.............--------:::yhysssshmmdhyssssssssshdmhyymyyyymyyssdyyyydddhhyyhmhyysyyssyymdssssyh..................
.......................shssssssssydhddhsssssssssshdhmyyyyhhyhhdmddhhdssssssdsyyyhyyhhddhmysssyh-................
....................../dsssssssssssdhshdhssssssssssyhmmhhhdhydyssyhddyssssyhyysysssssdyyhmysssymo...............
......................hsssssssssssssdhssymhsssssssssssyddyyhmhsssssdsyhysssyhyydsssssdsysymyssshmy/.............
.....................:dssssssssssssssdyssshmhssssssssssssdddyhhysshyssshhysssymhhhhssyshssymssssdyys-...........
.....................sysssssssssssssssmsssssdmssssssssssssshdysssyhhhyyyhysssymysyhyssyhydyymssssmssyo..........
.....................msssssssssssssssshdsssssymysssssssssssssdNdsshsssyhmhhhyyhyyyyhsssssmhhddsssdhsssh/........                           +MMm                                           
`/sdmNd:                           +MMy                                           
syyddmMMMMh`                         /MMh        `````             `.``    `-..`    
dN.  .mMMMM/      `/syys/.        .:o+dMN`    -+o+ydddhhy-      `-+osdh-  :dydmmy.  
sMN-  +MMMm-     /mMy..smNh/.   `/m/` `mMy   sh/---NMMMMMo    .ods. oMMMy-Nd  /MMy  
`hMm. oMNh.     /MMo    .yMMNh/`dMN    :Nm-  dMMM/:::::::`   `mNh`  oMMMMyMh  :MMN/ 
/MMdomd/.---`  dMm      `yMMMNyMMM.    yNy  +MMM/           .MM/   sMMMmmMMsomMMmNo
mMMNdhmNNNNd` mMd       -MMMMMMMMy`   oMM:  /dMNy.          /dd::sNMMd--ymMMMNo`hM
yMMo..-mMMMM- yMM.      sMMMNhMMMMs`  -NMm`  `-+yyo++++       `.::syN/`   .-:/-  .+
yMM+   /MMMM- `yNd.   -yMMNs-`/ydMMhsosmmm.       ```''      `-------ds             
mMM+   oMMMm`   :ydooymmy/`     `.---.````              `:ymNds/:/yNM+            
.MMN. `sMMNs`      ``````                                +MMd:`    `mMy            
+MMhsdmds/`                                              +MMh       dMy            
+so++/:.`                                                 `dMMo_____NMo            
 """);
        //--- F ---- horsie ----------------//

        //--- I ---- Variáveis -------------//
        List<Bebida> bebidas = new ArrayList<Bebida>();
        List<Clientes> cachaceiros = new ArrayList<Clientes>();
        Scanner scanner = new Scanner(System.in);
        //--- F ---- Variáveis -------------//

        //--- I ---- Menu ------------------//
        while (true){
            System.out.println("--------- MENU ---------");
            System.out.println("|1.| CADASTRAR BEBIDA");
            System.out.println("|2.| MOSTRAR BEBIDAS");
            System.out.println("|3.| COMPRAR BEBIDA");
            System.out.println("|4.| VENDER BEBIDA");
            System.out.println("|5.| CADASTRAR CLIENTE");
            System.out.println("|6.| MOSTRAR CLIENTES");
            System.out.println("|7.| SAIR");
            System.out.println("------------------------");
            //--- F ---- Menu ------------------//

            //--- I ---- Scan Menu -------------//
            int leitor = scanner.nextInt();
            //--- F ---- Scan Menu -------------//

            //--- I ---- Cadastrar Bebida ------//
            if (leitor == 1){
                System.out.print("Código do Produto: ");
                int produto = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nome do Produto: ");
                String descricao = scanner.nextLine();
                System.out.print("Conteúdo líquido em ml: ");
                int mls = scanner.nextInt();
                System.out.print("Preço de venda: ");
                float preco = scanner.nextFloat();
                System.out.print("Quantidade em estoque: ");
                int estoque = scanner.nextInt();
                System.out.print("Possui teor alcoólico ('true' ou 'false'): ");
                boolean alcool = scanner.nextBoolean();
                Bebida cachaça = new Bebida(produto,descricao,mls,preco,estoque,alcool);
                bebidas.add(cachaça);
            }
            //--- F ---- Cadastrar Bebida ------//

            //--- I ---- Mostrar Bebidas -------//
            if (leitor == 2){
                for (int i = 0; i < bebidas.size(); i++){
                    Bebida b = bebidas.get(i);
                    System.out.println("---------------------------------------");
                    System.out.println("Código: " + b.getNCodPro());
                    System.out.println("Nome: " + b.getADesPro());
                    System.out.println("Conteúdo líquido em ml: " + b.getNQtdMls());
                    System.out.println("Preço: " + b.getFPreBas());
                    System.out.println("Quantidade em estoque: " + b.getNQtdEst());
                    System.out.println("Possui teor alcoólico: " + b.getBAlcOol());
                    System.out.println("---------------------------------------");
                }
            }
            //--- F ---- Mostrar Bebidas -------//

            //--- I ---- Comprar Bebida --------//
            if (leitor == 3){
                System.out.print("Código da bebida: ");
                int codigo = scanner.nextInt();
                System.out.print("Quantidade de entrada: ");
                int entrada = scanner.nextInt();
                for (int i = 0; i < bebidas.size(); i++){
                    if (bebidas.get(i).getNCodPro() == codigo){
                        bebidas.get(i).compraBebida(entrada);
                    }
                }
            }
            //--- F ---- Comprar Bebida --------//

            //--- I ---- Vender Bebida ---------//
            if (leitor == 4){
                System.out.print("Código do cliente: ");
                int codcli = scanner.nextInt();
                System.out.print("Código da bebida: ");
                int codpro = scanner.nextInt();
                System.out.print("Quantidade da compra: ");
                int saida = scanner.nextInt();
                Clientes cliente = new Clientes();
                for (int i = 0; i < cachaceiros.size(); i++){
                    if (cachaceiros.get(i).getNCodCli() == codcli){
                        cliente = cachaceiros.get(i);
                    }
                }
                for (int i = 0; i < bebidas.size(); i++){
                    if (bebidas.get(i).getNCodPro() == codpro){
                        bebidas.get(i).vendeBebida(cliente, saida);
                    }
                }
            }
            //--- F ---- Vender Bebida ---------//

            //--- I ---- Cadastrar Cliente -----//
            if (leitor == 5){
                System.out.print("Código: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                System.out.print("O cliente é maior de idade ('true' ou 'false'): ");
                boolean adulto = scanner.nextBoolean();
                System.out.print("Vender fiado ('true' ou 'false'): ");
                boolean fiado = scanner.nextBoolean();
                Clientes cliente = new Clientes(codigo, nome, cpf, adulto, fiado);
                cachaceiros.add(cliente);
            }
            //--- F ---- Cadastrar Cliente -----//

            //--- I ---- Mostrar Clientes ------//
            if (leitor == 6){
                for (int i = 0; i < cachaceiros.size(); i++){
                    Clientes c = cachaceiros.get(i);
                    System.out.println("---------------------------------------");
                    System.out.println("Código do cliente: " + c.getNCodCli());
                    System.out.println("Nome do cliente: " + c.getANomCli());
                    System.out.println("CPF: " + c.getACpfCli());
                    System.out.println("+18: " + c.getBCliMai());
                    System.out.println("Vender fiado: " + c.getBFiaDoo());
                    System.out.println("---------------------------------------");

                }
            }
            //--- F ---- Mostrar Clientes ------//

            //--- I ---- Sair ------------------//
            if (leitor == 7){
                scanner.close();
                System.exit(0);
            }
            //--- F ---- Sair ------------------//
        }
    }
}