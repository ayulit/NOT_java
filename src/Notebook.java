public class Notebook extends Computer{
    int diag;
    int timeWork;

    public Notebook() {
    }

    public Notebook(int diag, int timeWork, int memory, int hardSpace, int numberCores) {
        super(memory,hardSpace,numberCores);
        this.diag = diag;
        this.timeWork = timeWork;
    }
}
