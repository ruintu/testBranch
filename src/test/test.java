package test;


public class test{

    private String name;

    private int no;

    static {
        System.out.println("static block test");
    }

    {
        System.out.println("block test");
    }

    public test(){
        System.out.println("test!");
    }

    public static void test(){
        System.out.println("static test");
    }

    public static void main(String[] args) {
        test();
    }


}