//write a java programme to insert your friends name

/*import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> friends=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of all the beard duckies");
        while(true){
            String name = sc.nextLine();
            if(!name.equals("exit")){
                friends.add(name);
                System.out.println("Enter new duckie or type exit to close");
            }
            else{
                break;
            }
        }
        System.out.println(friends);
        int len = friends.size();
        friends.remove(len-1);
        System.out.println(friends);
        System.out.println("my best friend: "+ friends.get(0));
        System.out.println("i had a little fight with:"+ friends.get(0));
        friends.set(0, "nobody");
        System.out.println("now my best friend : "+ friends.get(0));
        System.out.println("i need 10 lakhs");
        System.out.println("now my friends");
        friends.clear();
        System.out.println(friends);
    }

}*/


//1.Create an Arraylist of natural numbers and then create a method to return arraylist of even numbers.
//2.An array name is given .......now find the most occured name.
//3.nums=[1,2,1,3,4,5,1,3,2,1,4].....return array of unique elements.

/*import java.util.ArrayList;

public class Question1{
    public static ArrayList <Integer> even(ArrayList<Integer>list){
        ArrayList<Integer> evenlist=new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)%2==0){
                evenlist.add(list.get(i));
            }
        }
        return evenlist;
    }
    public static void main(String[] args) {
        ArrayList<Integer>natural=new ArrayList<>();
        for(int i=1; i<=20; i++){
            natural.add(i);
        }
        System.out.println("list of natural numbers: " +natural);
        ArrayList<Integer> evennum=even(natural);
        System.out.println("list of even natural numbers: " +evennum);
    }
}*/

//2

/*import java.util.HashMap;
import java.util.HashSet;

public class Question1 {
       public static void main(String[] args) {
        String names[]={"karan", "raj", "mohit", "raj", "karan", "raj"};//given array
        String name="";//assumes names is maximum occured name
        HashMap<String, Integer> map=new HashMap<>();//creating hashmap to store values
        for(String i:names){//iterating map with for each loop
            map.put(i, map.getOrDefault(i, 0)+1);  // step 1:i=karan{karan=1}
        } //step 2: i=raj  {karan=1,raj=1}
        // step 3: i=mohit {karan=1,raj=1, mohit=1}
        // step 4: i=raj      fetched value of raj which is 1 now{karan=1,raj=2, mohit=1}
        //step 5: i=karan     fetched value of karan which is 1 now {karan=1+1, raj=2, mohit=1}
        // step 6: i=raj      fetched value of raj which is 2 now {karan=1+1, raj=2+1, mohit=1}
        //resultant map: {karan=2, raj=3, mohit=1}
        
        for (String key: map.keySet()){  //{"karan", "raj", "mohit"}
                  if(map.get(key)>map.getOrDefault(name, 0)){
                    name=key;
                    //step 1: key=karan, name="" if(2>0) condition true then name will update =>name=karan
                    //step 2: key=raj, name=karan if(3,2)   condition is true then name will update =>name=raj
                    //step 3: key=mohit, name=raj if(1>3)  condition is false name won't get printed

                  }
            }
            System.out.println(name);
       }
}*/

/*import java.util.Arrays;
import java.util.HashSet;

public class Question1 {

    public static void main(String[] args) {
        int arr[]={1,2,1,3,2,4,1,3};// given array
        HashSet<Integer> unique=new HashSet<>();//created HAshset to store unique
        for(int i:arr){
            unique.add(i); // unique=[1,2,3,4] but it is a hashset
        }
        int res[]=new int[unique.size()]; // creating a array of size unique
        int ip=0;  // creating pointer to insert values in res array
        for(int i:unique){
            res[ip]=i;
            ip++;
            //Step 1: i=1, first ip was 0and then ip=1, res=[]
            //res=[1,0,0,0]
            //Step 2: i=2, ip=1 now res=[1,2,0,0] then ip=2
            //Step 3: i=3, ip=2 now res=[1,2,3,0]then ip=3
            //Step 4: i=4, ip=3 now res=[1,2,3,4] then ip=4
            //reached end of the seto
        }
        System.out.println(Arrays.toString(res));
    }
}*/

//u r given A 2D array of integers that have multiple natural numbers now our task is to find an 1-D array which have 
//the max frequent element from 2d array
