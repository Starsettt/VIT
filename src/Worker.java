import java.util.ArrayList;
public class Worker
{
    String name;
    public ArrayList <Worker> Workers = new ArrayList<>();
    Worker() {}
    Worker(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void ListOfWorkers() {
        for (int i = 0; i < Workers.size()-1; i++) {
            System.out.println(i+1 + ") - " + Workers.get(i).getName());
        }
    }
}