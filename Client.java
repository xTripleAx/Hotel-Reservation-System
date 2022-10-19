public class Client {
  String name;
  int age;
  int id;
  static int count=0;
  
  public Client(String name,int age) {
	  this.name=name;
	  this.age=age;
	  count++;
	  this.id=count;
  } 
}