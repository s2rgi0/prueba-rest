package com.xergio.api.pruebarest.service;

import com.xergio.api.domian.Articulo;
import com.xergio.api.domian.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ApiService {

    List<User> getUsers(Integer limit);
    Articulo getArticulos();
}
