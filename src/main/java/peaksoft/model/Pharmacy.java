package peaksoft.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "pharmacies")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "pharmacy_gen")
    @SequenceGenerator(
            name = "pharmacy_gen",
            sequenceName = "pharmacy_seq",
            allocationSize = 1)


    private  Long id;
    private String name;
    private String adress;

    @ManyToMany(mappedBy="pharmacy",cascade =)
    private List<Medicine> medicines;
    @OneToMany(mappedBy = "pharmacy")
    private List<Worker>workers;
}
