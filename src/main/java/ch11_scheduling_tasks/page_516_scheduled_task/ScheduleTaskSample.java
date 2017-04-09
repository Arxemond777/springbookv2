package ch11_scheduling_tasks.page_516_scheduled_task;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ScheduleTaskSample
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch11_scheduling_tasks/page_516_scheduled_task/task-namespace-app-context.xml");
        ctx.refresh();

        while (true) {
        }
    }
}
