package com.cloudframe.app.ar640010.dto;

/**
*  The class SysMsgOutArray260 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SysMsgOutArray260 extends SysMsgOutArray260Serialized { 
   

						private char[] sysMsgOut260 = Field.fillLowValue(80);
	
	/**
	* Constructor for SysMsgOutArray260
	**/
    public SysMsgOutArray260() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SysMsgOutArray260. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SysMsgOutArray260(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sysMsgOut260
	 *	@return sysMsgOut260
	 */
   public char[] getSysMsgOut260() throws CFException{
     if (isSysMsgOut260Modified()) { 
        sysMsgOut260 = refreshSysMsgOut260();
     }
   		return sysMsgOut260;
   }

  
	/**
	*  set variable sysMsgOut260
	*  Corresponding COBOL Variable is 260-SYS-MSG-OUT
	*  @param value
	**/
   public void setSysMsgOut260(char[] value) {
      sysMsgOut260 = checkSysMsgOut260Constraints(value);
      serializeSysMsgOut260(sysMsgOut260);
   } 

     /**
	 * 	Update SysMsgOut260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSysMsgOut260(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSysMsgOut260,sysMsgOut260.length);
   	
   }
   
   public void setSysMsgOut260(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSysMsgOut260,sysMsgOut260.length);
   	
   }
   
     /**
	 * 	Update SysMsgOut260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSysMsgOut260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSysMsgOut260+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SysMsgOut260 with another Field
	 *	@param value
	 */
   public void setSysMsgOut260(Field source) {
       replace(source,0,source.length(),beginSysMsgOut260,SYS_MSG_OUT_260_LEN);
   	
   }  
   
     /**
	 * 	Update SysMsgOut260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSysMsgOut260(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSysMsgOut260,SYS_MSG_OUT_260_LEN);
   	
   }
   
     /**
	 * 	Update SysMsgOut260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSysMsgOut260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSysMsgOut260+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSysMsgOutArray260FieldLength() {
			return SYS_MSG_OUT_ARRAY_260_LENGTH;
		}

}
  
