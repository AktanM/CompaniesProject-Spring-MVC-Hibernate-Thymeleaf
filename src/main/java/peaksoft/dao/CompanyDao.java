package peaksoft.dao;

import peaksoft.entities.Company;
import java.util.List;

public interface CompanyDao {
    void UpdateCompaniesTable(long id,Company company);
    void saveCompanies(Company company);
    void removeCompaniesById(long id);
    List<Company> getAllCompanies();
    Company getById(long id);

}
