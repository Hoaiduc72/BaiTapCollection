
import java.util.Objects;

public class Task {
    private String id;
    private String description;
    private String deadline;
    private int priority;

    public String getId(){ return id;}
    public String getDescription(){ return description;}
    public String getDeadline(){ return deadline;}
    public int getPriority(){ return priority;}

    public Task(String id,String description,String deadline,int priority){
        this.id = id;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Task other = (Task) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
       return "ID: "+id+" | Description: "+description+" | Deadline: "+deadline+" | Priority: "+priority;
    }

    

    
}
