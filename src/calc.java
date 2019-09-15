import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class calc {

    static String num1 = "";
    static String num2 = "";
    static char oper = ' ';
    static int intNum1 = 0;
    static int intNum2 = 0;
    static int result = 0;

    public static void main(String args[]) throws IOException {

        logicModule.logic();

        if (logicModule.flag == 1) {
            intNum1 = romanToDecimal.romanToDecimal(num1);
            intNum2 = romanToDecimal.romanToDecimal(num2);
        }
        if (logicModule.flag == 2) {
            intNum1 = Integer.parseInt(num1);
            intNum2 = Integer.parseInt(num2);
        }

        if (intNum1 > 10 || intNum1 <= 0) {
            System.out.println("Ошибка 6");
            System.exit(1);
        }
        if (intNum2 > 10 || intNum2 <= 0) {
            System.out.println("Ошибка 7");
            System.exit(1);
        }

        switch (oper) {
            case '+':
                result = intNum1 + intNum2;
                break;
            case '-':
                result = intNum1 - intNum2;
                break;
            case '*':
                result = intNum1 * intNum2;
                break;
            case '/':
                result = intNum1 / intNum2;
                break;
            default:
                break;
        }

        if (logicModule.flag == 1) {
            System.out.println(decimalToRoman.decimalToRoman(result));
        }
        if (logicModule.flag == 2) {
            System.out.println(result);
        }

    }
}

