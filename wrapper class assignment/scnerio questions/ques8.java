public class ques8 {
    public static void main(String[] args) {
        
        Integer[] scores = {50, null, 80, 0, null, 95};

        int notPlayedCount = 0;
        int totalScore = 0;   

       
        for (Integer score : scores) {
            if (score == null) {
                notPlayedCount++; 
            } else {
                totalScore += score; 
            }
        }

        System.out.println("--- Game Scoreboard ---");
        System.out.println("Players who haven't played: " + notPlayedCount);
        System.out.println("Total of valid scores: " + totalScore);
    }
}

