/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;

/**
 *
 * @author origin
 */
public class NewClass {
    
    public static void main(String[] args) throws NamingException {
        System.out.println("HI THERE WISLON LI !!!!!!!!!!!!!!!!!!!!!!!!");
        EJBContainer container = EJBContainer.createEJBContainer();
        NewSessionBean bean = (NewSessionBean) container.getContext().lookup("java:global/classes/NewSessionBean");
        bean.businessMethod();
        
        System.out.println("HI THERE WISLON LI !!!!!!!!!!!!!!!!!!!!!!!!");
    }
    
}
