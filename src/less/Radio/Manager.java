package less.Radio;

import java.util.ArrayList;

public class Manager {

    private String name;
    private int experience;
    private boolean resume;


    public Manager(String name, int experience, boolean resume) {
        this.name = name;
        this.experience = experience;
        this.resume = resume;
    }



    public Manager() {

    }

    public static class ManagerBuilder {
        private Manager manager;

        public ManagerBuilder() {
            manager = new Manager();
        }

        public ManagerBuilder name(String name){
            manager.name = name;
            return this;
        }

        public ManagerBuilder experience(int experience){
            manager.experience = experience;
            return this;
        }

        public ManagerBuilder resume(boolean resume){
            manager.resume = resume;
            return this;
        }


        public Manager build(){
            return manager;
        }

    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", resume=" + resume +
                '}';
    }
}
