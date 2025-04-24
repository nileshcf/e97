package com.cloudframe.app.sf311010.dto;

/**
*  The class De48Se42500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class De48Se42500 extends De48Se42500Serialized { 
   

						private char[] se4212500 = Field.fillLowValue(2);

						private char[] se423500 = Field.fillLowValue(1);
	
	/**
	* Constructor for De48Se42500
	**/
    public De48Se42500() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of se4212500
	 *	@return se4212500
	 */
   public char[] getSe4212500() throws CFException{
     if (isSe4212500Modified()) { 
        se4212500 = refreshSe4212500();
     }
   		return se4212500;
   }

  
	/**
	*  set variable se4212500
	*  Corresponding COBOL Variable is 500-SE42-1-2
	*  @param value
	**/
   public void setSe4212500(char[] value) {
      se4212500 = checkSe4212500Constraints(value);
      serializeSe4212500(se4212500);
   } 

     /**
	 * 	Update Se4212500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSe4212500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSe4212500,se4212500.length);
   	
   }
   
   public void setSe4212500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSe4212500,se4212500.length);
   	
   }
   
     /**
	 * 	Update Se4212500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSe4212500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSe4212500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Se4212500 with another Field
	 *	@param value
	 */
   public void setSe4212500(Field source) {
       replace(source,0,source.length(),beginSe4212500,SE_4212500_LEN);
   	
   }  
   
     /**
	 * 	Update Se4212500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSe4212500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSe4212500,SE_4212500_LEN);
   	
   }
   
     /**
	 * 	Update Se4212500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSe4212500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSe4212500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of se423500
	 *	@return se423500
	 */
   public char[] getSe423500() throws CFException{
     if (isSe423500Modified()) { 
        se423500 = refreshSe423500();
     }
   		return se423500;
   }

  
	/**
	*  set variable se423500
	*  Corresponding COBOL Variable is 500-SE42-3
	*  @param value
	**/
   public void setSe423500(char[] value) {
      se423500 = checkSe423500Constraints(value);
      serializeSe423500(se423500);
   } 

     /**
	 * 	Update Se423500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSe423500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSe423500,se423500.length);
   	
   }
   
   public void setSe423500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSe423500,se423500.length);
   	
   }
   
     /**
	 * 	Update Se423500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSe423500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSe423500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Se423500 with another Field
	 *	@param value
	 */
   public void setSe423500(Field source) {
       replace(source,0,source.length(),beginSe423500,SE_423500_LEN);
   	
   }  
   
     /**
	 * 	Update Se423500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSe423500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSe423500,SE_423500_LEN);
   	
   }
   
     /**
	 * 	Update Se423500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSe423500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSe423500+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDe48Se42500FieldLength() {
			return DE_48_SE_42500_LENGTH;
		}

}
  
