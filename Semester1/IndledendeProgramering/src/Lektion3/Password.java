package Lektion3;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        //Læs noget fra konsollen
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        //Check passwordet
        if(password.length() < 5){
            System.out.println("Password for kort");
        } else if (password.length() > 8){
            System.out.println("Password for langt");
        } else {
            System.out.println("Password tilpas");
        }
        //Husk at lukke scanneren
        scan.close();

    }

}
