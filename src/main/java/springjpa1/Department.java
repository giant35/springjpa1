/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springjpa1;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author sihai
 */
@Entity
public class Department {
    @Id @GeneratedValue            
    int id;
    
    String name;
    
    @OneToOne
    Employee leader;
}
