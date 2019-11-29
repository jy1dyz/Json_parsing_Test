package com.example.jsontojavaparsing.model;

public class MyPojo
{
    private String total;

    private Field field;

    private Data[] data;

    private Extra extra;

    private String chart;

    private String[] views;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public Field getField ()
    {
        return field;
    }

    public void setField (Field field)
    {
        this.field = field;
    }

    public Data[] getData ()
    {
        return data;
    }

    public void setData (Data[] data)
    {
        this.data = data;
    }

    public Extra getExtra ()
    {
        return extra;
    }

    public void setExtra (Extra extra)
    {
        this.extra = extra;
    }

    public String getChart ()
    {
        return chart;
    }

    public void setChart (String chart)
    {
        this.chart = chart;
    }

    public String[] getViews ()
    {
        return views;
    }

    public void setViews (String[] views)
    {
        this.views = views;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", field = "+field+", data = "+data+", extra = "+extra+", chart = "+chart+", views = "+views+"]";
    }
}