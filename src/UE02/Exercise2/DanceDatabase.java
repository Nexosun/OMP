package UE02.Exercise2;

public class DanceDatabase {
    public static void main(String[] args) {
    StandardDance waltz = new StandardDance();
    waltz.setBeat(Beat.ThreeQuarter);

    StandardDance tango = new StandardDance();
    tango.setBeat(Beat.FourQuarter);

    StandardDance quickstep = new StandardDance();
    quickstep.setBeat(Beat.FourQuarter);

    LatinDance chaChaCha = new LatinDance();
    chaChaCha.setBeat(Beat.FourQuarter);

    LatinDance rumba = new LatinDance();
    rumba.setBeat(Beat.FourQuarter);

    LatinDance jive = new LatinDance();
    jive.setBeat(Beat.FourQuarter);


    Figure basicMovement = new Figure("basicMovement");
    Figure naturalTurn = new Figure("naturalTurn");
    Figure spinTurn = new Figure("spinTurn");
    Figure promenade = new Figure("promenade");
    Figure chassee = new Figure("chassee");
    Figure fan = new Figure("fan");
    Figure whisk = new Figure("whisk");

    Figure[] whiskFigures = new Figure[]{promenade, chassee};
    whisk.setSequence(whiskFigures);

    Figure[] waltzFigures = new Figure[]{naturalTurn, spinTurn, whisk};
    waltz.setFigures(waltzFigures);

    Figure[] tangoFigures = new Figure[]{basicMovement, promenade};
    tango.setFigures(tangoFigures);

    Figure[] quickstepFigure = new Figure[]{basicMovement, spinTurn};

    Figure[] chaChaChaAndRumbaFigure = new Figure[]{basicMovement, fan};
    chaChaCha.setFigures(chaChaChaAndRumbaFigure);
    rumba.setFigures(chaChaChaAndRumbaFigure);

    Figure[] jiveFigure = new Figure[]{basicMovement};
    jive.setFigures(jiveFigure);
    }
}
