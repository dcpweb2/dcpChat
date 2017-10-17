package dcp.dcpChat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@EnableAutoConfiguration
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger( SampleController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String sample(Locale locale, Model model) {
    	logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );


		
		return "sample/sample";
    }
}
