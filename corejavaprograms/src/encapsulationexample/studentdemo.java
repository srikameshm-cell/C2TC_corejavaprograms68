package encapsulationexample;

public class studentdemo {

	public static void main(String[] args) {
		student s = new student();
		s.setSid(101);
		s.setSname("raja");
		s.setAvg(89.5f);
		
		System.out.println(s);
		/*
		System.out.println("student id:"+s.getSid());
		System.out.println("student Name:"+s.getSname());
		System.out.println("student Average:"+s.getAvg());
		*/
		student s1=new student();
		s1.setSid(101);;
		s1.setSname("raja");
		s1.setAvg(89.5f);
		System.out.println(s1);

	}

}
