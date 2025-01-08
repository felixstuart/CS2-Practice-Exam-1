public class StarshipExplorer {

    private String alienLanguage = "Vrlnq*T xm!ow b*aF#nmpq*k^s jfy*e* *m&xlqw*e tT@br* lm*t oT%*ovnzr* oY#rwqs*y uo@L*oe^t aE!wqlm*u*r aD@rzxs* eB&vnyp Rlkzx*l W tnl@qp*e eXm*a#kyr*d aM^yplw o*e&mnbs*r eI!k*,srn* pC#txry*B cO@pb*elm Hlmpq*y P tn!*ojlwl rE#kxtm*n eF^l*cqrx tO&wtnq*e fC*!xtpm oK#xrnl nT@klpm cT@vrqp";

    private Alien[] aliens;


    public StarshipExplorer() {
        aliens = new Alien[50];

        for (int i = 0; i < 50; i++) {
            int hostilityIndex = (int) (Math.random() * 75) + 1;
            int energyLevel = (int) (Math.random() * 101);
            aliens[i] = new Alien(energyLevel, hostilityIndex);
        }
        displayAliens();
        decipher(alienLanguage);

    }

    public void displayAliens() {
        for (Alien alien : aliens) {
            alien.printInfo();
        }
    }
    public static void main(String[] args) {
        StarshipExplorer sp = new StarshipExplorer();
        System.out.println("Hello World! Good luck on your exams!");
    }

    public boolean checkEnergy() {
        for (int i = 0; i < aliens.length; i++) {
            for (int j = i+1; j < aliens.length; j++) {
                if (aliens[i].getEnergyLevel() == aliens[j].getEnergyLevel()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public String decipher(String alienLanguage) {
        String englishTranslation = "";
        while(alienLanguage.contains("*")) {
            int nextStar = alienLanguage.indexOf("*");
            englishTranslation += alienLanguage.substring(nextStar+1, nextStar+2);
            alienLanguage = alienLanguage.substring(nextStar+1);
        }
        return englishTranslation;
    }
}