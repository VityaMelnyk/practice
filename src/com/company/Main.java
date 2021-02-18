package com.company;

public class Main {

    public static void main(String[] args) {
	int[] array = new int[]{10, 20, 30, 40, 50};
	int buffer = array [0];
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
                array[i] = buffer;
            }else {
                array[i] = array[i+1];
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        // 10 20 30 40 50
        //После первого цикла 20 20 30 40 50
        //После второго цикла 20 30 30 40 50
        //После третього цикла 20 30 40 40 50
        //После четвертого цикла 20 30 40 50 50
        //На пятом цикле пятому елементу даем БУФФЕР

        buffer = array[array.length-1];

        for (int i = array.length-1; i >= 0; i--) {
            if (i == 0) {
                array[i] = buffer;
            } else {
                array[i] = array[i - 1];
            }
        }
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                System.out.print(" " + array[i]);
            }

            //найти общий префикс
            String[] strings = {"abc","abcd","abcde","abco","abrakadabra"};
            int counter = -1;
            boolean goOn = true;
            while (goOn) {

                for (int i = 0; i < strings.length; i++) {
                    counter++;
                    if (strings[i].charAt(counter) != strings[0].charAt(counter)) {
                        goOn = false;
                        break;
                    }
                }
                System.out.println(counter);

                System.out.println(strings[0].substring(0,counter));
            }
    }
}
