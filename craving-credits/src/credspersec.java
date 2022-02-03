import java.util.*;

public class credspersec {
	public void crps() {
		Timer credps = new Timer();
		credps.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				util.cps = 1;
				util.credits = util.credits + util.cps;
			}

		}, 1000, 1000);
	}
}