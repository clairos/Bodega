import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Bodega{
    public static void main(String[] args){
        //--- I ---- Variáveis -------------//
        List<Bebida> bebidas = new ArrayList<Bebida>();
        List<Clientes> cachaceiros = new ArrayList<Clientes>();
        Scanner scanner = new Scanner(System.in);
        File txt = new File("C:\\Users\\clara\\OneDrive\\Área de Trabalho\\UFFS\\Bodega\\arquivo.txt");
        boolean cunt = true;
        //--- F ---- Variáveis -------------//
        
        //--- teste ler arquivo ------------//
        try {
            FileInputStream fi = new FileInputStream(txt);
            ObjectInputStream oi = new ObjectInputStream(fi);
            while (cunt){
                Bebida b = (Bebida) oi.readObject();
                if (b != null){
                    bebidas.add(b);
                    b = null;
                }
                else{
                    cunt = false;
                }
            }
            fi.close();
            oi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException e) {
            System.out.println("Erro ao inicializar stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //--- teste ler arquivo ------------//

        while (true){
            //--- I ---- Menu ------------------//
            System.out.println("--------- MENU ---------");
            System.out.println("|1.| CADASTRAR BEBIDA");
            System.out.println("|2.| MOSTRAR BEBIDAS");
            System.out.println("|3.| COMPRAR BEBIDA");
            System.out.println("|4.| VENDER BEBIDA");
            System.out.println("|5.| CADASTRAR CLIENTE");
            System.out.println("|6.| MOSTRAR CLIENTES");
            System.out.println("|7.| SALVAR E SAIR");
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

            //--- I ---- Salvar e Sair ---------//
            if (leitor == 7){
                scanner.close();
                //------ teste salvar aquivo ------//
                try {
                    FileOutputStream arq = new FileOutputStream(txt);
                    ObjectOutputStream o = new ObjectOutputStream(arq);

                    for (int i = 0; i < bebidas.size(); i++){
                        o.writeObject(bebidas.get(i));
                    }
                    o.close();
                    arq.close();
                } catch (FileNotFoundException e) {
                    System.out.println("Arquivo não existe");
                } catch (IOException e) {
                    System.out.println("Erro ao inicializar stream");
                } 
                //------ teste salvar aquivo ------//
                System.exit(0);
            }
            //--- F ---- Sair ------------------//

            //--- I ---- Mensagem Erro --------//
            if ((leitor != 1) && (leitor != 2) && (leitor != 3) && (leitor != 4) && (leitor != 5) && (leitor != 6) && (leitor != 7) && (leitor != 69)){
                System.out.println("Por favor, escolha um item que está no menu :)");    
            }
            //--- F ---- Mensagem Erro --------//

            if (leitor == 69){
                System.out.println();
                System.out.println("oh.");
                System.out.println("heh");
                System.out.println("nice");
                System.exit(0);
            }
        }
    }
}