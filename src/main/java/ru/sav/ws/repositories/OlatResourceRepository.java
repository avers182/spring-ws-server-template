package ru.sav.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.sav.ws.model.OlatResource;

import javax.annotation.Resource;

@Resource
public interface OlatResourceRepository extends CrudRepository<OlatResource, Long>{}
