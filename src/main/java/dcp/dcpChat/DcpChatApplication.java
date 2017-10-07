package dcp.dcpChat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DcpChatApplication {

//    @Autowired
//    ConfigurationsRepository configurationsRepository;
//    
//    @RequestMapping("/")
//    public String home() {
//        System.out.println("[START] データベースに接続してデータを取得します。");
//        Page<Configurations> configs = configurationsRepository.findAll(new PageRequest(0, 10));
//        for (Configurations config : configs) {
//            System.out.println(config.getName() + " = " + config.getValue());
//        }
//        System.out.println("[END  ] データベースに接続してデータを取得します。");
//        return "index";
//    }
//
	public static void main(String[] args) {
		SpringApplication.run(DcpChatApplication.class, args);
	}
}
