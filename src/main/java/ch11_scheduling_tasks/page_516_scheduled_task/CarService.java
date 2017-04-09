package ch11_scheduling_tasks.page_516_scheduled_task;

import java.util.List;

public interface CarService
{
    List<Car> findAll();

    Car save(Car car);

    void updateCarAgeJob();
}
