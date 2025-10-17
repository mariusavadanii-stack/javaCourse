package G;

public class MethodOverLoading {
    /*creating a method with same name but with different number or type of parameters*/
    static void main(String[] args) {
        System.out.println(sum(3, 7));
        System.out.println(MethodOverLoading.sum(3, 7));
        getScore("luigi",2000, 3,100,true);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(double a, double b, double c) {
        return a + b + c;
    }

    public static void getScore(String player, int score) {
        System.out.println("the player " + player + "has a score " + score);

    }
    public static void getScore(String player, int score, int levels, int bonus, boolean isGameOver) {
        if (isGameOver) {
            double finalScore = score + (levels * bonus);
        } else {
            System.out.println("can't know score if game not over");
        }
    }


}/*class end*/