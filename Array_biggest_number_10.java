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
public class Array_biggest_number_10 {
    public static void main(String[] args) {
		if (args.length != 9)
			System.out.println("Please enter 9 integer numbers");

		int[][] array = new int[3][3];
		int x = 0;

		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = Integer.parseInt(args[x++]);
			}
		}
		
		int max = 0;
                 for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
                     System.out.print(array[i][j]+" ");
                       }
                       System.out.println(" ");
                     }

		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
			     if(array[i][j]>max)
                             {
                                max=array[i][j];
                            }
			}
		}
			
		System.out.println("The biggest number in the given array is " + max);
		
	}

    
}
