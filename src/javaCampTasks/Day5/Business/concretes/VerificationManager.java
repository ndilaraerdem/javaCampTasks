package javaCampTasks.Day5.Business.concretes;

import javaCampTasks.Day5.Business.abstracts.VerificationService;

public class VerificationManager implements VerificationService {
    @Override
    public void sendMail() {
        System.out.println("Email gönderildi.");
    }

    @Override
    public boolean verify() {
        System.out.println("Email doğrulandı.");
        return true;
    }
}
