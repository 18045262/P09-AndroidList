package sg.edu.rp.c346.alcadapter;

public class arrayList {
    private String msa;
    private String date;

    public arrayList(String msa, String date){
        this.msa = msa;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getMsa() {
        return msa;
    }

    @Override
    public String toString() {
        return msa + ":" + date;
    }
}
