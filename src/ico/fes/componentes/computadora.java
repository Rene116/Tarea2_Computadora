/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author User
 */
public class computadora {

    private String mouseP1;
    private String tecladoP1;
    private String monitorP1;
    private String cpuP1;

    public computadora() {
    }

    public computadora(String mouseP1, String tecladoP1, String monitorP1, String cpuP1) {
        this.mouseP1 = mouseP1;
        this.tecladoP1 = tecladoP1;
        this.monitorP1 = monitorP1;
        this.cpuP1 = cpuP1;
    }

    public String getMouseP1() {
        return mouseP1;
    }

    public void setMouseP1(String mouseP1) {
        this.mouseP1 = mouseP1;
    }

    public String getTecladoP1() {
        return tecladoP1;
    }

    public void setTecladoP1(String tecladoP1) {
        this.tecladoP1 = tecladoP1;
    }

    public String getMonitorP1() {
        return monitorP1;
    }

    public void setMonitorP1(String monitorP1) {
        this.monitorP1 = monitorP1;
    }

    public String getCpuP1() {
        return cpuP1;
    }

    public void setCpuP1(String cpuP1) {
        this.cpuP1 = cpuP1;
    }

    @Override
    public String toString() {
        return "computadora{" + "mouseP1=" + mouseP1 + ", tecladoP1=" + tecladoP1 + ", monitorP1=" + monitorP1 + ", cpuP1=" + cpuP1 + '}';
    }

}
