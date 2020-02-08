package io.h2cone.mybatis.interceptor;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CityMapper {

    @Select("select * from city where province_code = #{provinceCode}")
    List<City> selectCities(String provinceCode);

}
