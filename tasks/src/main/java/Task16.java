public class Task16 {

    public static int convert(int minutes) {
        return minutes * 60;
    }

    public static int points(int points2, int points3) {
        return points2 * 2 + points3 * 3;
    }

    public static int footballPoints(int victories, int draws, int losses) {
        return victories * 3 + draws;
    }

    public static boolean divisibleByFive(int number) {
        return number % 5 == 0;
    }

    public static boolean and(boolean a, boolean b) {
        return a && b;
    }

    public static int howManyWalls(int n, int w, int h) {
        return n / (w * h);
    }

    public static int squared(int a) {
        return a * a;
    }

    public static boolean profitableGamble(float prob, int prize, int pay) {
        return prob * prize > pay;
    }

    public static int frames(int minutes, int fps) {
        return fps * minutes * 60;
    }

    public static int mod(int a, int b) {
        return a - a / b * b;
    }



}
