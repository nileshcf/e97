package com.cloudframe.app.db2func.dto;

/**
*  The class Parm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Parm extends ParmSerialized {
   

								private short parmLen01;

						private char[] useSysin = Field.fillLowValue(1);


						private char[] command = Field.fillLowValue(20);

	
	/**
	* Constructor for Parm
	**/
    public Parm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of parmLen01
	 *	@return parmLen01
	 */
	public short getParmLen01() throws CFException {
        if (isParmLen01Modified()) { 
           parmLen01 = refreshParmLen01();
        }
   		return parmLen01;
	}
	
	/**
	 * 	Update ParmLen01 with the passed value
	 *  Corresponding COBOL Variable is LK-PARM-LEN
	 *	@param number
	 */
	public void setParmLen01(short number) {
	     // Truncate if the number is beyond +/- Max range
	    parmLen01 = checkParmLen01MaxLimit(number); 
		serializeParmLen01(parmLen01);
	}

	public void setParmLen01(int number) {
	    number = checkParmLen01MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmLen01((short)number);
	}
	public void setParmLen01(long number) {
	    number = checkParmLen01MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmLen01((short)number);
	}
	

	/**
	 *	Returns the value of useSysin
	 *	@return useSysin
	 */
   public char[] getUseSysin() throws CFException{
     if (isUseSysinModified()) { 
        useSysin = refreshUseSysin();
     }
   		return useSysin;
   }

  
	/**
	*  set variable useSysin
	*  Corresponding COBOL Variable is LK-USE-SYSIN
	*  @param value
	**/
   public void setUseSysin(char[] value) {
      useSysin = checkUseSysinConstraints(value);
      serializeUseSysin(useSysin);
   } 

     /**
	 * 	Update UseSysin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUseSysin(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUseSysin,useSysin.length);
   	
   }
   
   public void setUseSysin(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUseSysin,useSysin.length);
   	
   }
   
     /**
	 * 	Update UseSysin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUseSysin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUseSysin+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UseSysin with another Field
	 *	@param value
	 */
   public void setUseSysin(Field source) {
       replace(source,0,source.length(),beginUseSysin,USE_SYSIN_LEN);
   	
   }  
   
     /**
	 * 	Update UseSysin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUseSysin(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUseSysin,USE_SYSIN_LEN);
   	
   }
   
     /**
	 * 	Update UseSysin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUseSysin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUseSysin+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of command
	 *	@return command
	 */
   public char[] getCommand() throws CFException{
     if (isCommandModified()) { 
        command = refreshCommand();
     }
   		return command;
   }

  
	/**
	*  set variable command
	*  Corresponding COBOL Variable is LK-COMMAND
	*  @param value
	**/
   public void setCommand(char[] value) {
      command = checkCommandConstraints(value);
      serializeCommand(command);
   } 

     /**
	 * 	Update Command 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCommand(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCommand,command.length);
   	
   }
   
   public void setCommand(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCommand,command.length);
   	
   }
   
     /**
	 * 	Update Command 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCommand(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCommand+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Command with another Field
	 *	@param value
	 */
   public void setCommand(Field source) {
       replace(source,0,source.length(),beginCommand,COMMAND_LEN);
   	
   }  
   
     /**
	 * 	Update Command 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCommand(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCommand,COMMAND_LEN);
   	
   }
   
     /**
	 * 	Update Command 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCommand(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCommand+targetIndex,targetLen);
    
   }

	
	
	

		public static int getParmFieldLength() {
			return PARM_LENGTH;
		}

}
  
