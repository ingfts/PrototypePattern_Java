public class ConcretePrototype implements Prototype {

    private String prototype;

    public ConcretePrototype(String prototype) {
        this.prototype = prototype;
    }

    public String getPrototype() {
        return prototype;
    }

    @Override
    public Prototype clone() {
        // Return a new instance of ConcretePrototype with the same prototype value
        return new ConcretePrototype(this.prototype);
    }
}
