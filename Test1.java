import java.util.*;
import java.io.*;
import java.lang.*;


    
class Test1{
    public static void main(String[] args){

        System.out.println(compareProduct(65));
    }

    public static boolean compareProduct(int num) {
        if (num < 10)
            return false;
        int oddProdValue = 1, evenProdValue = 1;

        while(num > 0) {
            int digit = num / 10;
            oddProdValue *= digit;
            num = num / 10;
            System.out.println(num);
            System.out.println(digit);
            if(num == 0)
                break;
            digit = num / 10;
            evenProdValue *= digit;
            num = num / 10;
        }
        if(evenProdValue == oddProdValue)
            return true;
        return false;
    }
}

