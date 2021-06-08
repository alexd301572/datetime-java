package com.gmail.alexd301572;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ACDDateTime
{
    private LocalDateTime dtObj;
    
    public ACDDateTime()
    {
        this.dtObj = LocalDateTime.now();
    }

    public ACDDateTime(LocalDateTime dtObj)
    {
        this.dtObj = dtObj;
    }
    
    public String getDatestamp()
    {
        return this.dtObj.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }
    
    public String getTimestamp()
    {
        return this.dtObj.format(DateTimeFormatter.ofPattern("HHmmss"));
    }
    
    public String getMilliseconds(int num)
    {
        String pattern = ACDString.repeat("S", num);
        return this.dtObj.format(DateTimeFormatter.ofPattern(pattern));
    }
    
    public String getDateTimeTS()
    {
        return getDatestamp() + "T" + getTimestamp();
    }
    
    public String getDateTimeTS(int num)
    {
        return getDatestamp() + "T" + getTimestamp() + getMilliseconds(num);
    }

}
