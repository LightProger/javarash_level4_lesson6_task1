package Alexandr_Nikitchenko;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // Ввод данных с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d = reader.readLine();
        int a = Integer.parseInt(d);
        String e = reader.readLine();
        int b = Integer.parseInt(e);

        // Вычисление наименьшего числа из двух
        if(a < b ){
            System.out.println(a);
        }else  {
            System.out.println(b);
        }
    }
}
