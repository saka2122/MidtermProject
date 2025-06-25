public class GameMaster {//main
    public static void main(String[] args) {
        Hero abel = new Hero("アベル", 100, "銅の剣");
        Slime slimeA = new Slime("スライムA", 30);

        System.out.println("冒険が始まる…！");
        abel.showStatus();
        slimeA.showStatus();

        System.out.println("戦闘開始！");
        abel.attack(slimeA);
        slimeA.showStatus();

        slimeA.attack(abel);
        abel.showStatus();

        abel.heal();
        abel.showStatus();

        abel.attack(slimeA);
        abel.attack(slimeA);
        abel.attack(slimeA);

        System.out.println("--- 戦闘終了 ---");
        System.out.println("最終ステータス：");
        abel.showStatus();
        slimeA.showStatus();

        System.out.println(abel.name + "は生きている: " + abel.isAlive());
        System.out.println(slimeA.name + "は生きている: " + slimeA.isAlive());

        System.out.println("--- 参照の確認 ---");
        Character partyMember = abel;
        partyMember.hp -= 50;
        System.out.println("partyMember経由でHPを減らした後：");
        abel.showStatus();
    }
}

