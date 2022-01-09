/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.util;
import dto.UnidadeOrganizacionalDTO;
/**
 *
 * @author gabri
 */
public class UnidadeOrganizacionalHelper {
    public static boolean validarUnidadeOrganizacional(UnidadeOrganizacionalDTO unidadeOrganizacional){
        if(unidadeOrganizacional.getNome().length() == 0||unidadeOrganizacional.getEndereco().length()==0){
            return false; 
        }
        return true;
    }
}