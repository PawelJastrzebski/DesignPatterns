package com.jastrzab.designpatterns.behavioral.command;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.behavioral.command.editor.Editor;
import com.jastrzab.designpatterns.behavioral.command.editor.EnterTextCommand;
import com.jastrzab.designpatterns.behavioral.command.editor.NewLineCommand;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class CommandApp implements Application {
    @Override
    public String appName() {
        return "Command";
    }

    @Override
    public void startApplication() {
        Editor editor = new Editor();
        editor.action(new EnterTextCommand("Hello"));
        editor.action(new EnterTextCommand(" "));
        editor.action(new EnterTextCommand("World"));
        editor.action(new NewLineCommand());
        editor.action(new EnterTextCommand("New line"));

        editor.print();
        editor.undo();
        editor.print();
        editor.undo();
        editor.print();
        editor.undo();
        editor.print();
        editor.undo();
        editor.print();
        editor.undo();

        editor.print();
    }
}
