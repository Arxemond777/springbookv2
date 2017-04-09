package ch11_scheduling_tasks.page_522_scheduled_task_annotation;

import java.util.List;

public interface CarService
{
    List<Car> findAll();

    Car save(Car car);

    void updateCarAgeJob();
}
