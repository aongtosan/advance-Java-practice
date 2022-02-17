package demo;
public class helloworld {
    public String hi(String name){
        return "hello "+name;
    }
    public static void main (String... arg){
        System.out.println(new helloworld().hi("jakkapat"));
    }
}




