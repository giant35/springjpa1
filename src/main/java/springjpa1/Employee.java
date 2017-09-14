/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springjpa1;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author sihai
 */
@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue
    int id;

    @Column(name = "my_name")
    String name;
    Date birthday;

    @ManyToOne
    Department department;
}
