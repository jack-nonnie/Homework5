
public class AlarmClock {
	private int hour;
	private int minute;
	private String period;
	private int hrAlarm;
	private int minAlarm;
	private String periodAlarm;
	private int second;
	private String station;
	private int volume;

	public AlarmClock(int a, int b, String c, int d, int e, String f) {
		this.hour = a;
		this.minute = b;
		this.period = c;
		this.hrAlarm = d;
		this.minAlarm = e;
		this.periodAlarm = f;
		this.second = 0;
	}
	public void showTime() {
		System.out.println(String.valueOf(this.hour) + ":" + String.format("%02d",this.minute) + " " + this.period);
	}
	public void tick() {
		this.second +=1;
		if(this.second == 60) {
			this.minute +=1;
			this.second = 0;
			if(this.minute == 60) {
				this.minute = 0;
				this.hour+=1;
				if(this.hour==12) {
					if(this.period =="AM") {
						this.period = "PM";
					}
					else {
						this.period = "AM";
					}
					
				}
				if(this.hour==13) {
					this.hour = 1;
				}
			}
		}
	}
	public void checkAlarm() {
		if(this.second==0 && this.hour == this.hrAlarm && this.minute==this.minAlarm && this.period==this.periodAlarm) {
			System.out.println("Buzz Buzz Buzz");
		}
	}
	public void snooze() {
		System.out.println("Snooze was pressed");
		this.minAlarm+=9;
		if(this.minAlarm/60 == 1) {
			this.minAlarm %= 60;
			this.hrAlarm ++;
			if(this.hrAlarm == 12) {
				if(this.periodAlarm == "AM") {
					this.periodAlarm = "PM";		
				}
				else {
					this.periodAlarm = "AM";
				}	
			}
			if(this.hrAlarm==13) {
				this.hrAlarm = 1;
			}
		}
	}
	public void checkAlarmTime() {
		System.out.println(this.hrAlarm);
		System.out.println(this.minAlarm);
		System.out.println(this.periodAlarm);
	}
	public void alarmOff() {
		this.hrAlarm = 0;
		this.minAlarm = 0;
		this.periodAlarm = "null";
		System.out.println("The alarm has been turned off");
	}
	public void setRadio(String a, int b) {
		this.station = a;
		this.volume = b;
		if(this.volume<0) {
			this.volume = 0;
		}
		if(this.volume>100) {
			this.volume = 100;
		}
		System.out.println("The radio has been set to channel " + this.station + " and the volume has been set to " + String.valueOf(this.volume));
	}
	public void increaseVolume(int num) {
		this.volume+=num;
		if(this.volume>100) {
			this.volume=100;
		}
		System.out.println("The volume has now been set to: " + String.valueOf(volume));
	}
	public void decreaseVolume(int num) {
		this.volume-=num;
		if(this.volume<0) {
			this.volume=0;
		}
		System.out.println("The volume has now been set to: " + String.valueOf(volume));
	}
	public void displayRadio() {
		System.out.println("The radio is playing channel " + this.station + " and is playing at a volume of " + String.valueOf(this.volume));
	}
	public void changeChannel(String chan) {
		this.station = chan;
		System.out.println("The channel has been changed to channel " + this.station);
	}
	public void turnOffRadio() {
		this.station = "null";
		this.volume =0;
		System.out.println("The radio has been turned off");
	}
}
	

