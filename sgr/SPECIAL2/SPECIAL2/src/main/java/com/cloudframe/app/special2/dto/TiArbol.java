package com.cloudframe.app.special2.dto;

/**
*  The class TiArbol is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class TiArbol extends TiArbolSerialized { 
   

								@Getter @Setter private int tiNTot;
			@Getter @Setter private List<TiArbolNodo> tiArbolNodo = new ArrayList<>();
    	
	
	/**
	* Constructor for TiArbol
	**/
    public TiArbol() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TiArbol. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TiArbol(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < TI_ARBOL_NODO_SIZE;arrayIndex++) {
						getTiArbolNodo().add(new TiArbolNodo(this, beginTiArbolNodo + 
						arrayIndex * TiArbolNodo.getTiArbolNodoFieldLength()));
				}
								setTiNTot(0);
    } 



}
  
