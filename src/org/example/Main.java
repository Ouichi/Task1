package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word1 = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you!" +"\n"+ name +"В≥Вс");

        System.out.println("How many times to run? MAX 20 times!PLZ");
        int j = scanner.nextInt();
        String[] list1 = {"Hello", "world", "c"};
        Integer[] list2 ={1,2,3};
        int i1 = 0;

        for(int i=1; i <= j; i=i+1){
            i1 = i;
            if(i<=10){
                word1 = list2[0]+"."+list1[0]+list1[1];
            }
            else if(i>20){
                System.out.println(name + "В≥Вс!That's too much!"+"\n"+"I'm out!BYE!");
                break;
            }
            else{
                word1 = list2[1]+"."+list1[0];
            }
            System.out.println(word1+" "+i+" time");
        }
        if(i1!=21){
            System.out.println("Thanks!See you next time!");
        }
    }
}