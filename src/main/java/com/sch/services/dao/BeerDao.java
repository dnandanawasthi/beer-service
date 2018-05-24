package com.sch.services.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.sch.services.entity.BeerDetail;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class BeerDao implements IBeerDao {

	@PersistenceContext	
	private EntityManager entityManager;

    @Override
    public BeerDetail getBeer(final int id) {
        return entityManager.find(BeerDetail.class, id);
    }

}
