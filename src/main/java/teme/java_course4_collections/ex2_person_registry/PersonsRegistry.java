package teme.java_course4_collections.ex2_person_registry;

import java.util.Set;

class PersonsRegistry {

    //TODO: add a field for storing somehow the persons of this registry (type: some kind of collection)

    /**
     * Adds a new person to the registry. If a person with same CNP already exists,
     * it will NOT register this new person (just ignore it, and show an error)
     */
    void register(Person p) {
        //TODO!
    }

    /**
     * Finds a person by cnp and removes it from registry
     * If person not found, will still work (does nothing, but raises no error either)
     */
    void unregister(int cnp) {
        //TODO!
    }

    /**
     * Get the number of currently registered persons
     */
    int count() {
        //TODO!
        return -1;
    }

    /**
     * Get the list of distinct cnp values of all persons
     */
    Set<Integer> cnps() {
        //TODO!
        return null;
    }

    /**
     * Get the list of distinct names of all persons
     */
    Set<String> uniqueNames() {
        //TODO!
        return null;
    }

    /**
     * Find a person by cnp. Returns null if no person found.
     */
    Person findByCnp(int cnp) {
        //TODO!
        return null;
    }

    /**
     * Find the persons with a specified name (may be zero, one or more)
     * (comparing person name with specified name should be case insensitive)
     */
    Set<Person> findByName(String name) {
        //TODO!
        return null;
    }

    /**
     * Get the average age for all persons (or 0 as default if it cannot be computed)
     */
    double averageAge() {
        //TODO!
        return -1;
    }

    /**
     * Get the percent (a value between 0-100) of adults (persons with age >=18)
     * from the number of all persons (or 0 as default if it cannot be computed)
     */
    double adultsPercentage() {
        //TODO!
        return -1;
    }

    /**
     * Get the percent (a value between 0-100) of adults who voted
     * from the number of all adult persons (age>=18)
     */
    double adultsWhoVotedPercentage() {
        //TODO!
        return -1;
    }

    /**
     * Just for some manual tests
     */
    public static void main(String[] args) {
        PersonsRegistry reg = new PersonsRegistry();
        reg.register(new Person(1234, "Ion", 14, false));
        reg.register(new Person(2233, "Ana", 12, false));
        reg.register(new Person(2678, "Ana", 3, false));
        reg.register(new Person(1235, "Costel", 21, false));
        reg.register(new Person(2367, "Maria", 33, true));

        System.out.println("Registered persons count: " + reg.count());
        System.out.println("Average age: " + reg.averageAge());
        System.out.println("Adults percentage: " + reg.adultsPercentage());
        System.out.println("Voters percentage (vs all adults): " + reg.adultsWhoVotedPercentage());

        System.out.println("Unique names: " + reg.uniqueNames());
        System.out.println("Persons named 'ana': " + reg.findByName("ana"));
        System.out.println("Person with cnp 2678: " + reg.findByCnp(2678));
        System.out.println("Person with cnp 1000: " + reg.findByCnp(1000));

        reg.unregister(2678);
        System.out.println("Registered persons count: " + reg.count());
        System.out.println("Person with cnp 2678: " + reg.findByCnp(2678));
    }
}
