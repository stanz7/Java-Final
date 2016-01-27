public class Chapter {
    
    public ChapterIntro intro;
    public DecisionPoint[] decisions = new DecisionPoint[3];
    public int moralityChange;
    
    public Chapter( ChapterIntro chapIntro, DecisionPoint decision1, DecisionPoint decision2, DecisionPoint decision3 ) {
        intro = chapIntro;
    
        decisions[0] = decision1;
        decisions[1] = decision2;
        decisions[2] = decision3;
    }
    
    public int getChapterAndMoralityChange() {
        moralityChange += decisions[0].makeDecision();
        moralityChange += decisions[1].makeDecision();
        moralityChange += decisions[2].makeDecision();
        return moralityChange;
    }
    
}