import java.util.*;
public class Pattern18{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for(int i=0;i< n;i++){
   if(i<=n/2){
    for(int j=0;j<=n/2+i;j++){
      if(j<n/2-i)System.out.print("\t");
     else System.out.print("*\t");
    }
    System.out.println();
    System.out.println();
   }else{
     for(int j =0 ; j<n;j++){
     if(j>=i-n/2 && j<n-(i-n/2)){
        System.out.print("*\t");
     }else{
        System.out.print("\t");
     }

     }
     System.out.println();
    System.out.println();
   
   }
  }

}
}