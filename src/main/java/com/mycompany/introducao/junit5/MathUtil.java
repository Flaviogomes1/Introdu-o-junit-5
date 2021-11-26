/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introducao.junit5;

/**
 *
 * @author flavio
 */
public class MathUtil {
    public static int mdc(int a, int b){
        if(b > 0 && a % b ==0){
            return b;
        }
    return -1;
}
}
