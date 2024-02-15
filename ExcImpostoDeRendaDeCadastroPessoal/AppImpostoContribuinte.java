package ExcImpostoDeRendaDeCadastroPessoal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppImpostoContribuinte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<CadastroPessoa> pessoaList = new ArrayList<>();
        System.out.print("Quantia de contribuinte: ");
        int n = sc.nextInt();

        for(int i = 1;i <= n;i++){
            System.out.printf("--Dados do %d° contribuinte-- ",i);
            sc.nextLine();
            System.out.print("\nIndividual ou empresa(i/e): ");
            String cpfOuCnpj = sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Despesa anual: ");
            Double despesa = sc.nextDouble();

            if(cpfOuCnpj.equalsIgnoreCase("i")){
                System.out.print("Gastos com saúde: ");
                Double gastosSaude = sc.nextDouble();
                pessoaList.add(new ImpostoCpf(nome,despesa,gastosSaude));

            }
            else{
                System.out.print("Quantidade de funcionários: ");
                int funcionarios = sc.nextInt();
                pessoaList.add(new ImpostoCnpj(nome,despesa,funcionarios));
            }

        }
        System.out.println();
        System.out.print("Impostos a pagar \n");
        double som = 0;
        for(CadastroPessoa cad:pessoaList){
            System.out.println(cad.getNome()+": $ "+String.format("%.2f",cad.imposto()));
            som += cad.imposto();


        }
        System.out.println();
        System.out.print("Valor somado: $"+String.format("%.2f",som));
        sc.close();
    }

}