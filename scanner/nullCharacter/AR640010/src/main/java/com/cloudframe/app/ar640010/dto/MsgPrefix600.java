package com.cloudframe.app.ar640010.dto;

/**
*  The class MsgPrefix600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsgPrefix600 extends MsgPrefix600Serialized { 
   

						private char[] programId600 = new char[8];

	
	/**
	* Constructor for MsgPrefix600
	**/
    public MsgPrefix600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsgPrefix600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsgPrefix600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setProgramId600(("AR640010").toCharArray());
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 8
             ,1
             );
    } 

	/**
	 *	Returns the value of programId600
	 *	@return programId600
	 */
   public char[] getProgramId600() throws CFException{
     if (isProgramId600Modified()) { 
        programId600 = refreshProgramId600();
     }
   		return programId600;
   }

  
	/**
	*  set variable programId600
	*  Corresponding COBOL Variable is 600-PROGRAM-ID
	*  @param value
	**/
   public void setProgramId600(char[] value) {
      programId600 = checkProgramId600Constraints(value);
      serializeProgramId600(programId600);
   } 

     /**
	 * 	Update ProgramId600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProgramId600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProgramId600,programId600.length);
   	
   }
   
   public void setProgramId600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProgramId600,programId600.length);
   	
   }
   
     /**
	 * 	Update ProgramId600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProgramId600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProgramId600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProgramId600 with another Field
	 *	@param value
	 */
   public void setProgramId600(Field source) {
       replace(source,0,source.length(),beginProgramId600,PROGRAM_ID_600_LEN);
   	
   }  
   
     /**
	 * 	Update ProgramId600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProgramId600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProgramId600,PROGRAM_ID_600_LEN);
   	
   }
   
     /**
	 * 	Update ProgramId600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProgramId600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProgramId600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMsgPrefix600FieldLength() {
			return MSG_PREFIX_600_LENGTH;
		}

}
  
