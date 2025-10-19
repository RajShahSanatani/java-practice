import java.util.Scanner;
public class code6 {
    public static void main(String[] args){
        int n=5;
        int[] arr={10,20,30,40,50};
        int[] arr1=new int[n];
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;
        arr1[3]=4;
        arr1[4]=5;
        System.out.println(arr[1]);
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<n;i++){
        arr1[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.println(arr1[i]+"");
    }
    sc.close();
    }    

}     
