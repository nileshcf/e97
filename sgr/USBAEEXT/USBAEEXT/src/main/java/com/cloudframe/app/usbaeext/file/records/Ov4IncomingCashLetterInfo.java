package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4IncomingCashLetterInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.usbaeext.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Ov4IncomingCashLetterInfo extends Ov4IncomingCashLetterInfoSerialized { 
   

								private long ov4IclDate;
				private Ov4IclDateRedefined ov4IclDateRedefined = new Ov4IclDateRedefined();

								private BigDecimal ov4IclAmt = BigDecimal.ZERO;

								private BigDecimal ov4IclTapeTotal = BigDecimal.ZERO;

								private BigDecimal ov4IclPrevious = BigDecimal.ZERO;

								private BigDecimal ov4IclNext = BigDecimal.ZERO;

								private BigDecimal ov4IclListedAs = BigDecimal.ZERO;

								private BigDecimal ov4IclShouldBe = BigDecimal.ZERO;

								private long ov4IclFromAba;

								private long ov4IclToAba;

								private long ov4IclSerialNo;
	
	/**
	* Constructor for Ov4IncomingCashLetterInfo
	**/
    public Ov4IncomingCashLetterInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ov4IncomingCashLetterInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4IncomingCashLetterInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ov4IclDateRedefined.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ov4IclDate
	 *	@return ov4IclDate
	 */
	public long getOv4IclDate() throws CFException {
       if (isOv4IclDateModified()) { 
           ov4IclDate = refreshOv4IclDate();
        }
   		return ov4IclDate;
	}
	

	
	   
	/**
	 * 	Update Ov4IclDate with the passed value
	 *  Corresponding COBOL Variable is OV4-ICL-DATE
	 *	@param number
	 */
	public void setOv4IclDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4IclDate = checkOv4IclDateMaxLimit(number); 
		serializeOv4IclDate(ov4IclDate);
	}
	

	/**
	 * 	Update Ov4IclDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4IclDate(char[] value) throws CFException {
		 ov4IclDate = serializeOv4IclDate(value);
	}
	/**
	 * 	Update Ov4IclDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4IclDateString(char[] value) throws CFException {
		 setOv4IclDate(value);
	}
	/**
	 *	Returns the value of ov4IclDateRedefined
	 *	@return ov4IclDateRedefined
	 */   
	 public Ov4IclDateRedefined getOv4IclDateRedefined() {
   	return ov4IclDateRedefined;
   }
   /**
	* 	Update Ov4IclDateRedefined with the passed value
	*   Corresponding COBOL Variable is OV4-ICL-DATE-REDEFINED
	*	@param value
	*/
   public void setOv4IclDateRedefined(char[] value) {
      ov4IclDateRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Ov4IclDateRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOv4IclDateRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4IclDateRedefined.begin,ov4IclDateRedefined.length());
   }
   
     /**
	 * 	Update Ov4IclDateRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4IclDateRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4IclDateRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ov4IclDateRedefined with another Field
	 *	@param value
	 */
   public void setOv4IclDateRedefined(Field source) {
   	replace(source,0,source.length(),ov4IclDateRedefined.begin,ov4IclDateRedefined.length());
   }  
   
     /**
	 * 	Update Ov4IclDateRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOv4IclDateRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4IclDateRedefined.begin,ov4IclDateRedefined.length());
   }
   
     /**
	 * 	Update Ov4IclDateRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4IclDateRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4IclDateRedefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ov4IclAmt
	 *	@return ov4IclAmt
	 */
	public BigDecimal getOv4IclAmt() throws CFException {
       if (isOv4IclAmtModified()) { 
           ov4IclAmt = refreshOv4IclAmt();
        }
   		return ov4IclAmt;
	}
	

	
	   
	/**
	 * 	Update Ov4IclAmt with the passed number
	 *  Corresponding COBOL Variable is OV4-ICL-AMT
	 *	@param number
	 */
	public void setOv4IclAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       ov4IclAmt = checkOv4IclAmtMaxLimit(number);
	    serializeOv4IclAmt(ov4IclAmt);
   }
	/**
	 * 	Update Ov4IclAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4IclAmt(char[] value) throws CFException {
		 ov4IclAmt = serializeOv4IclAmt(value);
	}   
	/**
	 *	Returns the value of ov4IclTapeTotal
	 *	@return ov4IclTapeTotal
	 */
	public BigDecimal getOv4IclTapeTotal() throws CFException {
       if (isOv4IclTapeTotalModified()) { 
           ov4IclTapeTotal = refreshOv4IclTapeTotal();
        }
   		return ov4IclTapeTotal;
	}
	

	
	   
	/**
	 * 	Update Ov4IclTapeTotal with the passed number
	 *  Corresponding COBOL Variable is OV4-ICL-TAPE-TOTAL
	 *	@param number
	 */
	public void setOv4IclTapeTotal(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       ov4IclTapeTotal = checkOv4IclTapeTotalMaxLimit(number);
	    serializeOv4IclTapeTotal(ov4IclTapeTotal);
   }
	/**
	 * 	Update Ov4IclTapeTotal with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4IclTapeTotal(char[] value) throws CFException {
		 ov4IclTapeTotal = serializeOv4IclTapeTotal(value);
	}   
	/**
	 *	Returns the value of ov4IclPrevious
	 *	@return ov4IclPrevious
	 */
	public BigDecimal getOv4IclPrevious() throws CFException {
       if (isOv4IclPreviousModified()) { 
           ov4IclPrevious = refreshOv4IclPrevious();
        }
   		return ov4IclPrevious;
	}
	

	
	   
	/**
	 * 	Update Ov4IclPrevious with the passed number
	 *  Corresponding COBOL Variable is OV4-ICL-PREVIOUS
	 *	@param number
	 */
	public void setOv4IclPrevious(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       ov4IclPrevious = checkOv4IclPreviousMaxLimit(number);
	    serializeOv4IclPrevious(ov4IclPrevious);
   }
	/**
	 * 	Update Ov4IclPrevious with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4IclPrevious(char[] value) throws CFException {
		 ov4IclPrevious = serializeOv4IclPrevious(value);
	}   
	/**
	 *	Returns the value of ov4IclNext
	 *	@return ov4IclNext
	 */
	public BigDecimal getOv4IclNext() throws CFException {
       if (isOv4IclNextModified()) { 
           ov4IclNext = refreshOv4IclNext();
        }
   		return ov4IclNext;
	}
	

	
	   
	/**
	 * 	Update Ov4IclNext with the passed number
	 *  Corresponding COBOL Variable is OV4-ICL-NEXT
	 *	@param number
	 */
	public void setOv4IclNext(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       ov4IclNext = checkOv4IclNextMaxLimit(number);
	    serializeOv4IclNext(ov4IclNext);
   }
	/**
	 * 	Update Ov4IclNext with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4IclNext(char[] value) throws CFException {
		 ov4IclNext = serializeOv4IclNext(value);
	}   
	/**
	 *	Returns the value of ov4IclListedAs
	 *	@return ov4IclListedAs
	 */
	public BigDecimal getOv4IclListedAs() throws CFException {
       if (isOv4IclListedAsModified()) { 
           ov4IclListedAs = refreshOv4IclListedAs();
        }
   		return ov4IclListedAs;
	}
	

	
	   
	/**
	 * 	Update Ov4IclListedAs with the passed number
	 *  Corresponding COBOL Variable is OV4-ICL-LISTED-AS
	 *	@param number
	 */
	public void setOv4IclListedAs(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       ov4IclListedAs = checkOv4IclListedAsMaxLimit(number);
	    serializeOv4IclListedAs(ov4IclListedAs);
   }
	/**
	 * 	Update Ov4IclListedAs with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4IclListedAs(char[] value) throws CFException {
		 ov4IclListedAs = serializeOv4IclListedAs(value);
	}   
	/**
	 *	Returns the value of ov4IclShouldBe
	 *	@return ov4IclShouldBe
	 */
	public BigDecimal getOv4IclShouldBe() throws CFException {
       if (isOv4IclShouldBeModified()) { 
           ov4IclShouldBe = refreshOv4IclShouldBe();
        }
   		return ov4IclShouldBe;
	}
	

	
	   
	/**
	 * 	Update Ov4IclShouldBe with the passed number
	 *  Corresponding COBOL Variable is OV4-ICL-SHOULD-BE
	 *	@param number
	 */
	public void setOv4IclShouldBe(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       ov4IclShouldBe = checkOv4IclShouldBeMaxLimit(number);
	    serializeOv4IclShouldBe(ov4IclShouldBe);
   }
	/**
	 * 	Update Ov4IclShouldBe with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4IclShouldBe(char[] value) throws CFException {
		 ov4IclShouldBe = serializeOv4IclShouldBe(value);
	}   
	/**
	 *	Returns the value of ov4IclFromAba
	 *	@return ov4IclFromAba
	 */
	public long getOv4IclFromAba() throws CFException {
       if (isOv4IclFromAbaModified()) { 
           ov4IclFromAba = refreshOv4IclFromAba();
        }
   		return ov4IclFromAba;
	}
	

	
	   
	/**
	 * 	Update Ov4IclFromAba with the passed value
	 *  Corresponding COBOL Variable is OV4-ICL-FROM-ABA
	 *	@param number
	 */
	public void setOv4IclFromAba(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4IclFromAba = checkOv4IclFromAbaMaxLimit(number); 
		serializeOv4IclFromAba(ov4IclFromAba);
	}
	

	/**
	 * 	Update Ov4IclFromAba with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4IclFromAba(char[] value) throws CFException {
		 ov4IclFromAba = serializeOv4IclFromAba(value);
	}
	/**
	 * 	Update Ov4IclFromAba with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4IclFromAbaString(char[] value) throws CFException {
		 setOv4IclFromAba(value);
	}
	/**
	 *	Returns the value of ov4IclToAba
	 *	@return ov4IclToAba
	 */
	public long getOv4IclToAba() throws CFException {
       if (isOv4IclToAbaModified()) { 
           ov4IclToAba = refreshOv4IclToAba();
        }
   		return ov4IclToAba;
	}
	

	
	   
	/**
	 * 	Update Ov4IclToAba with the passed value
	 *  Corresponding COBOL Variable is OV4-ICL-TO-ABA
	 *	@param number
	 */
	public void setOv4IclToAba(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4IclToAba = checkOv4IclToAbaMaxLimit(number); 
		serializeOv4IclToAba(ov4IclToAba);
	}
	

	/**
	 * 	Update Ov4IclToAba with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4IclToAba(char[] value) throws CFException {
		 ov4IclToAba = serializeOv4IclToAba(value);
	}
	/**
	 * 	Update Ov4IclToAba with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4IclToAbaString(char[] value) throws CFException {
		 setOv4IclToAba(value);
	}
	/**
	 *	Returns the value of ov4IclSerialNo
	 *	@return ov4IclSerialNo
	 */
	public long getOv4IclSerialNo() throws CFException {
       if (isOv4IclSerialNoModified()) { 
           ov4IclSerialNo = refreshOv4IclSerialNo();
        }
   		return ov4IclSerialNo;
	}
	

	
	   
	/**
	 * 	Update Ov4IclSerialNo with the passed value
	 *  Corresponding COBOL Variable is OV4-ICL-SERIAL-NO
	 *	@param number
	 */
	public void setOv4IclSerialNo(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4IclSerialNo = checkOv4IclSerialNoMaxLimit(number); 
		serializeOv4IclSerialNo(ov4IclSerialNo);
	}
	

	/**
	 * 	Update Ov4IclSerialNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4IclSerialNo(char[] value) throws CFException {
		 ov4IclSerialNo = serializeOv4IclSerialNo(value);
	}
	/**
	 * 	Update Ov4IclSerialNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4IclSerialNoString(char[] value) throws CFException {
		 setOv4IclSerialNo(value);
	}

	
	
	

		public static int getOv4IncomingCashLetterInfoFieldLength() {
			return OV_4_INCOMING_CASH_LETTER_INFO_LENGTH;
		}

}
  
