package com.gmail.alexd301572;

public class ACDString
{
    public static String repeat(String input, int num)
    {
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num; i++)
        {
            sb.append(input);
        }
        return sb.toString();
    }
}
