package org.example.mappingshibernate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand")
    private String brand;
    
    
    
    /*
    @ManyToMany(mappedBy = "laptops", cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<>();*/
    
    
    
    /*
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;*/
    
    
   /*
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;*/

    // Constructors, getters, and setters
}
