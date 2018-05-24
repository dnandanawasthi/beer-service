package com.sch.services.resources;

import com.sch.services.entity.BeerDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sch.services.exceptions.ResourceNotFoundException;
import com.sch.services.service.IBeerService;

@RestController
@RequestMapping("mybeer")
public class BeerResource implements IBeerResource {

	@Autowired
	private IBeerService iBeerService;

    /**
     * Resource fetch beer on the basis of id
     * @param id
     * @return BeerDetail
     * @throws ResourceNotFoundException
     */
    @Override
    @GetMapping(path =  "randombeer")
    public BeerDetail getBeer(@RequestParam final int id) throws ResourceNotFoundException {
        BeerDetail beerDetail = iBeerService.getBeer(id);
        if(beerDetail == null)
            throw new ResourceNotFoundException("Requested resource for : "+id+" does not exist");
        return beerDetail;
    }

}