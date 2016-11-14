package com.Sample.DAO;

import com.Sample.Entity.Person;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {

	private static Map<Integer, Person> persons;
	
}
