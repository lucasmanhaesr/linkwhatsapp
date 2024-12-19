package br.com.linkwhatsapp.controller;

import br.com.linkwhatsapp.model.ContactModel;
import br.com.linkwhatsapp.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/url")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/create")
    public String create(@RequestBody ContactModel contactModel) {
        return contactService.create(contactModel);
    }
}
