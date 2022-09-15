/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.projetoCadPessoas.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author eduar
 */
@Entity
@Table(name = "tb_pessoajuridica")
public class PessoaJuridica extends Pessoa{
    private String cnpj;
}
