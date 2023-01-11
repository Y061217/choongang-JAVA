package Quiz;

class HowManyCars {
	int Passengers;	
	int CarSeats;
	int howManyCars;
	int LastCarPassengers=0;
	public HowManyCars(int Passengers , int CarSeats) {
		this.Passengers = Passengers;
		this.CarSeats = CarSeats;
		if(Passengers % CarSeats ==0) {
			howManyCars = Passengers/CarSeats;
		} else {
			howManyCars = Passengers/CarSeats+1;
			LastCarPassengers = Passengers % CarSeats;
		}
		System.out.println(Passengers+"명이 이동하기 위해 필요한 "+CarSeats+"인승 차량의 대수 : "+howManyCars);
		System.out.println("마지막 차량의 탑승 인원은 : "+LastCarPassengers);
	}


}
