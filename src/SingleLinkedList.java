
public class SingleLinkedList {

	private Node head;
	private int elementCount;

	public SingleLinkedList() {

		head = null;
		elementCount = 0;
	}

	// Funksjon for � se om lista er Tom.
	public boolean isEmptyList() {

		return head == null;

	}

	// Funksjon elementCount
	public int getElementCount() {

		return elementCount;
	}

	// 1: Slett f�rste element i listen
	public void Deletefirst() {

		if (head == null) {
			return;
		}
		Node currentNode = head; // peker mot hode som er f�rste node i linked list
		head = head.next; // for � kunne slette f�rste node m� head referansen fjernes p� f�rste.
		currentNode.next = null; // Setter referansen tilbake.
		elementCount--; // Den g�r ned pga at en Node blir slettet

		return;

	}

	// 2.Slett siste element i listen
	public void DeleteLast() {

		// N�r det bare er en Node i lista
		if (head.next == null) { // hvis head sin next er null
			head = null; // head blir null.
			elementCount = 0;
			return;

		}

		Node CurrentNode = head; 
		Node prevNode = null; // prevNode blir satt til null

		while (CurrentNode.next != null) { // g�r s� lenge head ikke er null

			prevNode = CurrentNode; // prevNode sin peker blir gjort om til peker i siste node
			CurrentNode = CurrentNode.next;// peker g�r til neste node

		}
		prevNode.next = null; // peker blir satt til null,
		elementCount--; // element g�r ned n�r en slettes
		return;
	}

	void DeleteList() {

		head = null; // Slett hele listen
		elementCount = 0; // nullstiller elementcount

		return;

	}

		void deleteNode(int value) {

			Node currentNode = head;
			Node prevNode = null;

			// hvis currenNode som er head holder verdien som skal bli slettet.

			if (currentNode != null && currentNode.value == value) {
				head = currentNode.next; // head er endret
				elementCount--; 
				return;
			}

			// stopper n�r begge parametere er true current node er null og value som tastes
			// inn er lik currentNode.value.

			while (currentNode != null && currentNode.value != value) {
				prevNode = currentNode; // previous blir current ;

				prevNode = currentNode.next; // pointer g�r til neste node.

				elementCount--; 
			}

			// hvis ikke value er funnet
			if (currentNode == null)
				return;

			// settes prevNode sin neste til currentNode sin neste
			prevNode.next = currentNode.next;
		
		
			elementCount--; 
		}

		
	public void deleteAllChosen(int searchValue) {
			Node currentNode = head; // current
			Node prevNode = null;

			while (currentNode != null) { // skal utf�res s� lenge CurrentNode ikke er null.

				// true
				if (currentNode.value == searchValue) { // hvis CurrentNode verdien er lik verdien som tastes inn.

					if (currentNode == head) { // condition true
						head = head.next;

					} else { // hvis ikke tempNode er head
						prevNode.next = currentNode.next;
					}

				}

				if (currentNode.value != searchValue) { // ikke lik verdien

					// g�r til neste node n�r det ikke er noe match
					prevNode = currentNode;
				}
				currentNode = currentNode.next; // linker noden
			
				elementCount--; 
			}

			return;
		}
	

	// 5.Legg til Node i starten av lista.
	public void InsertatStart(int val) {
		Node aNode = new Node(); // oppretter nyNode
		aNode.value = val;
		aNode.next = null;

		elementCount++;

		if (head == null) {
			head = aNode; // Hvis det ikke er noe i listen (Null) Blir F�rste input starten p� Lista.

		} else {

			aNode.setNext(head);// Hvis det er noe i listen, blir input satt i starten av listen

			head = aNode;

		}
	}

	// Legg til et element med oppgitt verdi i slutten av listen.

	public void insertAtEnd(int val) {

		Node aNode = new Node();// Ny node
		aNode.value = val; // Setter verdi inn i elementet
		aNode.next = null; // aNode next settes til null

		elementCount++; // �ker for hver insert

		if (head == null) { // hvis listen er tom blir aNode head
			head = aNode;
			return;
		}
		Node currentNode = head; // current node blir satt som head
		while (currentNode.next!=null) { // g�r til current sin next er null som er slutten p� lista
			currentNode = currentNode.next; // g�r til neste node
		}
		currentNode.next = aNode; // Ny Node settes inn som siste

		elementCount++; // �ker n�r en node blir satt inn
		return;
	}

