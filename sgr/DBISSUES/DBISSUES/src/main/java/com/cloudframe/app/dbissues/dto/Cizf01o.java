package com.cloudframe.app.dbissues.dto;

/**
*  The class Cizf01o is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:30. using version 5.0.0.257
**/


import com.cloudframe.app.dbissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Cizf01o extends Cizf01oSerialized {
   
				private F01oParteFija f01oParteFija = new F01oParteFija();
	
	/**
	* Constructor for Cizf01o
	**/
    public Cizf01o() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			f01oParteFija.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of f01oParteFija
	 *	@return f01oParteFija
	 */   
	 public F01oParteFija getF01oParteFija() {
   	return f01oParteFija;
   }
   /**
	* 	Update F01oParteFija with the passed value
	*   Corresponding COBOL Variable is F01O-PARTE-FIJA
	*	@param value
	*/
   public void setF01oParteFija(char[] value) {
      f01oParteFija.setString(value); 
   }   
    
     /**
	 * 	Update F01oParteFija 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setF01oParteFija(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,f01oParteFija.begin,f01oParteFija.length());
   }
   
     /**
	 * 	Update F01oParteFija 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setF01oParteFija(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,f01oParteFija.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update F01oParteFija with another Field
	 *	@param value
	 */
   public void setF01oParteFija(Field source) {
   	replace(source,0,source.length(),f01oParteFija.begin,f01oParteFija.length());
   }  
   
     /**
	 * 	Update F01oParteFija 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setF01oParteFija(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,f01oParteFija.begin,f01oParteFija.length());
   }
   
     /**
	 * 	Update F01oParteFija 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setF01oParteFija(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,f01oParteFija.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCizf01oFieldLength() {
			return CIZF_01O_LENGTH;
		}

}
  
