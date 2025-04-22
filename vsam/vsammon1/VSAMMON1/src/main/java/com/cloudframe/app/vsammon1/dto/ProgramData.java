package com.cloudframe.app.vsammon1.dto;

/**
*  The class ProgramData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:09. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ProgramData extends ProgramDataSerialized { 
   

						private char[] iProgram = Field.fillLowValue(8);
	
	/**
	* Constructor for ProgramData
	**/
    public ProgramData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ProgramData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProgramData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of iProgram
	 *	@return iProgram
	 */
   public char[] getIProgram() throws CFException{
     if (isIProgramModified()) { 
        iProgram = refreshIProgram();
     }
   		return iProgram;
   }

  
	/**
	*  set variable iProgram
	*  Corresponding COBOL Variable is WS-I-PROGRAM
	*  @param value
	**/
   public void setIProgram(char[] value) {
      iProgram = checkIProgramConstraints(value);
      serializeIProgram(iProgram);
   } 

     /**
	 * 	Update IProgram 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIProgram(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIProgram,iProgram.length);
   	
   }
   
   public void setIProgram(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIProgram,iProgram.length);
   	
   }
   
     /**
	 * 	Update IProgram 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIProgram(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIProgram+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IProgram with another Field
	 *	@param value
	 */
   public void setIProgram(Field source) {
       replace(source,0,source.length(),beginIProgram,I_PROGRAM_LEN);
   	
   }  
   
     /**
	 * 	Update IProgram 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIProgram(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIProgram,I_PROGRAM_LEN);
   	
   }
   
     /**
	 * 	Update IProgram 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIProgram(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIProgram+targetIndex,targetLen);
    
   }

	
	
	

		public static int getProgramDataFieldLength() {
			return PROGRAM_DATA_LENGTH;
		}

}
  
