package hw.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class CalculatorController {


    Operator operator =new Operator();

    @GetMapping("/add/{firstNumber}/{secondNumber}")
    public int getAdd(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return operator.add(firstNumber,secondNumber);
    }

    @GetMapping("/sub/{firstNumber}/{secondNumber}")
    public int getSub(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return operator.sub(firstNumber,secondNumber);
    }

    @GetMapping("/mul/{firstNumber}/{secondNumber}")
    public int getMul(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return operator.mul(firstNumber,secondNumber);
    }

    @GetMapping("/div/{firstNumber}/{secondNumber}")
    public int getDiv(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return operator.div(firstNumber,secondNumber);
    }

    @GetMapping("/mod/{firstNumber}/{secondNumber}")
    public int getMod(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return operator.mod(firstNumber,secondNumber);
    }

}
