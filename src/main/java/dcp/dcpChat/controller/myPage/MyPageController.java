package dcp.dcpChat.controller.myPage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.Locale;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import dcp.dcpChat.form.login.LoginForm;

/**
 * マイページコントローラ
 * @author mishima
 */
@Controller
public class MyPageController {
    
    @ModelAttribute
    LoginForm setLoginForm() {
        return new LoginForm();
    }

    /**
     * マイページ画面表示処理
     * @param locale
     * @param model
     * @return
     */
    @RequestMapping(value = "/mypage", method = RequestMethod.GET)
    public String login(Locale locale, Model model) {
        return "mypage/mypage";
    }
}
