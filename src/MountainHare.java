public class MountainHare {

    private int age;
    private double weight;
    private int jumpLength;
    private static String color;

    public MountainHare (int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
        color = "";
    }

    public void setColor(String season) {
        switch (season) {
            case ("лето"):
                color = "серо-рыжий";
                break;
            case ("зима"):
                color = "белый";
                break;
        }
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}