package activity5;

public class Task {
	private String description;
	private boolean isFinished;
	public Task(String description, boolean isFinished) {
		super();
		this.description = description;
		this.isFinished = isFinished;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isFinished() {
		return isFinished;
	}
	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}
}


