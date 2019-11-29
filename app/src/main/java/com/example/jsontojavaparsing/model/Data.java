package com.example.jsontojavaparsing.model;


public class Data
{
    private String datetime;

    private String scalar;

    private String groupById;

    private String method;

    private String club;

    private String cashBox;

    private String type;

    private String percent;

    private String key;

    private String direction;

    public String getDatetime ()
    {
        return datetime;
    }

    public void setDatetime (String datetime)
    {
        this.datetime = datetime;
    }

    public String getScalar ()
    {
        return scalar;
    }

    public void setScalar (String scalar)
    {
        this.scalar = scalar;
    }

    public String getGroupById ()
    {
        return groupById;
    }

    public void setGroupById (String groupById)
    {
        this.groupById = groupById;
    }

    public String getMethod ()
    {
        return method;
    }

    public void setMethod (String method)
    {
        this.method = method;
    }

    public String getClub ()
    {
        return club;
    }

    public void setClub (String club)
    {
        this.club = club;
    }

    public String getCashBox ()
    {
        return cashBox;
    }

    public void setCashBox (String cashBox)
    {
        this.cashBox = cashBox;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getPercent ()
    {
        return percent;
    }

    public void setPercent (String percent)
    {
        this.percent = percent;
    }

    public String getKey ()
    {
        return key;
    }

    public void setKey (String key)
    {
        this.key = key;
    }

    public String getDirection ()
    {
        return direction;
    }

    public void setDirection (String direction)
    {
        this.direction = direction;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [datetime = "+datetime+", scalar = "+scalar+", groupById = "+groupById+", method = "+method+", club = "+club+", cashBox = "+cashBox+", type = "+type+", percent = "+percent+", key = "+key+", direction = "+direction+"]";
    }
}