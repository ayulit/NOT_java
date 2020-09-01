public class Notebook extends Computer implements Returnable{
    int diag;
    int timeWork;

    public Notebook() {
    }

    public Notebook(int diag, int timeWork, int memory, int hardSpace, int numberCores) {
        super(memory,hardSpace,numberCores);
        this.diag = diag;
        this.timeWork = timeWork;
    }

    public boolean getDocs(){
        if (order && passport) return true;
        else return false;
    }

    public int getDay2Return(){
        return days2Return;
    }
}
