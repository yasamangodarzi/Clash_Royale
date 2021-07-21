package Game;

import java.util.ArrayList;

public class Level {
    public void SetCard(ArrayList<Card>card, int level) {
        for (Card c : card) {
            if (c instanceof Barbarians) {
                switch (level) {
                    case 1: {
                        c.setHP(300);
                        c.setDamage(75);
                        break;
                    }
                    case 2: {
                        c.setHP(330);
                        c.setDamage(82);
                        break;
                    }
                    case 3: {
                        c.setHP(363);
                        c.setDamage(90);
                        break;
                    }
                    case 4: {
                        c.setHP(438);
                        c.setDamage(99);
                        break;
                    }
                    case 5: {
                        c.setHP(480);
                        c.setDamage(109);
                        break;
                    }
                }
            }
            if (c instanceof Archer) {
                switch (level) {
                    case 1: {
                        c.setHP(125);
                        c.setDamage(33);
                        break;
                    }
                    case 2: {
                        c.setHP(127);
                        c.setDamage(44);
                        break;
                    }
                    case 3: {
                        c.setHP(151);
                        c.setDamage(48);
                        break;
                    }
                    case 4: {
                        c.setHP(166);
                        c.setDamage(53);
                        break;
                    }
                    case 5: {
                        c.setHP(182);
                        c.setDamage(58);
                        break;
                    }

                }
            }
            if (c instanceof BabyDragon) {
                switch (level) {
                    case 1: {
                        c.setHP(800);
                        c.setDamage(100);
                        break;
                    }
                    case 2: {
                        c.setHP(880);
                        c.setDamage(110);
                        break;
                    }
                    case 3: {
                        c.setHP(968);
                        c.setDamage(121);
                        break;
                    }
                    case 4: {
                        c.setHP(1064);
                        c.setDamage(133);
                        break;
                    }
                    case 5: {
                        c.setHP(1168);
                        c.setDamage(146);
                        break;
                    }

                }
            }
            if (c instanceof Wizard) {
                switch (level) {
                    case 1: {
                        c.setHP(340);
                        c.setDamage(130);
                        break;
                    }
                    case 2: {
                        c.setHP(374);
                        c.setDamage(143);
                        break;
                    }
                    case 3: {
                        c.setHP(411);
                        c.setDamage(157);
                        break;
                    }
                    case 4: {
                        c.setHP(452);
                        c.setDamage(172);
                        break;
                    }
                    case 5: {
                        c.setHP(496);
                        c.setDamage(189);
                        break;
                    }

                }
            }
            if (c instanceof Giant) {
                switch (level) {
                    case 1: {
                        c.setHP(2000);
                        c.setDamage(126);
                        break;
                    }
                    case 2: {
                        c.setHP(2200);
                        c.setDamage(138);
                        break;
                    }
                    case 3: {
                        c.setHP(2420);
                        c.setDamage(152);
                        break;
                    }
                    case 4: {
                        c.setHP(2660);
                        c.setDamage(167);
                        break;
                    }
                    case 5: {
                        c.setHP(2920);
                        c.setDamage(183);
                        break;
                    }

                }
            }
            if (c instanceof Valkyrie) {
                switch (level) {
                    case 1: {
                        c.setHP(880);
                        c.setDamage(120);
                        break;
                    }
                    case 2: {
                        c.setHP(968);
                        c.setDamage(132);
                        break;
                    }
                    case 3: {
                        c.setHP(1064);
                        c.setDamage(145);
                        break;
                    }
                    case 4: {
                        c.setHP(1170);
                        c.setDamage(159);
                        break;
                    }
                    case 5: {
                        c.setHP(1284);
                        c.setDamage(175);
                        break;
                    }

                }
            }
            if (c instanceof PEKKA) {
                switch (level) {
                    case 1: {
                        c.setHP(600);
                        c.setDamage(325);
                        break;
                    }
                    case 2: {
                        c.setHP(660);
                        c.setDamage(357);
                        break;
                    }
                    case 3: {
                        c.setHP(726);
                        c.setDamage(393);
                        break;
                    }
                    case 4: {
                        c.setHP(798);
                        c.setDamage(432);
                        break;
                    }
                    case 5: {
                        c.setHP(874);
                        c.setDamage(474);
                        break;
                    }

                }
            }
            if (c instanceof Cannon) {
                switch (level) {
                    case 1: {
                        c.setHP(380);
                        c.setDamage(60);
                        break;
                    }
                    case 2: {
                        c.setHP(418);
                        c.setDamage(66);
                        break;
                    }
                    case 3: {
                        c.setHP(459);
                        c.setDamage(72);
                        break;
                    }
                    case 4: {
                        c.setHP(505);
                        c.setDamage(79);
                        break;
                    }
                    case 5: {
                        c.setHP(554);
                        c.setDamage(87);
                        break;
                    }

                }
            }
            if (c instanceof InfernoTower) {
                switch (level) {
                    case 1: {
                        c.setHP(800);
                        c.setDamage(20);
                        ((InfernoTower) c).setHighDamage(400);
                        break;
                    }
                    case 2: {
                        c.setHP(880);
                        c.setDamage(22);
                        ((InfernoTower) c).setHighDamage(440);
                        break;
                    }
                    case 3: {
                        c.setHP(968);
                        c.setDamage(24);
                        ((InfernoTower) c).setHighDamage(484);
                        break;
                    }
                    case 4: {
                        c.setHP(1064);
                        c.setDamage(26);
                        ((InfernoTower) c).setHighDamage(532);
                        break;
                    }
                    case 5: {
                        c.setHP(1168);
                        c.setDamage(29);
                        ((InfernoTower) c).setHighDamage(584);
                        break;
                    }

                }
            }

        }
    }
    public void SetTower(ArrayList<Tower>towers, int level) {
        for (Tower t : towers) {
            if (t instanceof KingTower) {
                switch (level) {
                    case 1: {
                        t.setHP(2400);
                        t.setDamage(50);
                        break;
                    }
                    case 2: {
                        t.setHP(2568);
                        t.setDamage(53);
                        break;
                    }
                    case 3: {
                        t.setHP(2736);
                        t.setDamage(57);
                        break;
                    }
                    case 4: {
                        t.setHP(2904);
                        t.setDamage(60);
                        break;
                    }
                    case 5: {
                        t.setHP(3096);
                        t.setDamage(64);
                        break;
                    }
                }
            }
            if (t instanceof  PrincessTower) {
                switch (level) {
                    case 1: {
                        t.setHP(1400);
                        t.setDamage(50);
                        break;
                    }
                    case 2: {
                        t.setHP(1512);
                        t.setDamage(54);
                        break;
                    }
                    case 3: {
                        t.setHP(1624);
                        t.setDamage(58);
                        break;
                    }
                    case 4: {
                        t.setHP(1750);
                        t.setDamage(62);
                        break;
                    }
                    case 5: {
                        t.setHP(1890);
                        t.setDamage(69);
                        break;
                    }

                }
            }


        }
    }
}
