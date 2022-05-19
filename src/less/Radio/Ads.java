package less.Radio;

public class Ads implements Instruction{

    private String name;
    private int time;
    private final int price = 5;

    public Ads(String name, int time) {
        this.name = name;
        this.time = time;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }

}
