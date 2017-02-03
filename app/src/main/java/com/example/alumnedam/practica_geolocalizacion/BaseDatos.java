package com.example.alumnedam.practica_geolocalizacion;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper{

    String sqlCreate;
    String[] sqlInsert;

    public BaseDatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqlCreate= "CREATE TABLE AGAPITO (id_bus String, contrasena String)";

        sqlInsert[0]="INSERT INTO AGAPITO ('id_bus', 'contrasena') VALUES ('1111A', '1111A')";
        sqlInsert[1]="INSERT INTO AGAPITO ('id_bus', 'contrasena') VALUES('2222B', '2222B', '0', '0');";
        sqlInsert[2]="INSERT INTO AGAPITO ('id_bus', 'contrasena') VALUES('3333C', '3333C');";

        sqLiteDatabase.execSQL(sqlCreate);

        for (int i=0; i < sqlInsert.length; i++){
            sqLiteDatabase.execSQL(sqlInsert[i]);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
