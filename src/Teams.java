public class Teams {
    private String name;
    private Mans[] man;

    public Teams(String name, Mans[] man) {
        this.name = name;
        this.man = man;

    }

    public String getName() {
        return name;
    }

    public Mans[] getMans(){
        return man;
    }
}
