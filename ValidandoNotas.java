public class ValidandoNotas{

public static void main(String args[]){
    int nota1 = 6;
    int nota2 = 3;
    int nota3 = 1;
    int nota4 = 7;

    int media = (nota1 + nota2 + nota3 + nota4)/4;
    if(media >= 7){
        System.out.println("aprovado");
    } else if (media >=5){
        System.out.println("recuperação");
    } else {
        System.out.println("Reprovado");
    }
    }
}