public class Certificado {

    private String anomalias;
    private int idEnsayo;


    // metodo contructor


    public Certificado(int idCertificado, double calidad, String anomalias, int idEnsayo) {
        this.anomalias = anomalias;
        this.idEnsayo = idEnsayo;
    }

    //// metod


    public void setAnomalias(String anomalias) {
        this.anomalias = anomalias;
    }

    public void setIdEnsayo(int idEnsayo) {
        this.idEnsayo = idEnsayo;
    }
}
