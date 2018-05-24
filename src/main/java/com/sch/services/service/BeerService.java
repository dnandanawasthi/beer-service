package com.sch.services.service;

import com.sch.services.entity.BeerDetail;
import com.sch.services.dao.IBeerDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeerService implements IBeerService {
	@Autowired
	private IBeerDao iBeerDao;

    public BeerDetail getBeer(final int id) {
        return iBeerDao.getBeer(id);
    }

}
