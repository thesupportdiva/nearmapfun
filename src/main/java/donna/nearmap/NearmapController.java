package donna.nearmap;

import donna.nearmap.Nearmap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NearmapController {
    @GetMapping("/addNearmap")
    public String sendForm(Nearmap nearmap) {
        return "addNearmap";
    }

    @PostMapping("/addNearmap")
    public String processForm(Nearmap nearmap) {
//        System.out.println("Latitude: " + nearmap.getLatitude());
//        System.out.println("Longitude: " + nearmap.getLongitude());
//        System.out.print("URL: " + nearmap.getUrl());
        return "showNearmap";
    }
}
