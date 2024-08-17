import java.util.*;
public class BinaryNumbers{
    public static void main(String[] args){
    //CONVERT DECIMAL OR INTEGER TO BINARY NUMBER CODE
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you want to convert a to binary number: ");
        int number = input.nextInt();
        int original_number = number;
        String fix = "";
        String add = "";
        while(number >= 1){
            if(number % 2 == 0){
                add +=0;
            }
            else {
                add +=1;
            }
            number /=2;
        }
        int count = 0;
        for(int i=0; i < add.length(); i++){
            count++;
            fix = add.charAt(i) + fix;
            if(count == 10){
                System.out.println();
            }
        }
        System.out.println("BINARY NUMBER OF " + original_number + " IS " + fix);
        System.out.print("This binary number " + fix + " has " + count + " bits");
   }
}