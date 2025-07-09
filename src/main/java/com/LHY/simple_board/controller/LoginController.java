package com.LHY.simple_board.controller;

import com.LHY.simple_board.dto.LoginDto;
import com.LHY.simple_board.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor

public class LoginController {
    private final UserRepository userRepository;

    @GetMapping({"/", "/login"})
    public String loginForm(Model model) {
        model.addAttribute("loginDto", new LoginDto());

        return "login";
    }
}
