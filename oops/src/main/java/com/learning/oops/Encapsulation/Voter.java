package com.learning.oops.Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Voter {
    
    /**
     * public String voterName,
     * public int voterAge,
     * public String voterAddress,
     * public String voterDistrictName
     * public String voterState
     * 
     * Making these memebers of voter, to public, there is no restriction of data, any one from another class can try to access and modify these members.
     * For Example consider another class as voterAdmin, if these members were public, then admin can modify a few like 
     * voter.age = -10, 
     * voter.voterState = Moon
     * voter.voterName = Aloha etc..!, but which can't be allowed.
     * 
     * Encapsulation does not only restrict the access to member/fields, but also over the content, and it binds the similar fields and methods together.
     */

    private String voterName;
    private int voterAge;
    private String voterAddress;
    private String voterDistrictName;
    private String voterState;

    protected List<String> stateList = new ArrayList<String>();

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public int getVoterAge() {
        return voterAge;
    }

    public void setVoterAge(int voterAge) throws Exception {

        /**
         * Restriction over content, age can't be negative
         */
        if(voterAge < 0){
            throw new Exception("Error : Age can't be negative");
        }
        this.voterAge = voterAge;
    }

    public String getVoterAddress() {
        return voterAddress;
    }

    public void setVoterAddress(String voterAddress) {
        this.voterAddress = voterAddress;
    }

    public String getVoterState() {
        return voterState;
    }

    /**
     * Updating the voter state, IFF the provided state is found in the given stateList.
     * The same can be done for the voterDistrictName 
     */
    public void setVoterState(String voterState) throws Exception {
        if(! stateList.contains(voterState))
        {
            throw new Exception("Error : No state found with that name");
        }

        this.voterState = voterState;
    }

    public String getVoterDistrictName() {
        return voterDistrictName;
    }

    public void setVoterDistrictName(String voterDistrictName) {
        this.voterDistrictName = voterDistrictName;
    }
    
}
