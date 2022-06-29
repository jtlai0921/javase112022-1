package lab;


class DNASynch {
    int aCount;
    int tCount;
    int cCount;
    int gCount;
//    void setACount(int aCount) {
//        this.aCount = aCount;
//    }
//    void setTCount() {
//        this.tCount = this.tCount;
//    }
//    int setCCount() {
//        return cCount;
//    }
    int setGCount(int g) {
        gCount = g;
        return gCount;
    }
    void setAllCount(int x) {
        this.aCount = cCount = this.cCount = setGCount(x);
    }
}


// AC
public class Q02 {

}
