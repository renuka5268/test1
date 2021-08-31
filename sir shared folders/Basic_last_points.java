public class Basic_last_points extends Main {
    //constractor
    //class variable which has only one copy of that variable in that
    //static variable are used for static function
    public  static int var=0;
    public int age1=0;
    //[static memory]
    //refrence memory
    public Basic_last_points(){

    }
    public Basic_last_points(int age){
        this.var=age;
        this.age1=age;

    }
    public static void input(){
        int age;
        System.out.println("you'r in Basic_last_points class");
        System.out.println("var value"+var);
    }
    public void input1(){
        System.out.println("age value="+age1);
    }


}
