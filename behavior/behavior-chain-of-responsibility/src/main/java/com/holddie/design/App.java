package com.holddie.design;

import com.holddie.design.concrete.HRLeader;
import com.holddie.design.concrete.ProjectLeader;
import com.holddie.design.concrete.TeamLeader;
import com.holddie.design.entity.Leave;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        TeamLeader teamLeader = new TeamLeader();
        ProjectLeader projectLeader = new ProjectLeader();
        HRLeader hrLeader = new HRLeader();

        teamLeader.setNextHandler(projectLeader);
        projectLeader.setNextHandler(hrLeader);

        teamLeader.approve(new Leave(1, 5));
        teamLeader.approve(new Leave(1, 15));
        teamLeader.approve(new Leave(1, 25));
        teamLeader.approve(new Leave(1, 35));

    }
}
