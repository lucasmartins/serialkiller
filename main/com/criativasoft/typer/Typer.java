// Written by Lucas Neves Martins - Snowniak - v0.0.1.10 - Some Rigths Reserved  - 2008 - Date: 5/11/2008 17:57:42
// You can use this code not comercially without authorization, but I will be glad to authorize commercial use for free too.
// * This code will soon be under BSD license, but not yet. (cosider it as a Creative Commons for now)

package com.criativasoft.typer;

import java.awt.AWTException;
import java.awt.Robot;

// The code is not so pretty because I've lost the sources once, so I decompiled it... :D

public class Typer
{

    public Typer(String text_to_write, int delay_start_time)
    {
        start_delay = 0;
        start_delay = delay_start_time;
        writer(stringToCharVec(cleanString(text_to_write)));
    }

    private String cleanString(String dirt_string)
    {
        dirt_string = dirt_string.replace("-", "").replace(" ", "").toUpperCase();
        return dirt_string;
    }

    private char[] stringToCharVec(String clean_string)
    {
        char chars[] = new char[clean_string.length()];
        chars = clean_string.toCharArray();
        return chars;
    }

    private void writer(char chars[])
    {
        StringToKeys oSTK = new StringToKeys();
        int keys[] = oSTK.getKeys(chars);
        try
        {
            Robot Rx11 = new Robot();
            Rx11.delay(start_delay * 1000);
            for(int x = 0; x < keys.length; x++)
            {
                Rx11.delay(10);
                Rx11.keyPress(keys[x]);
                Rx11.delay(10);
                Rx11.keyRelease(keys[x]);
                Rx11.delay(10);
            }

        }
        catch(AWTException e)
        {
            e.printStackTrace();
        }
    }

    int start_delay;
}