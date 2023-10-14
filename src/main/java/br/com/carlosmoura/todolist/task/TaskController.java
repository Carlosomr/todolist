package br.com.carlosmoura.todolist.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    
    @Autowired
    private ITaskRepository itaskRepository;


    @PostMapping("/")
    public TaskModel create (@RequestBody TaskModel taskModel){
    System.out.println("chegou no controller");
     var task = this.itaskRepository.save(taskModel);
     return task;

    }
}
