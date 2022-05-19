package less.Radio;

public class Interview implements Instruction{

    private String name;
    private int time;
    private final int price = 2;

    public Interview(String name, int time) {
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
