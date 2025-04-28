package com.cloudframe.app.special2.dto;

/**
*  The class TiArbolNodo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.special2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TiArbolNodo extends TiArbolNodoSerialized { 
   

								private int tiNMaxheight;
	
	/**
	* Constructor for TiArbolNodo
	**/
    public TiArbolNodo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TiArbolNodo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TiArbolNodo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tiNMaxheight
	 *	@return tiNMaxheight
	 */
	public int getTiNMaxheight() throws CFException {
       if (isTiNMaxheightModified()) { 
           tiNMaxheight = refreshTiNMaxheight();
        }
   		return tiNMaxheight;
	}
	

    /**
	 *	Returns the String value of tiNMaxheight
	 *	@return tiNMaxheight
	 */
	public char[]  getTiNMaxheightActualString() {
	    String value = String.valueOf(tiNMaxheight).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update TiNMaxheight with the passed value
	 *  Corresponding COBOL Variable is TI-N-MAXHEIGHT
	 *	@param number
	 */
	public void setTiNMaxheight(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tiNMaxheight = checkTiNMaxheightMaxLimit(number); 
		serializeTiNMaxheight(tiNMaxheight);
	}
	

	public void setTiNMaxheight(long number) {
	    number = checkTiNMaxheightMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTiNMaxheight((int)number);
	}
	
	/**
	 * 	Update TiNMaxheight with the passed value
	 *	@param value (String or char[])
	 */
	public void setTiNMaxheight(char[] value) throws CFException {
		 tiNMaxheight = serializeTiNMaxheight(value);
	}
	/**
	 * 	Update TiNMaxheight with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTiNMaxheightString(char[] value) throws CFException {
		 setTiNMaxheight(value);
	}

	
	
	

		public static int getTiArbolNodoFieldLength() {
			return TI_ARBOL_NODO_LENGTH;
		}

}
  
