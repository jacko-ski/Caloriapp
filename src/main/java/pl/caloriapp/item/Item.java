package pl.caloriapp.item;

import pl.caloriapp.product.Product;
import pl.caloriapp.user.UserApp;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private java.sql.Date date;
    @Column(nullable = false)
    private int meal;
    @Column(scale=2, nullable = false)
    @NotNull(message = "Ilosc jest wymagana")
    @Min(value = 1, message = "Ilosc musi byc wieksza od 0")
    private BigDecimal quantity;
    @Column(scale=2, nullable = false)
    private BigDecimal calorie;
    @Column(scale=2, nullable = false)
    @NotNull(message = "Waga jest wymagana")
    @Min(value = 1,message = "Waga musi byc wieksza od 0")
    private BigDecimal weight;
    @ManyToOne()
    @NotNull
    private Product product;
    @ManyToOne
    @NotNull
    private UserApp user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMeal() {
        return meal;
    }

    public void setMeal(int meal) {
        this.meal = meal;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getCalorie() {
        return calorie;
    }

    public void setCalorie(BigDecimal calorie) {
        this.calorie = calorie;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public UserApp getUser() {
        return user;
    }

    public void setUser(UserApp user) {
        this.user = user;
    }
}
