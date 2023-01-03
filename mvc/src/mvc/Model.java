package mvc;

public class Model {
    private String no;
    private String namabrg;
    private String tgl;
    private boolean status;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNamabrg() {
        return namabrg;
    }

    public void setNamabrg(String namabrg) {
        this.namabrg = namabrg;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public Model(String no, String namabrg, String tgl, boolean status){
        this.no = no;
        this.namabrg = namabrg;
        this.tgl = tgl;
        this.status = status;
    }
}
