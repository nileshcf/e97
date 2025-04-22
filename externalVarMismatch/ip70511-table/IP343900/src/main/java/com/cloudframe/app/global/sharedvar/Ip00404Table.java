package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip00404Table")

public class Ip00404Table extends Ip00404TableSerialized  implements InitializingBean {
   

								private int ip00404EntriesFoundCount;
				private Ip00404ArRangeGrp ip00404ArRangeGrp = new Ip00404ArRangeGrp();
				private Ip00404ArRangeEntries ip00404ArRangeEntries = new Ip00404ArRangeEntries();
	
	/**
	* Constructor for Ip00404Table
	**/
    public Ip00404Table() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip00404ArRangeGrp.setParent(this,getStartOffset() + 4);
	       			ip00404ArRangeEntries.setParent(this,getStartOffset() + 42);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip00404EntriesFoundCount
	 *	@return ip00404EntriesFoundCount
	 */
	public int getIp00404EntriesFoundCount() throws CFException {
        if (isIp00404EntriesFoundCountModified()) { 
           ip00404EntriesFoundCount = refreshIp00404EntriesFoundCount();
        }
   		return ip00404EntriesFoundCount;
	}
	
	/**
	 * 	Update Ip00404EntriesFoundCount with the passed value
	 *  Corresponding COBOL Variable is IP00404-ENTRIES-FOUND-COUNT
	 *	@param number
	 */
	public void setIp00404EntriesFoundCount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00404EntriesFoundCount = checkIp00404EntriesFoundCountMaxLimit(number); 
		serializeIp00404EntriesFoundCount(ip00404EntriesFoundCount);
	}


	public void setIp00404EntriesFoundCount(long number) {
	    number = checkIp00404EntriesFoundCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00404EntriesFoundCount((int)number);
	}
	
	/**
	 *	Returns the value of ip00404ArRangeGrp
	 *	@return ip00404ArRangeGrp
	 */   
	 public Ip00404ArRangeGrp getIp00404ArRangeGrp() {
   	return ip00404ArRangeGrp;
   }
   /**
	* 	Update Ip00404ArRangeGrp with the passed value
	*   Corresponding COBOL Variable is IP00404-AR-RANGE-GRP
	*	@param value
	*/
   public void setIp00404ArRangeGrp(char[] value) {
      ip00404ArRangeGrp.setString(value); 
   }   
    
     /**
	 * 	Update Ip00404ArRangeGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00404ArRangeGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404ArRangeGrp.begin,ip00404ArRangeGrp.length());
   }
   
     /**
	 * 	Update Ip00404ArRangeGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ArRangeGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404ArRangeGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00404ArRangeGrp with another Field
	 *	@param value
	 */
   public void setIp00404ArRangeGrp(Field source) {
   	replace(source,0,source.length(),ip00404ArRangeGrp.begin,ip00404ArRangeGrp.length());
   }  
   
     /**
	 * 	Update Ip00404ArRangeGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00404ArRangeGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404ArRangeGrp.begin,ip00404ArRangeGrp.length());
   }
   
     /**
	 * 	Update Ip00404ArRangeGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ArRangeGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404ArRangeGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00404ArRangeEntries
	 *	@return ip00404ArRangeEntries
	 */   
	 public Ip00404ArRangeEntries getIp00404ArRangeEntries() {
   	return ip00404ArRangeEntries;
   }
   /**
	* 	Update Ip00404ArRangeEntries with the passed value
	*   Corresponding COBOL Variable is IP00404-AR-RANGE-ENTRIES
	*	@param value
	*/
   public void setIp00404ArRangeEntries(char[] value) {
      ip00404ArRangeEntries.setString(value); 
   }   
    
     /**
	 * 	Update Ip00404ArRangeEntries 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00404ArRangeEntries(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404ArRangeEntries.begin,ip00404ArRangeEntries.length());
   }
   
     /**
	 * 	Update Ip00404ArRangeEntries 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ArRangeEntries(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404ArRangeEntries.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00404ArRangeEntries with another Field
	 *	@param value
	 */
   public void setIp00404ArRangeEntries(Field source) {
   	replace(source,0,source.length(),ip00404ArRangeEntries.begin,ip00404ArRangeEntries.length());
   }  
   
     /**
	 * 	Update Ip00404ArRangeEntries 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00404ArRangeEntries(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404ArRangeEntries.begin,ip00404ArRangeEntries.length());
   }
   
     /**
	 * 	Update Ip00404ArRangeEntries 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ArRangeEntries(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404ArRangeEntries.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip00404Table
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00404EntriesFoundCount(0);
          ip00404ArRangeGrp.initialize();
     
          ip00404ArRangeEntries.initialize();
     
   }

		public static int getIp00404TableFieldLength() {
			return IP_00404_TABLE_LENGTH;
		}

}
  
