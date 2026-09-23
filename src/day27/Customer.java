package day27;

public class Customer {
    public String[] getDeviceDetails(String customerName) {
        String equipments[]= null;
        if (customerName.equals("Kerrie"))
        {
            String[] devices = {"macbook pro", "ipad", "iPhone17"};
            equipments =devices;
        }
        else if (customerName.equals("Larry"))
        {
            String[] devices = {"ipad", "iPhone13"};
            equipments =devices;
        }
        else if (customerName.equals("Lee"))
        {
            String[] devices = {"ipad", "iPhone13", "Windows11"};
            equipments =devices;
        }
        else if (customerName.equals("Rose"))
        {
            String[] devices = {"ipad", "iPhone13", "Samsung S10"};
            equipments =devices;
        }
        return equipments;
    }
}
