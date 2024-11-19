package repository;

//import java.sql.ResultSet;
//import java.sql.SQLException;

public interface Repository <Ent>{
    void save(Ent entitas) throws Exception;
    void update(Ent entitas) throws Exception;
    void delete(Ent entitas) throws Exception;
}