package com.cloudframe.app.sf311010.dto;

/**
*  The class De48DataGroup500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class De48DataGroup500 extends De48DataGroup500Serialized {
   

						private char[] de48Data500 = new char[999];
	
	/**
	* Constructor for De48DataGroup500
	**/
    public De48DataGroup500() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDe48Data500(pad(999," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of de48Data500
	 *	@return de48Data500
	 */
   public char[] getDe48Data500() throws CFException{
     if (isDe48Data500Modified()) { 
        de48Data500 = refreshDe48Data500();
     }
   		return de48Data500;
   }

  
	/**
	*  set variable de48Data500
	*  Corresponding COBOL Variable is 500-DE48-DATA
	*  @param value
	**/
   public void setDe48Data500(char[] value) {
      de48Data500 = checkDe48Data500Constraints(value);
      serializeDe48Data500(de48Data500);
   } 

     /**
	 * 	Update De48Data500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDe48Data500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDe48Data500,de48Data500.length);
   	
   }
   
   public void setDe48Data500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDe48Data500,de48Data500.length);
   	
   }
   
     /**
	 * 	Update De48Data500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe48Data500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe48Data500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update De48Data500 with another Field
	 *	@param value
	 */
   public void setDe48Data500(Field source) {
       replace(source,0,source.length(),beginDe48Data500,DE_48_DATA_500_LEN);
   	
   }  
   
     /**
	 * 	Update De48Data500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDe48Data500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDe48Data500,DE_48_DATA_500_LEN);
   	
   }
   
     /**
	 * 	Update De48Data500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe48Data500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe48Data500+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDe48DataGroup500FieldLength() {
			return DE_48_DATA_GROUP_500_LENGTH;
		}

}
  
