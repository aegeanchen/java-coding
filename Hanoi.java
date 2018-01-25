package test3;

public class Hanoi {


    public static void main(String[] args){
        getNum(5);

    }


    private static void getNum(int num){
        int moveCount;
        char a = 'A';
        char b = 'B';
        char c = 'C';
        moveCount = 0;
        move(num, a, b, c);
        
        System.out.println("moveCount = " + moveCount);
    }


    private static void move(int moveNum, char a,char b, char c){
        if(moveNum == 1){
            System.out.println("from " + a + " move " + moveNum + " to " + c);
        }
        else{
            move(moveNum - 1, a, c, b);
            System.out.println("from " + a + " move " + moveNum + " to " + c);
            move(moveNum - 1, b, a, c);
        }

    }
}