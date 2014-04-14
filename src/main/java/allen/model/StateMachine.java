package allen.model;

import java.util.ArrayList;
import java.util.List;

public class StateMachine {

	private static List<StateListener> listeners = new ArrayList<StateListener>();

	/**
	 * ע���������
	 * */
	public static void register(StateListener listener) {
		listeners.add(listener);
	}

	/**
	 * ����������
	 * */
	public static void takeAction(Action action) {
		for (StateListener listener : listeners) {
			listener.update(action);
		}
	}
}
