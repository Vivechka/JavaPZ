import java.awt.List;
import java.util.ArrayList;

public class Lab3 {
    public static void main(String[] arg){
        StringBuffer text = new StringBuffer("Був собі Еру, Єдиний, котрого на Арді величають Ілуватаром.");
        char m = 'о';
        ArrayList<String> l = new ArrayList<String>();
        int stert = 0;
        for(int i = 0; i < text.length(); i++){
            
            if(text.charAt(i) == ' '){
                l.add(text.substring(stert, i));
                if( i ==text.length() - 1){
                    break;
                }
                stert = i+1;
                i+=1;
            }
            if (i ==text.length() - 1){
                l.add(text.substring(stert, i+1));
            }
        } 
        for(int i = 0; i < l.size(); i++){
            int mcount = 0;
            String nap = l.get(i);
            for (int j = 0; j <nap.length(); j++){
                if(nap.charAt(j) == m) mcount += 1;
            }
           
            for(int j = 0; j < l.size(); j++){
                int mcount1 = 0;
                String pan = l.get(j);
                for (int k = 0; k <pan.length(); k++){
                    if(pan.charAt(k) == m) mcount1 += 1;
                } 
            
                if(mcount < mcount1){
                    String tre = l.get(i);
                    l.set(i, l.get(j));
                    l.set(j, tre);
                    
                }
            }
        }
        System.out.println(l);
    }
}
