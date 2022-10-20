package exercicio.metodos;

public class Emprestimo {

    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }
    public static int getQuatroParcelas(){
        return 4;
    }
    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static double getTaxaTresParcelas(){
        return 0.45;
    }
    public static double getTaxaQuatroParcelas(){
        return 0.5;
    }

    public static void calcular(double valor, int parcelas){

        if (parcelas == 2){

            double valorFinal = valor = (valor * getTaxaDuasParcelas());
            System.out.println("Valor do emprestimo em 2 parcelas de de: RS " + valorFinal);

        }else if (parcelas == 3){

            double valorFinal  = (valor * getTaxaTresParcelas());
            System.out.println("Valor do emprestimo em 3 parcelas de de: RS " + valorFinal);


        }else if (parcelas == 4){
            double valorFinal = (valor * getTaxaQuatroParcelas());
            System.out.println("Valor do emprestimo em 4 parcelas de de: RS " + valorFinal  );
        }else {
            System.out.println("Quanidade de parcelas invalida");
        }


    }
}




