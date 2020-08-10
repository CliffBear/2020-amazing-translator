package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> germanTranslations=new ArrayList<>();
        germanTranslations.add("Einz");
        germanTranslations.add("Zwei");
        germanTranslations.add("Drei");

        List<String> frenchTranslations=new ArrayList<>();
        germanTranslations.add("Un");
        germanTranslations.add("Deux");
        germanTranslations.add("Trois");

        System.out.println( "What number shall we translate?" );
        Scanner scanner=new Scanner(System.in);
        String numberAsString=scanner.nextLine();
        Integer number = null;
        try {
            number = Integer.parseInt(numberAsString);
            System.out.println(number);
        }
        catch (NumberFormatException nfe) {
            System.out.println("The Number must be entered in Numeric form");
            System.exit(0);
        }
        System.out.println( "What language shall we translate into?" );
        System.out.println("1:French");
        System.out.println("2:German");
        String optionAsString=scanner.nextLine();
        Integer option= null;
        try {
            option = Integer.parseInt(optionAsString);
            System.out.println(option);
        }
        catch (NumberFormatException nfe) {
            System.out.println("The Option must be entered in Numeric form");
            System.exit(0);
        }

        if (option ==1){
            String translated=frenchTranslations.get(number-1);
            System.out.println(translated);
        }
    }
}
