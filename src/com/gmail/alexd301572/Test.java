package com.gmail.alexd301572;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test
{

    public static void main(String[] args)
    {
        ACDDateTime acddt = new ACDDateTime();
        System.out.println(acddt.getDateTimeTS(3));
    }
}
