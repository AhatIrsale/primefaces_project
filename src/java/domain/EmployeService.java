/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
import abstractFacade.AbstractFacade;
import entities.Employe;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class EmployeService extends AbstractFacade<Employe> {

    public EmployeService(Class<Employe> entityClass) {
        super(entityClass);
    }
    
}
