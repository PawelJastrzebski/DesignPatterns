package com.jastrzab.designpatterns.behavioral.command.editor;

public interface IEditor {
    String getText();
    void action(IEditorCommand command);
    void undo();
}
