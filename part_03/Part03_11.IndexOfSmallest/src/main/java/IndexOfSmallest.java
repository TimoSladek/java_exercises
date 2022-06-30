
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int smallest = 10000;

        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input==9999){
                break;
            }
            if(input<smallest){
                smallest = input;
            }
            list.add(input);
        }
        System.out.println("Smallest number: "+smallest);

        for (int i= 0;i < list.size();i++){
            if(list.get(i)==smallest){
                System.out.println("Found at index: "+ i);
            }
        }
    }
}
