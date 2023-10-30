public class Image {
    private String fileName;
    private int width;
    private int height;

    public Image (String fileName, int width, int height){
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public boolean isKnownFileType(){
        String[] fileNameEnding = fileName.split("\\.");
        switch(fileNameEnding[1]){
            case "gif", "jpg", "jpeg", "png", "webp", "bmp" -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }

    public boolean isPortrait(){
        return height > width;
    }

    public boolean isLandscape(){
        return width > height;
    }

    public String toString(){
        return fileName + "("+height+":"+width+")";
    }
}
