package less.Radio;

import java.util.ArrayList;


public class Station {
    private int totalTime;
    private int timeCheking;
    private int adsTime;
    private int profit;
    ArrayList<String> list = new ArrayList<>();



    public Station(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public int getProfit() {
        return profit;
    }

    public void addSong(Songs songs) {
        if (timeCheking + songs.getTime() <= getTotalTime()) {
            timeCheking += songs.getTime();
            list.add(songs.getName());
        } else {
            System.out.println("Время вышло");
        }
    }

    public void addInterview(Interview interview) {
        if (timeCheking + interview.getTime() <= getTotalTime()) {
            timeCheking += interview.getTime();
            profit -= interview.getPrice() * interview.getTime();
            list.add(interview.getName());
        } else {
            System.out.println("Время вышло");
        }
    }

    public void addAds(Ads ads) {
        if (timeCheking + ads.getTime() <= getTotalTime()) {
            if (adsTime + ads.getTime() <= getTotalTime()/2) {
                adsTime += ads.getTime();
                timeCheking += ads.getTime();
                profit += ads.getPrice() * ads.getTime();
                list.add(ads.getName());
            } else if (adsTime + ads.getTime() >= getTotalTime()/2) {
                System.out.println("Много рекламы");
            } else {
                System.out.println("Время вышло");
            }
        }


    }

}



