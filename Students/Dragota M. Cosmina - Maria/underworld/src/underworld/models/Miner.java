package underworld.models;

import java.util.Arrays;

import underworld.utils.Constants;
import underworld.utils.Resources;

public class Miner {
	private String name;
	private int[] backpack;
	private int backpackIndex;

	/**
	 * Note: backpackIndex is a variable in which we will store the current
	 * position in which we will be able to place some resource inside our
	 * miner's backpack array.
	 * 
	 * @param name
	 */

	public Miner(String name) { // constructor

		int[] backpack = new int[100]; // initializare cu valori by default

	}

	public String getName() {
		return this.name; // obtin numele
	}

	public void setName(String name) {// il setez
		this.name = name;
	}

	

	/**
	 * Check whether the backpack is full and, if not, generate a resource the
	 * same way you did for the sleep method. Store the value in the backpack
	 * and return it.
	 * 
	 * @return
	 */
	public int dig() {

		boolean isFull = isBackpackFull();
		int newResource;
		if (isFull == false) {
			newResource = Resources.generateResource();
			backpack[backpackIndex] = newResource;

		}
		return backpack[backpackIndex];
	}

	/**
	 * Inside this method a resource should be generated by calling the
	 * generateResource method on your Resources class. The value of the
	 * resource must be returned.
	 * 
	 * @return
	 */
	public int sleep() {

		int resourceValue = Resources.generateResource();
		return resourceValue;
	}

	/**
	 * Returns true if backpack is full and false otherwise.
	 * 
	 * @return
	 */
	private boolean isBackpackFull() {
		if (backpackIndex == (Constants.MINER_BACKPACK_SIZE - 1)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Display to console the resources stored inside the backpack array at that
	 * moment in time.
	 */
	public void showBackpack() {
		// daca e full afisez tot, daca nu e full afisez pana la backpackIndex
		boolean isFull = isBackpackFull();
		if (isFull == true) {
			System.out.println(Arrays.toString(backpack));

		} else {
			for (int i = 0; i < backpackIndex; i++) {
				System.out.println(backpack[i] + " ");
			}
			System.out.println("Number of empty slots is "
					+ getNumberOfBackpackSlots());
		}

	}

	/**
	 * As its name says, it will return the number of empty slots left in our
	 * miner's backpack. Call this method from showBackpack to also display the
	 * numbers of empty slots besides all the values stored inside the backpack.
	 */

	private int getNumberOfBackpackSlots() {

		int emptySlots = backpack.length - backpack[backpackIndex];
		return emptySlots;
	}
}
