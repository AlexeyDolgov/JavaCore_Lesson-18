package ua.lviv.lgs.task18;

public class Main {

	public static void main(String[] args) {

		MyMap<Integer, Integers> newMap = new MyMap<>(11, new Integers("2"));
		
		newMap.addNewEntry(22, new Integers("3"));
		newMap.addNewEntry(33, new Integers("4"));
		newMap.viewMap();
		newMap.removeEntry(11);
		newMap.viewMap();
		newMap.removeValue(22);
		newMap.viewKeysSet();
		newMap.viewValuesList();
		newMap.viewMap();
		
		MyMap<String, Integer> newMap1 = new MyMap<>("2", 11);

		newMap1.addNewEntry("3", 22);
		newMap1.addNewEntry("4", 33);
		newMap1.viewMap();
		newMap1.removeEntry("2");
		newMap1.viewMap();
		newMap1.removeValue("3");
		newMap1.viewKeysSet();
		newMap1.viewValuesList();
		newMap1.viewMap();

	}

	public static class Integers {
		String integer;

		public Integers(String integer) {
			this.integer = integer;
		}

		public String getInteger() {
			return integer;
		}

		public void setInteger(String integer) {
			this.integer = integer;
		}

		@Override
		public String toString() {
			return integer;
		}

	}
}
