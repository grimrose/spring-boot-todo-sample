package sample.web

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping(value = '/todo')
class TodoController {

    @RequestMapping
    public String index(Model model) {
        model.addAttribute("now", new Date())
        "list"
    }

}
