package utils;

import main.Game;

public class Constants {
	
	public static class UI {
		public static class Buttons{
			public static final int B_WIDTH_DEFAULT= 140;
			public static final int B_HEIGHT_DEFAULT= 56;
			public static final int B_WIDTH = (int)(B_WIDTH_DEFAULT * Game.SCALE);
			public static final int B_HEIGHT = (int)(B_HEIGHT_DEFAULT * Game.SCALE);

		}
		
		public static class pauseButtons{
			public static final int SOUND_SIZE_DEFAULT = 42;
			public static final int SOUND_SIZE = (int)(SOUND_SIZE_DEFAULT * Game.SCALE);
			
		}
		
		public static class URMButtons{
			public static final int URM_DEFAULT_SIZE = 56;
			public static final int URM_SIZE = (int)(URM_DEFAULT_SIZE * Game.SCALE);
			
		}
		public static class VolumeButtons{
			public static final int VOLUME_DEFAULT_WIDTH = 28;
			public static final int VOLUME_DEFAULT_HEIGHT = 44;
			public static final int SLIDER_DEFAULT_WIDTH = 215;

			
			public static final int VOLUME_SIZE_WIDTH = (int)(VOLUME_DEFAULT_WIDTH * Game.SCALE);
			public static final int VOLUME_SIZE_HEIGTH = (int)(VOLUME_DEFAULT_HEIGHT* Game.SCALE);
			public static final int SLIDER_WIDTH = (int)(SLIDER_DEFAULT_WIDTH* Game.SCALE);

			
		}
		
	}
	
	
	public static class Directions {
		public static final int LEFT=0;
		public static final int UP=1;
		public static final int RIGHT=2;
		public static final int DOWN=3;

	}
	
public static class EntityConstants{
	
	public static class EnemyConstants{
		public static final int CRABBY = 0;
		
		public static final int IDLE=0;
		public static final int RUNNING=1;
		public static final int ATTACK=2;
		public static final int HIT=3;
		public static final int DEAD=4;
		
		public static final int CRABBY_WIDTH_DEFAULT = 72;
		public static final int CRABBY_HEIGHT_DEFAULT = 32;
		
		public static final int CRABBY_WIDTH = (int)(CRABBY_WIDTH_DEFAULT * Game.SCALE);
		public static final int CRABBY_HEIGHT = (int)(CRABBY_HEIGHT_DEFAULT * Game.SCALE);
		
			public static int getSpriteAmount(int enemy_type,int enemyAction) {
			
				
				switch(enemy_type) {
				
				case CRABBY:
					switch(enemyAction) {
					
					case RUNNING:
						return 6;
					case IDLE:
						return 9;
					case ATTACK:
						return 7;
					case HIT:
						return 4;
					case DEAD:
						return 4;
					default:
						return 9;
							
					
					}
				}
				return 0;
			}	
		
	}
	
	public static class PlayerConstants{
		public static final int IDLE = 0;
		public static final int RUNNING = 1;
		public static final int JUMP = 2;
		public static final int FALLING = 3; 
		public static final int GROUND = 4;
		public static final int HIT = 5; 
		public static final int ATTACK_1 = 6; 
		public static final int ATTACK_JUMP_1 = 7;
		public static final int ATTACK_JUMP_2 = 8; 
		
		
		public static int getSpriteAmount(int player_Action) {
			
			switch(player_Action) {
			
			case RUNNING:
				return 6;
			case IDLE:
				return 5;
			case HIT:
				return 4;
			case JUMP:
			case ATTACK_1:
			case ATTACK_JUMP_1:
			case ATTACK_JUMP_2:
				return 3;
			case GROUND:
				return 2;
			case FALLING:
			default:
				return 1;
						
				
			}
		}
	}
	
	}
}
