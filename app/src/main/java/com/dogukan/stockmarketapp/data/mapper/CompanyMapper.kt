package com.dogukan.stockmarketapp.data.mapper

import com.dogukan.stockmarketapp.data.local.CompanyListingEntity
import com.dogukan.stockmarketapp.data.remote.dto.CompanyInfoDto
import com.dogukan.stockmarketapp.domain.model.CompanyInfo
import com.dogukan.stockmarketapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing() : CompanyListing{
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}
fun CompanyListing.toCompanyListing() : CompanyListingEntity{
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}
fun CompanyInfoDto.toCompanyInfo() : CompanyInfo{
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""

    )
}