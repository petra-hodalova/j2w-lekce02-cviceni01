package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Controller
public class MainController {

    @GetMapping("/datum")
    public ModelAndView datum() {
        final Locale LOCALE = Locale.forLanguageTag("cs-CZ");
        final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("d. MMMM yyyy", LOCALE);

        ModelAndView modelAndView=new ModelAndView("datum");
        modelAndView.addObject("datum",LocalDate.now().format(DATE_FORMATTER));
        return modelAndView;
    }

    @GetMapping("/cas")
    public ModelAndView cas() {
        final Locale LOCALE = Locale.forLanguageTag("cs-CZ");
        final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("H:mm", LOCALE);

        ModelAndView modelAndView=new ModelAndView("cas");
        modelAndView.addObject("cas",LocalTime.now().format(TIME_FORMATTER));
        return modelAndView;
    }
}
