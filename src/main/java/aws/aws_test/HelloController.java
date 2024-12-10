package aws.aws_test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final String testMsg;

    public HelloController(@Value("${msg}") String testMsg) {
        this.testMsg = testMsg;
    }

    @GetMapping("/hello")
    public String Hello() {
        return "hello";
    }

    @GetMapping("/hi")
    public String hi() {
        return testMsg;
    }

}
