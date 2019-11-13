public class SortedLinkedList {

	private ComparableListElement first;

	public SortedLinkedList() {
		first = null;
	}
	public boolean isEmpty() {
		return first == null;
	}
	public void add(Comparable data) {

		// wenn Liste leer
		if (isEmpty()) {
			first = new ComparableListElement(data, null);
		} else {

			// wenn neues Element kleiner als erstes Element
			if (first.data.compareTo(data) > 0) {
				first = new ComparableListElement(data, first);
			} else {
				ComparableListElement element = first;
				ComparableListElement before = first;

				// solange momentanes Element kleiner ist als das neue Element
				while (element != null && element.data.compareTo(data) < 0) {
					before = element;
					element = element.next;
				}

				// setze den Nachfolger des letzten Elements auf ein neues Element, das das momentane Element als Nachfolger hat
				before.next = new ComparableListElement(data, element);
			}
		}
	}
	
	public Comparable getMin() {
		if (isEmpty()) {
			return null;
		} else {
			return first.data;
		}
	}
	
	public Comparable getMax() {
		if (isEmpty()) {
			return null;
		} else {
			ComparableListElement element = first;
			while (element.next != null) {
				element = element.next;
			}
			return element.data;
		}			
	}
	
	public Comparable removeMin() {
		if (isEmpty()) {
			return null;
		} else {
			ComparableListElement element = first;
			first = first.next;
			return element.data;
		}
	}
	
	public boolean contains(Comparable data) {
		if (isEmpty()) {
			return false;
		} else {
			ComparableListElement element = first;
			while (element.next != null) {
				if (element.data.compareTo(data) == 0) {
					return true;
				}
				element = element.next;
			}
			return false;
		}
	}

	public String toString() {
		if (isEmpty()) {
			return "";
		} else {
			StringBuilder sb = new StringBuilder(first.data.toString());
			ComparableListElement element = first;
			while (element.next != null) {
				sb.append(" -> ");
				element = element.next;
				sb.append(element.data.toString());
			}
			return sb.toString();
		}
	}
}


class ComparableListElement {
	Comparable data;
	ComparableListElement next;
	
	ComparableListElement(Comparable data, ComparableListElement next) {
		this.data = data;
		this.next = next;
	}
}