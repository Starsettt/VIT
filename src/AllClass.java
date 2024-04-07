import java.util.ArrayList;
import java.util.Scanner;
public class AllClass
{
    Scanner input = new Scanner(System.in);
    String SpecialKey = "№86!";
    String ManagerPass = "1410";
    String WorkerPass = "2222";
    String PrimaryStatus = " - (НЕ ВЫПОЛНЕНО)";
    String NewStatus = " - (ВЫПОЛНЕНО)";
    boolean operator = false;
    boolean bool = true;
    int ArrayIndex;
    Manager manager = new Manager();
    Worker worker = new Worker();
    Task task = new Task();
    void FastEntrance(ArrayList<String> List)
    {
        System.out.println("Введите номер для быстрого входа:");

        int index = input.nextInt();
        ArrayIndex = index-1;
        if (index>List.size())
        {
            while (index>List.size())
            {
                System.out.println("Сотрудника с таким номером не существует!Повторите ввод");
                index = input.nextInt();
                ArrayIndex = index-1;
            }
        }
        operator = false;
    }
    void ManagerOptions()
    {
        bool = true;
        while (bool)
        {
            //FastEntrance(Managers);
            //String Login = manager.Managers.get(ArrayIndex).getName();
            String Login = input.next();
            if (!operator)
            {
                operator = true;
                System.out.println("Введите пароль:");
                String Password = input.next();
                while (bool)
                {
                    if (Password.equals(ManagerPass))
                    {
                        System.out.println(Login + ", добро пожаловать!\nВыберите опцию:");
                        System.out.println("1) - Список сотрудников\n2) - Список ваших задач\n3) - Добавление задачи\n4) - Изменение задачи\n5) - Переназначение задачи\n6) - Удаление задачи\n7) - Добавление сотрудника\n8) - Удаление сотрудника\n9) - Выход в главное меню");
                        int function1 = input.nextInt();
                        switch (function1)
                        {
                            case 1:
                                worker.ListOfWorkers();
                                break;
                            case 2:
                                ListOfManagerTasks(Login);
                                break;
                            case 3:
                                AddTask(Login);
                                break;
                            case 4:
                                ListOfManagerTasks(Login);
                                //ChangeTask(Login);
                                break;
                            case 5:
                                ListOfManagerTasks(Login);
                                //ReassignTask();
                                break;
                            case 6:
                                ListOfManagerTasks(Login);
                               // DeleteTask();
                                break;
                            case 7:
                               // AddWorker();
                                break;
                            case 8:
                                //DeleteWorker();
                                break;
                            case 9:
                                bool = false;
                                break;
                            default:
                                System.out.println("Функции с таким номером не сущесвует!");
                        }
                    }
                    else
                    {
                        System.out.println("Неверный пароль!\nВведите пароль:");
                        Password = input.next();
                    }
                }
            }
            else
            {
                System.out.println("Такого менеджера здесь нет!");
            }
            if (!bool)
            {
                break;
            }
        }
    }
    void ListOfManagerTasks(String ManagerLogin)
    {
        System.out.println("Текущий список ваших задач:");
        for (int i = 0; i<=task.Tasks.size()-1; i++)
        {
            String Task = task.Tasks.get(i).getText() + task.Tasks.get(i).getDate();
            if (Task.contains(ManagerLogin))
            {
                System.out.println(Task);
            }
        }
    }
    void AddTask(String ManagerLogin)
    {
        System.out.println("Введите задачу: ");
        String Task = input.next();
        worker.ListOfWorkers();
        System.out.println("Введите номер сотрудника: ");
        int index = input.nextInt()-1;
        String NameOfWorker = worker.Workers.get(index).getName();
        Task task1 = new Task(Task + ManagerLogin + NameOfWorker, input.next());
        task.Tasks.add(task1);
    }

}