import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args) throws IOException {
        /*String text = "+7-905-238-85-88";

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(text);

        while(m.find()) {
            System.out.print(m.group());
        }*/

        //Разбивка ФИО
        System.out.println("Введите Фамилию Имя Отчество: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //разбивка опирается на пробелы
        String readString = reader.readLine();
        String fragments3[] = readString.split("\\s+");

        System.out.println("Фамилия: " + fragments3[0]);
        System.out.println("Имя: " + fragments3[1]);
        System.out.println("Отчество: " + fragments3[2]);

        //В закомментированном куске кода появляется чувствительность к регистру
        /*Pattern p1 = Pattern.compile("[А-ЯЁ][а-яё]*");
        Matcher m1 = p1.matcher(readString);

        int count = 0;

        while (m1.find()) {
            count++;
            if (count == 1)
            {
                int start = m1.start();
                int end = m1.end();
                System.out.println("Фамилия: " + text2.substring(start, end));
            }
            else if (count == 2)
            {
                int start = m1.start();
                int end = m1.end();
                System.out.println("Имя: " + text2.substring(start, end));
            }
            else if(count == 3)
            {
                int start = m1.start();
                int end = m1.end();
                System.out.println("Отчество: " + text2.substring(start, end));
            }
        }*/
    }
}
