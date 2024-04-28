package session3;

public class Person {
    static String name = "UNKNOWN";
    String instanceName = "UNKNOWN";
    String age = "25";

    public Person() {
    }

    public Person(String age) {
        age = age;
    }

    public Person(String name, String age) {
        this.age = age;
        this.instanceName = Person.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String toString() {
        return instanceName + " is " + age + " years old (" + getAgeGroupClassification() + ")";
    }

    public String getAgeGroupClassification() {

        String ageClassification = "GenY";

        int age = Integer.parseInt(this.age);

        if (age >= 95) {
            ageClassification = "The Greatest Generation";
        } else if (age >= 75) {
            ageClassification = "The Silent Generation";
        } else if (age >= 55) {
            ageClassification = "Baby Boomer";
        } else if (age >= 40) {
            ageClassification = "GenX";
        } else if (age >= 20) {
            ageClassification = "Millenial";
            String ageType = "";
            if (age >= 21) {
                ageType = "Voting ";
            }
            ageClassification = ageType + ageClassification;

        }
        return ageClassification;
    }
}
