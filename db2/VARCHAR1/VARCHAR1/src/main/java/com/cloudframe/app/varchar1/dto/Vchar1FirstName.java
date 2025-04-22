package com.cloudframe.app.varchar1.dto;

/**
*  The class Vchar1FirstName is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.varchar1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Vchar1FirstName extends Vchar1FirstNameSerialized { 
   

								private short vchar1FirstNameLen;

						private char[] vchar1FirstNameData = Field.fillLowValue(15);
	
	/**
	* Constructor for Vchar1FirstName
	**/
    public Vchar1FirstName() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Vchar1FirstName. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Vchar1FirstName(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of vchar1FirstNameLen
	 *	@return vchar1FirstNameLen
	 */
	public short getVchar1FirstNameLen() throws CFException {
        if (isVchar1FirstNameLenModified()) { 
           vchar1FirstNameLen = refreshVchar1FirstNameLen();
        }
   		return vchar1FirstNameLen;
	}
	
	/**
	 * 	Update Vchar1FirstNameLen with the passed value
	 *  Corresponding COBOL Variable is VCHAR1-FIRST-NAME-LEN
	 *	@param number
	 */
	public void setVchar1FirstNameLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    vchar1FirstNameLen = checkVchar1FirstNameLenMaxLimit(number); 
		serializeVchar1FirstNameLen(vchar1FirstNameLen);
	}

	public void setVchar1FirstNameLen(int number) {
	    number = checkVchar1FirstNameLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVchar1FirstNameLen((short)number);
	}
	public void setVchar1FirstNameLen(long number) {
	    number = checkVchar1FirstNameLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVchar1FirstNameLen((short)number);
	}
	

	/**
	 *	Returns the value of vchar1FirstNameData
	 *	@return vchar1FirstNameData
	 */
   public char[] getVchar1FirstNameData() throws CFException{
     if (isVchar1FirstNameDataModified()) { 
        vchar1FirstNameData = refreshVchar1FirstNameData();
     }
   		return vchar1FirstNameData;
   }

  
	/**
	*  set variable vchar1FirstNameData
	*  Corresponding COBOL Variable is VCHAR1-FIRST-NAME-DATA
	*  @param value
	**/
   public void setVchar1FirstNameData(char[] value) {
      vchar1FirstNameData = checkVchar1FirstNameDataConstraints(value);
      serializeVchar1FirstNameData(vchar1FirstNameData);
   } 

     /**
	 * 	Update Vchar1FirstNameData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVchar1FirstNameData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVchar1FirstNameData,vchar1FirstNameData.length);
   	
   }
   
   public void setVchar1FirstNameData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVchar1FirstNameData,vchar1FirstNameData.length);
   	
   }
   
     /**
	 * 	Update Vchar1FirstNameData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVchar1FirstNameData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVchar1FirstNameData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Vchar1FirstNameData with another Field
	 *	@param value
	 */
   public void setVchar1FirstNameData(Field source) {
       replace(source,0,source.length(),beginVchar1FirstNameData,VCHAR_1_FIRST_NAME_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Vchar1FirstNameData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVchar1FirstNameData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVchar1FirstNameData,VCHAR_1_FIRST_NAME_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Vchar1FirstNameData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVchar1FirstNameData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVchar1FirstNameData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getVchar1FirstNameFieldLength() {
			return VCHAR_1_FIRST_NAME_LENGTH;
		}

}
  
