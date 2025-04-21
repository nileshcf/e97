package com.cloudframe.app.ar640010.dto;

/**
*  The class ProgramMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ProgramMsg600 extends ProgramMsg600Serialized { 
   


						private char[] programVersion600 = new char[3];
	
	/**
	* Constructor for ProgramMsg600
	**/
    public ProgramMsg600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ProgramMsg600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProgramMsg600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("0000-START OF PROGRAM - VERSION: ").toCharArray()
             , getStartOffset() + 0
             ,33
             );
								setProgramVersion600(("018").toCharArray());
    } 

	/**
	 *	Returns the value of programVersion600
	 *	@return programVersion600
	 */
   public char[] getProgramVersion600() throws CFException{
     if (isProgramVersion600Modified()) { 
        programVersion600 = refreshProgramVersion600();
     }
   		return programVersion600;
   }

  
	/**
	*  set variable programVersion600
	*  Corresponding COBOL Variable is 600-PROGRAM-VERSION
	*  @param value
	**/
   public void setProgramVersion600(char[] value) {
      programVersion600 = checkProgramVersion600Constraints(value);
      serializeProgramVersion600(programVersion600);
   } 

     /**
	 * 	Update ProgramVersion600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProgramVersion600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProgramVersion600,programVersion600.length);
   	
   }
   
   public void setProgramVersion600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProgramVersion600,programVersion600.length);
   	
   }
   
     /**
	 * 	Update ProgramVersion600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProgramVersion600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProgramVersion600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProgramVersion600 with another Field
	 *	@param value
	 */
   public void setProgramVersion600(Field source) {
       replace(source,0,source.length(),beginProgramVersion600,PROGRAM_VERSION_600_LEN);
   	
   }  
   
     /**
	 * 	Update ProgramVersion600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProgramVersion600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProgramVersion600,PROGRAM_VERSION_600_LEN);
   	
   }
   
     /**
	 * 	Update ProgramVersion600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProgramVersion600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProgramVersion600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getProgramMsg600FieldLength() {
			return PROGRAM_MSG_600_LENGTH;
		}

}
  
