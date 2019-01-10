package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by jensW89
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uoe;

    @ManyToOne
    private Recipe recipe;

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uoe, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uoe = uoe;
        this.recipe = recipe;
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uoe) {
        this.description = description;
        this.amount = amount;
        this.uoe = uoe;
    }

    public Ingredient() {
    }
}
