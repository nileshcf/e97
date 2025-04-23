package com.cloudframe.app.cfdate02.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private long bkupDtIso;

								private int integerOfDate;

						private char[] paygoSplanTableX = Field.fillLowValue(52);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBkupDtIso(0L);
								setIntegerOfDate(0);
    }


 

	/**
	 *	Returns the value of bkupDtIso
	 *	@return bkupDtIso
	 */
	public long getBkupDtIso() throws CFException {
       if (isBkupDtIsoModified()) { 
           bkupDtIso = refreshBkupDtIso();
        }
   		return bkupDtIso;
	}
	

	
	   
	/**
	 * 	Update BkupDtIso with the passed value
	 *  Corresponding COBOL Variable is WS-BKUP-DT-ISO
	 *	@param number
	 */
	public void setBkupDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bkupDtIso = checkBkupDtIsoMaxLimit(number); 
		serializeBkupDtIso(bkupDtIso);
	}
	

	/**
	 * 	Update BkupDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setBkupDtIso(char[] value) throws CFException {
		 bkupDtIso = serializeBkupDtIso(value);
	}
	/**
	 * 	Update BkupDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBkupDtIsoString(char[] value) throws CFException {
		 setBkupDtIso(value);
	}
	/**
	 *	Returns the value of integerOfDate
	 *	@return integerOfDate
	 */
	public int getIntegerOfDate() throws CFException {
   		return integerOfDate;
	}
	
	/**
	 * 	Update IntegerOfDate with the passed value
	 *  Corresponding COBOL Variable is WS-INTEGER-OF-DATE
	 *	@param number
	 */
	public void setIntegerOfDate(int number) {
	     // Truncate if the number is beyond +/- Max range
	    integerOfDate = checkIntegerOfDateMaxLimit(number); 
	}


	public void setIntegerOfDate(long number) {
	    number = checkIntegerOfDateMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIntegerOfDate((int)number);
	}
	
	/**
	 *	Returns the value of paygoSplanTableX
	 *	@return paygoSplanTableX
	 */
   public char[] getPaygoSplanTableX() throws CFException{
   		return paygoSplanTableX;
   }

  
	/**
	*  set variable paygoSplanTableX
	*  Corresponding COBOL Variable is WS-PAYGO-SPLAN-TABLE-X
	*  @param value
	**/
   public void setPaygoSplanTableX(char[] value) {
       value = checkPaygoSplanTableXConstraints(value);
       arraycopy(value,0,paygoSplanTableX,0,value.length);
   } 
	public void setPaygoSplanTableX(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,paygoSplanTableX,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
