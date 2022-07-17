package string_manipulation;

public class Extract_Trnx_Id {
    public static void main(String[] args) {
        String html_body="<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";
        int pos= html_body.indexOf("TXN");
        String txnid= html_body.substring(pos,pos+9);
        System.out.println(txnid);
    }
}
