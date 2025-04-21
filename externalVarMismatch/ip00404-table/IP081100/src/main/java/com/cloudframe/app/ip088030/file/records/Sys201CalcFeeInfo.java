package com.cloudframe.app.ip088030.file.records;

/**
*  The class Sys201CalcFeeInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.ip088030.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys201CalcFeeInfo extends Sys201CalcFeeInfoSerialized { 
   

						private char[] sys201CalcPayParty = Field.fillLowValue(3);

								private long sys201CalcFeeSetlAmt;

								private int sys201CalcFeeSetlCur;

						private char[] sys201CalcFeeDrCrInd = Field.fillLowValue(2);
	
	/**
	* Constructor for Sys201CalcFeeInfo
	**/
    public Sys201CalcFeeInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sys201CalcFeeInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys201CalcFeeInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sys201CalcPayParty
	 *	@return sys201CalcPayParty
	 */
   public char[] getSys201CalcPayParty() throws CFException{
     if (isSys201CalcPayPartyModified()) { 
        sys201CalcPayParty = refreshSys201CalcPayParty();
     }
   		return sys201CalcPayParty;
   }

  
	/**
	*  set variable sys201CalcPayParty
	*  Corresponding COBOL Variable is SYS201-CALC-PAY-PARTY
	*  @param value
	**/
   public void setSys201CalcPayParty(char[] value) {
      sys201CalcPayParty = checkSys201CalcPayPartyConstraints(value);
      serializeSys201CalcPayParty(sys201CalcPayParty);
   } 

     /**
	 * 	Update Sys201CalcPayParty 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201CalcPayParty(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201CalcPayParty,sys201CalcPayParty.length);
   	
   }
   
   public void setSys201CalcPayParty(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201CalcPayParty,sys201CalcPayParty.length);
   	
   }
   
     /**
	 * 	Update Sys201CalcPayParty 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201CalcPayParty(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201CalcPayParty+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201CalcPayParty with another Field
	 *	@param value
	 */
   public void setSys201CalcPayParty(Field source) {
       replace(source,0,source.length(),beginSys201CalcPayParty,SYS_201_CALC_PAY_PARTY_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201CalcPayParty 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201CalcPayParty(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201CalcPayParty,SYS_201_CALC_PAY_PARTY_LEN);
   	
   }
   
     /**
	 * 	Update Sys201CalcPayParty 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201CalcPayParty(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201CalcPayParty+targetIndex,targetLen);
    
   }
	char[] sys20188PayPartyAcq88Value = "ACQ".toCharArray();
	/**
	 *	Test condition "ACQ" for isSys20188PayPartyAcq()
	 *	@return  Returns true if isSys20188PayPartyAcq() is "ACQ"
	 */
   public boolean isSys20188PayPartyAcq() throws CFException {
      return (  compareChars( getSys201CalcPayParty() , sys20188PayPartyAcq88Value)  == 0  );
   }


	/**
	*  set values "ACQ"
	*/
   	public void setSys20188PayPartyAcqTrue() {  			
    	setSys201CalcPayParty( sys20188PayPartyAcq88Value);
   	}
	char[] sys20188PayPartyIss88Value = "ISS".toCharArray();
	/**
	 *	Test condition "ISS" for isSys20188PayPartyIss()
	 *	@return  Returns true if isSys20188PayPartyIss() is "ISS"
	 */
   public boolean isSys20188PayPartyIss() throws CFException {
      return (  compareChars( getSys201CalcPayParty() , sys20188PayPartyIss88Value)  == 0  );
   }


	/**
	*  set values "ISS"
	*/
   	public void setSys20188PayPartyIssTrue() {  			
    	setSys201CalcPayParty( sys20188PayPartyIss88Value);
   	}
	/**
	 *	Returns the value of sys201CalcFeeSetlAmt
	 *	@return sys201CalcFeeSetlAmt
	 */
	public long getSys201CalcFeeSetlAmt() throws CFException {
       if (isSys201CalcFeeSetlAmtModified()) { 
           sys201CalcFeeSetlAmt = refreshSys201CalcFeeSetlAmt();
        }
   		return sys201CalcFeeSetlAmt;
	}
	

    /**
	 *	Returns the String value of sys201CalcFeeSetlAmt
	 *	@return sys201CalcFeeSetlAmt
	 */
	public char[]  getSys201CalcFeeSetlAmtActualString() {
	    String value = String.valueOf(sys201CalcFeeSetlAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Sys201CalcFeeSetlAmt with the passed value
	 *  Corresponding COBOL Variable is SYS201-CALC-FEE-SETL-AMT
	 *	@param number
	 */
	public void setSys201CalcFeeSetlAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sys201CalcFeeSetlAmt = checkSys201CalcFeeSetlAmtMaxLimit(number); 
		serializeSys201CalcFeeSetlAmt(sys201CalcFeeSetlAmt);
	}
	

	/**
	 * 	Update Sys201CalcFeeSetlAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys201CalcFeeSetlAmt(char[] value) throws CFException {
		 sys201CalcFeeSetlAmt = serializeSys201CalcFeeSetlAmt(value);
	}
	/**
	 * 	Update Sys201CalcFeeSetlAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys201CalcFeeSetlAmtString(char[] value) throws CFException {
		 setSys201CalcFeeSetlAmt(value);
	}
	/**
	 *	Returns the value of sys201CalcFeeSetlCur
	 *	@return sys201CalcFeeSetlCur
	 */
	public int getSys201CalcFeeSetlCur() throws CFException {
       if (isSys201CalcFeeSetlCurModified()) { 
           sys201CalcFeeSetlCur = refreshSys201CalcFeeSetlCur();
        }
   		return sys201CalcFeeSetlCur;
	}
	

	
	   
	/**
	 * 	Update Sys201CalcFeeSetlCur with the passed value
	 *  Corresponding COBOL Variable is SYS201-CALC-FEE-SETL-CUR
	 *	@param number
	 */
	public void setSys201CalcFeeSetlCur(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    sys201CalcFeeSetlCur = checkSys201CalcFeeSetlCurMaxLimit(number); 
		serializeSys201CalcFeeSetlCur(sys201CalcFeeSetlCur);
	}
	

	public void setSys201CalcFeeSetlCur(long number) {
	    number = checkSys201CalcFeeSetlCurMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSys201CalcFeeSetlCur((int)number);
	}
	
	/**
	 * 	Update Sys201CalcFeeSetlCur with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys201CalcFeeSetlCur(char[] value) throws CFException {
		 sys201CalcFeeSetlCur = serializeSys201CalcFeeSetlCur(value);
	}
	/**
	 * 	Update Sys201CalcFeeSetlCur with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys201CalcFeeSetlCurString(char[] value) throws CFException {
		 setSys201CalcFeeSetlCur(value);
	}
	/**
	 *	Returns the value of sys201CalcFeeDrCrInd
	 *	@return sys201CalcFeeDrCrInd
	 */
   public char[] getSys201CalcFeeDrCrInd() throws CFException{
     if (isSys201CalcFeeDrCrIndModified()) { 
        sys201CalcFeeDrCrInd = refreshSys201CalcFeeDrCrInd();
     }
   		return sys201CalcFeeDrCrInd;
   }

  
	/**
	*  set variable sys201CalcFeeDrCrInd
	*  Corresponding COBOL Variable is SYS201-CALC-FEE-DR-CR-IND
	*  @param value
	**/
   public void setSys201CalcFeeDrCrInd(char[] value) {
      sys201CalcFeeDrCrInd = checkSys201CalcFeeDrCrIndConstraints(value);
      serializeSys201CalcFeeDrCrInd(sys201CalcFeeDrCrInd);
   } 

     /**
	 * 	Update Sys201CalcFeeDrCrInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201CalcFeeDrCrInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201CalcFeeDrCrInd,sys201CalcFeeDrCrInd.length);
   	
   }
   
   public void setSys201CalcFeeDrCrInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201CalcFeeDrCrInd,sys201CalcFeeDrCrInd.length);
   	
   }
   
     /**
	 * 	Update Sys201CalcFeeDrCrInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201CalcFeeDrCrInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201CalcFeeDrCrInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201CalcFeeDrCrInd with another Field
	 *	@param value
	 */
   public void setSys201CalcFeeDrCrInd(Field source) {
       replace(source,0,source.length(),beginSys201CalcFeeDrCrInd,SYS_201_CALC_FEE_DR_CR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201CalcFeeDrCrInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201CalcFeeDrCrInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201CalcFeeDrCrInd,SYS_201_CALC_FEE_DR_CR_IND_LEN);
   	
   }
   
     /**
	 * 	Update Sys201CalcFeeDrCrInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201CalcFeeDrCrInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201CalcFeeDrCrInd+targetIndex,targetLen);
    
   }
	char[] sys20188FeeIndCr88Value = "CR".toCharArray();
	/**
	 *	Test condition "CR" for isSys20188FeeIndCr()
	 *	@return  Returns true if isSys20188FeeIndCr() is "CR"
	 */
   public boolean isSys20188FeeIndCr() throws CFException {
      return (  compareChars( getSys201CalcFeeDrCrInd() , sys20188FeeIndCr88Value)  == 0  );
   }


	/**
	*  set values "CR"
	*/
   	public void setSys20188FeeIndCrTrue() {  			
    	setSys201CalcFeeDrCrInd( sys20188FeeIndCr88Value);
   	}
	char[] sys20188FeeIndDr88Value = "DR".toCharArray();
	/**
	 *	Test condition "DR" for isSys20188FeeIndDr()
	 *	@return  Returns true if isSys20188FeeIndDr() is "DR"
	 */
   public boolean isSys20188FeeIndDr() throws CFException {
      return (  compareChars( getSys201CalcFeeDrCrInd() , sys20188FeeIndDr88Value)  == 0  );
   }


	/**
	*  set values "DR"
	*/
   	public void setSys20188FeeIndDrTrue() {  			
    	setSys201CalcFeeDrCrInd( sys20188FeeIndDr88Value);
   	}

	
	
	

		public static int getSys201CalcFeeInfoFieldLength() {
			return SYS_201_CALC_FEE_INFO_LENGTH;
		}

}
  
