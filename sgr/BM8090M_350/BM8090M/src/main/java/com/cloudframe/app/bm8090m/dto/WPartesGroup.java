package com.cloudframe.app.bm8090m.dto;

/**
*  The class WPartesGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WPartesGroup extends WPartesGroupSerialized {
   

						private char[] wPartes = new char[22];
					private WParts wParts = new WParts();
	
	/**
	* Constructor for WPartesGroup
	**/
    public WPartesGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wParts.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWPartes(fillSpace(22));
    }


 

	/**
	 *	Returns the value of wPartes
	 *	@return wPartes
	 */
   public char[] getWPartes() throws CFException{
     if (isWPartesModified()) { 
        wPartes = refreshWPartes();
     }
   		return wPartes;
   }

  
	/**
	*  set variable wPartes
	*  Corresponding COBOL Variable is W-PARTES
	*  @param value
	**/
   public void setWPartes(char[] value) {
      wPartes = checkWPartesConstraints(value);
      serializeWPartes(wPartes);
   } 

     /**
	 * 	Update WPartes 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPartes(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWPartes,wPartes.length);
   	
   }
   
   public void setWPartes(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWPartes,wPartes.length);
   	
   }
   
     /**
	 * 	Update WPartes 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPartes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPartes+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WPartes with another Field
	 *	@param value
	 */
   public void setWPartes(Field source) {
       replace(source,0,source.length(),beginWPartes,W_PARTES_LEN);
   	
   }  
   
     /**
	 * 	Update WPartes 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPartes(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWPartes,W_PARTES_LEN);
   	
   }
   
     /**
	 * 	Update WPartes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPartes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPartes+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wParts
	 *	@return wParts
	 */   
	 public WParts getWParts() {
   	return wParts;
   }
   /**
	* 	Update WParts with the passed value
	*   Corresponding COBOL Variable is W-PARTS
	*	@param value
	*/
   public void setWParts(char[] value) {
      wParts.setString(value); 
   }   
    
     /**
	 * 	Update WParts 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWParts(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wParts.begin,wParts.length());
   }
   
     /**
	 * 	Update WParts 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWParts(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wParts.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WParts with another Field
	 *	@param value
	 */
   public void setWParts(Field source) {
   	replace(source,0,source.length(),wParts.begin,wParts.length());
   }  
   
     /**
	 * 	Update WParts 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWParts(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wParts.begin,wParts.length());
   }
   
     /**
	 * 	Update WParts 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWParts(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wParts.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWPartesGroupFieldLength() {
			return W_PARTES_GROUP_LENGTH;
		}

}
  
