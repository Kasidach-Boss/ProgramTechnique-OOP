import java.util.Scanner; // Import Scanenr


class MainExtractIt {
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in); // Scanner Class
        ExtractIt EI = new ExtractIt(); // ExtractIT class
        String Text;  
        System.out.println("Input your text"); // show "Input your text" on display
        Text = Reader.nextLine(); // Keyboard Input
        System.out.println(EI.ExtractIts(Text)); //Answer = Program's result
    }
}

// Kasidach Sangthong 6135512045