package henrietha.DendencyInjection.springdi.controllers;

import com.henrietha.pets.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) { this.petService = petService; }

    public String likedPetService() { return petService.getPetType();}
}
