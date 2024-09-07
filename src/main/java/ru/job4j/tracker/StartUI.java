package ru.job4j.tracker;

import ru.job4j.tracker.action.*;
import ru.job4j.tracker.input.ConsoleInput;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.ConsoleOutput;
import ru.job4j.tracker.output.Output;

public class StartUI {
    private final Output output;

    public StartUI(Output output) {
        this.output = output;
    }

    public void init(Input input, Tracker tracker, UserAction[] action) {
        boolean run = true;
        while (run) {
            showMenu(action);
            int select = input.askInt("Выбрать: ");
            if ((select >= 0) && (select <= 6)) {
                run = action[select].execute(input, tracker);
            } else {
                output.println("Ошибка выбора пункта меню");
            }
        }
    }

    private void showMenu(UserAction[] action) {
        output.println("Меню:");
        for (int i = 0; i < action.length; i++) {
            output.println(i + ". " + action[i].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
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