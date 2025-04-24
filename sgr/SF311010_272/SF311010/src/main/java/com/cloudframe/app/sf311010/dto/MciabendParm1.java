package com.cloudframe.app.sf311010.dto;

/**
*  The class MciabendParm1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciabendParm1 extends MciabendParm1Serialized { 
   

						private char[] mciabendDumpOpt = new char[1];


								private int mciabendAbendCode;
	
	/**
	* Constructor for MciabendParm1
	**/
    public MciabendParm1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MciabendParm1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciabendParm1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMciabendDumpOpt(fillSpace(1));
    } 

	/**
	 *	Returns the value of mciabendDumpOpt
	 *	@return mciabendDumpOpt
	 */
   public char[] getMciabendDumpOpt() throws CFException{
     if (isMciabendDumpOptModified()) { 
        mciabendDumpOpt = refreshMciabendDumpOpt();
     }
   		return mciabendDumpOpt;
   }

  
	/**
	*  set variable mciabendDumpOpt
	*  Corresponding COBOL Variable is MCIABEND-DUMP-OPT
	*  @param value
	**/
   public void setMciabendDumpOpt(char[] value) {
      mciabendDumpOpt = checkMciabendDumpOptConstraints(value);
      serializeMciabendDumpOpt(mciabendDumpOpt);
   } 

     /**
	 * 	Update MciabendDumpOpt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciabendDumpOpt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciabendDumpOpt,mciabendDumpOpt.length);
   	
   }
   
   public void setMciabendDumpOpt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciabendDumpOpt,mciabendDumpOpt.length);
   	
   }
   
     /**
	 * 	Update MciabendDumpOpt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciabendDumpOpt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciabendDumpOpt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciabendDumpOpt with another Field
	 *	@param value
	 */
   public void setMciabendDumpOpt(Field source) {
       replace(source,0,source.length(),beginMciabendDumpOpt,MCIABEND_DUMP_OPT_LEN);
   	
   }  
   
     /**
	 * 	Update MciabendDumpOpt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciabendDumpOpt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciabendDumpOpt,MCIABEND_DUMP_OPT_LEN);
   	
   }
   
     /**
	 * 	Update MciabendDumpOpt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciabendDumpOpt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciabendDumpOpt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciabendAbendCode
	 *	@return mciabendAbendCode
	 */
	public int getMciabendAbendCode() throws CFException {
        if (isMciabendAbendCodeModified()) { 
           mciabendAbendCode = refreshMciabendAbendCode();
        }
   		return mciabendAbendCode;
	}
	
	/**
	 * 	Update MciabendAbendCode with the passed value
	 *  Corresponding COBOL Variable is MCIABEND-ABEND-CODE
	 *	@param number
	 */
	public void setMciabendAbendCode(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mciabendAbendCode = checkMciabendAbendCodeMaxLimit(number); 
		serializeMciabendAbendCode(mciabendAbendCode);
	}


	public void setMciabendAbendCode(long number) {
	    number = checkMciabendAbendCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMciabendAbendCode((int)number);
	}
	

	
	
	

		public static int getMciabendParm1FieldLength() {
			return MCIABEND_PARM_1_LENGTH;
		}

}
  
