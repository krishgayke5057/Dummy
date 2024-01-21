abstract class Vehicle
{
	public abstract int getNoOfWheels();

	public void infoOfVehicle(){
		System.out.println("Generic Information ::");
	}
}

class Bus extends Vehicle
{
	@Override
    public int getNoOfWheels(){
		return 7;
    }

	@Override
    public void infoOfVehicle(){
		System.out.println("Invoke Vehicle---");
    }
}

class Auto extends Vehicle
{
	@Override
    public int getNoOfWheels(){
		return 3;
    }

	@Override
    public void infoOfVehicle(){
		System.out.println("Dummy Vehicle---");
    }
}


class Abstract2 
{

	public static void main(String[] args) 
	{
		Vehicle v1 = new Bus();
		v1.infoOfVehicle();
	    System.out.println("No of wheels for Bus is :: "+v1.getNoOfWheels());

        System.out.println();

		Vehicle v2 = new Auto();
		v2.infoOfVehicle();
		System.out.println("No of wheels for Bus is :: "+v2.getNoOfWheels());

	}
}
