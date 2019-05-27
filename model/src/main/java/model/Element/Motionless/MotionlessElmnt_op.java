package model.Element.Motionless;

public abstract class MotionlessElmnt_op {

	private static final Wall wall = new Wall();
	private static final Ground ground = new Ground();
	private static final Empty empty = new Empty();
	private static final Exit exit = new Exit();

	private static MotionlessElmnt[] MotionlessElmnt_op = { wall, ground, exit, empty, };

	public static MotionlessElmnt createWall() {
		return wall;
	}

	public static MotionlessElmnt createGround() {
		return ground;
	}

	public static MotionlessElmnt createExit() {
		return exit;
	}

	public static MotionlessElmnt createEmpty() {
		return empty;
	}

	public static MotionlessElmnt getFromFileSymbol(final char fileSymbol) {
		for (final MotionlessElmnt motionlessElmnt : MotionlessElmnt_op) {
			if (motionlessElmnt.getSprite().getConsoleImage() == fileSymbol) {
				return motionlessElmnt;
			}
		}
		return ground;
	}
}