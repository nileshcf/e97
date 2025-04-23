package com.cloudframe.app.ip200090.dto;

/**
*  The class BslIdGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.ip200090.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BslIdGroup800 extends BslIdGroup800Serialized {
   
					private BslId800 bslId800 = new BslId800();

						private char[] bslIdR800 = Field.fillLowValue(7);
	
	/**
	* Constructor for BslIdGroup800
	**/
    public BslIdGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bslId800.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bslId800
	 *	@return bslId800
	 */   
	 public BslId800 getBslId800() {
   	return bslId800;
   }
   /**
	* 	Update BslId800 with the passed value
	*   Corresponding COBOL Variable is 800-BSL-ID
	*	@param value
	*/
   public void setBslId800(char[] value) {
      bslId800.setString(value); 
   }   
    
     /**
	 * 	Update BslId800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBslId800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bslId800.begin,bslId800.length());
   }
   
     /**
	 * 	Update BslId800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBslId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bslId800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BslId800 with another Field
	 *	@param value
	 */
   public void setBslId800(Field source) {
   	replace(source,0,source.length(),bslId800.begin,bslId800.length());
   }  
   
     /**
	 * 	Update BslId800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBslId800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bslId800.begin,bslId800.length());
   }
   
     /**
	 * 	Update BslId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBslId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bslId800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bslIdR800
	 *	@return bslIdR800
	 */
   public char[] getBslIdR800() throws CFException{
     if (isBslIdR800Modified()) { 
        bslIdR800 = refreshBslIdR800();
     }
   		return bslIdR800;
   }

  
	/**
	*  set variable bslIdR800
	*  Corresponding COBOL Variable is 800-BSL-ID-R
	*  @param value
	**/
   public void setBslIdR800(char[] value) {
      bslIdR800 = checkBslIdR800Constraints(value);
      serializeBslIdR800(bslIdR800);
   } 

     /**
	 * 	Update BslIdR800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBslIdR800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBslIdR800,bslIdR800.length);
   	
   }
   
   public void setBslIdR800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBslIdR800,bslIdR800.length);
   	
   }
   
     /**
	 * 	Update BslIdR800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBslIdR800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBslIdR800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BslIdR800 with another Field
	 *	@param value
	 */
   public void setBslIdR800(Field source) {
       replace(source,0,source.length(),beginBslIdR800,BSL_ID_R_800_LEN);
   	
   }  
   
     /**
	 * 	Update BslIdR800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBslIdR800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBslIdR800,BSL_ID_R_800_LEN);
   	
   }
   
     /**
	 * 	Update BslIdR800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBslIdR800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBslIdR800+targetIndex,targetLen);
    
   }
	char[] mexBsa8880088Value = "4484001".toCharArray();
	/**
	 *	Test condition "4484001" for isMexBsa88800()
	 *	@return  Returns true if isMexBsa88800() is "4484001"
	 */
   public boolean isMexBsa88800() throws CFException {
      return (  compareChars( getBslIdR800() , mexBsa8880088Value)  == 0  );
   }


	/**
	*  set values "4484001"
	*/
   	public void setMexBsa88800True() {  			
    	setBslIdR800( mexBsa8880088Value);
   	}

	
	
	

		public static int getBslIdGroup800FieldLength() {
			return BSL_ID_GROUP_800_LENGTH;
		}

}
  
