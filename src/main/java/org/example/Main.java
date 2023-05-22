package org.example;

import java.time.LocalDate;
import java.util.*;

import static java.awt.SystemColor.text;

public class Main {
    public static void main(String[] args) {
    Main app=new Main();

        //app.e1invertirString("reversa");
    //    app.e2CapiCua(659);
     //   app.e3CountCharacterTimes("numeron");
    //app.e4CountCharTimes("contara");
    //app.e5Multipleof(30);
        //app.e6IsLeapYear(2020);
        //app.e7RamdomOrderStrign("palabra");
        //app.e8GetOnllyNotDuplicateList(Arrays.asList(1,2,2,3,3,4,5));
        //app.e9CheckIfVowelIsPresent("palabra");
        app.e10Palindrome("oro");

    }

    private void e1InvertirString(String ingreso) {

        String texto = new StringBuilder(ingreso).reverse().toString();
        System.out.println(texto);

        /*
        //Logica

        //Separa el texto en el arreglo
        String [] array=ingreso.split("");

        StringBuilder invertir=new StringBuilder();
    for(int i=array.length;i>0;i--){
        invertir.append(array[i-1]);
    }
        System.out.println(invertir);
    }    */
    }
    private void e2CapiCua(int number){
    String numberText=String.valueOf(number);
    String reverseNumber=new StringBuilder(numberText).reverse().toString();

    if(numberText.equals(reverseNumber)){
        System.out.println("Is Capicua");
    }else {
        System.out.println("Not Capicua");
    }    }
    private void e3CountCharacterTimes(String texto){
        int counter []=new int[256];

    for(int i=0;i<texto.length();i++){
    counter[texto.charAt(i)]++;
    }

    for(int i=0;i<256;i++){
        if(counter[i]!=0){
            System.out.println((char) i+": "+counter[i]);
        }
    }


    }
    private void e4CountCharTimes(String texto){
        int counter []=new int[256];

        for(int i=0;i<texto.length();i++){
            counter[texto.charAt(i)]++;
        }

        for(int i=0;i<256;i++){
            if(counter[i]>1){
                System.out.println((char) i+": "+counter[i]);
            }
        }


    }
    private void e5Multipleof(int number){
        if(number%2==0){
            System.out.println("Is Multiple");
        }else
            System.out.println("Not is multiple");
    }
    private void e6IsLeapYear(int year){
        Boolean isLeapYear=LocalDate.of(year,1,1).isLeapYear();
        System.out.println("LeapYear: "+isLeapYear);
    }
    private void e7RamdomOrderStrign(String text){
        String [] array=text.split("");
        List<String> list= Arrays.asList(array);
        Collections.shuffle(list);
        System.out.println(list);
    }
    private void e8GetOnllyNotDuplicateList(List<Integer> list){
        Set<Integer> set=new HashSet<>(list);
        set.forEach(System.out::println);
    }
    private void e9CheckIfVowelIsPresent(String text){

        /*
        String[] array=text.split("");
        Boolean ispresent=false;
        for(String s:array){
            if(s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u")){
                ispresent=true;
                break;
            }
        }
        System.out.println(ispresent);
        */

        Boolean result=text.matches(".*[aeiou].*");
        System.out.println(result);
    }
    private void e10Palindrome(String texto){
        boolean result=true;
        int length=texto.length();

        for(int i=0;i<length/2;i++ ){
            if(texto.charAt(i)!=texto.charAt(length-i-1)){
                result=false;
                break;
            }

        }
        System.out.println(result);
    }
}//End main