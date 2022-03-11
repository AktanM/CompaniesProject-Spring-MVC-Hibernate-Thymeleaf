package peaksoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import peaksoft.entities.Company;
import peaksoft.services.CompanyServiceImpl;

@Controller
public class CompanyController {

    private final CompanyServiceImpl companyService;
    @Autowired
    public CompanyController(CompanyServiceImpl companyService) {
        this.companyService = companyService;
    }
    @GetMapping("/getAllCompanies")
    public String create(Model model){
        model.addAttribute("comp",companyService.getAllCompanies());
        return "company/mainPage";
    }

    @GetMapping("/newCompany")
    public String newCom(Model model){
        model.addAttribute("company",new Company());
        return "company/addCompany";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("company") Company company){
        companyService.saveCompanies(company);
        return "redirect:/getAllCompanies";
    }

    @GetMapping("/{id}/update")
    public String getById(Model model,@PathVariable("id") long id){
        model.addAttribute("company",companyService.getById(id));
        return "company/updateCompany";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("company") Company company, @PathVariable("id") long id) {
        companyService.UpdateCompaniesTable(id,company);
        return "redirect:/getAllCompanies";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id) {
        companyService.removeCompaniesById(id);
        return "redirect:/getAllCompanies";
    }

}
