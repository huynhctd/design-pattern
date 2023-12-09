package template;

public class Main {
    public static void main(String[] args) {
        AbstractBatchJob batchJob1 = new BatchJobImpl1();
        AbstractBatchJob batchJob2 = new BatchJobImpl2();

        batchJob1.template();
        System.out.println("----------------------------------------");
        batchJob2.template();
    }
}
