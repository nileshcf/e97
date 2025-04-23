package com.cloudframe.app.db2funci.dto;

/**
*  The class Parmlst is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Parmlst extends ParmlstSerialized { 
   

								private short parmlen;

						private char[] parmtxt = Field.fillLowValue(254);
	
	/**
	* Constructor for Parmlst
	**/
    public Parmlst() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Parmlst. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parmlst(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of parmlen
	 *	@return parmlen
	 */
	public short getParmlen() throws CFException {
        if (isParmlenModified()) { 
           parmlen = refreshParmlen();
        }
   		return parmlen;
	}
	
	/**
	 * 	Update Parmlen with the passed value
	 *  Corresponding COBOL Variable is PARMLEN
	 *	@param number
	 */
	public void setParmlen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    parmlen = checkParmlenMaxLimit(number); 
		serializeParmlen(parmlen);
	}

	public void setParmlen(int number) {
	    number = checkParmlenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmlen((short)number);
	}
	public void setParmlen(long number) {
	    number = checkParmlenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmlen((short)number);
	}
	

	/**
	 *	Returns the value of parmtxt
	 *	@return parmtxt
	 */
   public char[] getParmtxt() throws CFException{
     if (isParmtxtModified()) { 
        parmtxt = refreshParmtxt();
     }
   		return parmtxt;
   }

  
	/**
	*  set variable parmtxt
	*  Corresponding COBOL Variable is PARMTXT
	*  @param value
	**/
   public void setParmtxt(char[] value) {
      parmtxt = checkParmtxtConstraints(value);
      serializeParmtxt(parmtxt);
   } 

     /**
	 * 	Update Parmtxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmtxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParmtxt,parmtxt.length);
   	
   }
   
   public void setParmtxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParmtxt,parmtxt.length);
   	
   }
   
     /**
	 * 	Update Parmtxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmtxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmtxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Parmtxt with another Field
	 *	@param value
	 */
   public void setParmtxt(Field source) {
       replace(source,0,source.length(),beginParmtxt,PARMTXT_LEN);
   	
   }  
   
     /**
	 * 	Update Parmtxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmtxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParmtxt,PARMTXT_LEN);
   	
   }
   
     /**
	 * 	Update Parmtxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmtxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmtxt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getParmlstFieldLength() {
			return PARMLST_LENGTH;
		}

}
  
