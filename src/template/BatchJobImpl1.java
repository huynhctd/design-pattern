package template;

public class BatchJobImpl1 extends AbstractBatchJob {
    @Override
    public String step1() {
        return "BatchJobImpl1_step1";
    }

    @Override
    public String step2() {
        return "BatchJobImpl1_step2";
    }
}
