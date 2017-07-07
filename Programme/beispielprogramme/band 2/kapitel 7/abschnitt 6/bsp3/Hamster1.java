import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;class Hamster1 extends Hamster {
    int gesammelteKoerner;

    Hamster1(int r, int s, int b, int k) {
        this.init(r, s, b, k);
        this.gesammelteKoerner = 0;
    }

    Hamster1() {
        this.init(0, 0, Hamster.NORD, 0);
        this.gesammelteKoerner = 0;
    }
}