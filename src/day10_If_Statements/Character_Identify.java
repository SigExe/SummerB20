package day10_If_Statements;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.application.Application;
import javafx.stage.Stage;
import org.w3c.dom.ls.LSOutput;

public class Character_Identify {
    public static void main(String[] args) {

        char character = '@';

        boolean isAlphabetic = character >= 65 && character <= 90 || character >= 97 && character <= 122;
                               // upper case characters           || lower case characters

        boolean isDigit = character >= 48 && character <= 57;

        boolean isSpecChar = !isAlphabetic && ! isDigit;

        String alphabet = "";

        if(isAlphabetic == true){
            alphabet = character + " is Alphabetic";
        }else{
            alphabet = character + " is not Alphabetic";
        }

        System.out.println(alphabet);

        String digit = "";

        if(isDigit == true){
            digit = character + " is a digit";
        }else{
            digit = character + " is not a digit";
        }

        System.out.println(digit);

        String specChar = "";

        if(isSpecChar == true){
            specChar = character + " is a special char";
        }else{
            specChar = character + " is not a special char";
        }

        System.out.println(specChar);



    }



}


