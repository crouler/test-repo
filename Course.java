public class Course {

    public int runDistance;
    public double jumpDistance;
    public int swimDistance;


    public Course(int runDistance, int jumpDistance, int swimDistance) {
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;
        this.swimDistance = swimDistance;
    }


    public void teamDoIt(Team team) {
        boolean result = false;
        Player [] playerArr =  team.teamPlayerArray();

        for (int i = 0; i < playerArr.length; i++) {            // проверка преодоления дистанции бега

                if (playerArr[i].run() >= runDistance) {
                    result = true;
                }

        }

            if (result){System.out.println("Все игроки пробежали дистанцию " + runDistance + " метров");}

        for (int i = 0; i < playerArr.length; i++) {

            if (playerArr[i].jump() >= jumpDistance) {
                result = true;
            }

        }

        if (result){System.out.println("Все игроки преодолели ров шириной " + jumpDistance + " метра(ов)");}

        for (int i = 0; i < playerArr.length; i++) {

            if (playerArr[i].swim() >= swimDistance) {
                result = true;
            }

        }

        if (result){System.out.println("Все игроки проплыли дистанцию " + swimDistance + " метров");}


        if (result) {
            System.out.println("Команда прошла полосу препятствий УСПЕШНО !!!");

        } else {
            System.out.println("Команда не  прошла полосу препятствий");
        }
    }

}
