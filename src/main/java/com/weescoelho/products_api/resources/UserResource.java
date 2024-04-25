package com.weescoelho.products_api.resources;

import com.weescoelho.products_api.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Necessário para definir que a classe é um controller REST
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping // Define que esta rota é um GET
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
