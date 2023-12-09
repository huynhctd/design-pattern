package template;

public abstract class AbstractBatchJob {
    public void template() {
        System.out.println("------- start job ---------");
        System.out.println("------- step 1 --------- : " + step1());
        // Logic
        System.out.println("------- step 1 --------- : " + step2());

        // Insert info job SUCCESS OR FAILURE TO DB
        // Notify
        System.out.println("------- end job ---------");
    }

    public abstract String step1();
    public abstract String step2();
}
