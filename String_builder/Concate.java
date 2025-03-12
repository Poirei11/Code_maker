public class Concate{
    void Concate(String a1,String a2){
        String a3 = a1 + a2;
        System.out.println(a3);
    }
    public static void main(String arga[]){
        Concate obj = new Concate();
        obj.Concate("Thokchom","Poirei");
    }
}