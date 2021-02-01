package A_11JavaCollectorsFramework;

import java.util.PriorityQueue;

public class Ticket implements Comparable<Ticket>{
	/**
	 * Fields of our ticket
	 */
	private final int number;
	private final String name;
	private final long NIF;

	/**
	 *
	 * @param number number of priority in the line
	 * @param name of the person in the line
	 * @param NIF number of fiscal identity of the person that's in the line
	 */
	public Ticket(int number, String name, long NIF) {
		this.number = number;
		this.name = name;
		this.NIF = NIF;
	}

	/**
	 * Getters
	 * @return the different fields of the person in line
	 */
	public int getNumber() {
		return number;
	}

	public String getNome() {
		return name;
	}

	public long getNIF() {
		return NIF;
	}

	/**
	 *
	 * @param tickets a priorityQueue of tickets (TicketLine Object)
	 */
	public static void printTickets(PriorityQueue<Ticket> tickets){
		System.out.println("\n");
		for (Ticket ticket : tickets) {
			System.out.println(ticket);

		}
	}
	/**
	 *
	 * @return the information of the ticket
	 */
	@Override
	public String toString() {
		return getNome()+" |\tNIF: "+getNIF()+" |\tTicket Number: "+getNumber();
	}

	/**
	 *
	 * @param o ticket to compare this ticket to
	 * @return a positive number if this number is bigger than the other number
	 * a negative number if the other number is bigger than this ticket's number
	 * a 0 if the too tickets have the same number
	 */
	@Override
	public int compareTo(Ticket o) {
		return this.getNumber()-o.getNumber();
	}

	public static void main(String[] args) {
		//We create a priorityQueue of Tickets
		PriorityQueue<Ticket> queueTicket = new PriorityQueue<>();
		//We instantiate some tickets
		Ticket a1 = new Ticket(1,"Joao",24657365433L);
		Ticket b1 = new Ticket(1,"Petra",657687313L);
		Ticket c1 = new Ticket(2,"Fernando",85643187164L);
		Ticket d1 = new Ticket(2,"Monsanto",63618454035L);
		Ticket e1 = new Ticket(2,"Juan",351736764L);
		Ticket f1 = new Ticket(3,"Antonio",36751436L);
		Ticket g1 = new Ticket(3,"Marco",3517687153L);
		//We add the tickets to our queue
		queueTicket.add(a1);
		queueTicket.add(c1);
		queueTicket.add(f1);
		queueTicket.add(b1);
		queueTicket.add(g1);
		queueTicket.add(d1);
		queueTicket.add(e1);

		//We print the queue to see what's inside
		printTickets(queueTicket);
		// We see the first ticket in our list
		System.out.println("\n"+ queueTicket.peek());
		//We erase the first ticket in our list
		queueTicket.poll();
		// We see the first ticket in our list
		System.out.println("\n"+ queueTicket.peek());
		//We erase the first ticket in our list
		queueTicket.poll();
		// We see the first ticket in our list
		System.out.println("\n"+ queueTicket.peek());
		//We erase the first ticket in our list
		queueTicket.poll();
		// We see the first ticket in our list
		System.out.println("\n"+ queueTicket.peek());
		//We erase the first ticket in our list
		queueTicket.poll();
		// We see the first ticket in our list
		System.out.println("\n"+ queueTicket.peek());
		//We erase the first ticket in our list
		queueTicket.poll();
		// We see the first ticket in our list
		System.out.println("\n"+ queueTicket.peek());
		//We erase the first ticket in our list
		queueTicket.poll();
		// We see the first ticket in our list
		System.out.println("\n"+ queueTicket.peek());
		//We erase the first ticket in our list
		queueTicket.poll();
		// We see the first ticket in our list and realize our list doesn't have any more elements in it
		System.out.println("\n"+ queueTicket.peek());
	}
}
