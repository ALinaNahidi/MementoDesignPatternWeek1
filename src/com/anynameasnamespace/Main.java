package com.anynameasnamespace;

import momento.Editor;
import momento.History;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createContent());
        editor.setContent("b");
        history.push(editor.createContent());
        editor.setContent("c");
        history.push(editor.createContent());
        editor.restore(history.pop());
//        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}

/*public class Main{
    public static void main(String[] args){
        var editor = new Editor();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
        editor.undo();

    }
}*/