package day29;

public class ExecuteQATrainingBatch {
    static void main() {
        QATrainingBatch batch1 = new QATrainingBatch();
        batch1.numberOfStudents = 10;
        batch1.topicTaughtToday = "Method Overloading";

        System.out.println(batch1.numberOfStudents + ", " + batch1.topicTaughtToday + ", " + QATrainingBatch.trainersName);
    }
}
