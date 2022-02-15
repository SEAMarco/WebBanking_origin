package de.telekom.sea7;

import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //
public class ViewImpl {

    @GetMapping("/index.html")
    @ResponseBody 
    public String getHtml() {
        String body = LocalDateTime.now().toString();
        String html = "<!doctype html>" + 
        "<html>" + " "
                + "<head>"
        + " <title>Hello from getHtml</title>" 
                + " </head>"
                + " <body>"
                + body
                + " </body>"
                + " </html>";
        return html;
    }

    @GetMapping("/index.css")
    @ResponseBody
    public String getCSS() {
        String css = "<@charset UTF-8>";

        return css;
    }
}
