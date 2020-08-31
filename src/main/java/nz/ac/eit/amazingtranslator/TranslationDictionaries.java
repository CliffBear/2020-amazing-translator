package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TranslationDictionaries{
    private List<String> germanTranslations=new ArrayList<>();
    private List<String> frenchTranslations=new ArrayList<>();

    public void initializeDictionaries() { //when testing, change void to Integer, to allow correct results check

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
        germanTranslations.add("Dreißig"); //Array Creation Tested - Valid

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
        frenchTranslations.add("Vignt-Neuf"); //Array Creation Tested - Valid

        //Test Reference, not needed in final result:
        //return frenchTranslations.size();
    }

    public String getTranslation(Integer number, Integer language) throws LanguageNotAvailableException, NumberOutOfRangeException{
        if (number<1 || number>30){
            throw new NumberOutOfRangeException();
        }
        if (language ==1){
            return frenchTranslations.get(number - 1);
        } else if(language == 2){
            return germanTranslations.get(number - 1);
        } else {
            throw new LanguageNotAvailableException();
        }
    }
}
