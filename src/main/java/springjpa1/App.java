/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springjpa1;

import java.util.Date;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author sihai
 */
@SpringBootApplication
public class App {

    public static void main(String[] argv) {
        SpringApplication.run(App.class, argv);
    }

    @Bean
    CommandLineRunner runner(EmployeeRepository repo,DepartmentRepository drepo) {
        return (argv) -> {
            Department d = new Department();
            d.name = "研发部";
            drepo.save(d);
            
            Employee e = new Employee();
            //e.id = 1;
            e.name = "二号员工";
            e.birthday = new Date();
            e.department = d;
            final Employee e2 = repo.save(e);
            System.out.println(e2);
            
            d.leader = e;
            drepo.save(d);            
        };
    }
}
