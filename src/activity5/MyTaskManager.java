package activity5;

import java.util.ArrayList;
import java.util.List;

public class MyTaskManager implements TaskManager{

	private List<Task> tasks = new ArrayList<Task>();
	@Override
	public void addTask(Task task) {
		tasks.add(task);		
	}
	@Override
	public void removeTask(Task task) {
		int index = tasks.indexOf(task);
		tasks.remove(index);		
	}
	@Override
	public List<Task> getTasks() {
		return tasks;
	}
	@Override
	public int getSize() {
		return tasks.size();
	}
}

