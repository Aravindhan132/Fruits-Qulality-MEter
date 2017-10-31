package n.aravindhan.qualitymeter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by user on 24-10-2017.
 */

public class DataHelper extends SQLiteOpenHelper {
    public static final String Database_Name="prodb";
    public static final String Table_Pro="information";
    public static final int Database_Version=1;
    public static final String Create_Pro="CREATE TABLE IF NOT EXISTS "+Table_Pro+"(id INTEGER PRIMARY KEY AUTOINCREMENT,pname TEXT NOT NULL UNIQUE)";
    public static final String Delete_pro="DROP TABLE IF EXITS "+Table_Pro;
    public DataHelper(Context context){
        super(context,Database_Name,null,Database_Version);
    }
    public void onCreate(SQLiteDatabase db){

        db.execSQL(Create_Pro);

    }
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        db.execSQL(Delete_pro);
    }
    public void insertinformation(String pname){
        SQLiteDatabase db=this.getWritableDatabase();
        db.beginTransaction();
        ContentValues values;
        try{
            values=new ContentValues();
            values.put("pname",pname);
            db.insert(Table_Pro,null,values);
            db.setTransactionSuccessful();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            db.endTransaction();
            db.close();
        }

    }
    public ArrayList<String> getAllproviciences(){
        ArrayList<String> list=new ArrayList<String>();
        SQLiteDatabase db=this.getReadableDatabase();
        db.beginTransaction();
        try{
            String selectquerry="SELECT *FROM "+ Table_Pro;
            Cursor cursor=db.rawQuery(selectquerry,null);
            if(cursor.getCount()>0){
                while (cursor.moveToNext()){
                    String pname=cursor.getString(cursor.getColumnIndex("pname"));
                    list.add(pname);
                }
            }
            db.setTransactionSuccessful();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            db.endTransaction();
            db.close();
        }
return list;
    }

}
