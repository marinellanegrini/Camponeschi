package univaq.progetto.database;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface ObjectDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void save(Object1 obj);

    @Delete
    public void delete(Object1 obj);

    @Query("DELETE FROM information")
    public void deleteAll();

    @Query ("SELECT * FROM information WHERE id IN (:objIds)")
    public List <Object1> loadAllByIds(long[] objIds);

    @Query("SELECT * FROM information ORDER BY date ASC")
    public List <Object1> getAllObjects();

    @Update
    public void update(Object1 obj);
}
