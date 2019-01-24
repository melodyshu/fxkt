package com.fx.dao;

import com.fx.City;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CityMapper {
    public List<City> queryAll();
}
