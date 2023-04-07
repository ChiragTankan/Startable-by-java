import java.util.*;
public class Main {
	public static void main(String[] args) {
          Scanner ap =new Scanner (System.in);
          System.out.print("Number for row=");
         int n=ap.nextInt();
                   System.out.print("Number for length of table=");
         int m=ap.nextInt();
      for(int i=0; i<n; i++) {
           
           for(int j=0; j<m; j++) {
           
                       if(i==1||j==1||i==n||j==m){
                 System.out.print("*");
                 }else{
                             System.out.print("   ");
                      }
                 
                              } 
                  
               } 
               
               
           
           System.out.println();
       }
   }
