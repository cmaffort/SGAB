package sgab.model.dto.util;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import sgab.model.dto.Atendente;
//import sgab.model.dto.Gestor;
/**
 *
 * @author Gabriel Lucas
 */


public class AtendenteHelper {
    public static boolean validarAtendente(Atendente atendente){
            //if(atendente.getGestor()==null){
            //    return false;
            //}
            if(atendente.getNome().length()<1){
                return false;
            }
            if(atendente.getId()<0){
                return false;
            }
            return true;
    }

    public static boolean validarId(Long id){
        return id >= 0;
    }

    public static boolean validarNome(String nome){
        return nome.length()>0;
    }



}