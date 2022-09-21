package com.javacrud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javacrud.entity.Cliente;
import com.javacrud.services.ClienteService;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClienteService clienteService;

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info(){
        return "esta viva XXX";
    }
    
    @RequestMapping(value = "NutriNET/Cliente", method = RequestMethod.POST)
    public String createClient(@RequestBody Cliente cliente){
        return clienteService.createcliente(cliente);
    }
    
    @RequestMapping(value = "NutriNET/Cliente/{id}", method = RequestMethod.PUT)
    public String updateClient(@PathVariable("id") int id,@RequestBody Cliente cliente){
        return clienteService.updateStudent(cliente,id);
    }	

    @RequestMapping(value = "NutriNET/Cliente", method = RequestMethod.GET)
    public List<Cliente> readClient(@RequestParam(required = false) Integer id){
        return clienteService.readClientes(id);
    }


}
