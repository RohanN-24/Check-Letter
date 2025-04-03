package String;
import java.util.Scanner;
public class CheckLetter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter string");
        String s = scan.nextLine();
        String s1= s.toLowerCase();
        String []ss = s1.split(" ");
       
        char ch = ss[0].charAt(0);
        boolean flag= true;
        for(int i=1; i<ss.length; i++){
            if (ch != ss[i].charAt(0)) {
                flag = false;
                break;
            }
        }
            if (flag== true) {
                System.out.println("same ");
            } else
            System.out.println("not same ");
         
       
    }
}
