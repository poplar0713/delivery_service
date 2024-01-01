package com.delivery_service.api.Account;

import com.delivery_service.db.account.AccountEntity;
import com.delivery_service.db.account.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/account")
public class AccountApiController {

    private final AccountRepository accountRepository;

    @GetMapping("")
    public void save() {
        var account = AccountEntity.builder().build();
        accountRepository.save(account);
    }

}
