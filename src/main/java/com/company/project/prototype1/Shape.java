package com.company.project.prototype1;

public abstract class Shape implements Cloneable{
	
	public abstract void setPosition(int x, int y);
	
	public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}
