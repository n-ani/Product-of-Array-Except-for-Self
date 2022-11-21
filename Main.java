import java.lang.*;
import java.util.*;
class Main {
  public static void main(String[] args) {
      //inputs and variables
      Scanner sc=new Scanner(System.in);
      int sum=1;
      System.out.print("Enter Array Length: ");
      int n=sc.nextInt();
      int [] arr=new int[n];
      int [] arr1=new int[arr.length];
      //take array elements input from the user
      for (int k=0;k<arr.length;k++){
          System.out.print("Enter Array Element "+(k+1)+" : ");
          arr[k]=sc.nextInt();
      }
      //functions and calculation
      for (int i=0;i<arr.length;i++){
          for (int j=0;j<arr.length;j++){
              if (arr[i]!=arr[j]){
                  sum=sum*arr[j];
              }
          }
          //System.out.println(sum);
          arr1[i]=sum;
          sum=1;
      }
      //output and presentation
      System.out.print("\nYour Array : "+Arrays.toString(arr));
      System.out.print("\nArray after calculation : "+Arrays.toString(arr1));
  }
}
