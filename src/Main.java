public class Main {
    public static void main(String[] args) {

        Mans[] man = new Mans[4];
        man[0] = new Mans("Имя", 9);
        man[1] = new Mans("Имя1", 200);
        man[2] = new Mans("Имя2", 300);
        man[3] = new Mans("Имя3", 400);
        Teams teams = new Teams( "1", man);

        Course course = new Course(10);
        String result = course.doIt(teams);
        System.out.println(result);


    }
}
