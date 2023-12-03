package Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos funcionários serão cadastrados? ");
        int n = sc.nextInt();

        List<CadastroFuncionario> lista = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.printf("Funcionário %d \n", i + 1);
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();
            System.out.print("---------------\n");

            CadastroFuncionario dados = new CadastroFuncionario(nome, salario, id);
            lista.add(dados);


        }
        System.out.print("Informe o id do funcionário: ");
        int idfuncionario = sc.nextInt();
        Integer posicao = posicaoId(lista, idfuncionario);
        if (posicao == null) {
            System.out.println("Não existe!");
        }
        else {
            System.out.print("Qual porcentagem? ");
            double porcento = sc.nextDouble();
            lista.get(posicao).AumentoSalario(porcento);

        }
        System.out.print("Lista de funcionários: \n");
        for (CadastroFuncionario emp : lista) {
            System.out.println(emp);
        }
        sc.close();
    }


    public static Integer posicaoId(List<CadastroFuncionario> lista, int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                return i;
            }
        }
        return null;

    }
}



