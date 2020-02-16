import java.util.HashMap;
import java.util.Scanner;
class HashMap {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String,Integer> map = new HashMap<String,Integer>();
    map.put("Excellent",0);
    map.put("Good",0);
    map.put("Lightly",0);
    map.put("Moderately",0);
    map.put("Heavily",0);
    while(true){
        String stop = sc.nextLine();
        if(stop.equals("Q")||stop.equals("q")){
            break;
        }
        else{
            int aqi = Integer.parseInt(stop);
            int count;
            if(aqi>=0 && aqi<=25){
                count=map.get("Excellent");
                map.put("Excellent",count+1);
            }
            else if(aqi>26 && aqi<=50){
                count=map.get("Good");
                map.put("Good",count+1);
            }
            else if(aqi>51 && aqi<=100){
                count=map.get("Lightly");
                map.put("Lightly",count+1);
            }
            else if(aqi>101 && aqi<=200){
                count=map.get("Moderately");
                map.put("Moderately",count+1);
            }
            else {
                count=map.get("Heavily");
                map.put("Heavily",count+1);
            }
        }
    }
    System.out.println(map);
    }
    
}