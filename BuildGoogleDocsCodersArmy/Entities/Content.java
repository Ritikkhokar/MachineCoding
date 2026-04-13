package MachineCoding.BuildGoogleDocsCodersArmy.Entities;

public abstract class Content {
    ContentType contentType;
    int positionX;
    int positionY;
    int contentId;
    
    public Content(int contentId, ContentType contentType, int positionX, int positionY) {
        this.contentId = contentId;
        this.contentType = contentType;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public  ContentType getContentType() {
        return contentType;
    }
    public int getPositionX() {
        return positionX;
    }
    public int getPositionY() {
        return positionY;
    }

    public void changePosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

}
