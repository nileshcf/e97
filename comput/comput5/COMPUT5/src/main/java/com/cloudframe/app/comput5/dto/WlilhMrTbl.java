package com.cloudframe.app.comput5.dto;

/**
*  The class WlilhMrTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class WlilhMrTbl extends WlilhMrTblSerialized { 
   

						private char[] wlilhMrTblPayInd = Field.fillLowValue(1);

								private BigDecimal wlilhMrTblLoanAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for WlilhMrTbl
	**/
    public WlilhMrTbl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WlilhMrTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WlilhMrTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wlilhMrTblPayInd
	 *	@return wlilhMrTblPayInd
	 */
   public char[] getWlilhMrTblPayInd() throws CFException{
     if (isWlilhMrTblPayIndModified()) { 
        wlilhMrTblPayInd = refreshWlilhMrTblPayInd();
     }
   		return wlilhMrTblPayInd;
   }

  
	/**
	*  set variable wlilhMrTblPayInd
	*  Corresponding COBOL Variable is WLILH-MR-TBL-PAY-IND
	*  @param value
	**/
   public void setWlilhMrTblPayInd(char[] value) {
      wlilhMrTblPayInd = checkWlilhMrTblPayIndConstraints(value);
      serializeWlilhMrTblPayInd(wlilhMrTblPayInd);
   } 

     /**
	 * 	Update WlilhMrTblPayInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWlilhMrTblPayInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWlilhMrTblPayInd,wlilhMrTblPayInd.length);
   	
   }
   
   public void setWlilhMrTblPayInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWlilhMrTblPayInd,wlilhMrTblPayInd.length);
   	
   }
   
     /**
	 * 	Update WlilhMrTblPayInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWlilhMrTblPayInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWlilhMrTblPayInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WlilhMrTblPayInd with another Field
	 *	@param value
	 */
   public void setWlilhMrTblPayInd(Field source) {
       replace(source,0,source.length(),beginWlilhMrTblPayInd,WLILH_MR_TBL_PAY_IND_LEN);
   	
   }  
   
     /**
	 * 	Update WlilhMrTblPayInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWlilhMrTblPayInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWlilhMrTblPayInd,WLILH_MR_TBL_PAY_IND_LEN);
   	
   }
   
     /**
	 * 	Update WlilhMrTblPayInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWlilhMrTblPayInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWlilhMrTblPayInd+targetIndex,targetLen);
    
   }
	char[] wlilhMrTblPay88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isWlilhMrTblPay()
	 *	@return  Returns true if isWlilhMrTblPay() is "1"
	 */
   public boolean isWlilhMrTblPay() throws CFException {
      return (  compareChars( getWlilhMrTblPayInd() , wlilhMrTblPay88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setWlilhMrTblPayTrue() {  			
    	setWlilhMrTblPayInd( wlilhMrTblPay88Value);
   	}
	public BigDecimal getWlilhMrTblLoanAmt() throws CFException {
        if (isWlilhMrTblLoanAmtModified()) { 
           wlilhMrTblLoanAmt = refreshWlilhMrTblLoanAmt();
        }
   		return wlilhMrTblLoanAmt;
	}

    public char[] getWlilhMrTblLoanAmtString() {
          return  wlilhMrTblLoanAmtString();
    }
	
	/**
	 * 	Update WlilhMrTblLoanAmt with the passed number
	 *  Corresponding COBOL Variable is WLILH-MR-TBL-LOAN-AMT
	 *	@param number
	 */
	public void setWlilhMrTblLoanAmt(BigDecimal number) {	
     wlilhMrTblLoanAmt = checkWlilhMrTblLoanAmtMaxLimit(number);
	    serializeWlilhMrTblLoanAmt(wlilhMrTblLoanAmt);
   }

	
	
	

		public static int getWlilhMrTblFieldLength() {
			return WLILH_MR_TBL_LENGTH;
		}

}
  
