import org.graalvm.compiler.nodes.memory.address.AddressNode;

class Employee{
    AddressNode.Address address;

    Employee(AddressNode.Address address){
        this.address=address;
    }
    public void setAddress(AddressNode.Address address){
        this.address=address;
    }

}