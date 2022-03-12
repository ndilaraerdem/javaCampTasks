package javaCampTasks.Day5.Business.concretes;

import javaCampTasks.Day5.Business.abstracts.CustomerService;
import javaCampTasks.Day5.Business.abstracts.RegisterCheckService;
import javaCampTasks.Day5.Business.abstracts.VerificationService;
import javaCampTasks.Day5.DataAccess.abstracts.CustomerDao;
import javaCampTasks.Day5.Entities.concretes.Customer;

public class CustomerManager implements CustomerService {
RegisterCheckService registerCheckService;
VerificationService verificationService;
CustomerDao customerDao;

    public CustomerManager(
            RegisterCheckService registerCheckService,
            VerificationService verificationService,
            CustomerDao customerDao) {
        this.registerCheckService = registerCheckService;
        this.verificationService = verificationService;
        this.customerDao = customerDao;
    }


    @Override
    public void register(Customer customer) {
        if (registerCheckService.check(customer)){
            System.out.println("Başarıyla üye oldunuz.");
            verificationService.sendMail();
        }
        else{
            System.out.println("Üyelik başarısız.");
        }
    }

    @Override
    public void login(Customer customer) {
        if (registerCheckService.checkEmail(customer) && registerCheckService.checkPassword(customer) && verificationService.verify()){
            System.out.println("Kullanıcı girişi başarıyla yapıldı.");
        }
        else {
            System.out.println("Böyle bir kullanıcı yok, lütfen kontrol ediniz.");
        }
    }

    }