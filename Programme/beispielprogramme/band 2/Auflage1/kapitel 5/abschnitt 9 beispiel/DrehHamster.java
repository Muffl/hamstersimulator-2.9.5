import de.hamster.debugger.model.Territorium;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.debugger.model.Hamster;class DrehHamster extends Hamster {
    void kehrt() {
      this.linksUm();
      this.linksUm();
    }

    void rechtsUm() {
      this.kehrt();
      this.linksUm();
    }
}