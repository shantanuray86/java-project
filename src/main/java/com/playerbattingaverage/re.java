package com.playerbattingaverage;

import java.util.ArrayList;
import java.util.List;

public class re {

	public static void main(String[] args) {
		  //Initialize array     
        //int [] arr = new int [] {9, 121, 27, 90, 64,36,78,66,900,2}; 
//        Elements of original array: 
//        	9 121 27 90 64 36 78 66 900 2 
//        	Elements of array sorted in ascending order: 
//        	[2, 9, 72, 63, 46, B66, N87, Z9, y121, 9]
        int [] arr = new int [] {27,4,120,65};
//        Elements of original array: 
//        	27 4 120 65 
//        	Elements of array sorted in ascending order: 
//        	[4, 72, A56, x21]
        int temp = 0;    
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }  
        
        System.out.println();   
        
        List<String> lts = new ArrayList<String>();
        
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {  
        	 int rev = 0; 
             // remainder 
             int rem; 
             int n= arr[i];
             while (n > 0) { 
                 rem = n % 10; 
                 rev = (rev * 10) + rem; 
                 n = n / 10; 
             } 
             char p_ = (char)arr[i];
             char r_;
             String el_;
             if(Character.isLetter(p_)) {
            	 el_=p_+Integer.toString(rev);
             }else {
            	 el_=Integer.toString(rev);
             }
            // String el_=p_+Integer.toString(rev);
             lts.add(el_);
               
        } 
        
        System.out.println(lts);

	}

}
