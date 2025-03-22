import java.util.Scanner;

public class Divertidamente {
    public static void main(String[] args) {
     
        int alegria=0, tristeza=0, amizades, nota1, nota2, nota3, media, algoritimos;
        Scanner scanner = new Scanner(System.in);

        //Parte 1
        System.out.println("Quantas amizades Railey fez na cidade? ");
        amizades = scanner.nextInt();

        if(amizades == 0){
            tristeza += 30;
        } else{
            alegria += (amizades*10);
        }
        //System.out.println("alegria: " + alegria + " tristeza: " +  tristeza);

        //Parte 2
        System.out.println("Riley, qual foi a sua nota na A1? ");
        nota1 = scanner.nextInt();

        System.out.println("Riley, qual foi a sua nota na A2? ");
        nota2 = scanner.nextInt();

        System.out.println("Riley, qual foi a sua nota na A3? ");
        nota3 = scanner.nextInt();

        media = (nota1+nota2+nota3)/3;

        if(media>=7){
            alegria += 50;
        } else{
            tristeza += 50;
        }

        //Parte 3
        System.out.println("Riley, quantos algoritimos você conseguiu fazer? ");
        algoritimos = scanner.nextInt();

        if(algoritimos == 0){
            tristeza += (10*10);
        } else if(algoritimos > 0){
            alegria += (algoritimos*10);
            tristeza += ((10-algoritimos)*10);
        }

        if(alegria>tristeza){
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }
        scanner.close();

    }
}
