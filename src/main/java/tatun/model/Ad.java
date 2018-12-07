package tatun.model;

import javax.persistence.*;

@Entity
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    private String name;

    private String description;

    private String telephone;
}
