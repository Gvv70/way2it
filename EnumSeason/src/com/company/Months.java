package com.company;

public enum Months {
    JANUARY(31, Season.WINTER),
    FEBRUARY(28, Season.WINTER),
    MARCH(31, Season.SPRING),
    APRIL(30, Season.SPRING),
    MAY(31, Season.SPRING),
    JUNE(30, Season.SUMMER),
    JULY(31, Season.SUMMER),
    AUGUST(31, Season.SUMMER),
    SEPTEMBER(30, Season.AUTUMN),
    OCTOBER(31, Season.AUTUMN),
    NOVEMBER(30, Season.AUTUMN),
    DECEMBER(31, Season.WINTER);

    int days;
    Season seasons;

    Months(int days, Season season) {
        this.days = days;
        this.seasons = season;
    }

    public int getDays() {
        return days;
    }

    public Season getSeasons() {
        return seasons;
    }
}

