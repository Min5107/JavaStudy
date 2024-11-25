package thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static thread.executor.ExecutorUtils.printState;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ExecutorBasicMain {
    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(2, 4,0, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
        log("== 초기 상태 ==");
        printState(es);

        es.execute(new RunnableTask("task A"));
        es.execute(new RunnableTask("task B"));
        es.execute(new RunnableTask("task C"));
        es.execute(new RunnableTask("task D"));

        log("== 작업 수행 중 ==");
        printState(es);
        sleep(3000);
        printState(es);

        es.close();
        log("== shutdown 완료 ==");
        printState(es);

    }
}
