package com.ysalama.sfgpetclinic.controllers;

import com.ysalama.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";

    }
}
