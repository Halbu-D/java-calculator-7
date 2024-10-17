package calculator;

import calculator.cli.View;
import calculator.domain.Calculator;
import calculator.domain.Separator;

public class Application {
    public static void main(String[] args) {
        View view = new View();
        Separator separator = new Separator(view.inputMessage());
        Calculator calculator = new Calculator();

        view.outputMessage(calculator.sum(separator.cut()));
    }
}
