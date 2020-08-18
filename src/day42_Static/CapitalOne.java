package day42_Static;

public class CapitalOne {

    public static void main(String[] args) {

        Tester[] testers = {new Tester(), new Tester(), new Tester()};
        testers[0].setInfo("Ryosuke", 'M', 11945L, "Test Lead", 175000);
        testers[1].setInfo("Achala", 'F', 16688L, "Tester", 150000);
        testers[2].setInfo("Anapa", 'M', 75463L, "Tester", 155000);

        Developer[] developers = {new Developer(), new Developer(), new Developer(), new Developer(), new Developer()};
        developers[0].setInfo("Ullr", 'M', 70045L, "Developer Lead", 225000);
        developers[1].setInfo("Freja", 'F', 22345L, "Developer", 200000);
        developers[2].setInfo("Ruby", 'F', 74645L, "Developer", 195000);
        developers[3].setInfo("Rama", 'M', 12345L, "Developer", 195000);
        developers[4].setInfo("Lucius", 'M', 02205L, "Developer", 250000);

        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("Doki", "Hachiman", "Osama");
        team1.addTester(testers);
        team1.addDeveloper(developers);
        team1.removeTester(75463L);
        team1.removeDeveloper(74645L);
        team1.removeDeveloper(02205L);
        System.out.println(team1);

        System.out.println("================================");

        for(Tester each : team1.testers){
            System.out.println(each.name + ": $" + each.salary);
        }

        System.out.println("=================================");

        for(Developer each : team1.developers){
            System.out.println(each.name + ": $" + each.salary);
        }

        Developer developers1 = new Developer();
        developers1.setInfo("Yamata", 'F', 22075L, "Developer", 195000);
        team1.addDeveloper(developers1);

        System.out.println(team1);

    }
}
