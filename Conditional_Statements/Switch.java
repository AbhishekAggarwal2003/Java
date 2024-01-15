package Conditional_Statements;

public class Switch {
    public static void main(String args[]){
        int age=5;
        switch(age){
            case 1:
                System.out.println("You can crawl");
                break;
            case 2:
                System.out.println("You can talk");
                break;
            case 3:
                System.out.println("You can dance");
                break;
            default:
                System.out.println("I don't know how old you are");
        }
    }
    
}
