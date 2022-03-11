package peaksoft.services;

import peaksoft.entities.Company;

import java.util.List;

public interface CompanyService {
    void UpdateCompaniesTable(long id,Company company);
    void saveCompanies(Company company);
    void removeCompaniesById(long id);
    List<Company> getAllCompanies();
    Company getById(long id);
}
