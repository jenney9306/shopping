package com.wish.shopping.controller;

import com.wish.shopping.dto.Join;
import com.wish.shopping.service.JoinService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class JoinController {
    private final JoinService joinService;


    @GetMapping("/Join")
    public String join(){
        return "Join";
    }

    @PostMapping("/joinProc")
    public String joinProcess(Join join){
        joinService.joinProcess(join);
        return "redirect:/login";
    }
}
