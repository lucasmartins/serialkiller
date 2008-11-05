// Written by Lucas Neves Martins - Snowniak - v0.0.1.10 - Some Rigths Reserved  - 2008 - Date: 5/11/2008 17:57:42
// You can use this code not comercially without authorization, but I will be glad to authorize commercial use for free too.
// * This code will soon be under BSD license, but not yet. (cosider it as a Creative Commons for now)

package com.criativasoft.typer;

import javax.swing.JOptionPane;

// The code is not so pretty because I've lost the sources once, so I decompiled it... :D

public class StringToKeys
{
    public StringToKeys()
    {
    }
    
    public static int getKey(char _char_)
    {
        int key = 0;
        if(_char_ == '0')
            return 48;
        if(_char_ == '1')
            return 49;
        if(_char_ == '2')
            return 50;
        if(_char_ == '3')
            return 51;
        if(_char_ == '4')
            return 52;
        if(_char_ == '5')
            return 53;
        if(_char_ == '6')
            return 54;
        if(_char_ == '7')
            return 55;
        if(_char_ == '8')
            return 56;
        if(_char_ == '9')
            return 57;
        if(_char_ == 'A')
            return 65;
        if(_char_ == 'B')
            return 66;
        if(_char_ == 'C')
            return 67;
        if(_char_ == 'D')
            return 68;
        if(_char_ == 'E')
            return 69;
        if(_char_ == 'F')
            return 70;
        if(_char_ == 'G')
            return 71;
        if(_char_ == 'H')
            return 72;
        if(_char_ == 'I')
            return 73;
        if(_char_ == 'J')
            return 74;
        if(_char_ == 'K')
            return 75;
        if(_char_ == 'L')
            return 76;
        if(_char_ == 'M')
            return 77;
        if(_char_ == 'N')
            return 78;
        if(_char_ == 'O')
            return 79;
        if(_char_ == 'P')
            return 80;
        if(_char_ == 'Q')
            return 81;
        if(_char_ == 'R')
            return 82;
        if(_char_ == 'S')
            return 83;
        if(_char_ == 'T')
            return 84;
        if(_char_ == 'U')
            return 85;
        if(_char_ == 'W')
            return 87;
        if(_char_ == 'V')
            return 86;
        if(_char_ == 'X')
            return 88;
        if(_char_ == 'Y')
            return 89;
        if(_char_ == 'Z')
            return 90;
        if(_char_ == _char_)
            return 151;
        JOptionPane.showMessageDialog(null, "Something strange is going on, are you using the Sun's JRE ?");
        return key;
    }

    public int[] getKeys(char _chars_[])
    {
        int keys[] = new int[_chars_.length];
        for(int x = 0; x < _chars_.length; x++)
            keys[x] = getKey(_chars_[x]);

        return keys;
    }
}