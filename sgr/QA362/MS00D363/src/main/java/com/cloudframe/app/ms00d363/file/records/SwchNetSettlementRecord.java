package com.cloudframe.app.ms00d363.file.records;

/**
*  The class SwchNetSettlementRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SwchNetSettlementRecord extends SwchNetSettlementRecordSerialized {
   
				private SwchSortField300010 swchSortField300010 = new SwchSortField300010();
				private SwchAccumFields300010 swchAccumFields300010 = new SwchAccumFields300010();
	
	/**
	* Constructor for SwchNetSettlementRecord
	**/
    public SwchNetSettlementRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			swchSortField300010.setParent(this,getStartOffset() + 0);
	       			swchAccumFields300010.setParent(this,getStartOffset() + 107);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of swchSortField300010
	 *	@return swchSortField300010
	 */   
	 public SwchSortField300010 getSwchSortField300010() {
   	return swchSortField300010;
   }
   /**
	* 	Update SwchSortField300010 with the passed value
	*   Corresponding COBOL Variable is SWCH-SORT-FIELD-300010
	*	@param value
	*/
   public void setSwchSortField300010(char[] value) {
      swchSortField300010.setString(value); 
   }   
    
     /**
	 * 	Update SwchSortField300010 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSwchSortField300010(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,swchSortField300010.begin,swchSortField300010.length());
   }
   
     /**
	 * 	Update SwchSortField300010 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSwchSortField300010(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,swchSortField300010.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SwchSortField300010 with another Field
	 *	@param value
	 */
   public void setSwchSortField300010(Field source) {
   	replace(source,0,source.length(),swchSortField300010.begin,swchSortField300010.length());
   }  
   
     /**
	 * 	Update SwchSortField300010 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSwchSortField300010(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,swchSortField300010.begin,swchSortField300010.length());
   }
   
     /**
	 * 	Update SwchSortField300010 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSwchSortField300010(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,swchSortField300010.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of swchAccumFields300010
	 *	@return swchAccumFields300010
	 */   
	 public SwchAccumFields300010 getSwchAccumFields300010() {
   	return swchAccumFields300010;
   }
   /**
	* 	Update SwchAccumFields300010 with the passed value
	*   Corresponding COBOL Variable is SWCH-ACCUM-FIELDS-300010
	*	@param value
	*/
   public void setSwchAccumFields300010(char[] value) {
      swchAccumFields300010.setString(value); 
   }   
    
     /**
	 * 	Update SwchAccumFields300010 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSwchAccumFields300010(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,swchAccumFields300010.begin,swchAccumFields300010.length());
   }
   
     /**
	 * 	Update SwchAccumFields300010 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSwchAccumFields300010(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,swchAccumFields300010.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SwchAccumFields300010 with another Field
	 *	@param value
	 */
   public void setSwchAccumFields300010(Field source) {
   	replace(source,0,source.length(),swchAccumFields300010.begin,swchAccumFields300010.length());
   }  
   
     /**
	 * 	Update SwchAccumFields300010 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSwchAccumFields300010(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,swchAccumFields300010.begin,swchAccumFields300010.length());
   }
   
     /**
	 * 	Update SwchAccumFields300010 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSwchAccumFields300010(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,swchAccumFields300010.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSwchNetSettlementRecordFieldLength() {
			return SWCH_NET_SETTLEMENT_RECORD_LENGTH;
		}

}
  
