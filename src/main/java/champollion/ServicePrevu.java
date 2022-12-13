package champollion;

public class ServicePrevu {
	Enseignant ens;
    UE unite;
    private  int VolumeCM;
    private  int VolumeTD;
    private  int VolumeTP;

    public ServicePrevu(Enseignant ens, UE unite,int VolumeCM, int VolumeTD, int VolumeTP){
        this.ens= ens;
        this.unite=unite;
        this.VolumeCM= VolumeCM;
        this.VolumeTD= VolumeTD;
        this.VolumeTP=VolumeTP;
    }
    public Enseignant getEnseignant(){
        return ens;
    }
    public UE getUE(){
        return unite;
    }
    public int getVolumeCM(){
        return VolumeCM;
    }
    public int getVolumeTD(){
        return VolumeTD;
    }
    public int getVolumeTP(){
        return VolumeTP;
    }
}
