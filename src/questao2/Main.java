package questao2;

import questao1.AcharPedido;
import questao1.Usuario;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        DistribuicaoAlimento distribuicaoAlimentoProj = new DistribuicaoAlimento("Distribuição de Grãos", "Distribuição de grãos para famílias carentes", "Rua 123, Bairro X", "2023-01-01", "", "Arroz e Feijão", 1000.0f);


        TrabalhoVoluntario trabalhoVoluntarioProj = new TrabalhoVoluntario("Reforma de Escolas", "Voluntários reformando escolas", "Rua 456, Bairro Y", "2023-02-01", "2023-02-28", "Construção", 30);


        boolean isValid = distribuicaoAlimentoProj.validaProjeto(distribuicaoAlimentoProj.getNomeProjeto());
        System.out.println("O projeto '" + distribuicaoAlimentoProj.getNomeProjeto() + "' é válido? " + isValid);


        System.out.println("\nDetalhes do Projeto de Distribuição de Alimentos:");
        System.out.println(distribuicaoAlimentoProj.imprimeProjeto());

        System.out.println("\nDetalhes do Projeto de Trabalho Voluntário:");
        System.out.println(trabalhoVoluntarioProj.imprimeProjeto());
    }
}
