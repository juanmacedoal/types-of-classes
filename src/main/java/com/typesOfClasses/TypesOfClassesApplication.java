package main.java.com.typesOfClasses;

import main.java.com.typesOfClasses.asbtractClass.CompleteAbstractClass;
import main.java.com.typesOfClasses.concreteClass.Concrete;
import main.java.com.typesOfClasses.finalClass.Final;
import main.java.com.typesOfClasses.staticClass.Static.StaticNestedClass;

/** Types of Java Classes. */
public class TypesOfClassesApplication {

  /**
   * Main method.
   *
   * @param args Application arguments.
   */
  public static void main(String[] args) {
    StaticNestedClass staticNestedClass = new StaticNestedClass();
    System.out.println("\n" + staticNestedClass.returnStaticData());
    Final finalClass = new Final();
    System.out.println("\n" + finalClass.printMsg());
    CompleteAbstractClass completeAbstractClass = new CompleteAbstractClass();
    System.out.println(
        "\n"
            + completeAbstractClass.printAnything(
                "Abstract class are imcomplete, meant to be extended and completed by another class"));
    Concrete concreteClass = new Concrete();
    System.out.println("\n" + concreteClass.regularClass());
  }
}
