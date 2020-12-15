public class Testcotxesegonapart {
    public static void main(String[] args) {
        CotxeSegonaPart_Joshua_Mas c1= new CotxeSegonaPart_Joshua_Mas("Ferrari", "asd", TipusCanvi.CanviManual);
        try {
            c1.canviarmarxaM('a');
            System.out.println(c1.getEstatmarxaM());
            c1.canviarmarxaM('-');
            System.out.println(c1.getEstatmarxaM());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
