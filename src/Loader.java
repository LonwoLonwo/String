import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args) throws IOException {
        //Разбивка ФИО
        System.out.println("Введите Фамилию Имя Отчество: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String readString = reader.readLine();
        parseText(readString);
        System.out.println();
        parseStringElse(readString);
    }

        //разбивка опирается на пробелы
        public static void parseText(String readString) {
            String fragments[] = readString.split("\\s+");

            if (!(fragments.length == 3)) {
                System.out.println("Информация введена не корректно!");
            } else {
                System.out.println("Фамилия: " + fragments[0]);
                System.out.println("Имя: " + fragments[1]);
                System.out.println("Отчество: " + fragments[2]);
            }
        }

        //Подходит только для кириллицы
        public static void parseStringElse(String readString) {
            Pattern p1 = Pattern.compile("[а-яА-ЯёЁ]+");
            Matcher m1 = p1.matcher(readString);

            int count = 0;

            while (m1.find()) {
                count++;
                if (count == 1) {
                    int start = m1.start();
                    int end = m1.end();
                    System.out.println("Фамилия: " + readString.substring(start, end));
                }
                else if (count == 2) {
                    int start = m1.start();
                    int end = m1.end();
                    System.out.println("Имя: " + readString.substring(start, end));
                }
                else if (count == 3) {
                    int start = m1.start();
                    int end = m1.end();
                    System.out.println("Отчество: " + readString.substring(start, end));
                }
            }

            if(count == 0){
                System.out.println("Информация введена не корректно!");
            }
        }

}
