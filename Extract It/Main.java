import java.util.Scanner; // Import Scanenr
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in); // Scanner Class
        String Text;  
      //  String star ="*";
       // String uc = "_";             
            Text = Reader.nextLine(); // Keyboard Input
           //Text = "www.abc.com/pub/*aaa.html";
        System.out.println(Text); // Print 
        String[] web = Text.split("/");
        System.out.println(web[2].startsWith("*"));
        System.out.println(web[2].startsWith("/"));
        for (int i=0; i < web.length; i++ ){
          /*  if(web[i].substring(1).equals("*")){
               System.out.println( web[i].substring(1).replace("*","_"));
            }
            else {*/
                System.out.println("Ans is "+web[i].substring(0).replace("*","_"));
            //}
            
        
        }
       
     
    }
}