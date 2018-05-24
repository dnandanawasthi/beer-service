package com.sch.serivces;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

import com.sch.services.RandomBeerApp;
import com.sch.services.entity.BeerDetail;
import com.sch.services.exceptions.ResourceNotFoundException;
import com.sch.services.resources.IBeerResource;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = RandomBeerApp.class)
public class BeerServiceResourceTest {

    @Autowired
    IBeerResource iBeerResource;

    @Test
    public void getBeerSuccessfullyTest() throws ResourceNotFoundException {
        BeerDetail beerDetail = iBeerResource.getBeer(1);
        Assert.assertNotNull(beerDetail);
        Assert.assertEquals(beerDetail.getId(), 1);
        Assert.assertEquals(beerDetail.getAlcoholPercentage(), "5");
        Assert.assertEquals(beerDetail.getBeerName(), "Kingfisher Light");
        Assert.assertEquals(beerDetail.getBreweryLocation(), "Gurgaon");
        Assert.assertEquals(beerDetail.getDescription(), "This beer is strong man");
    }

    @Test(expected = ResourceNotFoundException.class)
    public void getBeerThrowException() throws ResourceNotFoundException {
        BeerDetail beerDetail = iBeerResource.getBeer(11);
    }

}
