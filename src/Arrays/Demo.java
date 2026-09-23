package Arrays;
import java.util.*;
public class Demo {
    public static void main(String[] args){
        HashMap<Integer,String> studentAges=new HashMap<>();
        studentAges.put(7,"MSD");
        studentAges.put(24,"ayushi");
        studentAges.put(70,"nepal");

        System.out.println("ayushi age:" +studentAges.get("ayushi"));
    }
}