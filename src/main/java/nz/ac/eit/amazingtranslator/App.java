package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws LanguageNotAvailableException {
       TranslationDictionaries dictionaries= new TranslationDictionaries();
       dictionaries.initializeDictionaries();

        Boolean recursive= true;
        while(recursive = true) {
            System.out.println( "What number shall we translate?" );
            //Input Collector Begins
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
            } //try/catch could fail - test
            System.out.println( "What language shall we translate into?" );
            System.out.println("1:French");
            System.out.println("2:German");
            String optionAsString=scanner.nextLine();
            Integer option= null;
            try {
                option = Integer.parseInt(optionAsString);
            }
            catch (NumberFormatException nfe) {
                System.out.println("The Option must be entered in Numeric form");
                System.exit(0);
            }

            try {
                String translated = dictionaries.getTranslation(number, option);
                System.out.println(translated);
            } catch (LanguageNotAvailableException lnae){
                System.out.println("Language Not Supported");
            } catch (NumberOutOfRangeException noore){
                System.out.println("Number Out Of Range");
            }

            System.out.println("Would you like to Translate another number?");
            System.out.println("1:Yes");
            System.out.println("2:No");
            String loopOptionString=scanner.nextLine();
            Integer loop= null;
            try {
                loop = Integer.parseInt(loopOptionString);
            }
            catch (NumberFormatException nfe) {
                System.out.println("The Option must be entered in Numeric form");
                System.exit(0);
            }

            if(loop ==1){
                recursive = true;
            } else {
                System.exit(0);
            }
        }
    }
}
