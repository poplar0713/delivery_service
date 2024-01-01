package com.delivery_service.api.account;

import com.delivery_service.api.account.model.AccountMeResponse;
import com.delivery_service.db.account.AccountEntity;
import com.delivery_service.db.account.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/account")
public class AccountApiController {

    private final AccountRepository accountRepository;

    @GetMapping("/me")
    public AccountMeResponse me() {
        return AccountMeResponse.builder()
                .name("kwon")
                .email("minichip@naver.com")
                .registeredAt(LocalDateTime.now())
                .build();
    }

}
