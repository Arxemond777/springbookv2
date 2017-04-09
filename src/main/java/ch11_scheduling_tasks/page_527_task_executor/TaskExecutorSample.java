package ch11_scheduling_tasks.page_527_task_executor;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TaskExecutorSample
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch11_scheduling_tasks/page_527_task_executor/app-context.xml");
        ctx.refresh();

        TaskToExecute taskToExecute = ctx.getBean(TaskToExecute.class);
        taskToExecute.executeTask();
    }
}
