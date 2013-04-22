package design.adapter;

/**
 * @Description: code come from java design-patterns
 */
public class DuckTest {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		
		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The turkey says ....");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says ....");
		testDuck(duck);
		
		System.out.println("\nThe turkeyAdapter says ...");
		testDuck(turkeyAdapter);
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
