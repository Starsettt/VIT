import java.util.ArrayList;
public class Task
{
    String text;
    String date;
    public ArrayList <Task> Tasks = new ArrayList<>();
    Task(){}
    Task(String text, String date){
        this.text = text;
        this.date = date;
    }
    public String getDate() {
        return date;
    }
    public String getText() {
        return text;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void ListOfTasks() {
        for (int i = 0; i < Tasks.size()-1; i++) {
            System.out.println(i+1 + ") - " + Tasks.get(i).getText()+getDate());
        }
    }
}