package com.example.casaDragon.Servicios;

import com.example.casaDragon.models.Dragon;
import com.example.casaDragon.repositorios.DragonRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DragonServicio {

    @Autowired
    DragonRepositorio dragonRepositorio;

    //agregarUnDragon
    public Dragon agregarDragon(Dragon datosDragon) throws Exception{
        //llamar a las validaciones
        try{
            return dragonRepositorio.save(datosDragon);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //bucasrTodosLosDragrones
    public List<Dragon> buscarDragones() throws Exception{
        try {
            return dragonRepositorio.findAll();

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //buscarUnDragonLlavePrimaria
    //editarInofrmacionDragon
    //eliminarDragon
    //buscarUnDragonNombre
}
