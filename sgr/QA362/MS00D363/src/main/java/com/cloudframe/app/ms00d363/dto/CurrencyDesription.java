package com.cloudframe.app.ms00d363.dto;

/**
*  The class CurrencyDesription is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurrencyDesription extends CurrencyDesriptionSerialized {
   
				private CurrDescXds currDescXds = new CurrDescXds();
				private CurrDescBat currDescBat = new CurrDescBat();
	
	/**
	* Constructor for CurrencyDesription
	**/
    public CurrencyDesription() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			currDescXds.setParent(this,getStartOffset() + 0);
	       			currDescBat.setParent(this,getStartOffset() + 108);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of currDescXds
	 *	@return currDescXds
	 */   
	 public CurrDescXds getCurrDescXds() {
   	return currDescXds;
   }
   /**
	* 	Update CurrDescXds with the passed value
	*   Corresponding COBOL Variable is CURR-DESC-XDS
	*	@param value
	*/
   public void setCurrDescXds(char[] value) {
      currDescXds.setString(value); 
   }   
    
     /**
	 * 	Update CurrDescXds 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCurrDescXds(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currDescXds.begin,currDescXds.length());
   }
   
     /**
	 * 	Update CurrDescXds 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDescXds(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currDescXds.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CurrDescXds with another Field
	 *	@param value
	 */
   public void setCurrDescXds(Field source) {
   	replace(source,0,source.length(),currDescXds.begin,currDescXds.length());
   }  
   
     /**
	 * 	Update CurrDescXds 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCurrDescXds(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currDescXds.begin,currDescXds.length());
   }
   
     /**
	 * 	Update CurrDescXds 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDescXds(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currDescXds.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of currDescBat
	 *	@return currDescBat
	 */   
	 public CurrDescBat getCurrDescBat() {
   	return currDescBat;
   }
   /**
	* 	Update CurrDescBat with the passed value
	*   Corresponding COBOL Variable is CURR-DESC-BAT
	*	@param value
	*/
   public void setCurrDescBat(char[] value) {
      currDescBat.setString(value); 
   }   
    
     /**
	 * 	Update CurrDescBat 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCurrDescBat(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currDescBat.begin,currDescBat.length());
   }
   
     /**
	 * 	Update CurrDescBat 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDescBat(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currDescBat.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CurrDescBat with another Field
	 *	@param value
	 */
   public void setCurrDescBat(Field source) {
   	replace(source,0,source.length(),currDescBat.begin,currDescBat.length());
   }  
   
     /**
	 * 	Update CurrDescBat 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCurrDescBat(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currDescBat.begin,currDescBat.length());
   }
   
     /**
	 * 	Update CurrDescBat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDescBat(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currDescBat.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCurrencyDesriptionFieldLength() {
			return CURRENCY_DESRIPTION_LENGTH;
		}

}
  
