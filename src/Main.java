public class Main {
    public static void main(String[] args) {
        Character[] c = new Character[3];
        c[0] = new Hero();
        c[0].name = "勇者";

        c[1] = new Wizard();
        c[1].name = "魔法使い";

        c[2] = new Thief();
        c[2].name = "盗賊";

        Monster[] monsters = new Monster[3];
        monsters[0] = new Matango();

        monsters[1] = new Goblin();

        monsters[2] = new Slime();
        //for文が動くようにコードを書き加える

        for (Character member : c) {
            for (Monster m : monsters) {
                member.attack(m);
            }
        }
    }
}
