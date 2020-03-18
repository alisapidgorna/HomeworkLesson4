public class HomeworkLesson4 {
    public static void main(String[] args) {
        recursion(30);
        
        double t=161.8;
        int w=(int)t;
        System.out.println(w);
        long l = Math.round(t);
        System.out.println(l);
        System.out.println("Random/*200/round is "+ Math.round(Math.random()*200));

        Overload overload = new Overload();
        System.out.println(overload.AddThreeDigits(9,4,67));
        System.out.println(overload.AddThreeDigits(6.5,9.1,7.2));

        int v = Actions.doSummation(31,8,4);
        System.out.println("Result of Summation: "+ v);

        Actions obj1 = new Actions();
        int s = obj1.doMultiplication(45,5, 3);
        System.out.println("Result of Multiplication: "+ s);

        int g = Actions.div(60,3);
        System.out.println("Result of Division: "+ g);

        Actions obj2 = new Actions();
        int k = obj2.sub(98,7, 39);
        System.out.println("Result of Subtraction: "+ k);
    }

    public static void recursion (int y) {
        if (y == 0)
            return;
        System.out.println(y);
        recursion(y-2);
    }
}
