package peaksoft.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;


@Entity
@Table(name = "medicines")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "medicine_gen")
    @SequenceGenerator(
            name = "medicine_gen",
            sequenceName = "medicine_seq",
            allocationSize = 1)
    private Long id;
    private String name ;

    @NotNull
    private int price ;
    @ManyToMany
    private Pharmacy pharmacy;


}
