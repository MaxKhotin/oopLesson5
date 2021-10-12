package Task1;

import java.util.ArrayList;
import java.util.ListIterator;

//Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со
//        школы. И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Oksana T");
        arrayList.add("Lubov M");
        arrayList.add("Ludmila A");
        arrayList.add("Katerina S");
        arrayList.add("Vitaliy K");
        arrayList.add("Natalya G");
        System.out.println(arrayList);
        System.out.println("Индекс лучшего учителя: "+arrayList.indexOf("Oksana T"));
        System.out.println("Индекс худшего учителя: "+arrayList.indexOf("Katerina S"));

        }
    }