	public void insertAfterVal(int afterVal, int keyNum) {

		Node currentNode = head; // Node current = head; // current peker mot head.

		while (currentNode != null) { // L�kken g�r s� lenge current ikke er null

			if (currentNode.value == afterVal) { // hvis current.verdi er lik verdien som tastes inn

				if (currentNode.next == null) { // hvis noden er sist i lista opprettes det en ny Node

					Node aNode = new Node();

					aNode.value = keyNum; // verdien som blir satt er den bruker taster inn
					aNode.next = null;// aNode.next peker til null
					currentNode.next = aNode;// current er aNode.
					
					elementCount++;
					
					break; // hopper ut av l�kken

				}
				if (currentNode.next != null) { // hvis noden ikke er siste i listen

					Node aNode = new Node();
					aNode.value = keyNum;
					aNode.next = currentNode.next; // Nye noden peker mot current sin neste
					currentNode.next = aNode; // current peker mot aNode;
					elementCount++;
					break;
				}
			} else {
				currentNode = currentNode.next; // fortsetter i listen

			}
		}
	}

	
	public void insertBeforeVal(int beforeVal, int keyNum) { // 7.Legg til et elementet foran et element med
																// oppgitt verdi.
		// (gj�res en gang)

		Node currentNode = head;
		Node prevNode = currentNode;
		int count = 0;

		while (currentNode != null) { // L�kken g�r s� lenge current ikke er null

			if (currentNode.value == beforeVal) { // hvis verdi er lik verdien som tastes inn

				if (elementCount == 1 || count == 0) {// hvis elementet er f�rst i listen

					Node aNode = new Node();// Ny node opprettes
					aNode.value = keyNum; // verdien som blir satt er den bruker taster inn
					head = aNode; // Noden blir f�rst i listen
					aNode.next = currentNode; // peker aNode.next til currentNode

					elementCount++;// elementCount �ker
				break;
				}

				if (currentNode.next == null || count == 0) { // hvis elementet er det siste i listen

					Node aNode = new Node(); // ny node opprettes
					aNode.value = keyNum; // verdien som blir satt er den bruker taster inn
					prevNode.next = aNode;// Noden blir satt som f�rst
					aNode.next = currentNode; // aNode.next peker til currentNode

					elementCount++;
					break;
				}
			}
			
			if (currentNode.next != null || count != 0) { // Hvis elementet ikke er f�rst eller sist i listen
				
				Node aNode = new Node(); // nyNode
				aNode.value = keyNum; // verdien som blir satt er den bruker taster inn
				aNode.next = currentNode; // aNode.next er currentNode
				prevNode.next = aNode; // prevNode sin neste er aNode

				elementCount++;

			
			
			} else {
				
				prevNode = currentNode;
				currentNode = currentNode.next;
				count++;
			}

		}
	}
	
	
	

	public int getCount(int key) {
		Node currentNode = head;
		int count = 0; // Startverdi p� teller
		while (currentNode != null) // g�r s� lenge head ikke er null, lista er tom
		{

			if (currentNode.value == key) // er verdien equal verdien som tastes inn av bruker
				currentNode = currentNode.next; // Fortsetter i listen
			count++; // �ker telleren
		}

		return count;

	}

	public boolean CounterisTrueFalse() {

		Node currentNode = head;
		int counter = 0;
		while (currentNode != null) // g�r s� lenge head ikke er null
		{
			counter++; // g�r gjennom listen teller antall noder s�nn at det kan sammenlignes med
						// elementcount.
			currentNode = currentNode.next;
		}

		boolean countest = true;
		if (counter == elementCount) // Sjekker om count som teller er lik elementcount
		{
			countest = true;
		} // Returnerer true om den er equal

		else {
			countest = false;
		} // False om antallet ikke er likt.
		return countest;
	}

	public boolean haveNumber(int keyNum) {
		
		// sjekker om verdien er i listen s�nn at det ikke kommer en feilmelding n�r brukeren taster en verdi som ikke finnes
		Node CurrentNode = head;
		while (CurrentNode != null) { //L�kken g�r s� lenge den ikke er null
			if (keyNum == CurrentNode.value) { // ser om verdien tastet inn er lik verdien i Listen
				return true; // returnerer true som kan sammenlignes med scan funksjonen som bruker taster inn
			}
			CurrentNode = CurrentNode.next; // Fortsetter i listen til Whilel�kken sl�r ut.
		}
		return false;
	}

	
	
	// 14.Finn og skriv ut verdien av st�rste element

	public int max() {

		int max = 0;

		if (head == null) { // Max er head verdi n�r head er null
			max = head.value;

		} else {

			// Current head er initialization hva den starter p�
			// L�kken Stopper n�r head er null.
			// Current.next peker til neste node som blir sjekket g�r mot null ??
			for (Node CurrentNode = head; CurrentNode != null; CurrentNode = CurrentNode.next) {

				// for l�kke som g�r til temp er null,

				if (CurrentNode.value > max) { // Hvis temp.value er st�rre enn head.value
					max = CurrentNode.value; // peker tmp.value til Max.

				}
			}
		}
		return max;
	}

	// 14.Finn og skriv ut verdien av minste element
	public int min() {

		int min = head.value;

		if (head == null) { // Min er head verdi n�r head er null
			min = head.value;
		} else {

			// CurrentNode.head er initialization hva den starter p�
			// L�kken Stopper n�r head er null.
			// currentNode.next peker til neste node som blir sjekket g�r mot null ??

			for (Node currentNode = head; currentNode != null; currentNode = currentNode.next) {

				// for l�kke som g�r til temp er null,

				if (currentNode.value < min) { // Hvis temp.value er st�rre enn head.value
					min = currentNode.value; // peker tmp.value til Max.

				}
			}
		}
		return min;
	}

	// 12. Skriv ut hele listen. // FUNKER

	public void displayList() { // linked list display

		if (elementCount == 0) { // Viser at listen er tom, ved bruk av elementcount.

			System.out.print("The list is Empty");
			return;
		}

		int counter = 0; // Ny teller som g�r oppover for hver node som legges inn. Brukes til linjeskift
		Node aNode = head;
		while (aNode.next != null) {
			System.out.print(aNode.value + "->");// pilene mellom nodene.
			aNode = aNode.next;
			counter++;
			// Teller for linjeskift for hver hver 5 node
			if (counter == 5) {
				System.out.println("");
				counter = 0;// Resetter Counter n�r det 5 noder som er printet. Da kommer linjeskiftet
			}
		}
		System.out.print(aNode.value);
	}
}
