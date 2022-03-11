package momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<EditorState> state = new ArrayList<>();

    public void push(EditorState state){

        this.state.add(state);
    }

    public EditorState pop(){
        var lastIndex= state.size()-1;
        var lastState= state.get(lastIndex);
        state.remove(lastState);
        return state.get(lastIndex-1);
    }
}
