package Assignment_2.Task_3;

public class Task_4 {
    public class Entity {
        public void move() {
            System.out.println("Я передвигаюсь.");
        }

        public void eat() {
            System.out.println("Я ем.");
        }
    }

    public class Human extends
            Entity {

        public void speak() {
            System.out.println("Я умею общаться.");
        }

        public class JavaDeveloper
                extends Human {

            public void code() {
                System.out.println("Я умею общаться на Java.");
            }
        }

        public static void main(String[] args) {

        }
    }
}
