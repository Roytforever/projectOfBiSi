package Demo01;

import java.util.Scanner;

/*
写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 )
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String input = sc.nextLine();
            int sum = convert(input);
            System.out.println(sum);
        }
    }

    private static int convert(String str) {
        if (str == null || str.length() == 0){
            return 0;
        }
        int sum = 0,temp = 0,n =16;
        char ch;
        String input = str.substring(2,str.length());
        int count = input.length()-1;
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            if (ch >='0' && ch <= '9'){
                temp = ch -'0';
            }else
                if (ch >='a' && ch <='z'){
                    temp = ch -'a'+10;
                }
            else
                if (ch >='A' && ch<='Z'){
                    temp = ch -'A'+10;
                }
                else {
                    break;
                }
                sum += temp*Math.pow(n,count);
                count--;
        }
        return sum;
    }
}
