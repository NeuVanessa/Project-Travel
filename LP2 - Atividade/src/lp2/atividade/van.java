package lp2.atividade;

import java.util.ArrayList;


public class van{

    /**
     * @return the chassi
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * @param chassi the chassi to set
     */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    private String chassi;
    private String placa;
    public van(String chassi, String placa) {
    this.chassi = chassi;
    this.placa = placa;
    
    
    }
    
}
