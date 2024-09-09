package ru.job4j.tracker;

import ru.job4j.tracker.action.*;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.ValidateInput;
import ru.job4j.tracker.output.ConsoleOutput;
import ru.job4j.tracker.output.Output;

public class StartUI {
    private final Output output;

    public StartUI(Output output) {
        this.output = output;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Выбрать: ");
            if (select < 0 || select >= actions.length) {
                output.println("Неверный ввод, вы можете выбрать: 0 .. " + (actions.length - 1));
                continue;
            }
            run = actions[select].execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] action) {
        output.println("Меню:");
        for (int i = 0; i < action.length; i++) {
            output.println(i + ". " + action[i].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ValidateInput();
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        UserAction[] action = {
                new CreateAction(output),
                new FindAllAction(output),
                new ReplaceAction(output),
                new DeleteAction(output),
                new FindByIdAction(output),
                new FindByNameAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, action);
    }
}