package visao;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class TelaViagensString {

    public static int menu = 0;
    public static Scanner leia = new Scanner(System.in);
    public static ArrayList<String> viagens; 

    public static void main(String[] args) {
        viagens = new ArrayList <> ();
        viagens.add("Para�ba");
        viagens.add("Acre");
        viagens.add("Amazonas");
        viagens.add("Amap�");
        viagens.add("Minas Gerais");
        viagens.add("Tocantins");
        while (menu != 5) {
            menu = menu(new String[]{ "\n1.Cadastro", "2.Listar","3.Alterar","4.Excluir" ,"5.Sair\n" });
            switch (menu) {
            case 1:
                System.out.print("Digite seu destino:");
                viagens.add(leia.next());
                break;
            case 2:
                for (String v:viagens) {
                    System.out.println(v);    
                }
                break;
            case 3:
                System.out.print("Digite um �ndice do destino que deseja alterar:");
                int indice = leia.nextInt();
                System.out.print("Digite um novo destino:");
                String destino = leia.next();
                viagens.set(indice,destino);
                break;

            case 4:
                System.out.print("Digite um �ndice do destino que deseja excluir:");
                viagens.remove(leia.nextInt());
                break;
            case 5:
                System.out.println("Ariverdecci");
                break;
            default:
                System.out.println("N�o");
                break;
            }
        }
    }
 
    public static int menu(String[] itens) {
 
        for (String i : itens) {
            System.out.println(i);
        }
 
        return leia.nextInt();
    }
}