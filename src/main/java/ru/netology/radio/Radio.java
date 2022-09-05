package ru.netology.radio;

public class Radio {
    protected int maxStation;
    protected int currentStationNumber;
    protected int currentSoundVolume;



    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int amountNumberStation) {
        this.maxStation = amountNumberStation - 1;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            currentSoundVolume = 0;
        }
        if (currentSoundVolume > 100) {
            currentSoundVolume = 100;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void increaseVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume++;
        } else {
            currentSoundVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        } else {
            currentSoundVolume = 0;
        }
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > maxStation) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public void next() {
        if (currentStationNumber < maxStation) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prev() {
        if (currentStationNumber > 0) {
            currentStationNumber--;
        } else {
            currentStationNumber = maxStation;
        }
    }

}
