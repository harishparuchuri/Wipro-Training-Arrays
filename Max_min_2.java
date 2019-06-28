/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author haris
 */
import java.util.*;
public class Max_min_2 {
    public static void main(String args[]){
        int []a=new int[10];
        int i,n;
        int max,min;
         Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        n=sc.nextInt();
       
        for(i=0;i<=n;i++){
            
            a[i]=sc.nextInt();
        }
        max=a[0];
        min=a[0];
        for(i=1;i<n;i++){
            
            if(a[i]> max)
                max=a[i];
            
            
            if(a[i]< min){
                min=a[i];
                
            }
            
        }
        System.out.println("min is"+min);
        System.out.println("max is"+max);
        
    }
    
}
