public class main {

  public static void main(String[] args) { 


    AlarmClock myClock = new AlarmClock(8, 0, "AM", 8, 5, "AM");

    for (int i = 0; i < 6; i++)

      {
    	myClock.showTime();

        for (int seconds = 0; seconds < 60; seconds++)

        {

          myClock.checkAlarm();

          myClock.tick();

        }

      }

    myClock.snooze();

 

    for (int j = 0; j < 9; j++)

    {
    	myClock.showTime();

    	for (int seconds = 0; seconds < 60; seconds++)

    	{

    		myClock.checkAlarm();

    		myClock.tick();

    	}

    }
    myClock.setRadio("1060 AM", 103);
    myClock.changeChannel("106.7 FM");
    myClock.displayRadio();
    myClock.decreaseVolume(50);
    myClock.displayRadio();
    myClock.increaseVolume(10);
    myClock.displayRadio();
    myClock.turnOffRadio();
    myClock.alarmOff();

  }

 

}
