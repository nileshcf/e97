package com.cloudframe.app.varchar1.dto;

/**
*  The class Vchar1NickName is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:04. using version 5.0.0.256
**/


import com.cloudframe.app.varchar1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Vchar1NickName extends Vchar1NickNameSerialized { 
   

								private short vchar1NickNameLen;

						private char[] vchar1NickNameData = Field.fillLowValue(15);
	
	/**
	* Constructor for Vchar1NickName
	**/
    public Vchar1NickName() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Vchar1NickName. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Vchar1NickName(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of vchar1NickNameLen
	 *	@return vchar1NickNameLen
	 */
	public short getVchar1NickNameLen() throws CFException {
        if (isVchar1NickNameLenModified()) { 
           vchar1NickNameLen = refreshVchar1NickNameLen();
        }
   		return vchar1NickNameLen;
	}
	
	/**
	 * 	Update Vchar1NickNameLen with the passed value
	 *  Corresponding COBOL Variable is VCHAR1-NICK-NAME-LEN
	 *	@param number
	 */
	public void setVchar1NickNameLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    vchar1NickNameLen = checkVchar1NickNameLenMaxLimit(number); 
		serializeVchar1NickNameLen(vchar1NickNameLen);
	}

	public void setVchar1NickNameLen(int number) {
	    number = checkVchar1NickNameLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVchar1NickNameLen((short)number);
	}
	public void setVchar1NickNameLen(long number) {
	    number = checkVchar1NickNameLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVchar1NickNameLen((short)number);
	}
	

	/**
	 *	Returns the value of vchar1NickNameData
	 *	@return vchar1NickNameData
	 */
   public char[] getVchar1NickNameData() throws CFException{
     if (isVchar1NickNameDataModified()) { 
        vchar1NickNameData = refreshVchar1NickNameData();
     }
   		return vchar1NickNameData;
   }

  
	/**
	*  set variable vchar1NickNameData
	*  Corresponding COBOL Variable is VCHAR1-NICK-NAME-DATA
	*  @param value
	**/
   public void setVchar1NickNameData(char[] value) {
      vchar1NickNameData = checkVchar1NickNameDataConstraints(value);
      serializeVchar1NickNameData(vchar1NickNameData);
   } 

     /**
	 * 	Update Vchar1NickNameData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVchar1NickNameData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVchar1NickNameData,vchar1NickNameData.length);
   	
   }
   
   public void setVchar1NickNameData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVchar1NickNameData,vchar1NickNameData.length);
   	
   }
   
     /**
	 * 	Update Vchar1NickNameData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVchar1NickNameData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVchar1NickNameData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Vchar1NickNameData with another Field
	 *	@param value
	 */
   public void setVchar1NickNameData(Field source) {
       replace(source,0,source.length(),beginVchar1NickNameData,VCHAR_1_NICK_NAME_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Vchar1NickNameData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVchar1NickNameData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVchar1NickNameData,VCHAR_1_NICK_NAME_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Vchar1NickNameData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVchar1NickNameData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVchar1NickNameData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getVchar1NickNameFieldLength() {
			return VCHAR_1_NICK_NAME_LENGTH;
		}

}
  
