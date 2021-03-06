package ch11_scheduling_tasks.page_523_async_task;

import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

@Service("asyncService")
public class AsyncServiceImpl implements AsyncService
{
    final Logger logger = LoggerFactory.getLogger(AsyncServiceImpl.class);

    @Async
    @Override
    public void asyncTask() {
//        logger.info("Start execution of async. task");
        System.out.println("Start execution of async. task");

        try {
            Thread.sleep(10000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("Complete execution of async. task");
//        logger.info("Complete execution of async. task");
    }

    @Async
    @Override
    public Future<String> asyncWithReturn(String name) {
//        logger.info("Start execution of async. task with return");
        System.out.println("Start execution of async. task with return");

        try {
            Thread.sleep(5000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        logger.info("Complete execution of async. task with return");
        System.out.println("Complete execution of async. task with return");

        return new AsyncResult<String>("Hello: " + name);
    }
}
