import de.hamster.debugger.model.Territorium;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;public class hamsterprogramm extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    if (vornFrei()) {  // bedingte Anweisung
      vor();
      linksUm();
    }
    if (kornDa() && vornFrei()) { // Alternativanweisung
      nimm();
      vor();
    } else {
      linksUm();
    }
}}