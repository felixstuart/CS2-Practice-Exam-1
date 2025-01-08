public class Alien {
    private int energyLevel;
    private int hostilityIndex;
    
    public Alien(int energyLevel, int hostilityIndex) {
        this.energyLevel = energyLevel;
        this.hostilityIndex = hostilityIndex;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }


    public int getHostilityIndex() {
        return hostilityIndex;
    }

    public void printInfo() {
        System.out.println(String.format("The Alien's energy level is %s and it's hostility index is %s.", energyLevel, hostilityIndex));
    }
}