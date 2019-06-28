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
public class Search_3 {
    
    public static void main(String string[]){
        Scanner sc=new Scanner(System.in);
        int key,i,c=-1;
        int n=sc.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter key value");
        key=sc.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==key)
            {
                c=i;
            }
            
    }
        if(c>0)
                System.out.println("key value is fount at"+i);
            else
                System.out.println(c);
            
    }
}
