/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ascending;

/**
 *
 * @author RIFQIYAH
 */
public class BubbleDemo {
     public static void bubbleSort(int[] arr) {
         int i=1, j, n = arr.length;
         int temp; 
         while (i<n){ 
             j = n-1 ;  
             while(j>=i){  
                 if (arr[j-1]>arr[j]){
                     temp = arr[j];       
                     arr[j] = arr[j-1]; 
                     arr[j-1] = temp;    
                 }           
                 j = j - 1;  
             } 
             i = i + 1; 
         }
     }       
     public static void tampil(int data[]) { 
         for (int i = 0; i < data.length; i++) {
             System.out.print(data[i] + " ");   
         }   
         System.out.println();
     }
} 


