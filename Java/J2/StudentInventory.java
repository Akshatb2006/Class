
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
class StudentInventory {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no. of students:");
    int n = sc.nextInt();
    sc.nextLine();
    String names[] = new String[n];
    
    for(int i=0; i<n; i++){
        System.out.println("Enter name of Student" + (i+1));
        names[i]=sc.nextLine();
    }
    System.out.println(Arrays.toString(names));
}
}
