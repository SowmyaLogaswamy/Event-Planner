public class EventPlanning {

  private int mEventSize;
  private String mFoodsAvailable;
  private String mBeveragesServed;
  private String mMusicBandsAvailable;
  private String mAccessoriesAvailable;


public EventPlanning(int guests, String foods, String beverages, String musicbands, String accessories) {
  mEventSize = guests;
  mFoodsAvailable = foods;
  mBeveragesServed = beverages;
  mMusicBandsAvailable = musicbands;
  mAccessoriesAvailable = accessories;

}

public int getEventSize() {
  return mEventSize;
 }

  public String getFoodTypes() {
    return mFoodsAvailable;
   }


public String getBeverageTypes() {
  return mBeveragesServed;
  }
/
 public String getMusicBandTypes() {
// return mMusicBandsAvailable;
  }

}
