package øvelse17;

import java.util.ArrayList;
import java.util.Arrays;

public class Election {
    ArrayList<Candidate> candidates;

    public Election(){
        candidates = new ArrayList<>(Arrays.asList(
                new Candidate("John Bob","Bobben-John United",27),
                new Candidate("Sven-Arne","Bobben-John United",250),
                new Candidate("Smiley","Redacted",102),
                new Candidate("Chris","Nonsense",729),
                new Candidate("Kris","Nonsense",12),
                new Candidate("Lars","Nonsense",993),
                new Candidate("John Bob","Solo Cup",331)
        ));
    }

    public int getTotalVotes(){
        int total = 0;
        for (Candidate candidate: candidates) {
            total += candidate.getNumberOfVotes();
        }
        return total;
    }

    public ArrayList<Candidate> getCandidatesFromParty(String party){
        ArrayList<Candidate> candidatesInParty = new ArrayList<>();
        for (Candidate candidate: candidates) {
            if (candidate.getParty().equals(party)){
                candidatesInParty.add(candidate);
            }
        }
        return candidatesInParty;
    }
}
