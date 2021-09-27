/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author zaky
 */
public class array1301194315 {
    public static void main(String args[])
    {
        int i,j,k,f,g,m,temp;
        int arr_1301194315[][] = new int [5][6];
        i=0;
        k=1;
        for(j=0;j<3;++j){
            temp = k*3;
            arr_1301194315[i][j] = temp;
            System.out.print(" "+arr_1301194315[i][j]);
            ++k;
        }
        System.out.print(" ");
        ++i;
        f=0;
        for(j=0;j<4;){
            ++f;
            if(f%2==1) {
                arr_1301194315[i][j] = f;
                System.out.print(" "+arr_1301194315[i][j]);
                        ++j;
                    }
        }
        System.out.println(" ");
        ++i;
        temp=1;
        m=1;
        for(j=0;j<5;++j){
            temp = temp * m;
            arr_1301194315[i][j]=temp;
            System.out.print(" "+arr_1301194315[i][j]);
            ++m;
        }
        System.out.print(" ");
        ++i;
        g=f;
        for(j=0;j<6;++j){
            System.out.print(" "+g);
            ++g;
        }
    }
}
