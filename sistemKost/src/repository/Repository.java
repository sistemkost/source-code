package repository;

public interface Repository <Ent>{
    void save(Ent entitas) throws Exception;
    void update(Ent entitas) throws Exception;
}