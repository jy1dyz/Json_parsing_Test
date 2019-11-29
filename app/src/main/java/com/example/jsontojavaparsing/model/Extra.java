package com.example.jsontojavaparsing.model;

public class Extra
{
    private String caption;

    private Fields[] fields;

    public String getCaption ()
    {
        return caption;
    }

    public void setCaption (String caption)
    {
        this.caption = caption;
    }

    public Fields[] getFields ()
    {
        return fields;
    }

    public void setFields (Fields[] fields)
    {
        this.fields = fields;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [caption = "+caption+", fields = "+fields+"]";
    }
}