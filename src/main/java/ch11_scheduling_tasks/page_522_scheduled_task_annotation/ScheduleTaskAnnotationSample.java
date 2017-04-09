package ch11_scheduling_tasks.page_522_scheduled_task_annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ScheduleTaskAnnotationSample
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch11_scheduling_tasks/page_522_scheduled_task_annotation/task-annotation-app-context.xml");
        ctx.refresh();

        //TODO бала проблема с запуском с анотациями
        while (true) {
        }
    }
} 
