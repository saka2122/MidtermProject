public abstract class Character implements Creature {//HeroとSlimeクラスの親クラス。
    protected String name;
    protected int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public final boolean isAlive() {//生きているかの判断
        return hp > 0;
    }

    public void showStatus() {//キャラの状態を表示
        System.out.println(name + "：HP " + hp);
    }


}
