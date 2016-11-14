package com.Sample.Service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.Sample.Entity.Person;
import com.Sample.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Object findAll(){
        return personRepository.findAll();
    }

    public Person findById(Long id){
        return personRepository.findOne(id);
    }

    public Person save(Person person){
        return personRepository.save(person);
    }

    public void delete(Person person){
    	personRepository.delete(person);
    	return;
    }

	public Person findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
