package CreationalDesignPattern.BuilderExample.CarBuilderDemo;
import java.util.LinkedList;
// Builders common interface
interface IBuilder
{
    void BuildBody();
    void InsertWheels();
    void AddHeadlights();
    Product GetVehicle();
}

