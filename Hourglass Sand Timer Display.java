import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int l=n-1;
        
        for(int i=0;i<n;i++){
            for(int m=0;m<i;m++){
                System.out.print(" "+" ");
            }
            for(int j=i;j<n-1;j++){
                System.out.print("*"+" ");
            }
            for(int k=l;k>=0;k--){
                System.out.print("*");
                if(k!=0){
                    System.out.print(" ");
                }
            }
            System.out.println();
            l--;
            
        }
        int o=n-1;
        for(int i=1;i<n;i++){
             for(int m=i;m<n-1;m++){
                System.out.print(" "+" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int b=0;b<i;b++){
                System.out.print("*");
                if(b!=i){
                    System.out.print(" ");
                }
            }
            System.out.println();
            o--;
            
        }
    }
}
