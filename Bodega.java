import java.util.Scanner;

public class Bodega{
    public static void main(String[] args){
        //--- I ---- horse ------------------//
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
        //--- F ---- horse -----------------//

        //--- I ---- Variáveis -------------//
        
        //--- F ---- Variáveis -------------//

        //--- I ---- Menu ------------------//
        System.out.println("MENU:");
        System.out.println("1. Cadastrar bebida\n2. Mostrar bebidas\n3. Comprar bebida\n4. Vender bebida");
        System.out.println("5. Cadastrar cliente\n6. Mostrar clientes\n7. Sair");
        //--- F ---- Menu ------------------//

        //--- I ---- Scan Menu -------------//
        Scanner scan = new Scanner(System.in);
        String leitor = scan.nextLine();
        //--- F ---- Scan Menu -------------//

        //--- I ---- Cadastrar Bebida ------//
        if (leitor == "1"){
            System.out.println("Código do Produto: ");
            int produto = scan.nextInt();
            System.out.println("Nome do Produto: ");
            String descricao = scan.nextLine();
            System.out.println("Conteúdo líquido em ml: ");
            int mls = scan.nextInt();
            System.out.println("Preço de venda: ");
            float preco = scan.nextFloat();
            System.out.println("Quantidade em estoque: ");
            int estoque = scan.nextInt();
            System.out.println("Possui teor alcoólico? ");
            boolean alcool = scan.nextBoolean();
            Bebida bebida = new Bebida(produto,descricao,mls,preco,estoque,alcool);
        }
        //--- F ---- Cadastrar Bebida ------//

        //--- I ---- Mostrar Bebida --------//
        if (leitor == "2"){

        }
        //--- F ---- Mostrar Bebida --------//

        //--- I ---- Comprar Bebida --------//
        if (leitor == "3"){

        }
        //--- F ---- Comprar Bebida --------//

        //--- I ---- Vender Bebida ---------//
        if (leitor == "4"){

        }
        //--- F ---- Vender Bebida ---------//

        //--- I ---- Cadastrar Cliente -----//
        if (leitor == "5"){

        }
        //--- F ---- Cadastrar Cliente -----//

        //--- I ---- Mostrar Clientes ------//
        if (leitor == "6"){

        }
        //--- F ---- Mostrar Clientes ------//

        //--- I ---- Sair ------------------//
        if (leitor == "7"){
        System.exit(0);
        }
        //--- F ---- Sair ------------------//

        scan.close();
    }
}