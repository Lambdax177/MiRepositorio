/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author Eduardo
 */
@Stateless
public class OperacionesBean implements OperacionesBeanRemote {

    @Override
    public long calculaFactorial(int n) {
        if(n<1)
            return 1;
        else
            return n*calculaFactorial(n-1);
    }
}
