package com.company;

public class Main {
    static int sum(int a , int b, int c){
        return  a + b - c;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Main() {
    }

    public static void main(String[] args) {
	// write your code here
//        int x = sum(3,4,5);

        Sayhello("ssaya", 99);
        System.out.println(fun(5) + fun(5));
    }
    static  int fun(int x){
        return  5;
    }

    private static  void   Sayhello(String name, int x){
        System.out.println("heello" + name + x);
//        System.out.println(x);
    }


}
