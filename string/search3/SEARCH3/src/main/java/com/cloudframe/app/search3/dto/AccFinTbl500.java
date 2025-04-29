package com.cloudframe.app.search3.dto;

/**
*  The class AccFinTbl500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.search3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AccFinTbl500 extends AccFinTbl500Serialized { 
   

						private char[] accFinNfInd500 = Field.fillLowValue(2);

								private int accFinNfAmt500;
	
	/**
	* Constructor for AccFinTbl500
	**/
    public AccFinTbl500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AccFinTbl500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AccFinTbl500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of accFinNfInd500
	 *	@return accFinNfInd500
	 */
   public char[] getAccFinNfInd500() throws CFException{
     if (isAccFinNfInd500Modified()) { 
        accFinNfInd500 = refreshAccFinNfInd500();
     }
   		return accFinNfInd500;
   }

  
	/**
	*  set variable accFinNfInd500
	*  Corresponding COBOL Variable is 500-ACC-FIN-NF-IND
	*  @param value
	**/
   public void setAccFinNfInd500(char[] value) {
      accFinNfInd500 = checkAccFinNfInd500Constraints(value);
      serializeAccFinNfInd500(accFinNfInd500);
   } 

     /**
	 * 	Update AccFinNfInd500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAccFinNfInd500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAccFinNfInd500,accFinNfInd500.length);
   	
   }
   
   public void setAccFinNfInd500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAccFinNfInd500,accFinNfInd500.length);
   	
   }
   
     /**
	 * 	Update AccFinNfInd500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAccFinNfInd500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAccFinNfInd500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AccFinNfInd500 with another Field
	 *	@param value
	 */
   public void setAccFinNfInd500(Field source) {
       replace(source,0,source.length(),beginAccFinNfInd500,ACC_FIN_NF_IND_500_LEN);
   	
   }  
   
     /**
	 * 	Update AccFinNfInd500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAccFinNfInd500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAccFinNfInd500,ACC_FIN_NF_IND_500_LEN);
   	
   }
   
     /**
	 * 	Update AccFinNfInd500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAccFinNfInd500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAccFinNfInd500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of accFinNfAmt500
	 *	@return accFinNfAmt500
	 */
	public int getAccFinNfAmt500() throws CFException {
        if (isAccFinNfAmt500Modified()) { 
           accFinNfAmt500 = refreshAccFinNfAmt500();
        }
   		return accFinNfAmt500;
	}
	
	/**
	 * 	Update AccFinNfAmt500 with the passed value
	 *  Corresponding COBOL Variable is 500-ACC-FIN-NF-AMT
	 *	@param number
	 */
	public void setAccFinNfAmt500(int number) {
	     // Truncate if the number is beyond +/- Max range
	    accFinNfAmt500 = checkAccFinNfAmt500MaxLimit(number); 
		serializeAccFinNfAmt500(accFinNfAmt500);
	}


	public void setAccFinNfAmt500(long number) {
	    number = checkAccFinNfAmt500MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAccFinNfAmt500((int)number);
	}
	

	
	
	

		public static int getAccFinTbl500FieldLength() {
			return ACC_FIN_TBL_500_LENGTH;
		}

}
  
