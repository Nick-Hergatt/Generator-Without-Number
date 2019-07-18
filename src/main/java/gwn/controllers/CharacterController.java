package gwn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gwn.repos.CharacterRepository;

@RestController
@RequestMapping("/api")
public class CharacterController {
	@Autowired
	private CharacterRepository characterRepo;

	@GetMapping("/characters")
	public Iterable<Character> sendAuthors()
		{
		return characterRepo.findAll();
		}

	@GetMapping("/characters/{id}")
	public Character sendAuthor(@PathVariable Long id)
		{
		return characterRepo.findById(id).get();
		}

}
