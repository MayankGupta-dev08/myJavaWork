import java.util.Scanner;

public class c11_countDigitsInNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("total digits: "+count);
        scn.close();
    }
}

/* 
65784383
total digits: 8
*/