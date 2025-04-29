package com.cloudframe.app.calldrvr.dto;

/**
*  The class Parm4Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:31. using version 5.0.0.257
**/


import com.cloudframe.app.calldrvr.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Parm4Group extends Parm4GroupSerialized { 
   

						private char[] parm4 = Field.fillLowValue(8);
	
	/**
	* Constructor for Parm4Group
	**/
    public Parm4Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Parm4Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parm4Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of parm4
	 *	@return parm4
	 */
   public char[] getParm4() throws CFException{
     if (isParm4Modified()) { 
        parm4 = refreshParm4();
     }
   		return parm4;
   }

  
	/**
	*  set variable parm4
	*  Corresponding COBOL Variable is WS-PARM4
	*  @param value
	**/
   public void setParm4(char[] value) {
      parm4 = checkParm4Constraints(value);
      serializeParm4(parm4);
   } 

     /**
	 * 	Update Parm4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParm4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParm4,parm4.length);
   	
   }
   
   public void setParm4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParm4,parm4.length);
   	
   }
   
     /**
	 * 	Update Parm4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParm4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParm4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Parm4 with another Field
	 *	@param value
	 */
   public void setParm4(Field source) {
       replace(source,0,source.length(),beginParm4,PARM_4_LEN);
   	
   }  
   
     /**
	 * 	Update Parm4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParm4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParm4,PARM_4_LEN);
   	
   }
   
     /**
	 * 	Update Parm4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParm4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParm4+targetIndex,targetLen);
    
   }

	
	
	

		public static int getParm4GroupFieldLength() {
			return PARM_4_GROUP_LENGTH;
		}

}
  
