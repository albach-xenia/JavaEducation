package lr5.Example3;

import lr5.Example1.Task1;

public class Task3 {

        private int num1;
        private int num2;

        Task3(){
            System.out.println("Koнcтpyиpoвaниe объекта test Task(1)\n");
        }

        Task3(int num1){
            System.out.println("Koнcтpyиpoвaниe объекта Task(2)");
            this.num1 = num1;
            System.out.println("num1^num1 = " + exponentOwnPow(num1) + "\n");
        }

        public int exponentOwnPow(int num1) {
            this.num1 = num1;
            int result = 1;
            for (int i = 1; i <= num1; i++) {
                result = num1 * result;
            }
            return result;
        }

        Task3(int num1, int num2){
            System.out.println("Koнcтpyиpoвaниe объекта Task(3)");
            this.num1 = num1;
            this.num2 = num2;
            System.out.println("num1^num2 = " + exponentPow(num1, num2) + "\n");
        }

        public int exponentPow(int n1, int n2) {
            n1 = num1;
            n2 = num2;
            int result = 1;
            for (int i = 1; i <= num2; i++) {
                result = num1 * result;
            }
            return result;
        }
    }



