package ru.netology.sqr;

public class SQRService {


    public int search( int min, int max) {
        int number = 0;
        for (int i = 10; i <=99; i++){
            if (i * i >= min) {
                if (i * i <= max) {
                    number = number + 1;
                }
            }
        }
        return number;
    }

}