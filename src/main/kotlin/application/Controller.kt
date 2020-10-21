package application

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    var isCallActive = "Nope";

    @RequestMapping("/isActive")
    fun isActive(): String {
        return isCallActive
    }

    @RequestMapping("/setActive")
    fun setActive(): String {
        isCallActive = "Yep"
        return "Done"
    }

    @RequestMapping("/setInactive")
    fun setInactive(): String {
        isCallActive = "Nope"
        return "Done"
    }
}