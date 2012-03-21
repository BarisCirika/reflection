package activity5;

public class Application {
    
	public static void main(String[] args) {
    	TaskManager mng = (TaskManager) 
    			TaskManagerProxy.createProxy(new MyTaskManager());
    	Task t1 = new Task("Become a millionaire",false);
    	Task t2 = new Task("Prepare exam",true);
    	mng.addTask(t1);
    	mng.addTask(t2);
    	System.out.println("There are " + 
    				mng.getSize() + " tasks in the list.");
	}	
}

