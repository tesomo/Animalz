package com.animal.sounds;

public class Animals {
    public void animalSound() {
        System.out.println(" animals make different sounds; the specific animal sound is below");
    }
}

     class Pig extends Animals {
        public void pigSound() {
            super.animalSound();
            System.out.println(" a pig oinks");
        }
    }

     class Cat extends Animals {
        public void catSound() {
            super.animalSound();
            System.out.println(" a cat meows");
        }

         public void animalSound2() {
             int num = 9;
             System.out.println("a cat meows " + num + " times per hour ");
         }
     }

     class Test {
        public static void main(String[] args) {
            Pig obj = new Pig();
            Cat obj1 = new Cat();
            obj.pigSound();
            obj1.catSound();
            Cat obj3 = new Cat();
            obj3.animalSound2();

        }
    }
