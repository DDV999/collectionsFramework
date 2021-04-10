import java.util.HashMap;

public class CollectionTemp2 {
    public static void main(String[] args) {
        // Создать объект HashMap хранящий пары, код сотрудников и зарплаты.
        // String key: Код сотрудников
        // Float value: Зарплата.
        HashMap<String, Float> salaryMap = new HashMap<String, Float>();


        salaryMap.put("E01", 1000f);
        salaryMap.put("E02", 12000f);
        salaryMap.put("E03", 12300f);
        salaryMap.put("E04", 1000f);
        salaryMap.put("E05", 300.5f);

        // Получить зарплату сотрудника 'E02'
        Float salary = salaryMap.get("E01");
        System.out.println("Salary of employee E01 = " + salary);

        // Обновить зарплату сотрудника 'E05'
        salaryMap.put("E05", 400f);

        System.out.println("Salary of employee E05 = " + salaryMap.get("E05"));
    }
}
