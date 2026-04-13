package MachineCoding.BuildGoogleDocsCodersArmy.Entities;


public class TextContent extends Content {

    String text;
    public TextContent(int contentId, String text, int positionX, int positionY) {
        super(contentId, ContentType.TEXT, positionX, positionY); // Call the superclass constructor
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void editText(String text) {
        this.text = text;
    }
}
