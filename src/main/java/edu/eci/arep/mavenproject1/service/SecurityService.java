/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arep.mavenproject1.service;

/**
 *
 * @author 2112076
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
