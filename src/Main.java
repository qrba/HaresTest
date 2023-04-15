import java.util.List;

class HaresTest {
    public static void main(String[] args) {
        List<MountainHare> hares = List.of(
                new MountainHare(4, 4.4, 120),
                new MountainHare(7, 3.6, 150),
                new MountainHare(1, 2.3, 100)
        );
        List<MountainHare> test = List.of(
                new MountainHare(1, 1.1, 11)
        );

        System.out.println("В лесу лето!");
        Forest forest = new Forest(hares, "лето");


        System.out.println("Список зайцев:");
        forest.printHares();

        System.out.println("В лесу зима!");
        Forest.setSeason("зима", test);

        System.out.println("Список зайцев:");
        forest.printHares();
    }
}