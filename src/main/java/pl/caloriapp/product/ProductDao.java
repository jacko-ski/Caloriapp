package pl.caloriapp.product;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.caloriapp.item.Item;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ProductDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Product product) {
        entityManager.persist(product);
    }

    public void update(Product product) {
        entityManager.merge(product);
    }

    public List<Product> getAll() {
        return entityManager.createQuery("SELECT p FROM Product p").getResultList();
    }

    public Product getById(Long id){
        return entityManager.find(Product.class, id);
    }

    public void delete(Product product) {
        entityManager.remove(product);
    }
}
