import java.util.ArrayList;
public class Manager
{
    String name;
    public ArrayList<Manager> Managers = new ArrayList<>();
    Manager() {}
    Manager(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void ListOfWorkers() {
        for (int i = 0; i < Managers.size()-1; i++) {
            System.out.println(i+1 + ") - " + Managers.get(i).getName());
        }
    }
}