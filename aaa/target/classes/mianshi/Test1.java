package mianshi;

/**
 * Created by Administrator on 2015/12/3.
 *
 */
 public class Test1 {

        public static String translate (String tr){
            String tempStr = "";
            try {
                tempStr = new String(tr.getBytes("ISO-8859-1"), "GBK");
                tempStr = tempStr.trim();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            return tempStr;
        }
     public static void main(String[] args){
         System.out.println(translate("kjhkjh"));
     }

    }



