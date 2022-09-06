package com.cm.demo;

public class ASCII {
    public static void main(String[] args) {
        for(int i = 0;i < 127;i++){
            System.out.print((char)i +" ");
            if(i % 10 == 9){//从0开始到9为10 执行换行
                System.out.println();
            }
        }
    }
}
