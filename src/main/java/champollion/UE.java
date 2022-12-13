package champollion;

public class UE {
    private final String myIntitule;
    private  int heuresCM;
    private  int heuresTD;
    private  int heuresTP;

    public UE(String intitule, int heuresCM, int heuresTD, int heuresTP) {

        myIntitule = intitule;
        this.heuresCM= heuresCM;
        this.heuresTD= heuresTD;
        this.heuresTP= heuresTP;
    }
    public UE(String intitule) {
        myIntitule = intitule;
    }

    public String getIntitule() {
        return myIntitule;
    }
    public void setheuresCM(int heuresCM){
        this.heuresCM= heuresCM;
    }
    public void setHeuresCM(int heureTD){
        this.heuresTD=heuresTD;
    }
    public void setHeuresTP(int heuresTP){
        this.heuresTP=heuresTP;
    }
    public int getheuresCM() {
        return heuresCM;
    }

    public int getheuresTD() {
        return heuresTD;
    }

    public int getheuresTP() {
        return heuresTP;
    }
}
