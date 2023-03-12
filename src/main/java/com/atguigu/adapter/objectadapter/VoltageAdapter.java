package com.atguigu.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        setVoltage220V(voltage220V);
    }

    public Voltage220V getVoltage220V() {
        return voltage220V;
    }

    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dest = 0;
        if (null != voltage220V) {
            int src = voltage220V.output220V();
            dest = src / 44;
            System.out.println("适配完成，输出的电压 = " + dest);
        }
        return dest;
    }

}
