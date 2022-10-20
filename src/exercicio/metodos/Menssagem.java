package exercicio.metodos;

public class Menssagem {


    public static void obterMenssagem(int hora) {

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                menssagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                maenssagemBoaTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            menssagemBoaNoite();
            default:
                System.out.println("Hora invalida.");
                break;
        }
    }
    public static void menssagemBomDia(){
        System.out.println("Bom dia");
    }
    public static void maenssagemBoaTarde(){
        System.out.println("Boa Tade");
    }
    public static void menssagemBoaNoite(){
        System.out.println("Boa Noite");
    }

}
