package records;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import records.beans.Record;
import records.controller.BeanConfiguration;
import records.repository.RecordRepository;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Oct 17, 2022
 */


@SpringBootApplication
public class VinylRecordsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VinylRecordsApplication.class, args);
		
	}
	
	@Autowired
	RecordRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		Record recordOne = appContext.getBean("record", Record.class);
		recordOne.setArtist("Bob Dylan");
		recordOne.setTitle("Highway 61 Revisited");
		recordOne.setYear(1965);
		recordOne.setPrice(19.99);
		repo.save(recordOne);
		
		//Create a bean to use (using parameters)
		Record recordTwo = new Record("Pink Floyd", "Wish You Were Here", 1975, 21.99);
		repo.save(recordTwo);
		
		//Print Results
		List<Record>recordsList = repo.findAll();
		for (Record eachRecord: recordsList) {
			System.out.println(eachRecord.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
		
	}


}
