/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Saloni Bansal
 */
public class IntervalCount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]a=new int[n][2];
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            int e=sc.nextInt();
            a[i][0]=s;
            a[i][1]=e;
        }
//        6
//        1 3
//        2 4
//        3 5
//        0 6
//        5 7
//        8 9

        Arrays.sort(a,(aa,b)->aa[1]-b[1]);

        int count=1;
        int last=a[0][1];
        for(int i=1;i<n;i++){
            if(a[i][0]>=last) {
                count++;
                last=a[i][1];
            }
        }
        System.out.println(count);

    }
}
