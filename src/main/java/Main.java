import øvelse13.Julegave;
import øvelse14.Image;
import øvelse16.ExamQuestion;
import øvelse17.Election;
import øvelse17.Candidate;
import øvelse18.Audio;
import øvelse18.Media;
import øvelse18.Video;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------Øvelse13----------");

        for (int i = 0; i < 6; i++) {
            Julegave gave = new Julegave();
            System.out.println("Is gave-" + (i + 1) + " lego? " + gave.couldBeLego());
        }

        System.out.println("\n----------Øvelse14----------");

        Image img1 = new Image("noods.png",800,200);
        System.out.println(img1);
        System.out.println("Is filetype known? "+img1.isKnownFileType());
        System.out.println("Is it landscape? "+img1.isLandscape());
        System.out.println("Is it portrait? "+img1.isPortrait());
        Image img2 = new Image("classy-stuff.spunk",200,800);
        System.out.println(img2);
        System.out.println("Is filetype known? "+img2.isKnownFileType());
        System.out.println("Is it landscape? "+img2.isLandscape());
        System.out.println("Is it portrait? "+img2.isPortrait());

        System.out.println("\n----------Øvelse16----------");

        ExamQuestion[] examQuestions = new ExamQuestion[14];
        for (int i = 0; i < examQuestions.length; i++) {
            examQuestions[i] = new ExamQuestion(i+1);
            System.out.println("This is question "+examQuestions[i].getNumber()+
                    ": with grade "+examQuestions[i].getGrade());
        }

        System.out.println("\n----------Øvelse17----------");

        Election election = new Election();
        System.out.println("Out of all the candidates, the total number of votes are: "
                +election.getTotalVotes());
        System.out.println("All the candidates in party: 'Nonsense'");
        for (Candidate candidate : election.getCandidatesFromParty("Nonsense")) {
            System.out.println(candidate);
        }

        System.out.println("\n----------Øvelse18----------");

        ArrayList<Media> mediaList = new ArrayList<>(Arrays.asList(
                new Audio("Song 1",182,5.23),
                new Video("Video 1",182,"16:9"),
                new Audio("Song 2",123,3.92),
                new Video("Video 2",123,"4:6"),
                new Audio("Song 3",392,8.01),
                new Video("Video 3",392,"1920:1080")
        ));

        for (Media media: mediaList) {
            System.out.println(media);
        }
    }
}
