package univaq.progetto.database;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "information")
public class Object1 {

    @PrimaryKey(autoGenerate = true)
    private long id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "text")
    private String text;

    @ColumnInfo(name="descriptionmain")
    private String descriptionmain;

    @TypeConverters(ObjectTypeConverter.class)
    public ArrayList<Image> images = new ArrayList<>();

    public Object1(){}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titolo) {
        this.title = titolo;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int data) {
        this.date = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descrizionedata) {
        this.description = descrizionedata;
    }

    public String getDescriptionmain() {
        return descriptionmain;
    }

    public void setDescriptionmain(String descriptionmain) {
        this.descriptionmain = descriptionmain;
    }

    public String getText() {
        return text;
    }

    public void setText(String testo) {
        this.text = testo;
    }

    public ArrayList<Image> getImages() {
        return images;
    }

    public void setImages(ArrayList<Image> immagini) {
        this.images = immagini;
    }
}
