package univaq.progetto.database;

public class Image {

    String did;
    int img;

    public Image(String d, int i){
        this.did=d;
        this.img=i;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
