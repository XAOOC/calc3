import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class logicModule {

    static int flag = 0;

    public static void logic () throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] charArr = s.toCharArray();
        char operation = ' ';
        ArrayList<Character> number1 = new ArrayList<Character>();
        ArrayList<Character> number2 = new ArrayList<Character>();
        int flag2 = 0;

        for (int i = 0; i < charArr.length; i++) {
            try{
                if (charArr[0] == '0') {
                    System.out.println("Ошибка 0");
                    System.exit(1);
                }

                if (charArr[i] == 'V' || charArr[i] == 'I' || charArr[i] == 'X'){
                    if (flag == 2){
                        System.out.println("Ошибка 1");
                        System.exit(1);
                    }
                    number1.add(charArr[i]);
                    flag = 1;
                }
                else if (Integer.parseInt(String.valueOf(charArr[i])) >= 0) {
                    if (flag == 1){
                        System.out.println("Ошибка 2");
                        System.exit(1);
                    }
                    number1.add(charArr[i]);
                    flag = 2;
                }
                else {
                    System.out.println("Ошибка 3");
                    System.exit(1);
                }

                if (i < charArr.length && charArr[i+1] == ' ') {
                    i+=2;

                    switch (charArr[i]) {
                        case '+':
                            operation = '+';
                            i+=2;
                            break;
                        case '-':
                            operation = '-';
                            i+=2;
                            break;
                        case '*':
                            operation = '*';
                            i+=2;
                            break;
                        case '/':
                            operation = '/';
                            i+=2;
                            break;
                        default: System.out.println("Ошибка 4");
                            System.exit(1);
                    }

                    for (i = i; i < charArr.length; i++) {
                        if (flag2 == 0 && charArr[i] == '0') {
                            System.out.println("Ошибка 0");
                            System.exit(1);
                        }
                        flag2 = 1;
                        if (charArr[i] == 'V' || charArr[i] == 'I' || charArr[i] == 'X'){
                            if (flag == 2){
                                System.out.println("Ошибка 11");
                                System.exit(1);
                            }
                            number2.add(charArr[i]);
                        }

                        else if (Integer.parseInt(String.valueOf(charArr[i])) >= 0) {
                            if (flag == 1){
                                System.out.println("Ошибка 22");
                                System.exit(1);
                            }
                            number2.add(charArr[i]);
                        }
                        else {
                            System.out.println("Ошибка 33");
                            System.exit(1);
                        }
                    }

                }

            }
            catch (NumberFormatException  | ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка 5");
                System.exit(1);
            }
        }

        for (char z : number1)
        {
            calc.num1 += z;
        }
        for (char z : number2)
        {
            calc.num2 += z;
        }
        calc.oper = operation;


    }
}
