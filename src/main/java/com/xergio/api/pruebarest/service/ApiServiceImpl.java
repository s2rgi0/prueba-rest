package com.xergio.api.pruebarest.service;

import com.xergio.api.domian.Articulo;
import com.xergio.api.domian.User;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService{

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplateBuilder builder) {
        this.restTemplate = builder.build() ;
    }

    @Override
    public List<User> getUsers(Integer limit) {

        List <User> users = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users?_limit="+limit, List.class);
        return users;
    }

    @Override
    public Articulo getArticulos() {
        Articulo articulo = restTemplate.getForObject("http://localhost:8080/jerseyRestApi/webapi/articulo?clave=C-100P", Articulo.class);
        return articulo;
    }


}
