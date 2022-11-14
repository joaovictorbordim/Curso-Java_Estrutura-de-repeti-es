public class Main {
    public static void main(String[] args) {
        /* Criar um programa que defina se é criança, adolescente, adulto ou idoso.
        * Criança <=12
        * Adolecente >13 até <18
        * Adulto >= 18 até <=60
        * Idoso >60 */

        int idade = 2;
        if(idade <12 ){
            System.out.println("Criança");
        } else if (idade >=12  && idade<=18) {
            System.out.println("Adolescente");
        } else if (idade >18 && idade <59) {
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }
    }
}