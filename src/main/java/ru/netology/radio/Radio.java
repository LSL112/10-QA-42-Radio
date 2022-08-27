package ru.netology.radio;
public class Radio {
    public int currentStationNumber;
    public int currentSoundVolume;

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            currentSoundVolume = 0;
        }if (currentSoundVolume > 10) {
            currentSoundVolume = 10;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void increaseVolume() {
        if (currentSoundVolume < 10) {
            currentSoundVolume ++;
        }else {
            currentSoundVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume --;
        }else {
            currentSoundVolume = 0;
        }
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }if (currentStationNumber > 9) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public void next() {
        if (currentStationNumber < 9) {
            currentStationNumber ++;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prev() {
        if (currentStationNumber > 0) {
            currentStationNumber --;
        } else {
            currentStationNumber = 9;
        }
    }

}
