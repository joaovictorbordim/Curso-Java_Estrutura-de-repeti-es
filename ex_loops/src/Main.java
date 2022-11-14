public class Main {
    public static void main(String[] args) {

      /* loop
      while  (condição){
            Execulta (while = enquanto) essa condição for verdadeira;
            }
       */
       /* int numero = 0;
        while (numero < 5){
            numero = numero + 1;
            System.out.println("Execultou " + numero );
        }
        */

        //Trabalhando while com arrays;
        String[] postagens = {"Bom dia","Postagem 2","Postagem 3"};
            //Comando para exibir a quantidade de arrays (.length;
            System.out.println( postagens.length);
       int numero = 0;
       while (numero < postagens.length){

            System.out.println( postagens [numero] );
            System.out.println("######");

            numero = numero + 1;
        }
    }
}