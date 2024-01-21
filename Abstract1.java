abstract class Plane
{
    public abstract void takeOff();

	public abstract void fly();

	public abstract void land();

	public abstract void carry();

}

final class Cargo extends Plane
{
	@Override
	public void takeOff(){
		System.out.println("Cargo Plane takeOff");
	}

	@Override
	public  void fly(){
		System.out.println("Cargo Plane fly");
	}

	@Override
	public  void land(){
		System.out.println("Cargo Plane land");
	}

    @Override
	public  void carry(){
		System.out.println("Cargo Plane will carry");
	}

}





final class Books extends Plane
{
	@Override
	public void takeOff(){
		System.out.println("Books Plane takeOff");
	}

	@Override
	public  void fly(){
		System.out.println("Books Plane fly");
	}

	@Override
	public  void land(){
		System.out.println("Books Plane land");
	}

    @Override
	public  void carry(){
		System.out.println("Books Plane will book");
	}
}





final class Helper extends Plane
{
	@Override
	public void takeOff(){
		System.out.println("Helper Plane takeOff");
	}

	@Override
	public  void fly(){
		System.out.println("Helper Plane fly");
	}

	@Override
	public  void land(){
		System.out.println("Helper Plane land");
	}

    @Override
	public  void carry(){
		System.out.println("helper Plane will Help in rurel Area");
	}
}





final class Passenger extends Plane
{
	@Override
	public void takeOff(){
		System.out.println("Passenger Plane takeOff");
	}

	@Override
	public  void fly(){
		System.out.println("Passenger Plane fly");
	}

	@Override
	public  void land(){
		System.out.println("Passenger Plane land");
	}

    @Override
	public  void carry(){
		System.out.println("Passenger Plane will help to travel to Passenger");
	}
}


final class Forest
{
	public void allowPlane(Plane ref){
		System.out.println("Working  With the Object name ::"+ ref.getClass().getName());
		ref.takeOff();
		ref.fly();
		ref.land();
		ref.carry();
		System.out.println();

	}
}



class Abstract1 
{
	public static void main(String[] args) 
	{
		Cargo c = new Cargo();
		Books b = new Books();
		Helper h = new Helper();
		Passenger p = new Passenger();

		Forest f =  new Forest();
		f.allowPlane(c);
		f.allowPlane(b);
		f.allowPlane(h);
		f.allowPlane(p);
	}
}
