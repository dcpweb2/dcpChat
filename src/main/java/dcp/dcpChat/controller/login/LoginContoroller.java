package dcp.dcpChat.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import dcp.dcpChat.form.login.LoginForm;

@Controller
public class LoginContoroller {
    
    @ModelAttribute
    LoginForm setLoginForm() {
        return new LoginForm();
    }

    private static final Logger logger = LoggerFactory.getLogger(LoginContoroller.class);

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String sample(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate);
        
        return "login/login";
    }
}
