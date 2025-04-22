package com.cloudframe.app.init2.dto;

/**
*  The class L6560DbscInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class L6560DbscInfo extends L6560DbscInfoSerialized { 
   

						private char[] l6560DbscApplicableInd = Field.fillLowValue(1);

								private BigDecimal l6560DbscTotSurrAmt = BigDecimal.ZERO;

								private BigDecimal l6560DbscTotChrgAmt = BigDecimal.ZERO;

								private BigDecimal l6560DbscTotFreeAmt = BigDecimal.ZERO;

								private BigDecimal l6560DbscAssSurrAmt = BigDecimal.ZERO;

								private BigDecimal l6560DbscAssChrgAmt = BigDecimal.ZERO;

								private BigDecimal l6560DbscAssFreeAmt = BigDecimal.ZERO;

						private char[] l6560PlanFndTypCd = Field.fillLowValue(1);
	
	/**
	* Constructor for L6560DbscInfo
	**/
    public L6560DbscInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for L6560DbscInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public L6560DbscInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of l6560DbscApplicableInd
	 *	@return l6560DbscApplicableInd
	 */
   public char[] getL6560DbscApplicableInd() throws CFException{
     if (isL6560DbscApplicableIndModified()) { 
        l6560DbscApplicableInd = refreshL6560DbscApplicableInd();
     }
   		return l6560DbscApplicableInd;
   }

  
	/**
	*  set variable l6560DbscApplicableInd
	*  Corresponding COBOL Variable is L6560-DBSC-APPLICABLE-IND
	*  @param value
	**/
   public void setL6560DbscApplicableInd(char[] value) {
      l6560DbscApplicableInd = checkL6560DbscApplicableIndConstraints(value);
      serializeL6560DbscApplicableInd(l6560DbscApplicableInd);
   } 

     /**
	 * 	Update L6560DbscApplicableInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560DbscApplicableInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL6560DbscApplicableInd,l6560DbscApplicableInd.length);
   	
   }
   
   public void setL6560DbscApplicableInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL6560DbscApplicableInd,l6560DbscApplicableInd.length);
   	
   }
   
     /**
	 * 	Update L6560DbscApplicableInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560DbscApplicableInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560DbscApplicableInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L6560DbscApplicableInd with another Field
	 *	@param value
	 */
   public void setL6560DbscApplicableInd(Field source) {
       replace(source,0,source.length(),beginL6560DbscApplicableInd,L_6560_DBSC_APPLICABLE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update L6560DbscApplicableInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560DbscApplicableInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL6560DbscApplicableInd,L_6560_DBSC_APPLICABLE_IND_LEN);
   	
   }
   
     /**
	 * 	Update L6560DbscApplicableInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560DbscApplicableInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560DbscApplicableInd+targetIndex,targetLen);
    
   }
	char[] l6560DbscApplicable88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isL6560DbscApplicable()
	 *	@return  Returns true if isL6560DbscApplicable() is "Y"
	 */
   public boolean isL6560DbscApplicable() throws CFException {
      return (  compareChars( getL6560DbscApplicableInd() , l6560DbscApplicable88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setL6560DbscApplicableTrue() {  			
    	setL6560DbscApplicableInd( l6560DbscApplicable88Value);
   	}
	char[] l6560DbscApplicableNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isL6560DbscApplicableNo()
	 *	@return  Returns true if isL6560DbscApplicableNo() is "N"
	 */
   public boolean isL6560DbscApplicableNo() throws CFException {
      return (  compareChars( getL6560DbscApplicableInd() , l6560DbscApplicableNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setL6560DbscApplicableNoTrue() {  			
    	setL6560DbscApplicableInd( l6560DbscApplicableNo88Value);
   	}
	public BigDecimal getL6560DbscTotSurrAmt() throws CFException {
        if (isL6560DbscTotSurrAmtModified()) { 
           l6560DbscTotSurrAmt = refreshL6560DbscTotSurrAmt();
        }
   		return l6560DbscTotSurrAmt;
	}

    public char[] getL6560DbscTotSurrAmtString() {
          return  l6560DbscTotSurrAmtString();
    }
	
	/**
	 * 	Update L6560DbscTotSurrAmt with the passed number
	 *  Corresponding COBOL Variable is L6560-DBSC-TOT-SURR-AMT
	 *	@param number
	 */
	public void setL6560DbscTotSurrAmt(BigDecimal number) {	
     l6560DbscTotSurrAmt = checkL6560DbscTotSurrAmtMaxLimit(number);
	    serializeL6560DbscTotSurrAmt(l6560DbscTotSurrAmt);
   }
	public BigDecimal getL6560DbscTotChrgAmt() throws CFException {
        if (isL6560DbscTotChrgAmtModified()) { 
           l6560DbscTotChrgAmt = refreshL6560DbscTotChrgAmt();
        }
   		return l6560DbscTotChrgAmt;
	}

    public char[] getL6560DbscTotChrgAmtString() {
          return  l6560DbscTotChrgAmtString();
    }
	
	/**
	 * 	Update L6560DbscTotChrgAmt with the passed number
	 *  Corresponding COBOL Variable is L6560-DBSC-TOT-CHRG-AMT
	 *	@param number
	 */
	public void setL6560DbscTotChrgAmt(BigDecimal number) {	
     l6560DbscTotChrgAmt = checkL6560DbscTotChrgAmtMaxLimit(number);
	    serializeL6560DbscTotChrgAmt(l6560DbscTotChrgAmt);
   }
	public BigDecimal getL6560DbscTotFreeAmt() throws CFException {
        if (isL6560DbscTotFreeAmtModified()) { 
           l6560DbscTotFreeAmt = refreshL6560DbscTotFreeAmt();
        }
   		return l6560DbscTotFreeAmt;
	}

    public char[] getL6560DbscTotFreeAmtString() {
          return  l6560DbscTotFreeAmtString();
    }
	
	/**
	 * 	Update L6560DbscTotFreeAmt with the passed number
	 *  Corresponding COBOL Variable is L6560-DBSC-TOT-FREE-AMT
	 *	@param number
	 */
	public void setL6560DbscTotFreeAmt(BigDecimal number) {	
     l6560DbscTotFreeAmt = checkL6560DbscTotFreeAmtMaxLimit(number);
	    serializeL6560DbscTotFreeAmt(l6560DbscTotFreeAmt);
   }
	public BigDecimal getL6560DbscAssSurrAmt() throws CFException {
        if (isL6560DbscAssSurrAmtModified()) { 
           l6560DbscAssSurrAmt = refreshL6560DbscAssSurrAmt();
        }
   		return l6560DbscAssSurrAmt;
	}

    public char[] getL6560DbscAssSurrAmtString() {
          return  l6560DbscAssSurrAmtString();
    }
	
	/**
	 * 	Update L6560DbscAssSurrAmt with the passed number
	 *  Corresponding COBOL Variable is L6560-DBSC-ASS-SURR-AMT
	 *	@param number
	 */
	public void setL6560DbscAssSurrAmt(BigDecimal number) {	
     l6560DbscAssSurrAmt = checkL6560DbscAssSurrAmtMaxLimit(number);
	    serializeL6560DbscAssSurrAmt(l6560DbscAssSurrAmt);
   }
	public BigDecimal getL6560DbscAssChrgAmt() throws CFException {
        if (isL6560DbscAssChrgAmtModified()) { 
           l6560DbscAssChrgAmt = refreshL6560DbscAssChrgAmt();
        }
   		return l6560DbscAssChrgAmt;
	}

    public char[] getL6560DbscAssChrgAmtString() {
          return  l6560DbscAssChrgAmtString();
    }
	
	/**
	 * 	Update L6560DbscAssChrgAmt with the passed number
	 *  Corresponding COBOL Variable is L6560-DBSC-ASS-CHRG-AMT
	 *	@param number
	 */
	public void setL6560DbscAssChrgAmt(BigDecimal number) {	
     l6560DbscAssChrgAmt = checkL6560DbscAssChrgAmtMaxLimit(number);
	    serializeL6560DbscAssChrgAmt(l6560DbscAssChrgAmt);
   }
	public BigDecimal getL6560DbscAssFreeAmt() throws CFException {
        if (isL6560DbscAssFreeAmtModified()) { 
           l6560DbscAssFreeAmt = refreshL6560DbscAssFreeAmt();
        }
   		return l6560DbscAssFreeAmt;
	}

    public char[] getL6560DbscAssFreeAmtString() {
          return  l6560DbscAssFreeAmtString();
    }
	
	/**
	 * 	Update L6560DbscAssFreeAmt with the passed number
	 *  Corresponding COBOL Variable is L6560-DBSC-ASS-FREE-AMT
	 *	@param number
	 */
	public void setL6560DbscAssFreeAmt(BigDecimal number) {	
     l6560DbscAssFreeAmt = checkL6560DbscAssFreeAmtMaxLimit(number);
	    serializeL6560DbscAssFreeAmt(l6560DbscAssFreeAmt);
   }
	/**
	 *	Returns the value of l6560PlanFndTypCd
	 *	@return l6560PlanFndTypCd
	 */
   public char[] getL6560PlanFndTypCd() throws CFException{
     if (isL6560PlanFndTypCdModified()) { 
        l6560PlanFndTypCd = refreshL6560PlanFndTypCd();
     }
   		return l6560PlanFndTypCd;
   }

  
	/**
	*  set variable l6560PlanFndTypCd
	*  Corresponding COBOL Variable is L6560-PLAN-FND-TYP-CD
	*  @param value
	**/
   public void setL6560PlanFndTypCd(char[] value) {
      l6560PlanFndTypCd = checkL6560PlanFndTypCdConstraints(value);
      serializeL6560PlanFndTypCd(l6560PlanFndTypCd);
   } 

     /**
	 * 	Update L6560PlanFndTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560PlanFndTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL6560PlanFndTypCd,l6560PlanFndTypCd.length);
   	
   }
   
   public void setL6560PlanFndTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL6560PlanFndTypCd,l6560PlanFndTypCd.length);
   	
   }
   
     /**
	 * 	Update L6560PlanFndTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560PlanFndTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560PlanFndTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L6560PlanFndTypCd with another Field
	 *	@param value
	 */
   public void setL6560PlanFndTypCd(Field source) {
       replace(source,0,source.length(),beginL6560PlanFndTypCd,L_6560_PLAN_FND_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update L6560PlanFndTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560PlanFndTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL6560PlanFndTypCd,L_6560_PLAN_FND_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update L6560PlanFndTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560PlanFndTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560PlanFndTypCd+targetIndex,targetLen);
    
   }
	char[] l6560PlanFndTypSide88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isL6560PlanFndTypSide()
	 *	@return  Returns true if isL6560PlanFndTypSide() is "S"
	 */
   public boolean isL6560PlanFndTypSide() throws CFException {
      return (  compareChars( getL6560PlanFndTypCd() , l6560PlanFndTypSide88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setL6560PlanFndTypSideTrue() {  			
    	setL6560PlanFndTypCd( l6560PlanFndTypSide88Value);
   	}
	char[] l6560PlanFndTypNone88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isL6560PlanFndTypNone()
	 *	@return  Returns true if isL6560PlanFndTypNone() is "N"
	 */
   public boolean isL6560PlanFndTypNone() throws CFException {
      return (  compareChars( getL6560PlanFndTypCd() , l6560PlanFndTypNone88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setL6560PlanFndTypNoneTrue() {  			
    	setL6560PlanFndTypCd( l6560PlanFndTypNone88Value);
   	}
	char[] l6560PlanFndTypXtrnl88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isL6560PlanFndTypXtrnl()
	 *	@return  Returns true if isL6560PlanFndTypXtrnl() is "S"
	 */
   public boolean isL6560PlanFndTypXtrnl() throws CFException {
      return (  compareChars( getL6560PlanFndTypCd() , l6560PlanFndTypXtrnl88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setL6560PlanFndTypXtrnlTrue() {  			
    	setL6560PlanFndTypCd( l6560PlanFndTypXtrnl88Value);
   	}

	
	
	
	/**
	 * 	initializes L6560DbscInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setL6560DbscApplicableInd(CONSTANTS.SPACE);
			setL6560DbscTotSurrAmt(BigDecimal.ZERO);
			setL6560DbscTotChrgAmt(BigDecimal.ZERO);
			setL6560DbscTotFreeAmt(BigDecimal.ZERO);
			setL6560DbscAssSurrAmt(BigDecimal.ZERO);
			setL6560DbscAssChrgAmt(BigDecimal.ZERO);
			setL6560DbscAssFreeAmt(BigDecimal.ZERO);
         setL6560PlanFndTypCd(CONSTANTS.SPACE);
   }

		public static int getL6560DbscInfoFieldLength() {
			return L_6560_DBSC_INFO_LENGTH;
		}

}
  
