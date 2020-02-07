import java.util.Scanner; // Import Scanenr
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in); // Scanner Class
        String Text;  
        System.out.println("Input your text");
        Text = Reader.nextLine(); // Keyboard Input
        String[] web = Text.split("/");
        
        for (int i=0; i < web.length; i++ ){
          
            if(web[i].startsWith("*")){
                System.out.println("Answer is "+web[i].substring(0).replace("*","_"));
                System.exit(0); // End process
            }
        }
        System.out.println("Answer is "+web[web.length-1]); // print the last array
    }
}