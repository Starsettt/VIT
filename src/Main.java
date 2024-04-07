import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        AllClass options = new AllClass();

        while (true)
        {
            System.out.println("Выберите функцию:\n1) - Войти как менеджер\n2) - Войти как исполнитель\n3) - Выход из программы");
            String option = input.next();

            if (option.equals("1"))
            {
                options.ManagerOptions();
            }
            else if (option.equals("2"))
            {
                //options.WorkerOptions();
            }
            else if (option.equals("3"))
            {
                break;
            }
            else
            {
                System.out.println("Функции с таким номером не существует!");
            }
        }
    }
}