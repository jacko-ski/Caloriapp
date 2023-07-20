package pl.caloriapp.item;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ItemDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Item item) {
        entityManager.persist(item);
    }

    public void update(Item item) {
        entityManager.merge(item);
    }

    public List<Item> getAllByUserId(Long id) { //itemy tylko zalogowanego użytkownika
        return entityManager
                .createQuery("SELECT i FROM Item i WHERE i.user.id = :userid")
                .setParameter("userid",id)
                .getResultList();
    }

    public void delete(Item item) {
        entityManager.remove(item);
    }

    public Item getById(long id) {
        return entityManager.find(Item.class, id);
    }
}
