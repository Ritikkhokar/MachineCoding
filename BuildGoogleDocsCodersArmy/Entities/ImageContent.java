package MachineCoding.BuildGoogleDocsCodersArmy.Entities;

public class ImageContent extends Content {
    String imageUrl;

    public ImageContent(int contentId, String imageUrl, int positionX, int positionY) {
        super(contentId, ContentType.IMAGE, positionX, positionY); // Call the superclass constructor
        this.imageUrl = imageUrl;
    }    

    public String getImageUrl() {
        return imageUrl;
    }

    public void editImage(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
