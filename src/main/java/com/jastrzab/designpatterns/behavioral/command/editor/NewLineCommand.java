package com.jastrzab.designpatterns.behavioral.command.editor;

public class NewLineCommand extends EnterTextCommand {

    public NewLineCommand() {
        super("\n");
    }
}
