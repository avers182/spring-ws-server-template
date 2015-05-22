package ru.sav.ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sav.ws.model.OlatResource;
import ru.sav.ws.repositories.OlatResourceRepository;

@Service
public class OlatResourceService {
    @Autowired
    private OlatResourceRepository olatResourceRepository;

    public OlatResource getOlatResource(Long id) {
        return olatResourceRepository.findOne(id);
    }

}
