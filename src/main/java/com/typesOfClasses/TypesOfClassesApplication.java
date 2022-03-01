package main.java.com.typesOfClasses;

import main.java.com.typesOfClasses.abstractClass.CompleteAbstractClass;
import main.java.com.typesOfClasses.concreteClass.Concrete;
import main.java.com.typesOfClasses.finalClass.Final;
import main.java.com.typesOfClasses.innerClasses.AnonymousClassExample;
import main.java.com.typesOfClasses.innerClasses.OuterClass;
import main.java.com.typesOfClasses.pojoClass.POJO;
import main.java.com.typesOfClasses.singletonClass.Singleton;
import main.java.com.typesOfClasses.staticClass.Static.StaticNestedClass;
import main.java.com.typesOfClasses.wrapperClass.WrapperClass;

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
                "Abstract class are incomplete, meant to be extended and completed by another class"));
    Concrete concreteClass = new Concrete();
    System.out.println("\n" + concreteClass.regularClass());
    System.out.println("\n" + Singleton.SingletonInstance().getSingletonString());
    POJO pojo = new POJO();
    pojo.setStringData(
        "Plain Old Java Object that have public getter and setters only, don´t required constructor");
    System.out.println("\n" + pojo.getStringData());
    OuterClass outerClass = new OuterClass();
    System.out.println(
        "\n" + "Local inner class inside a class method: " + outerClass.accessToLocalInnerClass());
    AnonymousClassExample anonymousClassExample =
        new AnonymousClassExample() {
          @Override
          public String getStringVariable() {
            return "AnonymousClass: This is a string value called from an inner class anonymous created by the object\"";
          }
        };
    System.out.println("\n" + anonymousClassExample.getStringVariable());
    WrapperClass wrapperClass = new WrapperClass();
    System.out.println(
        "\n"
            + "WrapperClass transform the int to Integer the next value: "
            + wrapperClass.POJOintToWrapperClass());
  }
}
