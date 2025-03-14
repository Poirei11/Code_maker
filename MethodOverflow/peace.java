import java.util.*;
public class peace{
    void add(int a,int b){
        System.out.println("answer is"+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("answer is"+(a+b+c));
}
public static void main(String args[]){
    peace obj = new peace();
    obj.add(10,20);
    obj.add(20,30,40);
}
}