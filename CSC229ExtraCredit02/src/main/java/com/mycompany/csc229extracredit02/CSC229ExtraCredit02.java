/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc229extracredit02;

/**
 *
 * @author willi
 */
public class CSC229ExtraCredit02 {
    
    public static double ratio(double[] arr){
        double fLarge=arr[0]; // O(1)
        double sLarge=arr[0]; // O(1)
        double fSmall=arr[0]; // O(1)
        double sSmall=arr[0]; // O(1)
        for(int i=0;i<arr.length;i++){ // O(n)
            if(arr[i]>fLarge){ // O(1)
                sLarge=fLarge;
                fLarge=arr[i];
            }
            if(arr[i]<fSmall){ // O(1)
                sSmall=fSmall;
                fSmall=arr[i];
            }
            if(arr[i]<fLarge&&arr[i]>sLarge){ // O(1)
                sLarge=arr[i];
            }
            if(arr[i]>fSmall&&arr[i]<sSmall){ // O(1)
                sSmall=arr[i];
            }
        }
        System.out.println("First largest: "+fLarge);
        System.out.println("Second largest: "+sLarge);
        System.out.println("Sum of the first two largest numbers: "+(fLarge+sLarge));
        System.out.println("First smallest: "+fSmall);
        System.out.println("Second smallest: "+sSmall);
        System.out.println("Sum of the first two smallest numbers: "+(fSmall+sSmall));
        double ratio=((fLarge+sLarge)/(fSmall+sSmall));
        return ratio;
    }

    public static void main(String[] args) {
        double arr[] = new double [8];
        arr[0]=37; // Second smallest
        arr[1]=26; // First smallest
        arr[2]=229;
        arr[3]=300; // Second largest
        arr[4]=262;
        arr[5]=201;
        arr[6]=130;
        arr[7]=350; // First largest
        double ratio=ratio(arr);
        System.out.println("Ratio: "+ratio);
    }
}
/*
Time Complexity: O(n)

Space Complexity:
arr -> O(n)
fLarge -> O(1)
sLarge -> O(1)
fSmall -> O(1)
sSmall -> O(1)
ratio -> O(1)
Space complexity is O(n).
*/
