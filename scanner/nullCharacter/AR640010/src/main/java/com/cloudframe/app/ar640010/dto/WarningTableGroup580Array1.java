package com.cloudframe.app.ar640010.dto;

/**
*  The class WarningTableGroup580Array1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WarningTableGroup580Array1 extends WarningTableGroup580Array1Serialized { 
   

						private char[] warningId580 = Field.fillLowValue(4);

						private char[] warningText580 = Field.fillLowValue(50);
	
	/**
	* Constructor for WarningTableGroup580Array1
	**/
    public WarningTableGroup580Array1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WarningTableGroup580Array1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WarningTableGroup580Array1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of warningId580
	 *	@return warningId580
	 */
   public char[] getWarningId580() throws CFException{
     if (isWarningId580Modified()) { 
        warningId580 = refreshWarningId580();
     }
   		return warningId580;
   }

  
	/**
	*  set variable warningId580
	*  Corresponding COBOL Variable is 580-WARNING-ID
	*  @param value
	**/
   public void setWarningId580(char[] value) {
      warningId580 = checkWarningId580Constraints(value);
      serializeWarningId580(warningId580);
   } 

     /**
	 * 	Update WarningId580 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWarningId580(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWarningId580,warningId580.length);
   	
   }
   
   public void setWarningId580(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWarningId580,warningId580.length);
   	
   }
   
     /**
	 * 	Update WarningId580 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWarningId580(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWarningId580+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WarningId580 with another Field
	 *	@param value
	 */
   public void setWarningId580(Field source) {
       replace(source,0,source.length(),beginWarningId580,WARNING_ID_580_LEN);
   	
   }  
   
     /**
	 * 	Update WarningId580 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWarningId580(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWarningId580,WARNING_ID_580_LEN);
   	
   }
   
     /**
	 * 	Update WarningId580 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWarningId580(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWarningId580+targetIndex,targetLen);
    
   }
	char[] warningEot8858088Value = "....".toCharArray();
	/**
	 *	Test condition "...." for isWarningEot88580()
	 *	@return  Returns true if isWarningEot88580() is "...."
	 */
   public boolean isWarningEot88580() throws CFException {
      return (  compareChars( getWarningId580() , warningEot8858088Value)  == 0  );
   }


	/**
	*  set values "...."
	*/
   	public void setWarningEot88580True() {  			
    	setWarningId580( warningEot8858088Value);
   	}
	/**
	 *	Returns the value of warningText580
	 *	@return warningText580
	 */
   public char[] getWarningText580() throws CFException{
     if (isWarningText580Modified()) { 
        warningText580 = refreshWarningText580();
     }
   		return warningText580;
   }

  
	/**
	*  set variable warningText580
	*  Corresponding COBOL Variable is 580-WARNING-TEXT
	*  @param value
	**/
   public void setWarningText580(char[] value) {
      warningText580 = checkWarningText580Constraints(value);
      serializeWarningText580(warningText580);
   } 

     /**
	 * 	Update WarningText580 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWarningText580(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWarningText580,warningText580.length);
   	
   }
   
   public void setWarningText580(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWarningText580,warningText580.length);
   	
   }
   
     /**
	 * 	Update WarningText580 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWarningText580(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWarningText580+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WarningText580 with another Field
	 *	@param value
	 */
   public void setWarningText580(Field source) {
       replace(source,0,source.length(),beginWarningText580,WARNING_TEXT_580_LEN);
   	
   }  
   
     /**
	 * 	Update WarningText580 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWarningText580(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWarningText580,WARNING_TEXT_580_LEN);
   	
   }
   
     /**
	 * 	Update WarningText580 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWarningText580(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWarningText580+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWarningTableGroup580Array1FieldLength() {
			return WARNING_TABLE_GROUP_580_ARRAY_1_LENGTH;
		}

}
  
