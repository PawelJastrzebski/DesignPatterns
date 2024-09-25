package com.jastrzab.designpatterns.behavioral.command.editor;

import lombok.extern.log4j.Log4j2;

import java.util.Stack;


@Log4j2
public class Editor implements IEditor {
    Stack<IEditorCommand> history = new Stack<>();
    String text = "";

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public void action(IEditorCommand command) {
        this.text = command.runCommand(this);
        this.history.add(command);
    }

    @Override
    public void undo() {
        if (this.history.isEmpty()) return;
        this.text = this.history.pop().reversCommand(this);
    }

    public void print() {
        log.info("\n{}", this.text);
    }
}
