/**
 * 
 */
package net.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author vinitp
 *
 */
@Service
public class ContactServices {

	@Autowired
	private ContactRepository repo;

	public List<EmplContacts> listAll() {
		return repo.findAll();
	}

	public void save(EmplContacts contact) {
		repo.save(contact);
	}

	public EmplContacts get(Integer id) {
		return repo.findById(id).get();
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
