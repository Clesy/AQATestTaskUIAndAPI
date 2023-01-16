package com.gerasimenko.aqatesttaskuiandapi.utils;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public final class DateConverter {
    private DateConverter() {
    }

    private static final String PATTERN = "dd/MM/uuuu";

    private static ZoneId setZoneId() {
        return TimeZone.getTimeZone("GMT+1").toZoneId();
    }

    private static DateTimeFormatter formatter() {
        return DateTimeFormatter.ofPattern(PATTERN);
    }

    private static LocalDateTime getDate() {
        return LocalDateTime.now(setZoneId());
    }

    public static String getTodayDate() {
        return getDate().format(formatter()) + " - " + getDate().format(formatter());
    }

    public static String getYesterdayDate() {
        return getDate().minusDays(1).format(formatter()) + " - " + getDate().minusDays(1).format(formatter());
    }

    public static String getTomorrowDate() {
        return getDate().plusDays(1).format(formatter()) + " - " + getDate().plusDays(1).format(formatter());
    }

    public static String getThisWeekDate() {
        LocalDateTime lastWeekStart = getDate().minusWeeks(1).with(DayOfWeek.SUNDAY);
        LocalDateTime lastWeekEnd = lastWeekStart.plusDays(6);
        return lastWeekStart.format(formatter()) + " - " + lastWeekEnd.format(formatter());
    }
}
