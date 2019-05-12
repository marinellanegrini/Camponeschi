package univaq.progetto.database;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ObjectTypeConverter {

    @TypeConverter
    public static ArrayList<Image> stringToSomeImage(String data) {
        if (data == null) {
            return (null);
        }

        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Image>>() {
        }.getType();

        return gson.fromJson(data, type);
    }


    @TypeConverter
    public String fromImageList(ArrayList<Image> optionValues) {
        if (optionValues == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Image>>() {
        }.getType();
        String json = gson.toJson(optionValues, type);
        return json;
    }
}
