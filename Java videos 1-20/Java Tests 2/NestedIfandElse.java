public class NestedIfandElse {
    

public static void main(String[] args) {
    int age = 60;
    if (age<50){
        System.out.println("You are young");
    }else{
        System.out.println("You are old");
        if(age>70){
            System.err.println("You are really old");
        }else{
            System.out.println("Dont worry, you are'nt really that old");
        }
    }
    }
}