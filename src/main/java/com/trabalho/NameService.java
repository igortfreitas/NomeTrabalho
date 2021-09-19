package com.trabalho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameService {

    @Autowired
    private NameRepository nameRepository;

    public void addName(Name name){ nameRepository.save(name); }
    public void delName(Name name){ nameRepository.delete(name); }
    public List<Name> getList(){ return nameRepository.findAll(); }
}