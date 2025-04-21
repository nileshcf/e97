package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoEoj3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpCoEoj3 extends RpCoEoj3Serialized {
   



								private char[] rpCoEoj3TotalStats = Field.fillLowValue(6);

	
	/**
	* Constructor for RpCoEoj3
	**/
    public RpCoEoj3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("STATISTICS & ERROR LOG RECORDS READ      - ").toCharArray()
             , getStartOffset() + 1
             ,43
             );
       replaceValue( // serialize and save the value
             pad(84," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 50
             ,84
             );
    }


 

	/**
	 *	Returns the value of rpCoEoj3TotalStats
	 *	@return rpCoEoj3TotalStats
	 */
   public char[] getRpCoEoj3TotalStats() throws CFException{
     if (isRpCoEoj3TotalStatsModified()) { 
        rpCoEoj3TotalStats = refreshRpCoEoj3TotalStats();
     }
   		return rpCoEoj3TotalStats;
   }

  
	/**
	*  set variable rpCoEoj3TotalStats
	*  Corresponding COBOL Variable is RP-CO-EOJ3-TOTAL-STATS
	*  @param value
	**/
   public void setRpCoEoj3TotalStats(char[] value) {
      rpCoEoj3TotalStats = checkRpCoEoj3TotalStatsConstraints(value);
      serializeRpCoEoj3TotalStats(rpCoEoj3TotalStats);
   } 

     /**
	 * 	Update RpCoEoj3TotalStats 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpCoEoj3TotalStats(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpCoEoj3TotalStats,rpCoEoj3TotalStats.length);
   	
   }
   
   public void setRpCoEoj3TotalStats(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj3TotalStats,rpCoEoj3TotalStats.length);
   	
   }
   
     /**
	 * 	Update RpCoEoj3TotalStats 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj3TotalStats(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj3TotalStats+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpCoEoj3TotalStats with another Field
	 *	@param value
	 */
   public void setRpCoEoj3TotalStats(Field source) {
       replace(source,0,source.length(),beginRpCoEoj3TotalStats,RP_CO_EOJ_3_TOTAL_STATS_LEN);
   	
   }  
   
     /**
	 * 	Update RpCoEoj3TotalStats 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpCoEoj3TotalStats(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpCoEoj3TotalStats,RP_CO_EOJ_3_TOTAL_STATS_LEN);
   	
   }
   
     /**
	 * 	Update RpCoEoj3TotalStats 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj3TotalStats(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj3TotalStats+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpCoEoj3FieldLength() {
			return RP_CO_EOJ_3_LENGTH;
		}

}
  
