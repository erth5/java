public class SLLTest {
	public static void main(String[] args) {
		SortedLinkedList sll = new SortedLinkedList();
		System.out.println(String.format("leer: %b, min: %s, max: %s", sll.isEmpty(), sll.getMin(), sll.getMax()));
		System.out.println(String.format("enthaelt 5: %b", sll.contains(5), sll.getMin(), sll.getMax()));
		System.out.println(sll.toString());
		sll.add(1);
		System.out.println(String.format("added 1; leer: %b, min: %s, max: %s", sll.isEmpty(), sll.getMin(), sll.getMax()));
		System.out.println(sll.toString());
		sll.add(4);
		System.out.println(String.format("added 4; leer: %b, min: %s, max: %s", sll.isEmpty(), sll.getMin(), sll.getMax()));
		System.out.println(sll.toString());
		sll.add(7);
		System.out.println(String.format("added 7; leer: %b, min: %s, max: %s", sll.isEmpty(), sll.getMin(), sll.getMax()));
		System.out.println(sll.toString());
		sll.add(2);
		System.out.println(String.format("added 2; leer: %b, min: %s, max: %s", sll.isEmpty(), sll.getMin(), sll.getMax()));
		System.out.println(sll.toString());
		sll.add(0);
		System.out.println(String.format("added 0; leer: %b, min: %s, max: %s", sll.isEmpty(), sll.getMin(), sll.getMax()));
		System.out.println(sll.toString());
		sll.add(5);
		System.out.println(String.format("added 5; leer: %b, min: %s, max: %s", sll.isEmpty(), sll.getMin(), sll.getMax()));
		System.out.println(sll.toString());
		System.out.println(String.format("removing min: %s", sll.removeMin()));
		System.out.println(sll.toString());
		System.out.println(String.format("removing min: %s", sll.removeMin()));
		System.out.println(sll.toString());
		System.out.println(String.format("removing min: %s", sll.removeMin()));
		System.out.println(sll.toString());
	}
}