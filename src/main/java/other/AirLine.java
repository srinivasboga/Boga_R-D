package other;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AirLine {
	
	public static boolean isAllowed(LocalTime time, List<LocalTime> scheduled, int k) {
		for (LocalTime scheduledTime : scheduled) {
			long diff = Math.abs(Duration.between(time, scheduledTime).toMinutes());
			if (diff <= k) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int k = 3; // minimum time difference in minutes
		List<LocalTime> times = new ArrayList<>();
		List<LocalTime> scheduled = new ArrayList<>();
		
		// Add time entries
		times.add(LocalTime.of(12, 5));
		times.add(LocalTime.of(12, 2));
		times.add(LocalTime.of(12, 1));
		times.add(LocalTime.of(12, 7));
		times.add(LocalTime.of(12, 9));
		
		for (LocalTime request : times) {
			boolean allowed = isAllowed(request, scheduled, k);
			System.out.println(request + "AM - " + allowed);
			if (allowed) {
				scheduled.add(request);
			}
		}
	}
}
