public class Course {
    String result;
    private int necessaryDistance;

    public Course (int necessaryDistance){
        this.necessaryDistance = necessaryDistance;
    }

    public String doIt(Teams teams) {
        result = "Группа номер:"+ teams.getName()+ " " + '\n';
        for (Mans mans: teams.getMans()) {
            result += "Имя участника: " + mans.getName() + " " + '\n';
            int value = mans.getMaxDistance();
            testNecessaryDistance(value);
        }
        return result;
    }

    private void testNecessaryDistance(int value) {
        if (value>=necessaryDistance)
            result += "Distance Ok\n";
        else
            result += "Distance over long\n";
    }
}
