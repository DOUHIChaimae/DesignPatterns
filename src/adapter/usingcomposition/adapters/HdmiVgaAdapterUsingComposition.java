package adapter.usingcomposition.adapters;

import adapter.usingcomposition.computer.HDMI;
import adapter.usingcomposition.computer.VGA;

public class HdmiVgaAdapterUsingComposition implements VGA {
    private HDMI hdmi;

    @Override
    public void print(String message) {
        System.out.println("~~~~~~~~~~~ Adapter ~~~~~~~~~~");
        byte[] data = message.getBytes();
        hdmi.view(data);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
