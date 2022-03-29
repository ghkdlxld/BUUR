package com.bigdata.buur.beer.repository;

import com.bigdata.buur.entity.Beer;
import com.bigdata.buur.enums.BeerCategory;

import java.util.List;

public interface BeerRepository {

    List<Beer> findAllByTypeAndOffset(BeerCategory beerCategory, int offset);
}
