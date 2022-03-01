package main.java.com.typesOfClasses.singletonClass;

/** Singleton, a class that have one object at a time. */
public class Singleton {

  private String singletonString;
  private static Singleton instance = null;

  private Singleton() {
    singletonString = "Singleton class than hava a one object at a time.";
  }

  /**
   * Get the same instance.
   *
   * @return Singleton object instance
   */
  public static Singleton SingletonInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  /**
   * Get to string.
   *
   * @return string
   */
  public String getSingletonString() {
    return singletonString;
  }
}
