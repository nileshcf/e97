package com.cloudframe.app.vsammon7.dto;

/**
*  The class MonitorFileStatus is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:31. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon7.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MonitorFileStatus extends MonitorFileStatusSerialized { 
   

						private char[] staInStat1 = Field.fillLowValue(1);
	
	/**
	* Constructor for MonitorFileStatus
	**/
    public MonitorFileStatus() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of staInStat1
	 *	@return staInStat1
	 */
   public char[] getStaInStat1() throws CFException{
     if (isStaInStat1Modified()) { 
        staInStat1 = refreshStaInStat1();
     }
   		return staInStat1;
   }

  
	/**
	*  set variable staInStat1
	*  Corresponding COBOL Variable is STA-IN-STAT1
	*  @param value
	**/
   public void setStaInStat1(char[] value) {
      staInStat1 = checkStaInStat1Constraints(value);
      serializeStaInStat1(staInStat1);
   } 

     /**
	 * 	Update StaInStat1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStaInStat1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStaInStat1,staInStat1.length);
   	
   }
   
   public void setStaInStat1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStaInStat1,staInStat1.length);
   	
   }
   
     /**
	 * 	Update StaInStat1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStaInStat1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStaInStat1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StaInStat1 with another Field
	 *	@param value
	 */
   public void setStaInStat1(Field source) {
       replace(source,0,source.length(),beginStaInStat1,STA_IN_STAT_1_LEN);
   	
   }  
   
     /**
	 * 	Update StaInStat1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStaInStat1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStaInStat1,STA_IN_STAT_1_LEN);
   	
   }
   
     /**
	 * 	Update StaInStat1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStaInStat1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStaInStat1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMonitorFileStatusFieldLength() {
			return MONITOR_FILE_STATUS_LENGTH;
		}

}
  
