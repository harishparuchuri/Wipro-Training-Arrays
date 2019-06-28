/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author haris
 */
public class Sorted_order_6 {
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
        for(i=0;i<n;i++)
            System.out.print(a[i]+"\t");
    }
    
}
