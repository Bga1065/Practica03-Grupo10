
package com.practica01.service;

import com.practica01.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.practica01.dao.EstadoDao;

@Service

public class EstadoServiceImpl implements EstadoService{
    
    //@Autowired, provoca que si el objeto ya está en memoria no se crea y se usa ese mismo
    //Si no está en memoria se crea el objeto
    @Autowired
    private EstadoDao estadoDao;
    
    //Los metodos para poder hacer un CRUD
    //Create--Read--Update--Delete
    
    @Override
    @Transactional(readOnly = true)
    public List<Estado> getEstados(){
        return (List<Estado>)estadoDao.findAll();
    }
    
    @Override
    @Transactional(readOnly = true)
    public Estado getEstado(Estado estado){
        return estadoDao.findById(estado.getId_pais()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Estado estado){
        //si el idCliente es 0, lo incerta...
        //Si tiene un valor.. hace el update de ese registro.
        estadoDao.save(estado);
    }
    
    @Override
    @Transactional
    public void delete (Estado estado){
        estadoDao.delete(estado);
    }
    
}
