package com.cloudframe.app.ar640010.dto;

/**
*  The class CopybookEntry500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CopybookEntry500 extends CopybookEntry500Serialized { 
   

						private char[] copybookDate500 = Field.fillLowValue(10);

						private char[] copybookMod500 = Field.fillLowValue(1);
	
	/**
	* Constructor for CopybookEntry500
	**/
    public CopybookEntry500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CopybookEntry500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CopybookEntry500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of copybookDate500
	 *	@return copybookDate500
	 */
   public char[] getCopybookDate500() throws CFException{
     if (isCopybookDate500Modified()) { 
        copybookDate500 = refreshCopybookDate500();
     }
   		return copybookDate500;
   }

  
	/**
	*  set variable copybookDate500
	*  Corresponding COBOL Variable is 500-COPYBOOK-DATE
	*  @param value
	**/
   public void setCopybookDate500(char[] value) {
      copybookDate500 = checkCopybookDate500Constraints(value);
      serializeCopybookDate500(copybookDate500);
   } 

     /**
	 * 	Update CopybookDate500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopybookDate500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopybookDate500,copybookDate500.length);
   	
   }
   
   public void setCopybookDate500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopybookDate500,copybookDate500.length);
   	
   }
   
     /**
	 * 	Update CopybookDate500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopybookDate500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybookDate500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CopybookDate500 with another Field
	 *	@param value
	 */
   public void setCopybookDate500(Field source) {
       replace(source,0,source.length(),beginCopybookDate500,COPYBOOK_DATE_500_LEN);
   	
   }  
   
     /**
	 * 	Update CopybookDate500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopybookDate500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopybookDate500,COPYBOOK_DATE_500_LEN);
   	
   }
   
     /**
	 * 	Update CopybookDate500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopybookDate500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybookDate500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of copybookMod500
	 *	@return copybookMod500
	 */
   public char[] getCopybookMod500() throws CFException{
     if (isCopybookMod500Modified()) { 
        copybookMod500 = refreshCopybookMod500();
     }
   		return copybookMod500;
   }

  
	/**
	*  set variable copybookMod500
	*  Corresponding COBOL Variable is 500-COPYBOOK-MOD
	*  @param value
	**/
   public void setCopybookMod500(char[] value) {
      copybookMod500 = checkCopybookMod500Constraints(value);
      serializeCopybookMod500(copybookMod500);
   } 

     /**
	 * 	Update CopybookMod500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopybookMod500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopybookMod500,copybookMod500.length);
   	
   }
   
   public void setCopybookMod500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopybookMod500,copybookMod500.length);
   	
   }
   
     /**
	 * 	Update CopybookMod500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopybookMod500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybookMod500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CopybookMod500 with another Field
	 *	@param value
	 */
   public void setCopybookMod500(Field source) {
       replace(source,0,source.length(),beginCopybookMod500,COPYBOOK_MOD_500_LEN);
   	
   }  
   
     /**
	 * 	Update CopybookMod500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopybookMod500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopybookMod500,COPYBOOK_MOD_500_LEN);
   	
   }
   
     /**
	 * 	Update CopybookMod500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopybookMod500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybookMod500+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCopybookEntry500FieldLength() {
			return COPYBOOK_ENTRY_500_LENGTH;
		}

}
  
