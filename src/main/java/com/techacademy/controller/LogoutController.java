package com.techacademy.controller;

import org.springframework.web.bind.annotation.PostMapping;

public class LogoutController {
    /** ログアウト処理を行う */
    @PostMapping("/logout")
    public String postLogout() {
        // ログイン画面にリダイレクト
        return "redirect:/logout";
    }
}
