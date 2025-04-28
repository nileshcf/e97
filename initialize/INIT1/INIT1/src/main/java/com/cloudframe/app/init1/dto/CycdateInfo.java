package com.cloudframe.app.init1.dto;

/**
*  The class CycdateInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CycdateInfo extends CycdateInfoSerialized {
   
				private BillPeriodDates billPeriodDates = new BillPeriodDates();
	
	/**
	* Constructor for CycdateInfo
	**/
    public CycdateInfo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			billPeriodDates.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of billPeriodDates
	 *	@return billPeriodDates
	 */   
	 public BillPeriodDates getBillPeriodDates() {
   	return billPeriodDates;
   }
   /**
	* 	Update BillPeriodDates with the passed value
	*   Corresponding COBOL Variable is WS-BILL-PERIOD-DATES
	*	@param value
	*/
   public void setBillPeriodDates(char[] value) {
      billPeriodDates.setString(value); 
   }   
    
     /**
	 * 	Update BillPeriodDates 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBillPeriodDates(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,billPeriodDates.begin,billPeriodDates.length());
   }
   
     /**
	 * 	Update BillPeriodDates 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBillPeriodDates(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,billPeriodDates.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BillPeriodDates with another Field
	 *	@param value
	 */
   public void setBillPeriodDates(Field source) {
   	replace(source,0,source.length(),billPeriodDates.begin,billPeriodDates.length());
   }  
   
     /**
	 * 	Update BillPeriodDates 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBillPeriodDates(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,billPeriodDates.begin,billPeriodDates.length());
   }
   
     /**
	 * 	Update BillPeriodDates 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBillPeriodDates(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,billPeriodDates.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCycdateInfoFieldLength() {
			return CYCDATE_INFO_LENGTH;
		}

}
  
