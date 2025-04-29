package com.cloudframe.app.sf311010.dto;

/**
*  The class De48Se66SfLenGroup500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class De48Se66SfLenGroup500 extends De48Se66SfLenGroup500Serialized {
   

						private char[] de48Se66SfLen500 = new char[2];
					private De48Se66SfLen500Redefined de48Se66SfLen500Redefined = new De48Se66SfLen500Redefined();
	
	/**
	* Constructor for De48Se66SfLenGroup500
	**/
    public De48Se66SfLenGroup500() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			de48Se66SfLen500Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setDe48Se66SfLen500(fillSpace(2));
    }


 

	/**
	 *	Returns the value of de48Se66SfLen500
	 *	@return de48Se66SfLen500
	 */
   public char[] getDe48Se66SfLen500() throws CFException{
     if (isDe48Se66SfLen500Modified()) { 
        de48Se66SfLen500 = refreshDe48Se66SfLen500();
     }
   		return de48Se66SfLen500;
   }

  
	/**
	*  set variable de48Se66SfLen500
	*  Corresponding COBOL Variable is 500-DE48-SE66-SF-LEN
	*  @param value
	**/
   public void setDe48Se66SfLen500(char[] value) {
      de48Se66SfLen500 = checkDe48Se66SfLen500Constraints(value);
      serializeDe48Se66SfLen500(de48Se66SfLen500);
   } 

     /**
	 * 	Update De48Se66SfLen500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDe48Se66SfLen500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDe48Se66SfLen500,de48Se66SfLen500.length);
   	
   }
   
   public void setDe48Se66SfLen500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDe48Se66SfLen500,de48Se66SfLen500.length);
   	
   }
   
     /**
	 * 	Update De48Se66SfLen500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe48Se66SfLen500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe48Se66SfLen500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update De48Se66SfLen500 with another Field
	 *	@param value
	 */
   public void setDe48Se66SfLen500(Field source) {
       replace(source,0,source.length(),beginDe48Se66SfLen500,DE_48_SE_66_SF_LEN_500_LEN);
   	
   }  
   
     /**
	 * 	Update De48Se66SfLen500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDe48Se66SfLen500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDe48Se66SfLen500,DE_48_SE_66_SF_LEN_500_LEN);
   	
   }
   
     /**
	 * 	Update De48Se66SfLen500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe48Se66SfLen500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe48Se66SfLen500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of de48Se66SfLen500Redefined
	 *	@return de48Se66SfLen500Redefined
	 */   
	 public De48Se66SfLen500Redefined getDe48Se66SfLen500Redefined() {
   	return de48Se66SfLen500Redefined;
   }
   /**
	* 	Update De48Se66SfLen500Redefined with the passed value
	*   Corresponding COBOL Variable is 500-DE48-SE66-SF-LEN-REDEFINED
	*	@param value
	*/
   public void setDe48Se66SfLen500Redefined(char[] value) {
      de48Se66SfLen500Redefined.setString(value); 
   }   
    
     /**
	 * 	Update De48Se66SfLen500Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDe48Se66SfLen500Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,de48Se66SfLen500Redefined.begin,de48Se66SfLen500Redefined.length());
   }
   
     /**
	 * 	Update De48Se66SfLen500Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe48Se66SfLen500Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,de48Se66SfLen500Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update De48Se66SfLen500Redefined with another Field
	 *	@param value
	 */
   public void setDe48Se66SfLen500Redefined(Field source) {
   	replace(source,0,source.length(),de48Se66SfLen500Redefined.begin,de48Se66SfLen500Redefined.length());
   }  
   
     /**
	 * 	Update De48Se66SfLen500Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDe48Se66SfLen500Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,de48Se66SfLen500Redefined.begin,de48Se66SfLen500Redefined.length());
   }
   
     /**
	 * 	Update De48Se66SfLen500Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe48Se66SfLen500Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,de48Se66SfLen500Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDe48Se66SfLenGroup500FieldLength() {
			return DE_48_SE_66_SF_LEN_GROUP_500_LENGTH;
		}

}
  
