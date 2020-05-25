package com.kevin.demo.infrastructure.mapper;

import com.kevin.demo.domain.credit.Credit;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CreditMapper extends BaseMapper<Credit> {

}
