package com.company;

public class CheckMonth {
    Season season = null;

private Season definitionSeason(String month){
    for (Months value : Months.values()){
        if (month.equals(value.toString())){
            season = value.getSeasons();
            break;
        }
    }
    return season;
}

    private Integer definitionDaysQuantity(String month){
    int quantityDays = 0;
        for (Months value : Months.values()){
            if (month.equals(value.toString())){
                quantityDays = value.getDays();
                break;
            }
        }
        return quantityDays;
    }

public boolean checkNameMont (String month){
    boolean out = false;
    for (Months value : Months.values()){
        if (month.equals(value.toString())){
            out = true;
            break;
        }
    }
    return out;
}

public void getSeason (String month){
    if (definitionSeason(month) != null) {
        System.out.print("Months in season: ");
        for (Months value : Months.values()) {
            if (season.equals(value.getSeasons())) {
                System.out.print(value + ", ");
            }
        }
    }
    else {
        System.out.println("Season not found");
    }
}

    public void getMonthsDay (String month){
        int days = definitionDaysQuantity(month);
        if (days != 0) {
            System.out.print(days + " days in month: ");
            for (Months value : Months.values()) {
                if (days == value.getDays()) {
                    System.out.print(value + ", ");
                }
            }
        }
        else {
            System.out.println("Month not found");
        }
    }

    public void getLessDay (String month){
        int days = definitionDaysQuantity(month);
        if (days != 0) {
            System.out.print("Less than " + days + " days in month: ");
            for (Months value : Months.values()) {
                if (days > value.getDays()) {
                    System.out.print(value + ", ");
                }
            }
        }
        else {
            System.out.println("Month not found");
        }
    }

    public void getMoreDay (String month){
        int days = definitionDaysQuantity(month);
        if (days != 0) {
            System.out.print("More than " + days + " days in month: ");
            for (Months value : Months.values()) {
                if (days < value.getDays()) {
                    System.out.print(value + ", ");
                }
            }
        }
        else {
            System.out.println("Month not found");
        }
    }

    public void getNextSeason (String month){
        Season nextSeason = definitionSeason(month);
        if (nextSeason != null) {
            int numberSeason = nextSeason.ordinal();
            numberSeason++;
            if (numberSeason > 3){
                numberSeason = numberSeason - 4;
            }
            System.out.println("Next season - " + Season.values()[numberSeason]);
        }
        else {
            System.out.println("Mont not found");
        }
    }

    public void getPreviousSeason (String month){
        Season nextSeason = definitionSeason(month);
        if (nextSeason != null) {
            int numberSeason = nextSeason.ordinal();
            numberSeason--;
            if (numberSeason < 0){
                numberSeason = numberSeason + 4;
            }
            System.out.println("Previous season - " + Season.values()[numberSeason]);
        }
        else {
            System.out.println("Month not found");
        }
    }

    public void getMonthsEvenNumberDays (){
        System.out.print("Months with an even number of days: ");
        for (Months value : Months.values()){
            if (value.getDays() % 2 == 0){
                System.out.print(value + ", ");
            }
        }
    }

    public void getMonthsOddNumberDays (){
        System.out.print("Months with an odd number of days: ");
        for (Months value : Months.values()){
            if (value.getDays() % 2 != 0){
                System.out.print(value + ", ");
            }
        }
    }

    public void getMonthsOddOrEvenDays (String month){
       int daysInMont = definitionDaysQuantity(month);
       if (daysInMont != 0){
           if (daysInMont % 2 == 0){
               System.out.println("In " + month + " an even number of days");
           }
           else {
               System.out.println("In " + month + " an odd number of days");
           }
       }
       else {
           System.out.println("Month not found");
       }
    }
}
