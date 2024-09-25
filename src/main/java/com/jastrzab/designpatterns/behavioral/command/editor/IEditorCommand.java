package com.jastrzab.designpatterns.behavioral.command.editor;

public interface IEditorCommand {
    String runCommand(Editor editor);
    String reversCommand(Editor editor);
}
