package impressionable.impressionable_android;

/**
 * Created by David on 2016-10-15.
 */

import java.util.ArrayList;

class SessionData {

    private ArrayList<User> userData = new ArrayList<>();



    SessionData(){

    }

    public void addUserData(User user){
        userData.add(user);
    }

    ArrayList<User> getSessionData(){
        return userData;
    }

}
