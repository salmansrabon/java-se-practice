package string_manipulation;
//7. Find out how many images are in the given array:
//["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
//Output: 3
public class find_image {
    public static void main(String[] args) {
        String[] images = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
        int count=0;
        for (int i = 0; i < images.length; i++) {
            String ext[] = images[i].split("\\.");
            for (int j = 1; j < ext.length; j += 2) {
                if(ext[j].contains("jpg") || ext[j].contains("png")){
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
