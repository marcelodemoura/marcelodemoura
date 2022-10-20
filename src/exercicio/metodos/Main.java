package exercicio.metodos;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3, 6);
        Calculadora.sub(1, 8);
        Calculadora.mul(7, 9);
        Calculadora.div(5, 2.5);


        // Menssagem
        System.out.println("Exercico Mensagem");
        Menssagem.obterMenssagem(9);
        Menssagem.obterMenssagem(14);
        Menssagem.obterMenssagem(1);

        // Emprestimo
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, Emprestimo.getQuatroParcelas());
        Emprestimo.calcular(1000, 5);




    }
}
