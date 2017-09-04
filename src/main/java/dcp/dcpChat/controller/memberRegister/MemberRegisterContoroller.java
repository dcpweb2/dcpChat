package dcp.dcpChat.controller.memberRegister;

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

/**
 * 新規会員登録画面
 * @author inokoichi
 */
@Controller
public class MemberRegisterContoroller {

    private static final Logger logger = LoggerFactory.getLogger(MemberRegisterContoroller.class);

    /**
     * 新規会員登録画面表示
     * @param locale
     * @param model
     * @return
     */
    @RequestMapping(value = "/memberRegister", method = RequestMethod.GET)
    public String sample(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        return "memberRegister/memberRegister";
    }
}
