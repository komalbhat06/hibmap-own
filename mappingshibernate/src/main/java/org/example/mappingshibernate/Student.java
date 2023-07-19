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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


import org.hibernate.mapping.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;
    
    /*
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "student_laptop",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "laptop_id")
    )
    private List<Laptop> laptops = new ArrayList<>();*/
    
    
    /*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<Laptop> laptops;*/


    /*
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Laptop laptop;*/
    
    
    


    

    // Constructors, getters, and setters
}

