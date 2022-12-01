package day04_IfStatement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {
        /*
 Print "Lutfen is unvaninizi girin
 jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
 Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
 Eger jobTitle  qa ise print is unvaniniz Quality Analyst
 test data: qa ise print Quality Analyst
 dev ise print Developer
 ba ise print Business Analyst
 pm ise print Project Manager
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Is unvaninizi giriniz");
        String jobTitle = scan.nextLine();
        if(jobTitle.equalsIgnoreCase("qa")){
            System.out.println("Is unvani Quality Analist");
        } else if (jobTitle.equalsIgnoreCase("dev")) {
            System.out.println("Developper");
        } else if (jobTitle.equalsIgnoreCase("ba")) {
            System.out.println("Business Analyst");
        }else if (jobTitle.equalsIgnoreCase("pm")){
            System.out.println("Project Maneger");
        }else
            System.out.println("Gecerli bir deger giriniz");


    }
}
