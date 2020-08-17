package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What number shall we translate?" );
        Scanner scanner=new Scanner(System.in);
        String numberAsString=scanner.nextLine();

        System.out.println( "What language shall we translate into?" );
        System.out.println("1:French");
        System.out.println("2:German");
        String optionAsString=scanner.nextLine();
    }
}
