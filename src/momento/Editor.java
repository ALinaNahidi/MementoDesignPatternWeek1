package momento;

public class Editor {
    private String content;

    public EditorState createContent() {

        return new EditorState(content);
    }

    public String getContent()
    {
        return content;
    }
    public void setContent(String content) {

        this.content= content;
    }

    public void restore(EditorState state){

        content=state.getContent1();
    }
}
//    private String content;
//    private String prevContent;
//
//
//
//    public void setContent(String content){
//        prevContent=this.content;
//        this.content = content;
//    }
//
//    public void Undo(){
//        this.content=prevContent;
//    }
//
//    public String getContent() {
//        return content;
//    }
//}
