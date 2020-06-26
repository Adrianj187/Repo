package com.csc422.zombiewar.characters;

import com.csc422.zombiewar.weapons.Weapon;

public class Soldier extends Survivor
{
    private int objID = 0;
    private Weapon weapon;
    
    public Soldier(int ID, Weapon weapon)
    {
        super(/*health*/100,/*attack*/10);
        this.objID = ID;
        this.weapon = weapon;
    }
    
    public Soldier(int ID)
    {
        super(/*health*/100,/*attack*/10);
        this.objID = ID;
    }

    @Override
    public String toString()
    {
        return "Soldier " + objID;
    }

}

