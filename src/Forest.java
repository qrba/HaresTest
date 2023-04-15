import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    private static String season;

    public Forest(List<MountainHare> hares, String season) {
        this.hares = hares;
        setSeason(season, hares);
    }

    public static void setSeason(String newSeason, List<MountainHare> mountainHares) {
        season = newSeason;
        for (var hare : mountainHares) {
            hare.setColor(season);
        }
    }

    public void printHares() {
        for (var hare : hares) {
            System.out.println(hare);
        }
    }
}