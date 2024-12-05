/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package classes;

/**
 *
 * @author Yuri
 */
public interface OperadorSistema {
    boolean login(String email,String senha);
    boolean logout();
    void pesquisar(String titulo);
    void esqueciSenha(String email,String cpf);
    void consultarEmail(String cpf);
}
