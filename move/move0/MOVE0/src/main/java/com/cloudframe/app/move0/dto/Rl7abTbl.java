package com.cloudframe.app.move0.dto;

/**
*  The class Rl7abTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Rl7abTbl extends Rl7abTblSerialized { 
   

								private int dpFeatId;

								private long dpMonthlyAllowAmt;

						private char[] dpMonthlyAllowTxt = new char[40];

						private char[] dpMonthlyUnldInd = new char[1];

								private int dpAllowOffrId;

						private char[] dpAlwPerClassId = new char[2];

								private BigDecimal dpPerUnitChg1a = BigDecimal.ZERO;

						private char[] dpPerUnitChgTxt1a = new char[15];

								private BigDecimal dpPerUnitChg1b = BigDecimal.ZERO;

						private char[] dpPerUnitChgTxt1b = new char[15];

						private char[] dpFeatUnitDescr = new char[20];
	
	/**
	* Constructor for Rl7abTbl
	**/
    public Rl7abTbl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rl7abTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl7abTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setDpFeatId(111);
								setDpMonthlyAllowAmt(222L);
								setDpMonthlyAllowTxt(String.join("", java.util.Collections.nCopies(40, "3")).toCharArray());
								setDpMonthlyUnldInd(("4").toCharArray());
								setDpAllowOffrId(555);
								setDpAlwPerClassId(("66").toCharArray());
								setDpPerUnitChg1a(BigDecimal.valueOf(777).setScale(11));
								setDpPerUnitChgTxt1a(String.join("", java.util.Collections.nCopies(15, "8")).toCharArray());
								setDpPerUnitChg1b(BigDecimal.valueOf(999).setScale(11));
								setDpPerUnitChgTxt1b(String.join("", java.util.Collections.nCopies(15, "A")).toCharArray());
								setDpFeatUnitDescr(String.join("", java.util.Collections.nCopies(20, "B")).toCharArray());
    } 

	/**
	 *	Returns the value of dpFeatId
	 *	@return dpFeatId
	 */
	public int getDpFeatId() throws CFException {
        if (isDpFeatIdModified()) { 
           dpFeatId = refreshDpFeatId();
        }
   		return dpFeatId;
	}
	
	/**
	 * 	Update DpFeatId with the passed value
	 *  Corresponding COBOL Variable is WS-DP-FEAT-ID
	 *	@param number
	 */
	public void setDpFeatId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dpFeatId = checkDpFeatIdMaxLimit(number); 
		serializeDpFeatId(dpFeatId);
	}


	public void setDpFeatId(long number) {
	    number = checkDpFeatIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDpFeatId((int)number);
	}
	
	public long getDpMonthlyAllowAmt() throws CFException {
        if (isDpMonthlyAllowAmtModified()) { 
           dpMonthlyAllowAmt = refreshDpMonthlyAllowAmt();
        }
   		return dpMonthlyAllowAmt;
	}
	
	/**
	 * 	Update DpMonthlyAllowAmt with the passed value
	 *  Corresponding COBOL Variable is WS-DP-MONTHLY-ALLOW-AMT
	 *	@param number
	 */
	public void setDpMonthlyAllowAmt(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			dpMonthlyAllowAmt = checkDpMonthlyAllowAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeDpMonthlyAllowAmt(dpMonthlyAllowAmt);
	}


	/**
	 *	Returns the value of dpMonthlyAllowTxt
	 *	@return dpMonthlyAllowTxt
	 */
   public char[] getDpMonthlyAllowTxt() throws CFException{
     if (isDpMonthlyAllowTxtModified()) { 
        dpMonthlyAllowTxt = refreshDpMonthlyAllowTxt();
     }
   		return dpMonthlyAllowTxt;
   }

  
	/**
	*  set variable dpMonthlyAllowTxt
	*  Corresponding COBOL Variable is WS-DP-MONTHLY-ALLOW-TXT
	*  @param value
	**/
   public void setDpMonthlyAllowTxt(char[] value) {
      dpMonthlyAllowTxt = checkDpMonthlyAllowTxtConstraints(value);
      serializeDpMonthlyAllowTxt(dpMonthlyAllowTxt);
   } 

     /**
	 * 	Update DpMonthlyAllowTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDpMonthlyAllowTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDpMonthlyAllowTxt,dpMonthlyAllowTxt.length);
   	
   }
   
   public void setDpMonthlyAllowTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDpMonthlyAllowTxt,dpMonthlyAllowTxt.length);
   	
   }
   
     /**
	 * 	Update DpMonthlyAllowTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDpMonthlyAllowTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDpMonthlyAllowTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DpMonthlyAllowTxt with another Field
	 *	@param value
	 */
   public void setDpMonthlyAllowTxt(Field source) {
       replace(source,0,source.length(),beginDpMonthlyAllowTxt,DP_MONTHLY_ALLOW_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update DpMonthlyAllowTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDpMonthlyAllowTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDpMonthlyAllowTxt,DP_MONTHLY_ALLOW_TXT_LEN);
   	
   }
   
     /**
	 * 	Update DpMonthlyAllowTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDpMonthlyAllowTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDpMonthlyAllowTxt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dpMonthlyUnldInd
	 *	@return dpMonthlyUnldInd
	 */
   public char[] getDpMonthlyUnldInd() throws CFException{
     if (isDpMonthlyUnldIndModified()) { 
        dpMonthlyUnldInd = refreshDpMonthlyUnldInd();
     }
   		return dpMonthlyUnldInd;
   }

  
	/**
	*  set variable dpMonthlyUnldInd
	*  Corresponding COBOL Variable is WS-DP-MONTHLY-UNLD-IND
	*  @param value
	**/
   public void setDpMonthlyUnldInd(char[] value) {
      dpMonthlyUnldInd = checkDpMonthlyUnldIndConstraints(value);
      serializeDpMonthlyUnldInd(dpMonthlyUnldInd);
   } 

     /**
	 * 	Update DpMonthlyUnldInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDpMonthlyUnldInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDpMonthlyUnldInd,dpMonthlyUnldInd.length);
   	
   }
   
   public void setDpMonthlyUnldInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDpMonthlyUnldInd,dpMonthlyUnldInd.length);
   	
   }
   
     /**
	 * 	Update DpMonthlyUnldInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDpMonthlyUnldInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDpMonthlyUnldInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DpMonthlyUnldInd with another Field
	 *	@param value
	 */
   public void setDpMonthlyUnldInd(Field source) {
       replace(source,0,source.length(),beginDpMonthlyUnldInd,DP_MONTHLY_UNLD_IND_LEN);
   	
   }  
   
     /**
	 * 	Update DpMonthlyUnldInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDpMonthlyUnldInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDpMonthlyUnldInd,DP_MONTHLY_UNLD_IND_LEN);
   	
   }
   
     /**
	 * 	Update DpMonthlyUnldInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDpMonthlyUnldInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDpMonthlyUnldInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dpAllowOffrId
	 *	@return dpAllowOffrId
	 */
	public int getDpAllowOffrId() throws CFException {
        if (isDpAllowOffrIdModified()) { 
           dpAllowOffrId = refreshDpAllowOffrId();
        }
   		return dpAllowOffrId;
	}
	
	/**
	 * 	Update DpAllowOffrId with the passed value
	 *  Corresponding COBOL Variable is WS-DP-ALLOW-OFFR-ID
	 *	@param number
	 */
	public void setDpAllowOffrId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dpAllowOffrId = checkDpAllowOffrIdMaxLimit(number); 
		serializeDpAllowOffrId(dpAllowOffrId);
	}


	public void setDpAllowOffrId(long number) {
	    number = checkDpAllowOffrIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDpAllowOffrId((int)number);
	}
	
	/**
	 *	Returns the value of dpAlwPerClassId
	 *	@return dpAlwPerClassId
	 */
   public char[] getDpAlwPerClassId() throws CFException{
     if (isDpAlwPerClassIdModified()) { 
        dpAlwPerClassId = refreshDpAlwPerClassId();
     }
   		return dpAlwPerClassId;
   }

  
	/**
	*  set variable dpAlwPerClassId
	*  Corresponding COBOL Variable is WS-DP-ALW-PER-CLASS-ID
	*  @param value
	**/
   public void setDpAlwPerClassId(char[] value) {
      dpAlwPerClassId = checkDpAlwPerClassIdConstraints(value);
      serializeDpAlwPerClassId(dpAlwPerClassId);
   } 

     /**
	 * 	Update DpAlwPerClassId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDpAlwPerClassId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDpAlwPerClassId,dpAlwPerClassId.length);
   	
   }
   
   public void setDpAlwPerClassId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDpAlwPerClassId,dpAlwPerClassId.length);
   	
   }
   
     /**
	 * 	Update DpAlwPerClassId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDpAlwPerClassId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDpAlwPerClassId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DpAlwPerClassId with another Field
	 *	@param value
	 */
   public void setDpAlwPerClassId(Field source) {
       replace(source,0,source.length(),beginDpAlwPerClassId,DP_ALW_PER_CLASS_ID_LEN);
   	
   }  
   
     /**
	 * 	Update DpAlwPerClassId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDpAlwPerClassId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDpAlwPerClassId,DP_ALW_PER_CLASS_ID_LEN);
   	
   }
   
     /**
	 * 	Update DpAlwPerClassId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDpAlwPerClassId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDpAlwPerClassId+targetIndex,targetLen);
    
   }
	public BigDecimal getDpPerUnitChg1a() throws CFException {
        if (isDpPerUnitChg1aModified()) { 
           dpPerUnitChg1a = refreshDpPerUnitChg1a();
        }
   		return dpPerUnitChg1a;
	}

    public char[] getDpPerUnitChg1aString() {
          return  dpPerUnitChg1aString();
    }
	
	/**
	 * 	Update DpPerUnitChg1a with the passed number
	 *  Corresponding COBOL Variable is WS-DP-PER-UNIT-CHG-1A
	 *	@param number
	 */
	public void setDpPerUnitChg1a(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     dpPerUnitChg1a = checkDpPerUnitChg1aMaxLimit(number);
	    serializeDpPerUnitChg1a(dpPerUnitChg1a);
   }
	/**
	 *	Returns the value of dpPerUnitChgTxt1a
	 *	@return dpPerUnitChgTxt1a
	 */
   public char[] getDpPerUnitChgTxt1a() throws CFException{
     if (isDpPerUnitChgTxt1aModified()) { 
        dpPerUnitChgTxt1a = refreshDpPerUnitChgTxt1a();
     }
   		return dpPerUnitChgTxt1a;
   }

  
	/**
	*  set variable dpPerUnitChgTxt1a
	*  Corresponding COBOL Variable is WS-DP-PER-UNIT-CHG-TXT-1A
	*  @param value
	**/
   public void setDpPerUnitChgTxt1a(char[] value) {
      dpPerUnitChgTxt1a = checkDpPerUnitChgTxt1aConstraints(value);
      serializeDpPerUnitChgTxt1a(dpPerUnitChgTxt1a);
   } 

     /**
	 * 	Update DpPerUnitChgTxt1a 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDpPerUnitChgTxt1a(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDpPerUnitChgTxt1a,dpPerUnitChgTxt1a.length);
   	
   }
   
   public void setDpPerUnitChgTxt1a(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDpPerUnitChgTxt1a,dpPerUnitChgTxt1a.length);
   	
   }
   
     /**
	 * 	Update DpPerUnitChgTxt1a 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDpPerUnitChgTxt1a(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDpPerUnitChgTxt1a+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DpPerUnitChgTxt1a with another Field
	 *	@param value
	 */
   public void setDpPerUnitChgTxt1a(Field source) {
       replace(source,0,source.length(),beginDpPerUnitChgTxt1a,DP_PER_UNIT_CHG_TXT_1A_LEN);
   	
   }  
   
     /**
	 * 	Update DpPerUnitChgTxt1a 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDpPerUnitChgTxt1a(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDpPerUnitChgTxt1a,DP_PER_UNIT_CHG_TXT_1A_LEN);
   	
   }
   
     /**
	 * 	Update DpPerUnitChgTxt1a 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDpPerUnitChgTxt1a(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDpPerUnitChgTxt1a+targetIndex,targetLen);
    
   }
	public BigDecimal getDpPerUnitChg1b() throws CFException {
        if (isDpPerUnitChg1bModified()) { 
           dpPerUnitChg1b = refreshDpPerUnitChg1b();
        }
   		return dpPerUnitChg1b;
	}

    public char[] getDpPerUnitChg1bString() {
          return  dpPerUnitChg1bString();
    }
	
	/**
	 * 	Update DpPerUnitChg1b with the passed number
	 *  Corresponding COBOL Variable is WS-DP-PER-UNIT-CHG-1B
	 *	@param number
	 */
	public void setDpPerUnitChg1b(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     dpPerUnitChg1b = checkDpPerUnitChg1bMaxLimit(number);
	    serializeDpPerUnitChg1b(dpPerUnitChg1b);
   }
	/**
	 *	Returns the value of dpPerUnitChgTxt1b
	 *	@return dpPerUnitChgTxt1b
	 */
   public char[] getDpPerUnitChgTxt1b() throws CFException{
     if (isDpPerUnitChgTxt1bModified()) { 
        dpPerUnitChgTxt1b = refreshDpPerUnitChgTxt1b();
     }
   		return dpPerUnitChgTxt1b;
   }

  
	/**
	*  set variable dpPerUnitChgTxt1b
	*  Corresponding COBOL Variable is WS-DP-PER-UNIT-CHG-TXT-1B
	*  @param value
	**/
   public void setDpPerUnitChgTxt1b(char[] value) {
      dpPerUnitChgTxt1b = checkDpPerUnitChgTxt1bConstraints(value);
      serializeDpPerUnitChgTxt1b(dpPerUnitChgTxt1b);
   } 

     /**
	 * 	Update DpPerUnitChgTxt1b 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDpPerUnitChgTxt1b(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDpPerUnitChgTxt1b,dpPerUnitChgTxt1b.length);
   	
   }
   
   public void setDpPerUnitChgTxt1b(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDpPerUnitChgTxt1b,dpPerUnitChgTxt1b.length);
   	
   }
   
     /**
	 * 	Update DpPerUnitChgTxt1b 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDpPerUnitChgTxt1b(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDpPerUnitChgTxt1b+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DpPerUnitChgTxt1b with another Field
	 *	@param value
	 */
   public void setDpPerUnitChgTxt1b(Field source) {
       replace(source,0,source.length(),beginDpPerUnitChgTxt1b,DP_PER_UNIT_CHG_TXT_1B_LEN);
   	
   }  
   
     /**
	 * 	Update DpPerUnitChgTxt1b 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDpPerUnitChgTxt1b(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDpPerUnitChgTxt1b,DP_PER_UNIT_CHG_TXT_1B_LEN);
   	
   }
   
     /**
	 * 	Update DpPerUnitChgTxt1b 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDpPerUnitChgTxt1b(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDpPerUnitChgTxt1b+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dpFeatUnitDescr
	 *	@return dpFeatUnitDescr
	 */
   public char[] getDpFeatUnitDescr() throws CFException{
     if (isDpFeatUnitDescrModified()) { 
        dpFeatUnitDescr = refreshDpFeatUnitDescr();
     }
   		return dpFeatUnitDescr;
   }

  
	/**
	*  set variable dpFeatUnitDescr
	*  Corresponding COBOL Variable is WS-DP-FEAT-UNIT-DESCR
	*  @param value
	**/
   public void setDpFeatUnitDescr(char[] value) {
      dpFeatUnitDescr = checkDpFeatUnitDescrConstraints(value);
      serializeDpFeatUnitDescr(dpFeatUnitDescr);
   } 

     /**
	 * 	Update DpFeatUnitDescr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDpFeatUnitDescr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDpFeatUnitDescr,dpFeatUnitDescr.length);
   	
   }
   
   public void setDpFeatUnitDescr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDpFeatUnitDescr,dpFeatUnitDescr.length);
   	
   }
   
     /**
	 * 	Update DpFeatUnitDescr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDpFeatUnitDescr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDpFeatUnitDescr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DpFeatUnitDescr with another Field
	 *	@param value
	 */
   public void setDpFeatUnitDescr(Field source) {
       replace(source,0,source.length(),beginDpFeatUnitDescr,DP_FEAT_UNIT_DESCR_LEN);
   	
   }  
   
     /**
	 * 	Update DpFeatUnitDescr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDpFeatUnitDescr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDpFeatUnitDescr,DP_FEAT_UNIT_DESCR_LEN);
   	
   }
   
     /**
	 * 	Update DpFeatUnitDescr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDpFeatUnitDescr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDpFeatUnitDescr+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Rl7abTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setDpFeatId(0);
                     setDpMonthlyAllowAmt(0);
         setDpMonthlyAllowTxt(CONSTANTS.SPACE_40);
         setDpMonthlyUnldInd(CONSTANTS.SPACE);
                     setDpAllowOffrId(0);
         setDpAlwPerClassId(CONSTANTS.SPACE_2);
			setDpPerUnitChg1a(BigDecimal.ZERO);
         setDpPerUnitChgTxt1a(CONSTANTS.SPACE_15);
			setDpPerUnitChg1b(BigDecimal.ZERO);
         setDpPerUnitChgTxt1b(CONSTANTS.SPACE_15);
         setDpFeatUnitDescr(CONSTANTS.SPACE_20);
   }

		public static int getRl7abTblFieldLength() {
			return RL_7AB_TBL_LENGTH;
		}

}
  
