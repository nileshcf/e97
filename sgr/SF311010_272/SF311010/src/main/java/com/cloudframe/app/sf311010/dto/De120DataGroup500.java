package com.cloudframe.app.sf311010.dto;

/**
*  The class De120DataGroup500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class De120DataGroup500 extends De120DataGroup500Serialized {
   

						private char[] de120Data500 = new char[999];
	
	/**
	* Constructor for De120DataGroup500
	**/
    public De120DataGroup500() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDe120Data500(pad(999," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of de120Data500
	 *	@return de120Data500
	 */
   public char[] getDe120Data500() throws CFException{
     if (isDe120Data500Modified()) { 
        de120Data500 = refreshDe120Data500();
     }
   		return de120Data500;
   }

  
	/**
	*  set variable de120Data500
	*  Corresponding COBOL Variable is 500-DE120-DATA
	*  @param value
	**/
   public void setDe120Data500(char[] value) {
      de120Data500 = checkDe120Data500Constraints(value);
      serializeDe120Data500(de120Data500);
   } 

     /**
	 * 	Update De120Data500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDe120Data500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDe120Data500,de120Data500.length);
   	
   }
   
   public void setDe120Data500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDe120Data500,de120Data500.length);
   	
   }
   
     /**
	 * 	Update De120Data500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe120Data500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe120Data500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update De120Data500 with another Field
	 *	@param value
	 */
   public void setDe120Data500(Field source) {
       replace(source,0,source.length(),beginDe120Data500,DE_120_DATA_500_LEN);
   	
   }  
   
     /**
	 * 	Update De120Data500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDe120Data500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDe120Data500,DE_120_DATA_500_LEN);
   	
   }
   
     /**
	 * 	Update De120Data500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe120Data500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe120Data500+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDe120DataGroup500FieldLength() {
			return DE_120_DATA_GROUP_500_LENGTH;
		}

}
  
