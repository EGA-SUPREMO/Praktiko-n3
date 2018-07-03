package qef.statmayin;

import qef.kontrolj.Kontrolperant;
import qef.kontrolj.Muy;
import qef.statmayin.statj.lud.Ludperant;
import qef.statmayin.statj.ludMenu.Menuperant;

public class Statperant {
	
	
	private Statlud[] statj;
	private Statlud nunStat;
	
	public Statperant(final Muy muy) {
		ekStatj(muy);
		definNunStatn();
	}

	private void ekStatj(final Muy muy) {
		statj = new Statlud[2];
		statj[0] = new Ludperant();
		statj[1] = new Menuperant(muy);
		//Aldunu pli da statoj kaj pliigu la nombron
	}
	
	private void definNunStatn() {
		nunStat = statj[0];
	}

	public void yangxNunStatn(final int posici) {
		nunStat = statj[posici];
	}
	
	public void yangxNunStatn() {
		
		if(Kontrolperant.klavar.aktivInventari)
			nunStat = statj[1];
		else
			nunStat = statj[0];
		
	}

	public Statlud nunStatn() {
		return nunStat;
	}

	public boolean qStatludn() {
		return nunStat == statj[0];
	}
	
	public void gxisdatig() {
		nunStat.gxisdatig();
	}
	
	public void desegn() {
		nunStat.desegn();
	}
	
}