package pl.caloriapp.product;

import pl.caloriapp.item.Item;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    @NotNull(message = "Nazwa jest wymagana")
    @NotEmpty(message = "Nazwa jest wymagana")
    private String name;
    @Column(scale=2, nullable = false)
    @NotNull(message = "Kolerie sa wymagane")
    @Min(value = 1, message = "Kalorie musza byc wieksze od 0")
    private BigDecimal calorie;
    @Column(scale=2, nullable = false)
    @NotNull(message = "Waga jest wymagana")
    @Min(value = 1,message = "Waga musi byc wieksza od 0")
    private BigDecimal weight;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Item> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
