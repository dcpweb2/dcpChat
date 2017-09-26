package dcp.dcpChat.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.Locale;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import dcp.dcpChat.form.login.LoginForm;

/**
 * ログイン処理コントローラー
 * @author inokoichi
 */
@Controller
public class LoginContoroller {
    
    @ModelAttribute
    LoginForm setLoginForm() {
        return new LoginForm();
    }

    /**
     * ログイン画面表示処理
     * @param locale
     * @param model
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Locale locale, Model model) {
        return "login/login";
    }
}
