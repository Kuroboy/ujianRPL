package mvc;


import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Controller {
    ArrayList<Model> ArrayData;
    DefaultTableModel tabelModel;
    
    public Controller(){
        ArrayData = new ArrayList<Model>();
    }
    
    public void InsertData(String no, String namabrg, String tgl, boolean status){
        Model inv = new Model(no, namabrg, tgl, status);
        ArrayData.add(inv);
    }
    
    public DefaultTableModel showData(){
        String[] kolom = {"No", "NAMA BARANG", "TANGGAL", "STATUS"};
        Object[][] objData = new Object[ArrayData.size()][4];
        int i = 0;
        
        for(Model n : ArrayData){
            String[] arrData = {n.getNo(), n.getNamabrg(), n.getTgl(), (n.isStatus()) ? "Baik" : "Rusak"};
            objData[i] = arrData;
            i++;
        }
        
        tabelModel = new DefaultTableModel(objData, kolom){
            public boolean isCellEdittable(int rowIndex, int colIndex){
                return false;
            }
        };
        
        return tabelModel;        
    }
    
    public static void main(String[] args) {
    }
    
}