/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Saloni Bansal
 */
public class ConvertString {

    public int[] diStringMatch(String s) {
        int[] a = new int[s.length() + 1];
        int ss = 0, e = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                a[i] = ss++;
            } else {
                a[i] = e--;
            }
        }
        a[s.length()] = ss;
        return a;

    }

}
