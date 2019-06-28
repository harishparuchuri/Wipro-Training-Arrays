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
public class sum_1 {
    public static void main(String args[]){
        int []a=new int[10];
        int i;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<=5;i++){
            
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(i=0;i<=5;i++){
            sum+=a[i];
        }
        float avg=sum/5;
        System.out.println("sum ="+sum);
        System.out.println("average ="+avg);
        
    }
    
}
