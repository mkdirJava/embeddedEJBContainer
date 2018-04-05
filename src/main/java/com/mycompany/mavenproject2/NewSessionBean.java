/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author martin
 */
@Stateless
@LocalBean
public class NewSessionBean {

    public void businessMethod() {
        System.out.println("THIS IS A CALLL FROM THE BUSINESS LOOK BUSSY");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
