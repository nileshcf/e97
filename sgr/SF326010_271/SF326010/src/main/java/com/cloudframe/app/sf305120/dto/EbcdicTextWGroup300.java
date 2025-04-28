package com.cloudframe.app.sf305120.dto;

/**
*  The class EbcdicTextWGroup300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EbcdicTextWGroup300 extends EbcdicTextWGroup300Serialized { 
   
					private EbcdicTextW300 ebcdicTextW300 = new EbcdicTextW300();

						private char[] ebcdicText300 = Field.fillLowValue(86);
	
	/**
	* Constructor for EbcdicTextWGroup300
	**/
    public EbcdicTextWGroup300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ebcdicTextW300.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ebcdicTextW300
	 *	@return ebcdicTextW300
	 */   
	 public EbcdicTextW300 getEbcdicTextW300() {
   	return ebcdicTextW300;
   }
   /**
	* 	Update EbcdicTextW300 with the passed value
	*   Corresponding COBOL Variable is 300-EBCDIC-TEXT-W
	*	@param value
	*/
   public void setEbcdicTextW300(char[] value) {
      ebcdicTextW300.setString(value); 
   }   
    
     /**
	 * 	Update EbcdicTextW300 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEbcdicTextW300(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextW300.begin,ebcdicTextW300.length());
   }
   
     /**
	 * 	Update EbcdicTextW300 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicTextW300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextW300.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update EbcdicTextW300 with another Field
	 *	@param value
	 */
   public void setEbcdicTextW300(Field source) {
   	replace(source,0,source.length(),ebcdicTextW300.begin,ebcdicTextW300.length());
   }  
   
     /**
	 * 	Update EbcdicTextW300 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEbcdicTextW300(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextW300.begin,ebcdicTextW300.length());
   }
   
     /**
	 * 	Update EbcdicTextW300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicTextW300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextW300.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ebcdicText300
	 *	@return ebcdicText300
	 */
   public char[] getEbcdicText300() throws CFException{
     if (isEbcdicText300Modified()) { 
        ebcdicText300 = refreshEbcdicText300();
     }
   		return ebcdicText300;
   }

  
	/**
	*  set variable ebcdicText300
	*  Corresponding COBOL Variable is 300-EBCDIC-TEXT
	*  @param value
	**/
   public void setEbcdicText300(char[] value) {
      ebcdicText300 = checkEbcdicText300Constraints(value);
      serializeEbcdicText300(ebcdicText300);
   } 

     /**
	 * 	Update EbcdicText300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEbcdicText300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEbcdicText300,ebcdicText300.length);
   	
   }
   
   public void setEbcdicText300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEbcdicText300,ebcdicText300.length);
   	
   }
   
     /**
	 * 	Update EbcdicText300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicText300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEbcdicText300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EbcdicText300 with another Field
	 *	@param value
	 */
   public void setEbcdicText300(Field source) {
       replace(source,0,source.length(),beginEbcdicText300,EBCDIC_TEXT_300_LEN);
   	
   }  
   
     /**
	 * 	Update EbcdicText300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEbcdicText300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEbcdicText300,EBCDIC_TEXT_300_LEN);
   	
   }
   
     /**
	 * 	Update EbcdicText300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicText300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEbcdicText300+targetIndex,targetLen);
    
   }

	
	
	

		public static int getEbcdicTextWGroup300FieldLength() {
			return EBCDIC_TEXT_WGROUP_300_LENGTH;
		}

}
  
