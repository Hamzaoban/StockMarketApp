package com.dogukan.stockmarketapp.di

import com.dogukan.stockmarketapp.data.csv.CSVParser
import com.dogukan.stockmarketapp.data.csv.CompanyListingParser
import com.dogukan.stockmarketapp.data.csv.IntradayInfoParser
import com.dogukan.stockmarketapp.data.repository.StockRepositoryImpl
import com.dogukan.stockmarketapp.domain.model.CompanyListing
import com.dogukan.stockmarketapp.domain.model.IntradayInfo
import com.dogukan.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser : CompanyListingParser
    ) : CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ) : CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ) : StockRepository
}