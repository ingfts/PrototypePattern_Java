public class Main {

    public static void main(String[] args) {
      ConcretePrototype doorPrototype = new ConcretePrototype("door");
      ConcretePrototype windowPrototype = new ConcretePrototype("window");

      PrototypeFactory factory = new PrototypeFactory();


      factory.addPrototype("door", doorPrototype );
      factory.addPrototype("window", windowPrototype);


      Prototype clonedPrototype1 = factory.getPrototype("door");
      Prototype clonedPrototype2 = factory.getPrototype("window");

        System.out.println("Cloned Prototype 1 Property: " + ((ConcretePrototype) clonedPrototype1).getPrototype());
        System.out.println("Cloned Prototype 2 Property: " + ((ConcretePrototype) clonedPrototype2).getPrototype());

    }
}
