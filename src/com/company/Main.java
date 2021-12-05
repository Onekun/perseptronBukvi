package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static void Decrease(String number,List<Integer> weights){
        for(int i =0;i<25;i++){
            if(Integer.parseInt(Character.toString(number.charAt(i)))==1){
                weights.set(i,weights.get(i)-1);
            }
        }
    }
    static void Increase(String number,List<Integer> weights){
        for(int i=0;i<25;i++){
            if(Integer.parseInt(Character.toString(number.charAt(i)))==1){
                weights.set(i,weights.get(i)+1);
            }
        }
    }
    static Boolean Proceed(String number,List<Integer> weights,int bias){
        int net = 0;
        for(int i = 0;i<25;i++){
            net+=Integer.parseInt(Character.toString(number.charAt(i)))*weights.get(i);
        }
        if(net>=bias){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int bias=6;
        List<String> alp= new ArrayList<>();
        alp.add("01110" +
                "01010" +
                "01110" +
                "01010" +
                "01010");
        alp.add("11110" +
                "10000" +
                "11110" +
                "10010" +
                "11110");
        alp.add("11100" +
                "10100" +
                "11110" +
                "10010" +
                "11110");//В
        alp.add("11110" +
                "10000" +
                "10000" +
                "10000" +
                "10000");
        alp.add("01110" +
                "01010" +
                "01010" +
                "11111" +
                "10001");//Д
        alp.add("11110" +
                "10000" +
                "11110" +
                "10000" +
                "11110");
        alp.add("10101" +
                "10101" +
                "01110" +
                "10101" +
                "10101");
        alp.add("11110" +
                "00010" +
                "11110" +
                "00010" +
                "11110");//З
        alp.add("10010" +
                "10010" +
                "10110" +
                "11010" +
                "10010");//и
        alp.add("10010" +
                "10100" +
                "11000" +
                "10100" +
                "10010");
        alp.add("00001" +
                "00011" +
                "00101" +
                "01001" +
                "10001");
        alp.add("10001" +
                "11011" +
                "10101" +
                "10001" +
                "10001");
        alp.add("10010" +
                "10010" +
                "11110" +
                "10010" +
                "10010");//Н
        alp.add("11110" +
                "10010" +
                "10010" +
                "10010" +
                "11110");//о
        alp.add("11110" +
                "10010" +
                "10010" +
                "10010" +
                "10010");
        alp.add("11110" +
                "10010" +
                "11110" +
                "10000" +
                "10000");
        alp.add("11110" +
                "10000" +
                "10000" +
                "10000" +
                "11110");
        alp.add("11111" +
                "00100" +
                "00100" +
                "00100" +
                "00100");
        alp.add("10001" +
                "11011" +
                "01110" +
                "00100" +
                "11000");
        alp.add("00100" +
                "11111" +
                "10101" +
                "11111" +
                "00100");
        alp.add("10001" +
                "01010" +
                "00100" +
                "01010" +
                "10001");
        alp.add("10010" +
                "10010" +
                "10010" +
                "11110" +
                "00001");//ц
        alp.add("10001" +
                "10001" +
                "11111" +
                "00001" +
                "00001");
        alp.add("10101" +
                "10101" +
                "10101" +
                "10101" +
                "11111");
        alp.add("10101" +
                "10101" +
                "10101" +
                "11111" +
                "00001");
        alp.add("11000" +
                "01000" +
                "01111" +
                "01001" +
                "01111");
        alp.add("10001" +
                "10001" +
                "11101" +
                "10101" +
                "11101");
        alp.add("10000" +
                "10000" +
                "11110" +
                "10010" +
                "11110");
        alp.add("11100" +
                "00110" +
                "11111" +
                "00110" +
                "11100");
        alp.add("10111" +
                "10101" +
                "11101" +
                "10101" +
                "10111");
        alp.add("11110" +
                "10010" +
                "11110" +
                "01010" +
                "10010");
        List<String> imagesOfalp = new ArrayList<>();
        imagesOfalp.add(
                        "11100" +
                        "10000" +
                        "11110" +
                        "10010" +
                        "11110");//В
        imagesOfalp.add(
                        "11100" +
                        "00100" +
                        "11110" +
                        "00010" +
                        "11110");//В
        imagesOfalp.add(
                        "11100" +
                        "10100" +
                        "11110" +
                        "00000" +
                        "11110");//В
        imagesOfalp.add(
                        "10000" +
                        "10000" +
                        "11110" +
                        "10010" +
                        "10010");//Н
        imagesOfalp.add(
                        "10010" +
                        "10010" +
                        "11110" +
                        "00010" +
                        "10010");//Н
        imagesOfalp.add(
                        "10010" +
                        "10010" +
                        "11110" +
                        "00010" +
                        "00010");//Н

        List<Integer> weightsV=new ArrayList<>();
        for(int i =0;i<25;i++){
            weightsV.add(0);
        }
        List<Integer> weightsN=new ArrayList<>();
        for(int i =0;i<25;i++){
            weightsN.add(0);
        }
        Random random = new Random();
        for(int i =0;i<10000;i++){
            int rand=random.nextInt(30);
            if(rand==2){
                if(!Proceed(alp.get(rand),weightsV,bias)){
                    Increase(alp.get(rand),weightsV);
                }
            }
            if(rand==12){
                if(!Proceed(alp.get(rand),weightsN,bias)){
                    Increase(alp.get(rand),weightsN);
                }
            }
            if(rand!=12 && rand!=2){
                if(Proceed(alp.get(rand),weightsV,bias)){
                    Decrease(alp.get(rand),weightsV);
                }
                if(Proceed(alp.get(rand),weightsN,bias)){
                    Decrease(alp.get(rand),weightsN);
                }

            }
        }
        System.out.println(weightsV);
        System.out.println("А это В = "+Proceed(alp.get(0),weightsV,bias));
        System.out.println("Б это В = "+Proceed(alp.get(1),weightsV,bias));
        System.out.println("В это В = "+Proceed(alp.get(2),weightsV,bias));
        System.out.println("Г это В = "+Proceed(alp.get(3),weightsV,bias));
        System.out.println("Д это В = "+Proceed(alp.get(4),weightsV,bias));
        System.out.println("Е это В = "+Proceed(alp.get(5),weightsV,bias));
        System.out.println("Ж это В = "+Proceed(alp.get(6),weightsV,bias));
        System.out.println("З это В = "+Proceed(alp.get(7),weightsV,bias));
        System.out.println("И это В = "+Proceed(alp.get(8),weightsV,bias));
        System.out.println("К это В = "+Proceed(alp.get(9),weightsV,bias));
        System.out.println("Л это В = "+Proceed(alp.get(10),weightsV,bias));
        System.out.println("М это В = "+Proceed(alp.get(11),weightsV,bias));
        System.out.println("Н это В = "+Proceed(alp.get(12),weightsV,bias));
        System.out.println("О это В = "+Proceed(alp.get(13),weightsV,bias));
        System.out.println("П это В = "+Proceed(alp.get(14),weightsV,bias));
        System.out.println("Р это В = "+Proceed(alp.get(15),weightsV,bias));
        System.out.println("С это В = "+Proceed(alp.get(16),weightsV,bias));
        System.out.println("Т это В = "+Proceed(alp.get(17),weightsV,bias));
        System.out.println("У это В = "+Proceed(alp.get(18),weightsV,bias));
        System.out.println("Ф это В = "+Proceed(alp.get(19),weightsV,bias));
        System.out.println("Х это В = "+Proceed(alp.get(20),weightsV,bias));
        System.out.println("Ц это В = "+Proceed(alp.get(21),weightsV,bias));
        System.out.println("Ч это В = "+Proceed(alp.get(22),weightsV,bias));
        System.out.println("Ш это В = "+Proceed(alp.get(23),weightsV,bias));
        System.out.println("Щ это В = "+Proceed(alp.get(24),weightsV,bias));
        System.out.println("Ъ это В = "+Proceed(alp.get(25),weightsV,bias));
        System.out.println("Ы это В = "+Proceed(alp.get(26),weightsV,bias));
        System.out.println("Ь это В = "+Proceed(alp.get(27),weightsV,bias));
        System.out.println("Э это В = "+Proceed(alp.get(28),weightsV,bias));
        System.out.println("Ю это В = "+Proceed(alp.get(29),weightsV,bias));
        System.out.println("Я это В = "+Proceed(alp.get(30),weightsV,bias));

        System.out.println(weightsN);
        System.out.println("А это Н = "+Proceed(alp.get(0),weightsN,bias));
        System.out.println("Б это Н = "+Proceed(alp.get(1),weightsN,bias));
        System.out.println("В это Н = "+Proceed(alp.get(2),weightsN,bias));
        System.out.println("Г это Н = "+Proceed(alp.get(3),weightsN,bias));
        System.out.println("Д это Н = "+Proceed(alp.get(4),weightsN,bias));
        System.out.println("Е это Н = "+Proceed(alp.get(5),weightsN,bias));
        System.out.println("Ж это Н = "+Proceed(alp.get(6),weightsN,bias));
        System.out.println("З это Н = "+Proceed(alp.get(7),weightsN,bias));
        System.out.println("И это Н = "+Proceed(alp.get(8),weightsN,bias));
        System.out.println("К это Н = "+Proceed(alp.get(9),weightsN,bias));
        System.out.println("Л это Н = "+Proceed(alp.get(10),weightsN,bias));
        System.out.println("М это Н = "+Proceed(alp.get(11),weightsN,bias));
        System.out.println("Н это Н = "+Proceed(alp.get(12),weightsN,bias));
        System.out.println("О это Н = "+Proceed(alp.get(13),weightsN,bias));
        System.out.println("П это Н = "+Proceed(alp.get(14),weightsN,bias));
        System.out.println("Р это Н = "+Proceed(alp.get(15),weightsN,bias));
        System.out.println("С это Н = "+Proceed(alp.get(16),weightsN,bias));
        System.out.println("Т это Н = "+Proceed(alp.get(17),weightsN,bias));
        System.out.println("У это Н = "+Proceed(alp.get(18),weightsN,bias));
        System.out.println("Ф это Н = "+Proceed(alp.get(19),weightsN,bias));
        System.out.println("Х это Н = "+Proceed(alp.get(20),weightsN,bias));
        System.out.println("Ц это Н = "+Proceed(alp.get(21),weightsN,bias));
        System.out.println("Ч это Н = "+Proceed(alp.get(22),weightsN,bias));
        System.out.println("Ш это Н = "+Proceed(alp.get(23),weightsN,bias));
        System.out.println("Щ это Н = "+Proceed(alp.get(24),weightsN,bias));
        System.out.println("Ъ это Н = "+Proceed(alp.get(25),weightsN,bias));
        System.out.println("Ы это Н = "+Proceed(alp.get(26),weightsN,bias));
        System.out.println("Ь это Н = "+Proceed(alp.get(27),weightsN,bias));
        System.out.println("Э это Н = "+Proceed(alp.get(28),weightsN,bias));
        System.out.println("Ю это Н = "+Proceed(alp.get(29),weightsN,bias));
        System.out.println("Я это Н = "+Proceed(alp.get(30),weightsN,bias));

        System.out.println("Узнал В? "+Proceed(alp.get(2),weightsV,bias));
        System.out.println("Узнал Н? "+Proceed(alp.get(12),weightsN,bias));
        System.out.println("Узнал первый образ В? "+Proceed(imagesOfalp.get(0),weightsV,bias));
        System.out.println("Узнал второй образ В? "+Proceed(imagesOfalp.get(1),weightsV,bias));
        System.out.println("Узнал третьий образ В? "+Proceed(imagesOfalp.get(2),weightsV,bias));
        System.out.println("Узнал первый образ Н? "+Proceed(imagesOfalp.get(3),weightsN,bias));
        System.out.println("Узнал второй образ Н? "+Proceed(imagesOfalp.get(4),weightsN,bias));
        System.out.println("Узнал третий образ Н? "+Proceed(imagesOfalp.get(5),weightsN,bias));
    }
}