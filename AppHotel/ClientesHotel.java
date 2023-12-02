import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientesHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("     Dados do cliente ");
        System.out.print("Quantia de quartos para alugar: ");
        int n = sc.nextInt();

        List<AluguelQuarto> lista = new ArrayList<>();

        for(int i = 0; i < n ; i++){

            sc.nextLine();
            System.out.printf("\nCliente %d \n", i+1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Quarto: ");
            Integer quarto = sc.nextInt();
            System.out.print("\n=================");
            AluguelQuarto dados = new AluguelQuarto(nome,quarto);
            lista.add(dados);

        }
        System.out.println("  \n Lista de clientes\n");
        for(AluguelQuarto cliente:lista){
            System.out.println(cliente);
        }
        System.out.print("\n==================");
        System.out.print("\nDiga o quarto desejado: ");
        Integer QuartoDesejado = sc.nextInt();


        boolean encontrado = false;

        for(AluguelQuarto cliente:lista){
            if(cliente.getQuarto().equals(QuartoDesejado)){
                encontrado = true;
                System.out.print("Quarto "+QuartoDesejado+" alugado ");
                System.out.println("\nCliente: "+cliente.getNome());
                break;
            }

        }
        if(!encontrado){
            System.out.print("Quarto "+QuartoDesejado+" vago\n");
        }
        System.out.print("\n=================");
        System.out.println("\n   Lista atualizada");
        for(AluguelQuarto ocupados:lista){
            System.out.println(ocupados);
        }
        sc.close();
    }
}

