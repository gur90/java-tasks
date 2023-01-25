package kid;

public class Kid {
    private String name;
    private String adultName;
    public String titleOfGroup;
    private int age;

    private int height;

    public Kid(String name, String adultName, String titleOfGroup, int age, int height) {
        this.name = name;
        this.adultName = adultName;
        this.titleOfGroup = titleOfGroup;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Kid " + name +
                ", adultName " + adultName +
                ", titleOfGroup " + titleOfGroup +
                ", age " + age +
                ", height " + height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdultName() {
        return adultName;
    }

    public void setAdultName(String adultName) {
        this.adultName = adultName;
    }

//    public String getTitleOfGroup() {
//        return titleOfGroup;
//    }
//
//    public void setTitleOfGroup(String titleOfGroup) {
//        this.titleOfGroup = titleOfGroup;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
