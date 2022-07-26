package com.learning.oops.Encapsulation;

public class VoterAdmin {
    
    private int adminId;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    /**
     * Trying to modify the Voter information.  
     */
    public void modifyVoter(Voter voter) throws Exception{
        voter.setVoterAge(-10); //Throws exception.
        voter.setVoterState("Moon"); //Throws exception..
    }

    /***
     * A few examples of encapsulation,
     * -> A stock broker or a stakeholder or any other with access  can't modify the stock price, ot stock volume.
     * -> An employee can't change his salary, so salary will be having restricted and private access.
     */
    
}
