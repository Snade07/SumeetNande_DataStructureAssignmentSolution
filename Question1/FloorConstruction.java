package Question1;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class FloorConstruction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total no of floor in the building");
        int n = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1;i <= n;i++)
        {
            System.out.println("Enter the floor size given on day:"+i);
            int temp = sc.nextInt();
            q.add(temp);
        }

        int arr[];
        arr = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = -1;

        int pointer = n-1;

        System.out.println("The order of construction as follows");

        for(int i = 1;i <= n;i++)
        {
            int num = q.remove();

            arr[num - 1] = num;

            System.out.println("Day: "+i);
            while(pointer >= 0 && arr[pointer] != -1){
                System.out.print(arr[pointer]+" ");
                pointer--;
            }
            System.out.println();
        }

    }
}

