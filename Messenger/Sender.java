/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Messenger;

/**
 *
 * @author PC
 */
public class Sender {
    public static void main(String[] args) {

        stdMessenger summon = new stdMessenger();
        summon.sendMessege("", "", "");
        summon.sendMessege("Dyland", "Invitation", "I wanna invite you to join my team project, did you want it?");

        MailMessenger call = new MailMessenger();
        call.connect();
        call.sendMessege("", "List", "Murdered Victims");
        call.sendMessege("Sydney", "Sstt...", "Hello Sydney, do you wanna play some game?");
        call.disconnect();
        call.sendMessege("Samantha", "Quiz", "Who won the battle between Freddy & Jason?");
    }
}
