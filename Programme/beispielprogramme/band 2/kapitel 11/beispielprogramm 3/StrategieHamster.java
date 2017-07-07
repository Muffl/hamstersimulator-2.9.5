import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;class StrategieHamster extends SpielHamster {
    StrategieHamster(int r, int s, int b, int k, int anzahl) {
        super(r, s, b, k, anzahl);
    }

    // ueberschreiben der Methode friss
    int friss(int gegnerAnzahl) {
        this.koernerAnzahl = this.koernerAnzahl - gegnerAnzahl;
        // laufe wieder bis zum Anfang der Koernerreihe
        for (int i = 0; i < gegnerAnzahl; i++) {
            this.vor();
        }

        if (this.koernerAnzahl % 3 == 2) {
            this.vor();
            this.nimm();
            this.vor();
            this.nimm();
            this.koernerAnzahl = this.koernerAnzahl - 2;
            return 2;
        } else {
            this.vor();
            this.nimm();
            this.koernerAnzahl = this.koernerAnzahl - 1;
            return 1;
        }
    }
}