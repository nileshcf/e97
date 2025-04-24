package com.cloudframe.app.sup01751.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.sup01751.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

								private int rowCount;

						private char[] db2DateCurrBus = Field.fillLowValue(10);

						private char[] cdeTranStaInPrg = Field.fillLowValue(1);

						private char[] cdeTranTypDep = Field.fillLowValue(1);

						private char[] cdeStaPkgReady = Field.fillLowValue(1);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of rowCount
	 *	@return rowCount
	 */
	public int getRowCount() throws CFException {
   		return rowCount;
	}
	
	/**
	 * 	Update RowCount with the passed value
	 *  Corresponding COBOL Variable is WS-ROW-COUNT
	 *	@param number
	 */
	public void setRowCount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rowCount = checkRowCountMaxLimit(number); 
	}


	public void setRowCount(long number) {
	    number = checkRowCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRowCount((int)number);
	}
	
	/**
	 *	Returns the value of db2DateCurrBus
	 *	@return db2DateCurrBus
	 */
   public char[] getDb2DateCurrBus() throws CFException{
   		return db2DateCurrBus;
   }

  
	/**
	*  set variable db2DateCurrBus
	*  Corresponding COBOL Variable is WS-DB2-DATE-CURR-BUS
	*  @param value
	**/
   public void setDb2DateCurrBus(char[] value) {
       value = checkDb2DateCurrBusConstraints(value);
       arraycopy(value,0,db2DateCurrBus,0,value.length);
   } 
	public void setDb2DateCurrBus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,db2DateCurrBus,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of cdeTranStaInPrg
	 *	@return cdeTranStaInPrg
	 */
   public char[] getCdeTranStaInPrg() throws CFException{
   		return cdeTranStaInPrg;
   }

  
	/**
	*  set variable cdeTranStaInPrg
	*  Corresponding COBOL Variable is WS-CDE-TRAN-STA-IN-PRG
	*  @param value
	**/
   public void setCdeTranStaInPrg(char[] value) {
       value = checkCdeTranStaInPrgConstraints(value);
       arraycopy(value,0,cdeTranStaInPrg,0,value.length);
   } 
	public void setCdeTranStaInPrg(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,cdeTranStaInPrg,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of cdeTranTypDep
	 *	@return cdeTranTypDep
	 */
   public char[] getCdeTranTypDep() throws CFException{
   		return cdeTranTypDep;
   }

  
	/**
	*  set variable cdeTranTypDep
	*  Corresponding COBOL Variable is WS-CDE-TRAN-TYP-DEP
	*  @param value
	**/
   public void setCdeTranTypDep(char[] value) {
       value = checkCdeTranTypDepConstraints(value);
       arraycopy(value,0,cdeTranTypDep,0,value.length);
   } 
	public void setCdeTranTypDep(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,cdeTranTypDep,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of cdeStaPkgReady
	 *	@return cdeStaPkgReady
	 */
   public char[] getCdeStaPkgReady() throws CFException{
   		return cdeStaPkgReady;
   }

  
	/**
	*  set variable cdeStaPkgReady
	*  Corresponding COBOL Variable is WS-CDE-STA-PKG-READY
	*  @param value
	**/
   public void setCdeStaPkgReady(char[] value) {
       value = checkCdeStaPkgReadyConstraints(value);
       arraycopy(value,0,cdeStaPkgReady,0,value.length);
   } 
	public void setCdeStaPkgReady(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,cdeStaPkgReady,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
