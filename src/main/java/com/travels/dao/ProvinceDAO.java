package com.travels.dao;

import com.travels.entity.Province;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ProvinceDAO extends BaseDAO<Province, String> {
}
