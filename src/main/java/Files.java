import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Files {

    Account user = new Account();
    HashMap<Integer, Integer> mapOfAccounts = new HashMap<Integer, Integer>();
//    OptionMenu menu = new OptionMenu();

//vvv ability to have multiple accounts within the ATM vvv

    public void userAccountFile(){
        try {
            BufferedWriter userAccounts = new BufferedWriter(new FileWriter("userAccounts.txt"));
            //make a loop that stores info each time a user makes an account
            for (Integer key : mapOfAccounts.keySet()) {
                userAccounts.write(key.toString() + " ");
            }
            for (Integer value : mapOfAccounts.values()){
                userAccounts.write(value.toString() + "\n");
            }
            userAccounts.close();
            //if the map already contains the key and value, then don't save it...
//                userAccounts.write(String.valueOf(user.getCustomerNumber()));
        } catch (IOException E) {
            E.printStackTrace();
        }
    }
    public void userAccountFileReader(){
        try {
            BufferedReader read = new BufferedReader(new FileReader("userAccounts.txt"));
            String s;
//            while(s = read.readLine())
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void addToMap(int customerNumber, int pinNumber){
        mapOfAccounts.put(customerNumber,pinNumber);
    }
    public void checkMap(){

    }
}
