import java.util.*;
public class peace{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the nummber");
         String letter = obj.nextLine();
         String vowel[] = {"a","e","i","o","u"};
         int detect = 0;
         int i = 0;
         while(i<=4){
            if(letter.equals(vowel[i])){
                detect = 1;
            }
            i++;
         }
         if(detect ==1){
             System.out.println("Vowels");
         }
         else{
             System.out.println("not a Vowels");
         }
    }
}
    
    