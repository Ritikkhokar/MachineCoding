package MachineCoding.BuildGoogleDocsCodersArmy.Entities;

import java.util.List;

public class Document {
    List<Content> contents;
    int documentId;
    int ownerId; 
    String documentName;   


    public Document(int documentId, int ownerId, String documentName) {
        this.documentId = documentId;
        this.contents = new java.util.ArrayList<>();
        this.ownerId = ownerId;
        this.documentName = documentName;
    }
    
    public List<Content> getContents() {
        return contents;
    }
    public void addContent(Content content) {
        contents.add(content);
    }
    public void deleteContent(int contentId) {
        for (Content content : contents) {
            if (content.contentId == contentId) {
                contents.remove(content);
                break;
            }
        }
    }

    public void replaceContent(Content oldContent, Content newContent) {
        int index = contents.indexOf(oldContent);
        if (index != -1) {
            contents.set(index, newContent);
        }
    }

    public int getDocumentId() {
        return documentId;
    }

    public boolean editTextContent(int contentId, String newText) {
        for (Content content : contents) {
            if (content.contentId == contentId && content.getContentType() == ContentType.TEXT) {
                ((TextContent) content).editText(newText);
                return true;
            }
        }
        return false;
    }

    public boolean editImageContent(int contentId, String newImageUrl) {
        for (Content content : contents) {
            if (content.contentId == contentId && content.getContentType() == ContentType.IMAGE) {
                ((ImageContent) content).editImage(newImageUrl);
                return true;
            }
        }
        return false;
    }


}


