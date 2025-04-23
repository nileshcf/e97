package com.cloudframe.app.search3.dto;

/**
*  The class SrchVar is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.search3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SrchVar extends SrchVarSerialized {
   

						private char[] srchVar1 = Field.fillLowValue(2);

								private int srchVar2;
	
	/**
	* Constructor for SrchVar
	**/
    public SrchVar() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of srchVar1
	 *	@return srchVar1
	 */
   public char[] getSrchVar1() throws CFException{
     if (isSrchVar1Modified()) { 
        srchVar1 = refreshSrchVar1();
     }
   		return srchVar1;
   }

  
	/**
	*  set variable srchVar1
	*  Corresponding COBOL Variable is WS-SRCH-VAR-1
	*  @param value
	**/
   public void setSrchVar1(char[] value) {
      srchVar1 = checkSrchVar1Constraints(value);
      serializeSrchVar1(srchVar1);
   } 

     /**
	 * 	Update SrchVar1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrchVar1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSrchVar1,srchVar1.length);
   	
   }
   
   public void setSrchVar1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSrchVar1,srchVar1.length);
   	
   }
   
     /**
	 * 	Update SrchVar1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrchVar1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrchVar1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SrchVar1 with another Field
	 *	@param value
	 */
   public void setSrchVar1(Field source) {
       replace(source,0,source.length(),beginSrchVar1,SRCH_VAR_1_LEN);
   	
   }  
   
     /**
	 * 	Update SrchVar1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrchVar1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSrchVar1,SRCH_VAR_1_LEN);
   	
   }
   
     /**
	 * 	Update SrchVar1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrchVar1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrchVar1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of srchVar2
	 *	@return srchVar2
	 */
	public int getSrchVar2() throws CFException {
       if (isSrchVar2Modified()) { 
           srchVar2 = refreshSrchVar2();
        }
   		return srchVar2;
	}
	

	
	   
	/**
	 * 	Update SrchVar2 with the passed value
	 *  Corresponding COBOL Variable is WS-SRCH-VAR-2
	 *	@param number
	 */
	public void setSrchVar2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    srchVar2 = checkSrchVar2MaxLimit(number); 
		serializeSrchVar2(srchVar2);
	}
	

	public void setSrchVar2(long number) {
	    number = checkSrchVar2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSrchVar2((int)number);
	}
	
	/**
	 * 	Update SrchVar2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrchVar2(char[] value) throws CFException {
		 srchVar2 = serializeSrchVar2(value);
	}
	/**
	 * 	Update SrchVar2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrchVar2String(char[] value) throws CFException {
		 setSrchVar2(value);
	}

	
	
	

		public static int getSrchVarFieldLength() {
			return SRCH_VAR_LENGTH;
		}

}
  
