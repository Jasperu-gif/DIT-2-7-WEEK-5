public class ClassStatistics5 {
    public static void main(String[] args) {
        
        int[] scores = {75, 92, 78, 64, 91, 88, 73, 95};

        
        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        
        for (int i = 0; i < scores.length; i++) {
            
            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("--- Class Statistics Summary ---");
        System.out.println("Total Sum of Scores: " + sum);
        System.out.println("Average Class Score: " + average);
        System.out.println("Highest Grade:       " + highest);
        System.out.println("Lowest Grade:        " + lowest);
    }
}
