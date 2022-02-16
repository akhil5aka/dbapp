package com.example.studentdbapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class databasehelper extends SQLiteOpenHelper {

    static String DbName="college.db";
    static String TableName="students";
    static String col1="id";
    static String col2="name";
    static String col3="admn";
    static String col4="rno";
    static String col5="college";




    public databasehelper( Context context) {
        super(context, DbName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query="create table " +TableName+"("+col1+ " integer Primary key autoincrement,"+
        col2+ " text,"+
        col3+ " text,"+
        col4+ " text,"+
        col5+ " text)";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean insertdata(String name,String rno,String admno,String college)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues c=new ContentValues();
        c.put(col2,name);
        c.put(col3,rno);
        c.put(col4,admno);
        c.put(col5,college);
        long status=db.insert(TableName,null,c);
        if(status==-1)
        {
            return false;


        }
        else
        {
            return true;
        }



    }

}
