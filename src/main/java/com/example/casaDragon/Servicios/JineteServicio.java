package com.example.casaDragon.Servicios;

import com.example.casaDragon.models.Aliado;
import com.example.casaDragon.models.Jinete;
import com.example.casaDragon.repositorios.JineteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JineteServicio {

    @Autowired
    JineteRepositorio jineteRepositorio;

    public Jinete agregarJinete(Jinete datosJinete) throws  Exception{
        try{
            return jineteRepositorio.save(datosJinete);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<Jinete> buscarJinete() throws Exception{
        try {
            return jineteRepositorio.findAll();

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
