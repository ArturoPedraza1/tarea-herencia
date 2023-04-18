import ico.fes.vehiculo;
import ico.fes.automovil;
import ico.fes.taxi;
public class Main {
    public static void main(String[] args) {
        vehiculo vehi = new vehiculo("chevrolet","Pickups","Grande");
        System.out.println(vehi);
        vehi.encendido();
        vehi.avanzando();
        automovil auto = new automovil("chevrolet","pickup","Grande","4 personas","transporte","Goodyear");
        System.out.println(auto);
        auto.disponible();
        auto.apagado();
        taxi taxi = new taxi("chevrolet","pickup","Grande","4 personas","transporte","Goodyear","Javier","De 8am a 6pm","De Cuautitlan a Ecatepec");
        System.out.println(taxi);
        taxi.chambeando();
        taxi.ocupado();
    }
}