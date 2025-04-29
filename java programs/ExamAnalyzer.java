import java.util.*;

class ExamResults {
    Map<String, Integer> results = new HashMap<>();

    void addResult(String student, int score) {
        results.put(student, score);
    }
}

class ExamAnalyzer {
    public static void main(String[] args) {
        ExamResults er = new ExamResults();
        er.addResult("Bharath", 85);
        er.addResult("Ajay", 92);
        er.addResult("Damu", 95);
        System.out.println("Exam Results: " + er.results);
    }
}