package com.springmongo.transcation.mapper;

import com.springmongo.transcation.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.WARN, componentModel = "spring")
public interface AccountTransMapper {


    Account mapModelToEntity(com.springmongo.transcation.model.Account account);
}
