package de.hhu.propra.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import de.hhu.propra.db.data.KundeRepository;

@Controller
public class KundeController{
    @Autowired
    KundeRepository kunden;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("kunden", kunden.findAll());
        return "index";
    }
    
    @PostMapping("/")
    public String suchPage(Model model, String farbe) {
    	model.addAttribute("kunden", kunden.findAllByAutos_Farbe(farbe));
    	return "index";
    }
}
