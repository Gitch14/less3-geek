package less;


import less.Radio.*;

public class Main {

    public static void main(String[] args) {

        /** Patterns use in this program
         *
         *Decorator
         *Builder
         *
         * */

        Songs song1 = new Songs("Song1",185);
        Ads ad1 = new Ads("Ad1",54);
        Ads ad2 = new Ads("ad2",77);
        Interview interview1 = new Interview("interview1", 60);

        Manager manager1 = new Manager.ManagerBuilder()
                .name("Sony Green")
                .resume(true)
                .build();

                System.out.println(manager1);

        Station station = new Station(6000);



       station.addAds(ad1);
       station.addAds(ad2);
       station.addSong(song1);
       station.addInterview(interview1);


        System.out.println(station.getList());

        System.out.println(station.getProfit());



    }
}
