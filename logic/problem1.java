/*
The parameter weekday is true if it is a weekday, and the parameter
 vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in. 
 */

public class problem1{
    public static void main(String[] args) {
        System.out.println("Hello this is java dsa ");
          boolean ans=sleepin(false,true);
          System.out.println(ans);
    }
    static boolean sleepin(boolean weekday ,boolean vacation){
        if(!weekday || vacation){
        return true;

        }
       return false;
    }
}