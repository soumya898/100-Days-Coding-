public class Variable {
    // int x=10; // this is an error bcz its not a static varible so we cant acess
   
    static int x = 200; // it in static blcok
    static int y = 20;
     String name ="soumya ";

    void show() {

        System.out.println("I am best man in the world!");
    }

    public static void main(String[] args) {

        Variable ref = new Variable();
        ref.show();
        System.out.println(x);
        System.out.println(y);
<<<<<<< HEAD
        System.out.println(ref.name);
         // if you want acess static varible then create a ref and by reference we can call .
=======
        System.out.println(ref.name); // if you want acess static varible then create a ref and by reference we can call .
>>>>>>> master
        

    }
}
