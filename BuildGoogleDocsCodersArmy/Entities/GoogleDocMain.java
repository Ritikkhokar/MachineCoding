package MachineCoding.BuildGoogleDocsCodersArmy.Entities;

public class GoogleDocMain {
    public static void main(String[] args) {
        User user1 = new User(1,"John Doe", "john.doe@example.com");
        Document document = new Document(1,1,"My First Document");
        TextContent textContent = new TextContent(1,"Hello, World!", 0, 0);
        document.addContent(textContent);
        // document.editTextContent(1, "Hello, Google Docs!");
        System.out.println("Document ID: " + document.getContents());
        System.out.println("Document Contents:");
        for (Content content : document.getContents()) {
            if (content.getContentType() == ContentType.TEXT) {
                System.out.println("Text Content: " + ((TextContent) content).getText());
            }
        }
    }
}
