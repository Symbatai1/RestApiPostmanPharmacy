package peaksoft.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "workers")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "worker_gen")
    @SequenceGenerator(
            name = "worker_gen",
            sequenceName = "worker_seq",
            allocationSize = 1)


    private  Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private int salary;
    private String address;
    private LocalDate dateOfBirth;
    @ManyToOne
    private Pharmacy pharmacy;

}
