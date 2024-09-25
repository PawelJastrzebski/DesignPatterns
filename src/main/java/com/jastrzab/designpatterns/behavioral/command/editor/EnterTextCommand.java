package com.jastrzab.designpatterns.behavioral.command.editor;

public class EnterTextCommand implements IEditorCommand {

    private final String text;

    public EnterTextCommand(String text) {
        this.text = text;
    }

    @Override
    public String runCommand(Editor editor) {
        return editor.getText() + this.text;
    }

    @Override
    public String reversCommand(Editor editor) {
        String t = editor.getText();
        return t.substring(0, t.length() - this.text.length());
    }
}
