package less.Radio;

public class Songs implements Instruction{


    private String name;
    private int time;

    public Songs(String name, int time) {
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


}
