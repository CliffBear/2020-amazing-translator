package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        List<String> germanTranslations=new ArrayList<>();
        germanTranslations.add("Einz");
        germanTranslations.add("Zwei");
        germanTranslations.add("Drei");
        germanTranslations.add("Vier");
        germanTranslations.add("Funf");
        germanTranslations.add("Sechs");
        germanTranslations.add("Sieban");
        germanTranslations.add("Acht");
        germanTranslations.add("Neun");
        germanTranslations.add("Zehn");
        germanTranslations.add("Elf");
        germanTranslations.add("Zwolf");
        germanTranslations.add("Dreizehn");
        germanTranslations.add("Vierzehn");
        germanTranslations.add("Funfzehn");
        germanTranslations.add("Sechszehn");
        germanTranslations.add("Siebanzehn");
        germanTranslations.add("Achtzehn");
        germanTranslations.add("Neunzehn");
        germanTranslations.add("Zwanzig");
        germanTranslations.add("Einundzwanzig");
        germanTranslations.add("Zweiundzwanzig");
        germanTranslations.add("Dreiundzwanzig");
        germanTranslations.add("Vierundzwanzig");
        germanTranslations.add("Funfundzwanzig");
        germanTranslations.add("Sechsundzwanzig");
        germanTranslations.add("Siebanundzwanzig");
        germanTranslations.add("Achtundzwanzig");
        germanTranslations.add("Neunundzwanzig");
        germanTranslations.add("Dreißig");

        List<String> frenchTranslations=new ArrayList<>();
        frenchTranslations.add("Un");
        frenchTranslations.add("Deux");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Quatre");
        frenchTranslations.add("Cinq");
        frenchTranslations.add("Six");
        frenchTranslations.add("Sept");
        frenchTranslations.add("Huit");
        frenchTranslations.add("Neuf");
        frenchTranslations.add("Dix");
        frenchTranslations.add("Onze");
        frenchTranslations.add("Douze");
        frenchTranslations.add("Trieze");
        frenchTranslations.add("Quatorze");
        frenchTranslations.add("Quinze");
        frenchTranslations.add("Sieze");
        frenchTranslations.add("Dix-Sept");
        frenchTranslations.add("Dix-Huit");
        frenchTranslations.add("Dix-Nuef");
        frenchTranslations.add("Vignt");
        frenchTranslations.add("Vignt Et Un");
        frenchTranslations.add("Vignt-Deux");
        frenchTranslations.add("Vignt-Trois");
        frenchTranslations.add("Vignt-Quatre");
        frenchTranslations.add("Vignt-Cinq");
        frenchTranslations.add("Vignt-Six");
        frenchTranslations.add("Vignt-Sept");
        frenchTranslations.add("Vignt-Huit");
        frenchTranslations.add("Vignt-Neuf");
        frenchTranslations.add("Trente");

        Boolean recursive= true;
        while(recursive = true) {
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
            }
            catch (NumberFormatException nfe) {
                System.out.println("The Option must be entered in Numeric form");
                System.exit(0);
            }

            if (option ==1){
                String translated=frenchTranslations.get(number-1);
                System.out.println(translated);
            } else{
                String translated=germanTranslations.get(number-1);
                System.out.println(translated);
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
