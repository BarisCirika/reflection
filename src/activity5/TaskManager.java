package activity5;

import java.util.List;

public interface TaskManager {
	
    void addTask(Task task);
    void removeTask(Task task);
    List<Task> getTasks();
    int getSize();
    
}
