package com.cloudframe.app.special2.dto;

/**
*  The class TiArbol is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.special2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class TiArbol extends TiArbolSerialized { 
   

								private int tiNTot;
			private List<TiArbolNodo> tiArbolNodo = new ArrayList<>();
    	
	
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
						tiArbolNodo.add(new TiArbolNodo(this, beginTiArbolNodo + 
						arrayIndex * TiArbolNodo.getTiArbolNodoFieldLength()));
				}
								setTiNTot(0);
    } 

	/**
	 *	Returns the value of tiNTot
	 *	@return tiNTot
	 */
	public int getTiNTot() throws CFException {
       if (isTiNTotModified()) { 
           tiNTot = refreshTiNTot();
        }
   		return tiNTot;
	}
	

	
	   
	/**
	 * 	Update TiNTot with the passed value
	 *  Corresponding COBOL Variable is TI-N-TOT
	 *	@param number
	 */
	public void setTiNTot(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tiNTot = checkTiNTotMaxLimit(number); 
		serializeTiNTot(tiNTot);
	}
	

	public void setTiNTot(long number) {
	    number = checkTiNTotMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTiNTot((int)number);
	}
	
	/**
	 * 	Update TiNTot with the passed value
	 *	@param value (String or char[])
	 */
	public void setTiNTot(char[] value) throws CFException {
		 tiNTot = serializeTiNTot(value);
	}
	/**
	 * 	Update TiNTot with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTiNTotString(char[] value) throws CFException {
		 setTiNTot(value);
	}
	/**
	 *	Returns the  value of tiArbolNodo
	 *  Corresponding COBOL Variable is TI-ARBOL-NODO
	 *	@return tiArbolNodo
	 */
   public List<TiArbolNodo> getTiArbolNodo() {
       return tiArbolNodo;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return tiArbolNodo
	 */
	public TiArbolNodo getTiArbolNodo(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getTiArbolNodo(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= TI_ARBOL_NODO_SIZE) {
             	index = TI_ARBOL_NODO_SIZE -1; // can't exceed max array size
             	logger.trace("tiArbolNodo - Array index exceeded max Size {}, resetting it to max allowed",TI_ARBOL_NODO_SIZE); 
	    }
		if (index >= tiArbolNodo.size()) {
       		for (int fillIndex =  tiArbolNodo.size() -1; fillIndex < index;fillIndex++) {
		       tiArbolNodo.add(null);
		    }
			tiArbolNodo.set(index,
			   	   	new TiArbolNodo(this,beginTiArbolNodo + index * TiArbolNodo.getTiArbolNodoFieldLength()) 
				                        ); 	
		} 
   	   TiArbolNodo value = tiArbolNodo.get(index);
   	   if (value == null) {
   	      tiArbolNodo.set(index,
			   	   	new TiArbolNodo(this,beginTiArbolNodo + index * TiArbolNodo.getTiArbolNodoFieldLength()) 
				                        ); 
		  value = tiArbolNodo.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update TiArbolNodo at index with the passed value
	 *  Corresponding COBOL Variable is TI-ARBOL-NODO
	 *  @param index
	 *	@param value
	 */
  public void setTiArbolNodo(int index,char[] value) {
   	getTiArbolNodo(index).setString(value);
   }
   
	

	
	
	

		public static int getTiArbolFieldLength() {
			return TI_ARBOL_LENGTH;
		}

}
  
