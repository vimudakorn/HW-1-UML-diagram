// 6510405792 Vimudakorn Kittechapanich

import java.util.Random;
public class Die {
    private int faceValue;

    public void roll() {
        int number = new Random().nextInt(1,7);
        setFaceValue(number);
    }
    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }


}
