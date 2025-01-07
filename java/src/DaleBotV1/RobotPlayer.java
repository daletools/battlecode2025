package DaleBotV1;

import battlecode.common.*;

import java.util.Random;

public class RobotPlayer {
  static int turnCount = 0;
  static final Random rng = new Random(6147);
  static final Direction[] directions = {
      Direction.NORTH,
      Direction.NORTHEAST,
      Direction.EAST,
      Direction.SOUTHEAST,
      Direction.SOUTH,
      Direction.SOUTHWEST,
      Direction.WEST,
      Direction.NORTHWEST,
  };

  public static void run(RobotController rc) throws GameActionException {
    System.out.println("I'm alive");

    while (true) {
      turnCount += 1;  // We have now been alive for one more turn!

      try {
        switch (rc.getType()) {
          case SOLDIER: {
            runSoldier(rc);
          }
          case MOPPER: {
            runMopper(rc);
          }
          case SPLASHER: {
            runSplasher(rc);
          }
          default: {
            runTower(rc);
          }
        }
      } catch (GameActionException e) {
          System.out.println("GameActionException");
          e.printStackTrace();

        } catch (Exception e) {
          System.out.println("Exception");
          e.printStackTrace();

        } finally {
          Clock.yield();
        }
    }
  }

  private static void runTower(RobotController rc) {
  }

  private static void runSplasher(RobotController rc) {

  }

  private static void runMopper(RobotController rc) {
  }

  private static void runSoldier(RobotController rc) throws GameActionException {

  }
}
