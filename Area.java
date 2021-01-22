class Rectangle1{
	int w;
	int l;
	void insertinfo(int a,int b){

    w=a;
    l=b;

	}
	void displayinfo(){

	System.out.println(" area  =    "+w*l);
	}
	public static void main(String[]args){
	Rectangle A1=new Rectangle();
	Rectangle A2=new Rectangle();
	A1.insertinfo(2,4);
	A2.insertinfo(3,4);
	A1.displayinfo();
	A2.displayinfo();
}
}



