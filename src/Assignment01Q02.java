public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        double denominator = 1;
        int direction = 1;

        int precision = Integer.parseInt(args[0]);

        for (int i = 0; i<precision; i++) {
            approxPi += (direction/denominator);
            direction *= -1;
            denominator += 2;
        }

        approxPi *= 4;
        
        System.out.println(approxPi + " " + actualPi);
    }
}
