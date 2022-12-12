public class Main {
    public static void main(String[] args) {
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName+' '+firstName+' '+middleName;
        System.out.println(fullName);

        System.out.println("____________________");

        System.out.println("Вторая задача");

        String fullName2 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName2);

        System.out.println("____________________");

        System.out.println("Третья задача");

        fullName = "Иванов Семён Семёнович";
        String fullName1 = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — "+fullName1);

        System.out.println("____________________");
    }
}
