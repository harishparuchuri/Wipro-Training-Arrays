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
public class Largest_smallest_5 {
    public static void main(String args[]){
        int []a=new int[10];
        int i,j,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array values");
        for(i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        int n=a.length;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        
        }
        System.out.println("largest two numbers \t"+a[n-1]+"\t"+a[n-2]);
        System.out.println("smallest  two numbers \t"+a[0]+"\t"+a[1]);
    
}
}
