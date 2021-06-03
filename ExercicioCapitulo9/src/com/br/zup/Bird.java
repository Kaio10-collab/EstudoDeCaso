package com.br.zup;

public class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }

    public static class Solution {

        public static void main(String args[]) {

            Bird bird = new Bird();
            bird.walk();
            bird.fly();
            bird.sing();
        }
    }
}