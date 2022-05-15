package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkout() {

        return "Run a hard 5k";

    }

    @Override
    public String getDailyFortune() {
        return "just do it:" + fortuneService.getFortune();
    }


    //add an init method
    public void doMyStartupStuff() {

        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }


    //add an destroy method
    public void doMyCleanupStuff() {

        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }


}
