package app.railway.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for the name of the application
 * @author Andrés Felipe Arias
 */
@RestController
@RequestMapping("/api")
public class NameController {

    /**
     * Method to get the name of the owner of the application
     * @return String with the name of the owner
     */
    @GetMapping("/name")
    public String getName() {
        return "Andrés Felipe Arias ";
    }
}
