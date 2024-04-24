package ru;

import rand.RandomDate;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class MyClass {

    @RandomDate(min = 1262304000000L, max =1293753600000L )
    private Date date;

    @RandomDate()
    private Date date1;

    @RandomDate()
    private LocalDate localDate;

    @RandomDate()
    private LocalDateTime localDateTime;
    @RandomDate()
    private Instant instant;

    public String getDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return simpleDateFormat.format(date);

    }

    public LocalDate getLocalDate() {

        return localDate;
    }

    public Date getDate1() {
        return date1;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public Instant getInstant() {
        return instant;
    }

}
