package com.bigdata.buur.beer.repository;

import com.bigdata.buur.entity.Likes;

import java.util.List;
import java.util.Set;

public interface LikesRepository {
    Set<Long> findBeerIdByUserId(Long id);
}
