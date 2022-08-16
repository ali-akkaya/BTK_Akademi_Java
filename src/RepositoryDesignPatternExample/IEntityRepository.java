package RepositoryDesignPatternExample;

// With extending IEntity we only can take classes that implements IEntity.
public interface IEntityRepository<T extends IEntity> {

    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
