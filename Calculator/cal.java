public class Cal{
    void addition(int x,int y){
        int z = x + y;
        System.out.println(z);
    }
       void substraction(int e,int f){
        int a = e - f;
        System.out.println(a);
    }
       void multiplication(int g,int h){
        int b = g * h;
        System.out.println(b);
    }
       void division(int m,int n){
        int c = m/n;
        System.out.println(c);
    }
    public static void main(String args[]){
        Cal obj=new Cal();
        obj.addition(23,23);
        obj.substraction(19,12);
        obj.multiplication(24,22);
        obj.division(24,2);
    }
}