/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.datastructures;

/**
 *
 * @author Lester García & Ana Godínez
 * @param <E>
 */
public interface Position<E> {
	
	E getElement() throws IllegalStateException;

}
