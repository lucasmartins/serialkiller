// Written by Lucas Neves Martins - Snowniak - v0.0.1.10 - Some Rigths Reserved  - 2008 - Date: 5/11/2008 17:57:42
// You can use this code not comercially without authorization, but I will be glad to authorize commercial use for free too.
// * This code will soon be under BSD license, but not yet. (cosider it as a Creative Commons for now)

import com.criativasoft.typer.*;
import javax.swing.JOptionPane;

// The code is not so pretty because I've lost the sources once, so I decompiled it... :D

public class Starter
{

    public Starter()
    {
    }

    public static void main(String args[])
    {
        JOptionPane.showMessageDialog(null, "Welcome to the fucking Serial-Killer! beta 0.4c\n\n By Snowniak.");
        String text = JOptionPane.showInputDialog("Insert the serial:");
        boolean invalid_input = false;
        int delay_time = 0;
        while(!invalid_input) 
        {
            invalid_input = true;
            try
            {
                delay_time = Integer.parseInt(JOptionPane.showInputDialog(null, "After this screen, you will have X seconds to select the first field of the serial form.\n\nWhere X equals to:(please, dont put more than 15...)"));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Invalid data, please, put 1, 2, 5, but not this...");
                invalid_input = false;
            }
            if(delay_time == 0)
            {
                JOptionPane.showMessageDialog(null, "Well, I think you're not so fast to select the field in 0 seconds. If you think I'm wrong, mail me, and proove it.");
                invalid_input = false;
            }
            if(delay_time > 15)
            {
                JOptionPane.showMessageDialog(null, "Uhm, I sad till 15, more than this, and you have a K6-II. Put in the trash, and buy a computer. Don't take this personal.");
                invalid_input = false;
            }
        }
        Typer oTyper = new Typer(text, delay_time);
        LabelDemo.main(args);
    }
}