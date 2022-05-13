public class Animal1 {
    private String name1;
    private boolean dogTF;

    public Animal1(String name, boolean isDog) {
        this.name1 = name;
        this.dogTF = isDog;
    }

    public Animal1(String name) {
        this.name1 = name;
    }

    public Animal1(boolean isDog) {
        this.dogTF = isDog;
    }

    public String getName() {
        return name1;
    }

    public void setName(String name) {
        this.name1 = name;
    }

    public boolean getIsDog() {
        return dogTF;
    }

    public void setIsDog(boolean isDog) {
        this.dogTF = isDog;
    }

    private String dogNoise() {
        String[] dogNoise = {"bark", "woof", "ruff", "grr"};
        int index = (int)Math.floor(Math.random() * dogNoise.length);
        return dogNoise[index];
    }

    @Override
    public String toString() {
        if (getIsDog()) {
            return getName() + " is a dog - " + dogNoise() + "!";
        } else {
            return getName() + " is not a dog";
        }
    }
}
