public class EventPlanning {

  private int mEventSize;
  private String mFoodsAvailable;
  private String mBeveragesServed;
  private String mMusicBandsAvailable;
  private String mAccessoriesAvailable;

////////Create Constructor
public EventPlanning(int guests, String foods, String beverages, String musicbands, String accessories) {
  mEventSize = guests;
  mFoodsAvailable = foods;
  mBeveragesServed = beverages;
  mMusicBandsAvailable = musicbands;
  mAccessoriesAvailable = accessories;

}
/////////// Create Custom methods for all properties
public int getEventSize() {
  return mEventSize;
 }

  public String getFoodTypes() {
    return mFoodsAvailable;
   }


public String getBeverageTypes() {
  return mBeveragesServed;
  }

 public String getMusicBandTypes() {
 return mMusicBandsAvailable;
  }

  public String getAccessoriesAvailable() {
  return mAccessoriesAvailable;
  }
/////////////Create Method to Calculate Costs of Food and Beverages
  public int calculateFoodPrice() {
    int total = 0;
    if (mFoodsAvailable.equals("grand")){
      if (mEventSize <= 50) {
        total = mEventSize * 50;
        return total;
      } else if (mEventSize > 50 && mEventSize <= 100) {
        total = mEventSize * 45;
        return total;
       }
      else if (mEventSize > 100 && mEventSize <= 200) {
        total = mEventSize * 40;
       return total;
      } else if (mEventSize > 200 && mEventSize <= 300) {
        total = mEventSize * 35;
        return total;
      }
       else if (mEventSize > 300 && mEventSize <= 500) {
      total = mEventSize * 30;
       return total;
       }
       else  {
        total = mEventSize * 25;
       }
      return total;
     }
    else if (mFoodsAvailable.equals("simple")) {
      if (mEventSize <= 50) {
      total = mEventSize * 20;
      return total;
      }
    else if (mEventSize > 50 && mEventSize <= 100) {
        total = mEventSize * 15;
        return total;
      } else if (mEventSize > 100 && mEventSize <= 200) {
        total = mEventSize * 10;
        return total;
      } else if (mEventSize > 200 && mEventSize <= 300) {
        total = mEventSize * 8;
        return total;
      } else if (mEventSize > 300 && mEventSize <= 500) {
        total = mEventSize * 7;
        return total;
      }
     else{
        total = mEventSize * 5;

      }
      return total;

}
return total;
}
/////////////Create Method to Calculate Costs of Beverages
public int calculateBeveragePrice() {
  int total = 0;
  if (mBeveragesServed.equals("limebeer")){
    if (mEventSize <= 50) {
      total = mEventSize * 10;
      return total;
    } else if (mEventSize > 50 && mEventSize <= 100) {
      total = mEventSize * 7;
      return total;
    } else {
      total = mEventSize * 5;
      return total;
    }
  }
  else if (mBeveragesServed.equals("hot drinks")) {
    if (mEventSize <= 50) {
      total = mEventSize * 9;
      return total;
    } else if (mEventSize > 50 && mEventSize <= 100) {
      total = mEventSize * 8;
      return total;
    } else  {
      total = mEventSize * 4;
      return total;
    }
  }
  return total;
}




 }
