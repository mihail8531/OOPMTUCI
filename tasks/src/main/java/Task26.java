public class Task26 {

    public static void main(String[] args) {
        System.out.println(oppositeHouse(3, 5));
        System.out.println(nameShuffle("Donald Trump"));
        System.out.println(discount(89, 20));
        System.out.println(differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(equal(3, 4, 2));
        System.out.println(reverse("Hello World"));
        System.out.println(programmers(147, 33, 526));
        System.out.println(getXO("ooxXm"));
        System.out.println(bomb("There is a bomb."));
        System.out.println(sameAscii("AA", "B@"));

    }

    public static int oppositeHouse(int houseNumber, int houseCount) {
        return 2 * houseCount - houseNumber + 1;
    }

    public static String nameShuffle(String firstAndSecondName) {
        String[] words = firstAndSecondName.split(" ");
        return words[1] + " " + words[0];
    }

    public static float discount(int price, int discount) {
        return (float) price * (100 - discount) / 100;
    }

    public static int differenceMaxMin(int[] array) {
        return arrayMax(array) - arrayMin(array);
    }

    public static int equal(int a, int b, int c) {
        if (a == b && b == c)
            return 3;
        if (a == b || b == c || a == c)
            return  2;
        return 0;
    }

    public static String reverse(String s) {
        StringBuilder resultString = new StringBuilder();
        for (char c : s.toCharArray()) {
            resultString.insert(0, c);
        }
        return resultString.toString();
    }

    public static int programmers(int firstSalary, int secondSalary, int thirdSalary) {
        return differenceMaxMin(new int[] {firstSalary, secondSalary, thirdSalary});
    }

    public static boolean getXO(String s) {
        int xCount = 0;
        int oCount = 0;
        for (char c : s.toCharArray()) {
            xCount += Character.toLowerCase(c) == 'x' ? 1 : 0;
            oCount += Character.toLowerCase(c) == 'o' ? 1 : 0;
        }
        return xCount == oCount;
    }

    public static String bomb(String s) {
        return s.toLowerCase().contains("bomb") ? "DUCK!" : "Relax, there's no bomb.";
    }

    public static boolean sameAscii(String s1, String s2) {
         int sumASCIIs1 = 0;
         int sumASCIIs2 = 0;
         for (char c : s1.toCharArray())
             sumASCIIs1 += c;
         for (char c : s2.toCharArray())
             sumASCIIs2 += c;
         return sumASCIIs1 == sumASCIIs2;
    }

    

    private static int arrayMax(int[] array) {
        int maxNumber = array[0];
        for (int j : array) {
            maxNumber = Math.max(maxNumber, j);
        }
        return maxNumber;
    }

    private static int arrayMin(int[] array) {
        int maxNumber = array[0];
        for (int j : array) {
            maxNumber = Math.min(maxNumber, j);
        }
        return maxNumber;
    }

}
