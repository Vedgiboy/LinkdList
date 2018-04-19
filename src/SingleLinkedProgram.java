import java.util.Scanner;

public class SingleLinkedProgram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		SingleLinkedList myList = new SingleLinkedList(); // Listen opprettes

		int choice = 0;
		
		System.out.println("Single linked list program"+"\n");
		
		do { // Start på do while løkken.

			try {// start på try catch
			      String menu = "Please select an option to perform" 
			    		 +	"\n (1) Delete first Node in linkedlist."
			    		 +	"\n (2) Delete last Node in linkedlist." 
			    		 +	"\n (3) Delete  occuring node one time from list"
			    		 +	"\n (4) Delte all occuring nodes in list"
			    		 +  "\n (5) Insert element at the begining."
			    		 +  "\n (6) Insert element at the end" 	
			    		 +  "\n (7) Insert node after choosen Node" 
			    		 +  "\n (8) Insert node before choosen Node" 
			 	         +  "\n (9) Count number of elements in linkedlist "
			    		 +	"\n (10) Test elementcount " 
			    		 +	"\n (11) Counts the number of times  element occurs in list" 
			    		 +  "\n (12) Print linkedList " 
			    		 +  "\n (13) Delete all elements in linkedlist."
			 	         +  "\n (14) Show max value in linkedlist " 
			 	         +  "\n (15) Show min value in linkedlist "
			 	         +  "\n (0) Exit Program";
			      		
				// Meny som switch bruker

				System.out.println(menu);

				choice = scan.nextInt(); // Input fra bruker

				switch (choice) { // Switch for å velge mellom de fem alternativene i menyen

				case 1:// Sletter første element Listen
					if (myList.getElementCount() == 0) // Hvis listen er tom feilmelding
														// Sjekker elementcount
					{
						System.out.println("Nothing to Delete \n");
					} else {
						myList.Deletefirst();
					}
					break;

				case 2:// Sletter siste element i Listen
					if (myList.getElementCount() == 0) // Gir beskjed om at listen er tom.

					{
						System.out.println("The list i empty");
					} else {
						myList.DeleteLast();
					}
					break;

				case 3:// Slett et valgt element (første forekomst)

					if (myList.getElementCount() == 0) // Hvis listen er tom feilmelding
					// Sjekker elementcount
					{
						System.out.println("The list is empty \n");

					} else {

						System.out.println("What value do you want to delete?");

						Scanner input3 = new Scanner(System.in);

						int KeyVal = input3.nextInt();

						if (myList.haveNumber(KeyVal) == false) // sjekker om tallet er i listen, hvis ikke gir en
																// feilmelding

							System.out.println("The number is not in the list");

						else {
							myList.deleteNode(KeyVal); // Node med valgt verdi slettes.

						}
					}
					break;

				case 4: // Slett alle forekomster av et valgt element.

					if (myList.getElementCount() == 0) // Hvis listen er tom feilmelding
					// Sjekker elementcount
					{
						System.out.println("The list is empty \n");

					} else {

						System.out.println("What value do you want to delete?");

						Scanner input4 = new Scanner(System.in);

						int KeyVal = input4.nextInt();

						if (myList.haveNumber(KeyVal) == false) // sjekker om tallet er i listen, hvis ikke gir en
																// feilmelding

							System.out.println("The number is not in the list");

						else {
							myList.deleteAllChosen(KeyVal); // Alle like Noder med valgt verdi slettes

						}
					}
					break;

				case 5: // Sette inn et element i starten av listen.
					System.out.println("Enter a value  to insert at the beginning");
					myList.InsertatStart(scan.nextInt()); //
					break;

				case 6:// Sett inn et element på slutten av listen,
					System.out.print("Enter a value to insert at the end");
					myList.insertAtEnd(scan.nextInt());
					break;

				case 7: // Sett inn element etter et element med opgitt verdi

					if (myList.getElementCount() == 0) // Hvis listen er tom feilmelding

					{
						System.out.println("The list is empty \n");

					} else {

						System.out.println("What value  would you like to insert a Node after?");

						Scanner input4 = new Scanner(System.in);

						int KeyVal = input4.nextInt();

						if (myList.haveNumber(KeyVal) == false) // sjekker om tallet er i listen, hvis ikke gir en
																// feilmelding

							System.out.println("The number is not in the list");

						else {
							Scanner input5 = new Scanner(System.in);

							int KeyVal2 = input4.nextInt();

							myList.insertAfterVal(KeyVal, KeyVal2); // Alle like Noder med valgt verdi slettes

						}
					}

					break;

				case 8:// Legg til et element før et opgitt element

					if (myList.getElementCount() == 0) // Hvis listen er tom feilmelding

					{
						System.out.println("The list is empty \n");

					} else {

						System.out.println("Choose a Node (from value)");

						Scanner input5 = new Scanner(System.in);

						int KeyVal = input5.nextInt();

						if (myList.haveNumber(KeyVal) == false) 
							System.out.println("The number is not in the list");

						else {
							System.out.println("What value  would you like to insert  before the Node ?");
							Scanner input6 = new Scanner(System.in);

							int KeyVal2 = input6.nextInt();

							myList.insertBeforeVal(KeyVal, KeyVal2); // Alle like Noder med valgt verdi slettes

						}
					}
					break;

				case 9:// 9.Antall elementer i liste
					System.out.println("Number of Nodes in Singly linked list =" + myList.getElementCount() + "\n");
					break;

				case 10:
					System.out.println(" ElementCount test = " + myList.CounterisTrueFalse());
					
					break;

				case 11: // Antall forekomster av et element i listen
					System.out.print(myList.getCount(scan.nextInt()));
					break;

				case 12:// 13 Vise liste
					myList.displayList(); // Viser list.
					System.out.println("\n");
					break;

				case 13:// Slette alle elementer// hvise hvor mange i listen
					System.out.println("Number of elements delited = " + myList.getElementCount() + "\n");
					myList.DeleteList(); // Skriver ut antall elementer før de blir slettet.
					break;

				case 14: // Max.value list
					
					if (myList.getElementCount() == 0) // Hvis listen er tom feilmelding

					{
						System.out.println("The list is empty \n");

					} else {

					
					System.out.println(myList.max());
					}
					break;

				case 15:// 15.Min value list
			
					if (myList.getElementCount() == 0) // Hvis listen er tom feilmelding

					{
						System.out.println("The list is empty \n");

					} else {

					System.out.println(myList.min());
					}
					break;
				
				
				default:
				
					if (choice == 0) {
						System.out.println("You have exited program. Goodbye"); // if settning for at riktig println
																				// skal
																				// skrives ut i forhold til hvilket tall
																				// bruker taster inn.
					} else {
						System.out.println("Choose a number in the option menu \n");
					}
				}
			} catch (Exception e) {
				System.out.println("Enter integers only" + "\n");
				choice = scan.next().charAt(0); // Bruker en try catch funksjon for å fange
				// opp hvis bruker taster inn en bokstav istendefor et tall.
				// charAt(0) fanger opp første bokstaven/ string fra scanner.Gir bruker
				// feilmelding om at Integers må tastes inn.

			}
		} while (choice != 0); // Do While løkke som går så lenge bruker ikke taster inn 0.

	}
}
