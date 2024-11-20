package thread.cas.increment;

public class IncrementPerformanceMain {

    public static final long COUNT = 100_000_000;
    public static void main(String[] args) throws InterruptedException {
        test(new BasicInteger());
        test(new VolatileInteger());
        test(new SyncInteger());
        test(new MyAtomicInteger());
    }
    private static void test(IncrementInteger increment) throws InterruptedException {
        long startMs = System.currentTimeMillis();

        for (long i = 0; i < COUNT; i++) {
            increment.increment();
        }

        long endMs = System.currentTimeMillis();
        System.out.println(increment.getClass().getSimpleName() + ": ms=" + (endMs - startMs));
    }
}
