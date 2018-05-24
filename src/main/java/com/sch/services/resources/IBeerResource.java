package com.sch.services.resources;

import com.sch.services.entity.BeerDetail;
import com.sch.services.exceptions.ResourceNotFoundException;

import org.springframework.web.bind.annotation.RequestParam;

public interface IBeerResource {

    BeerDetail getBeer(@RequestParam int id) throws ResourceNotFoundException;

}
