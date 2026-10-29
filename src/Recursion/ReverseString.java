package Recursion;

;

public class ReverseString {
    public static void ReversePrint(String name,int index){
        if(index == name.length()){
            return;
        }
        ReversePrint(name,index+1);
        System.out.println(name.charAt(index));

    }
    public static void main(String args[]){
        String name = "sona";
        System.out.println("Reverse:");
        ReversePrint(name,0);

    }
}
