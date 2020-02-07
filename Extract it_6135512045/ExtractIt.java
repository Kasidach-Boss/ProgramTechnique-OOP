public class ExtractIt{ // create class ExtractIt
    private String webText;
    private String text;
    public String ExtractIts(String t){ // create ExtractIts
        this.text = t;
        String[] web = text.split("/"); // divide text to array
        
        for (int i=0; i < web.length; i++ ){ // loop
          
            if(web[i].startsWith("*")){ // find that array same as this condition 
                webText = "Answer = "+web[i].substring(0).replace("*","_"); //Answer = Program's result
                return webText; // return webText's variable
              
            }
        }
        return webText = "Answer = "+web[web.length-1]; // print the last array (Answer = Program's result)
    }
}

// Kasidach Sangthong 6135512045

      