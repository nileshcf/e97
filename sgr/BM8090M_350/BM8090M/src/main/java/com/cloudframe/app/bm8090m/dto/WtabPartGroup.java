package com.cloudframe.app.bm8090m.dto;

/**
*  The class WtabPartGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WtabPartGroup extends WtabPartGroupSerialized {
   

						private char[] wtabPart = new char[100];
					private WtabPartx wtabPartx = new WtabPartx();
	
	/**
	* Constructor for WtabPartGroup
	**/
    public WtabPartGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wtabPartx.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWtabPart(pad(100," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of wtabPart
	 *	@return wtabPart
	 */
   public char[] getWtabPart() throws CFException{
     if (isWtabPartModified()) { 
        wtabPart = refreshWtabPart();
     }
   		return wtabPart;
   }

  
	/**
	*  set variable wtabPart
	*  Corresponding COBOL Variable is WTAB-PART
	*  @param value
	**/
   public void setWtabPart(char[] value) {
      wtabPart = checkWtabPartConstraints(value);
      serializeWtabPart(wtabPart);
   } 

     /**
	 * 	Update WtabPart 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWtabPart(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWtabPart,wtabPart.length);
   	
   }
   
   public void setWtabPart(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWtabPart,wtabPart.length);
   	
   }
   
     /**
	 * 	Update WtabPart 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWtabPart(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWtabPart+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WtabPart with another Field
	 *	@param value
	 */
   public void setWtabPart(Field source) {
       replace(source,0,source.length(),beginWtabPart,WTAB_PART_LEN);
   	
   }  
   
     /**
	 * 	Update WtabPart 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWtabPart(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWtabPart,WTAB_PART_LEN);
   	
   }
   
     /**
	 * 	Update WtabPart 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWtabPart(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWtabPart+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wtabPartx
	 *	@return wtabPartx
	 */   
	 public WtabPartx getWtabPartx() {
   	return wtabPartx;
   }
   /**
	* 	Update WtabPartx with the passed value
	*   Corresponding COBOL Variable is WTAB-PARTX
	*	@param value
	*/
   public void setWtabPartx(char[] value) {
      wtabPartx.setString(value); 
   }   
    
     /**
	 * 	Update WtabPartx 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWtabPartx(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wtabPartx.begin,wtabPartx.length());
   }
   
     /**
	 * 	Update WtabPartx 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWtabPartx(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wtabPartx.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WtabPartx with another Field
	 *	@param value
	 */
   public void setWtabPartx(Field source) {
   	replace(source,0,source.length(),wtabPartx.begin,wtabPartx.length());
   }  
   
     /**
	 * 	Update WtabPartx 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWtabPartx(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wtabPartx.begin,wtabPartx.length());
   }
   
     /**
	 * 	Update WtabPartx 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWtabPartx(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wtabPartx.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWtabPartGroupFieldLength() {
			return WTAB_PART_GROUP_LENGTH;
		}

}
  
