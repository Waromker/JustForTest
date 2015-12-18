

public class ExExeption {

    public int validNumber(String num) {
        int n;
        try {
       n = Integer.parseInt(num);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage() + " Лови нолик!");
            n = 0;
        }
        return n;
    }
}
