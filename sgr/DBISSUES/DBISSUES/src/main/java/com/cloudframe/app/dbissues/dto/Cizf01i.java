package com.cloudframe.app.dbissues.dto;

/**
*  The class Cizf01i is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.dbissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Cizf01i extends Cizf01iSerialized {
   
				private F01iParteFija f01iParteFija = new F01iParteFija();
	
	/**
	* Constructor for Cizf01i
	**/
    public Cizf01i() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			f01iParteFija.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of f01iParteFija
	 *	@return f01iParteFija
	 */   
	 public F01iParteFija getF01iParteFija() {
   	return f01iParteFija;
   }
   /**
	* 	Update F01iParteFija with the passed value
	*   Corresponding COBOL Variable is F01I-PARTE-FIJA
	*	@param value
	*/
   public void setF01iParteFija(char[] value) {
      f01iParteFija.setString(value); 
   }   
    
     /**
	 * 	Update F01iParteFija 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setF01iParteFija(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,f01iParteFija.begin,f01iParteFija.length());
   }
   
     /**
	 * 	Update F01iParteFija 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setF01iParteFija(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,f01iParteFija.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update F01iParteFija with another Field
	 *	@param value
	 */
   public void setF01iParteFija(Field source) {
   	replace(source,0,source.length(),f01iParteFija.begin,f01iParteFija.length());
   }  
   
     /**
	 * 	Update F01iParteFija 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setF01iParteFija(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,f01iParteFija.begin,f01iParteFija.length());
   }
   
     /**
	 * 	Update F01iParteFija 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setF01iParteFija(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,f01iParteFija.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCizf01iFieldLength() {
			return CIZF_01I_LENGTH;
		}

}
  
