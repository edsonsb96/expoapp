/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.models;

import javax.persistence.*;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "CIDADE")
public class Cidade {
    @Id
    private int id;
    private String nome;
    private int fk_estado_id;
}