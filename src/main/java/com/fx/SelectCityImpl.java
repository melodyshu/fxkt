package com.fx;

import com.fx.dao.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectCityImpl implements SelectCity{
    @Autowired
    private CityMapper cityMapper;
    @Override
    public List<City> queryAll() {
        return cityMapper.queryAll();
    }
}
