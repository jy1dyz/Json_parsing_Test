package com.example.jsontojavaparsing.model;


public class Fields
{
    private String name;

    private String title;

    private String required;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getRequired ()
    {
        return required;
    }

    public void setRequired (String required)
    {
        this.required = required;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", title = "+title+", required = "+required+"]";
    }
}
