package dcp.dcpChat.controller.chat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

/**
 * チャットコントローラー
 *
 * @author sho_shimizu
 */
@Controller
public class ChatController {

    /**
     * チャット画面表示処理
     *
     * @param locale
     * @param model
     * @return
     */
    @RequestMapping(value = "/chat", method = RequestMethod.GET)
    public String chat(Locale locale, Model model) {
        return "chat/chat";
    }
}


