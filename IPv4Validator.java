public class IPv4Validator {
    public static boolean isValidIPv4(String ip){
        String[] parts=ip.split("\\.");
        if (parts.length!=4){
            return false;
        }
        for(String part:parts){
            if(!part.matches("\\d+")){
                return false;
            }
            int num=Integer.parseInt(part);
            if(num<0||num>255||(part.length()>1&&part.startsWith("0"))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isValidIPv4("222.111.111.111"));
        System.out.println(isValidIPv4("5555..555")); 
        System.out.println(isValidIPv4("0.0.0.255")); 
        System.out.println(isValidIPv4("0.0.0.0255")); 
    }
}
