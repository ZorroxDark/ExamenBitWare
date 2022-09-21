package com.javacrud.services;

import com.javacrud.entity.Cliente;
import com.javacrud.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Transactional
    public String createcliente(Cliente cliente){
        try {
            
                clienteRepository.save(cliente);
                return "cliente creado exitosamente";

        }catch (Exception e){
            throw e;
        }
    }

    public List<Cliente> readClientes(Integer id){
    	
    	if(id != null) {
    		return clienteRepository.findAll();
    	}else{
    		List<Cliente> temp = new ArrayList<>();
    		temp.add(clienteRepository.findByClienteId(id));
    		return temp;
    	}
    }

    @Transactional
    public String updateStudent(Cliente cliente, int id){
        
            try {
                Cliente temp = clienteRepository.findByClienteId(id);
                
                	if(temp != null) {
                		
                		temp.setEdad(id);
                		temp.setEstatura(id);
                		temp.setPeso(id);
                		temp.setGeb(id);
                        clienteRepository.save(temp);
                    
                	}else {
                		return "No existe cliente ";
                	}
                    
                return "cliente actualizado";
            }catch (Exception e){
                throw e;
            }
    }

   
}
