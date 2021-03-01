/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Beans;

import Modelo.Entidades.Cantante;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ASUS
 */
@Stateless
public class CantanteFacade extends AbstractFacade<Cantante> {

    @PersistenceContext(unitName = "ProyectoPISG4MusicaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CantanteFacade() {
        super(Cantante.class);
    }
    
}
