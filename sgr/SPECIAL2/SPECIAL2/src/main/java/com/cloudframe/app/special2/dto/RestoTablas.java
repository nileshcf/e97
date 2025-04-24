package com.cloudframe.app.special2.dto;

/**
*  The class RestoTablas is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.special2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RestoTablas extends RestoTablasSerialized { 
   

								private int tiNMax;
				private TiArbol tiArbol = new TiArbol();
	
	/**
	* Constructor for RestoTablas
	**/
    public RestoTablas() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			tiArbol.setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
								setTiNMax(50);
    }


 

	/**
	 *	Returns the value of tiNMax
	 *	@return tiNMax
	 */
	public int getTiNMax() throws CFException {
       if (isTiNMaxModified()) { 
           tiNMax = refreshTiNMax();
        }
   		return tiNMax;
	}
	

	
	   
	/**
	 * 	Update TiNMax with the passed value
	 *  Corresponding COBOL Variable is TI-N-MAX
	 *	@param number
	 */
	public void setTiNMax(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tiNMax = checkTiNMaxMaxLimit(number); 
		serializeTiNMax(tiNMax);
	}
	

	public void setTiNMax(long number) {
	    number = checkTiNMaxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTiNMax((int)number);
	}
	
	/**
	 * 	Update TiNMax with the passed value
	 *	@param value (String or char[])
	 */
	public void setTiNMax(char[] value) throws CFException {
		 tiNMax = serializeTiNMax(value);
	}
	/**
	 * 	Update TiNMax with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTiNMaxString(char[] value) throws CFException {
		 setTiNMax(value);
	}
	/**
	 *	Returns the value of tiArbol
	 *	@return tiArbol
	 */   
	 public TiArbol getTiArbol() {
   	return tiArbol;
   }
   /**
	* 	Update TiArbol with the passed value
	*   Corresponding COBOL Variable is TI-ARBOL
	*	@param value
	*/
   public void setTiArbol(char[] value) {
      tiArbol.setString(value); 
   }   
    
     /**
	 * 	Update TiArbol 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTiArbol(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tiArbol.begin,tiArbol.length());
   }
   
     /**
	 * 	Update TiArbol 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTiArbol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tiArbol.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TiArbol with another Field
	 *	@param value
	 */
   public void setTiArbol(Field source) {
   	replace(source,0,source.length(),tiArbol.begin,tiArbol.length());
   }  
   
     /**
	 * 	Update TiArbol 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTiArbol(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tiArbol.begin,tiArbol.length());
   }
   
     /**
	 * 	Update TiArbol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTiArbol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tiArbol.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRestoTablasFieldLength() {
			return RESTO_TABLAS_LENGTH;
		}

}
  
