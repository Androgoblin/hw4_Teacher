package hw;

import hw.controller.TeacherController;

public class Main {
   static TeacherController teacherController = new TeacherController();

    public static void main(String[] args) {
        teacherController.create("Зюзик", "Ибрагимович", "Парфёнов");
        teacherController.create("Серж", "Зеновьевич", "Колосов");
        teacherController.create("Сидор", "Кирилович", "Носов");
        teacherController.create("Иван", "Сидорович", "Иванов");
        teacherController.create("Камю", "Петрович", "Шикунов");
        teacherController.create("Зедан", "Наганыч", "Козловов");
        teacherController.create("Револьвер", "Сержович", "Барановов");
        
        teacherController.printAllTeacher();
    }
}
    

