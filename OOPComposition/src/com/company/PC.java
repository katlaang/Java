package com.company;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;

    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //Fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");

    }
}
   /*private Case getTheCase() { //change from public to private so main vclass cannot access the method
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private MotherBoard getMotherBoard() {
        return motherBoard;
    }
}*/
