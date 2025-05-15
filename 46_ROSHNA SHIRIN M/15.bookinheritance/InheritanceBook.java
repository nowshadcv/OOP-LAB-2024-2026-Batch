package MODULE2;
import java.util.Scanner;
class Publisher{
	String publisher;
	Publisher(String publi){
		this.publisher=publi;}}
class Book{
String name;
Publisher publisher;
Book(){}
public Book(String name,Publisher publisher) {
	this.name=name;
	this.publisher=publisher;}}
class Literature extends Book{
	String Lit_type="Literature";
	Literature(String name,Publisher publisher){
		super(name,publisher);}
	void display() {
		System.out.println("name:"+super.name);
		System.out.println("type:"+this.Lit_type);
		System.out.println("publisher"+this.publisher.publisher);
	}
	
	}
class fiction extends Book{
	String Lit_type="fiction";
	fiction(String name,Publisher publisher){
		super(name,publisher);}
	void display() {
		System.out.println("name:"+super.name);
		System.out.println("type:"+this.Lit_type);
		System.out.println("publisher:"+this.publisher.publisher);}}
public class InheritanceBook{
	public static void main(String  [] args){
		Publisher lp=new Publisher("s.CHAND");
		Literature L=new Literature("AS YOU LIKE IT",lp);
		L.display();
		Publisher fp=new Publisher("tata mcgraw hill");
		fiction f=new fiction("tempest",fp);
		f.display();}}
		
	
