package com.cloudframe.app.search0.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.search0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] search = Field.fillLowValue(3);

								private long tb05323FinEvntNo;

						private char[] tb05323FinMktId = Field.fillLowValue(3);

								private int financialCategory;

								private short finShortCategory;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of search
	 *	@return search
	 */
   public char[] getSearch() throws CFException{
   		return search;
   }

  
	/**
	*  set variable search
	*  Corresponding COBOL Variable is WS-SEARCH
	*  @param value
	**/
   public void setSearch(char[] value) {
       value = checkSearchConstraints(value);
       arraycopy(value,0,search,0,value.length);
   } 
	public void setSearch(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,search,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tb05323FinEvntNo
	 *	@return tb05323FinEvntNo
	 */
	public long getTb05323FinEvntNo() throws CFException {
   		return tb05323FinEvntNo;
	}
	
	/**
	 * 	Update Tb05323FinEvntNo with the passed value
	 *  Corresponding COBOL Variable is TB05323-FIN-EVNT-NO
	 *	@param number
	 */
	public void setTb05323FinEvntNo(long number) {
	     // Truncate if the number is beyond +/- Max range
	    tb05323FinEvntNo = checkTb05323FinEvntNoMaxLimit(number); 
	}


	/**
	 *	Returns the value of tb05323FinMktId
	 *	@return tb05323FinMktId
	 */
   public char[] getTb05323FinMktId() throws CFException{
   		return tb05323FinMktId;
   }

  
	/**
	*  set variable tb05323FinMktId
	*  Corresponding COBOL Variable is TB05323-FIN-MKT-ID
	*  @param value
	**/
   public void setTb05323FinMktId(char[] value) {
       value = checkTb05323FinMktIdConstraints(value);
       arraycopy(value,0,tb05323FinMktId,0,value.length);
   } 
	public void setTb05323FinMktId(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tb05323FinMktId,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of financialCategory
	 *	@return financialCategory
	 */
	public int getFinancialCategory() throws CFException {
   		return financialCategory;
	}
	
	/**
	 * 	Update FinancialCategory with the passed value
	 *  Corresponding COBOL Variable is WS-FINANCIAL-CATEGORY
	 *	@param number
	 */
	public void setFinancialCategory(int number) {
	     // Truncate if the number is beyond +/- Max range
	    financialCategory = checkFinancialCategoryMaxLimit(number); 
	}


	public void setFinancialCategory(long number) {
	    number = checkFinancialCategoryMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFinancialCategory((int)number);
	}
	
	/**
	 *	Returns the value of finShortCategory
	 *	@return finShortCategory
	 */
	public short getFinShortCategory() throws CFException {
   		return finShortCategory;
	}
	
	/**
	 * 	Update FinShortCategory with the passed value
	 *  Corresponding COBOL Variable is WS-FIN-SHORT-CATEGORY
	 *	@param number
	 */
	public void setFinShortCategory(short number) {
	     // Truncate if the number is beyond +/- Max range
	    finShortCategory = checkFinShortCategoryMaxLimit(number); 
	}

	public void setFinShortCategory(int number) {
	    number = checkFinShortCategoryMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFinShortCategory((short)number);
	}
	public void setFinShortCategory(long number) {
	    number = checkFinShortCategoryMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFinShortCategory((short)number);
	}
	


	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
