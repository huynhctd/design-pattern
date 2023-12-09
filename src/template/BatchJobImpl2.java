package template;

public class BatchJobImpl2 extends AbstractBatchJob{
    @Override
    public String step1() {
        return "BatchJobImpl2_step1";
    }

    @Override
    public String step2() {
        return "BatchJobImpl2_step2";
    }
}
