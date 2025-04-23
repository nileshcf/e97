package com.cloudframe.app.calldrvr.dto;

/**
*  The class Pgm4Parm4Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:35. using version 5.0.0.254
**/


import com.cloudframe.app.calldrvr.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Pgm4Parm4Group extends Pgm4Parm4GroupSerialized { 
   

						private char[] pgm4Parm4 = Field.fillLowValue(8);
	
	/**
	* Constructor for Pgm4Parm4Group
	**/
    public Pgm4Parm4Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Pgm4Parm4Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pgm4Parm4Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of pgm4Parm4
	 *	@return pgm4Parm4
	 */
   public char[] getPgm4Parm4() throws CFException{
     if (isPgm4Parm4Modified()) { 
        pgm4Parm4 = refreshPgm4Parm4();
     }
   		return pgm4Parm4;
   }

  
	/**
	*  set variable pgm4Parm4
	*  Corresponding COBOL Variable is WS-PGM4-PARM4
	*  @param value
	**/
   public void setPgm4Parm4(char[] value) {
      pgm4Parm4 = checkPgm4Parm4Constraints(value);
      serializePgm4Parm4(pgm4Parm4);
   } 

     /**
	 * 	Update Pgm4Parm4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgm4Parm4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPgm4Parm4,pgm4Parm4.length);
   	
   }
   
   public void setPgm4Parm4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPgm4Parm4,pgm4Parm4.length);
   	
   }
   
     /**
	 * 	Update Pgm4Parm4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgm4Parm4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgm4Parm4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Pgm4Parm4 with another Field
	 *	@param value
	 */
   public void setPgm4Parm4(Field source) {
       replace(source,0,source.length(),beginPgm4Parm4,PGM_4_PARM_4_LEN);
   	
   }  
   
     /**
	 * 	Update Pgm4Parm4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgm4Parm4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPgm4Parm4,PGM_4_PARM_4_LEN);
   	
   }
   
     /**
	 * 	Update Pgm4Parm4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgm4Parm4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgm4Parm4+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPgm4Parm4GroupFieldLength() {
			return PGM_4_PARM_4_GROUP_LENGTH;
		}

}
  
