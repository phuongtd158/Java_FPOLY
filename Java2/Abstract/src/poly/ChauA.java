/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author ADMIN
 */
interface ChauA{
    void daVang();
}
interface ChauAu{
    void daTrang();
}

class KetHop implements ChauA, ChauAu{

    @Override
    public void daTrang() {
        System.out.println("Da trắng");
    }

    @Override
    public void daVang() {
        System.out.println("Da vàng");
    }
    
}