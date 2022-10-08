package com.cm.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Add {

        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList() ;
            int sum=0;
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            Scanner sc2 = new Scanner(line);

            while(sc2.hasNextInt()){
                arr.add(sc2.nextInt());
            }
            for (int i = 0; i < arr.size(); i++) {
                int a=arr.get(i);
                sum=sum+a;
            }
            System.out.println(sum);
        }
}
