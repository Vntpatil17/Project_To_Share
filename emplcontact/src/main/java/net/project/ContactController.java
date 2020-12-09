/**
 * 
 */
package net.project;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vinitp
 *
 */
@RestController
public class ContactController {

	@Autowired
	private ContactServices service;

	@GetMapping("/contacts")
	public List<EmplContacts> list() {
		return service.listAll();
	}

	@PostMapping("/contacts")
	public void add(@RequestBody EmplContacts contact) {
		service.save(contact);
	}

	@PutMapping("/contacts/{id}")
	public ResponseEntity<?> update(@RequestBody EmplContacts contact, @PathVariable Integer id) {
		try {
			EmplContacts existContact = service.get(id);
			service.save(contact);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@DeleteMapping("/contacts/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
