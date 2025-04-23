package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip996011StartTimestamp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class Ip996011StartTimestamp extends Ip996011StartTimestampSerialized { 
   

								private char[] ip996011StartMonth = Field.fillLowValue(3);

								private char[] ip996011StartDay = Field.fillLowValue(3);

								private char[] ip996011StartYear = Field.fillLowValue(3);

								private int ip996011StartHour;

						private char[] ip996011Dot1 = Field.fillLowValue(1);

								private int ip996011StartMinute;

						private char[] ip996011Dot2 = Field.fillLowValue(1);

								private char[] ip996011StartSecond = Field.fillLowValue(4);
	
	/**
	* Constructor for Ip996011StartTimestamp
	**/
    public Ip996011StartTimestamp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip996011StartTimestamp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip996011StartTimestamp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip996011StartMonth
	 *	@return ip996011StartMonth
	 */
   public char[] getIp996011StartMonth() throws CFException{
     if (isIp996011StartMonthModified()) { 
        ip996011StartMonth = refreshIp996011StartMonth();
     }
   		return ip996011StartMonth;
   }

  
	/**
	*  set variable ip996011StartMonth
	*  Corresponding COBOL Variable is IP996011-START-MONTH
	*  @param value
	**/
   public void setIp996011StartMonth(char[] value) {
      ip996011StartMonth = checkIp996011StartMonthConstraints(value);
      serializeIp996011StartMonth(ip996011StartMonth);
   } 

     /**
	 * 	Update Ip996011StartMonth 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011StartMonth(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996011StartMonth,ip996011StartMonth.length);
   	
   }
   
   public void setIp996011StartMonth(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011StartMonth,ip996011StartMonth.length);
   	
   }
   
     /**
	 * 	Update Ip996011StartMonth 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011StartMonth(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011StartMonth+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996011StartMonth with another Field
	 *	@param value
	 */
   public void setIp996011StartMonth(Field source) {
       replace(source,0,source.length(),beginIp996011StartMonth,IP_996011_START_MONTH_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996011StartMonth 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011StartMonth(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996011StartMonth,IP_996011_START_MONTH_LEN);
   	
   }
   
     /**
	 * 	Update Ip996011StartMonth 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011StartMonth(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011StartMonth+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip996011StartDay
	 *	@return ip996011StartDay
	 */
   public char[] getIp996011StartDay() throws CFException{
     if (isIp996011StartDayModified()) { 
        ip996011StartDay = refreshIp996011StartDay();
     }
   		return ip996011StartDay;
   }

  
	/**
	*  set variable ip996011StartDay
	*  Corresponding COBOL Variable is IP996011-START-DAY
	*  @param value
	**/
   public void setIp996011StartDay(char[] value) {
      ip996011StartDay = checkIp996011StartDayConstraints(value);
      serializeIp996011StartDay(ip996011StartDay);
   } 

     /**
	 * 	Update Ip996011StartDay 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011StartDay(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996011StartDay,ip996011StartDay.length);
   	
   }
   
   public void setIp996011StartDay(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011StartDay,ip996011StartDay.length);
   	
   }
   
     /**
	 * 	Update Ip996011StartDay 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011StartDay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011StartDay+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996011StartDay with another Field
	 *	@param value
	 */
   public void setIp996011StartDay(Field source) {
       replace(source,0,source.length(),beginIp996011StartDay,IP_996011_START_DAY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996011StartDay 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011StartDay(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996011StartDay,IP_996011_START_DAY_LEN);
   	
   }
   
     /**
	 * 	Update Ip996011StartDay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011StartDay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011StartDay+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip996011StartYear
	 *	@return ip996011StartYear
	 */
   public char[] getIp996011StartYear() throws CFException{
     if (isIp996011StartYearModified()) { 
        ip996011StartYear = refreshIp996011StartYear();
     }
   		return ip996011StartYear;
   }

  
	/**
	*  set variable ip996011StartYear
	*  Corresponding COBOL Variable is IP996011-START-YEAR
	*  @param value
	**/
   public void setIp996011StartYear(char[] value) {
      ip996011StartYear = checkIp996011StartYearConstraints(value);
      serializeIp996011StartYear(ip996011StartYear);
   } 

     /**
	 * 	Update Ip996011StartYear 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011StartYear(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996011StartYear,ip996011StartYear.length);
   	
   }
   
   public void setIp996011StartYear(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011StartYear,ip996011StartYear.length);
   	
   }
   
     /**
	 * 	Update Ip996011StartYear 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011StartYear(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011StartYear+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996011StartYear with another Field
	 *	@param value
	 */
   public void setIp996011StartYear(Field source) {
       replace(source,0,source.length(),beginIp996011StartYear,IP_996011_START_YEAR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996011StartYear 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011StartYear(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996011StartYear,IP_996011_START_YEAR_LEN);
   	
   }
   
     /**
	 * 	Update Ip996011StartYear 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011StartYear(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011StartYear+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip996011StartHour
	 *	@return ip996011StartHour
	 */
	public int getIp996011StartHour() throws CFException {
       if (isIp996011StartHourModified()) { 
           ip996011StartHour = refreshIp996011StartHour();
        }
   		return ip996011StartHour;
	}
	

	
	   
	/**
	 * 	Update Ip996011StartHour with the passed value
	 *  Corresponding COBOL Variable is IP996011-START-HOUR
	 *	@param number
	 */
	public void setIp996011StartHour(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip996011StartHour = checkIp996011StartHourMaxLimit(number); 
		serializeIp996011StartHour(ip996011StartHour);
	}
	

	public void setIp996011StartHour(long number) {
	    number = checkIp996011StartHourMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp996011StartHour((int)number);
	}
	
	/**
	 * 	Update Ip996011StartHour with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp996011StartHour(char[] value) throws CFException {
		 ip996011StartHour = serializeIp996011StartHour(value);
	}
	/**
	 * 	Update Ip996011StartHour with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp996011StartHourString(char[] value) throws CFException {
		 setIp996011StartHour(value);
	}
	/**
	 *	Returns the value of ip996011Dot1
	 *	@return ip996011Dot1
	 */
   public char[] getIp996011Dot1() throws CFException{
     if (isIp996011Dot1Modified()) { 
        ip996011Dot1 = refreshIp996011Dot1();
     }
   		return ip996011Dot1;
   }

  
	/**
	*  set variable ip996011Dot1
	*  Corresponding COBOL Variable is IP996011-DOT-1
	*  @param value
	**/
   public void setIp996011Dot1(char[] value) {
      ip996011Dot1 = checkIp996011Dot1Constraints(value);
      serializeIp996011Dot1(ip996011Dot1);
   } 

     /**
	 * 	Update Ip996011Dot1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011Dot1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996011Dot1,ip996011Dot1.length);
   	
   }
   
   public void setIp996011Dot1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011Dot1,ip996011Dot1.length);
   	
   }
   
     /**
	 * 	Update Ip996011Dot1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011Dot1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011Dot1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996011Dot1 with another Field
	 *	@param value
	 */
   public void setIp996011Dot1(Field source) {
       replace(source,0,source.length(),beginIp996011Dot1,IP_996011_DOT_1_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996011Dot1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011Dot1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996011Dot1,IP_996011_DOT_1_LEN);
   	
   }
   
     /**
	 * 	Update Ip996011Dot1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011Dot1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011Dot1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip996011StartMinute
	 *	@return ip996011StartMinute
	 */
	public int getIp996011StartMinute() throws CFException {
       if (isIp996011StartMinuteModified()) { 
           ip996011StartMinute = refreshIp996011StartMinute();
        }
   		return ip996011StartMinute;
	}
	

	
	   
	/**
	 * 	Update Ip996011StartMinute with the passed value
	 *  Corresponding COBOL Variable is IP996011-START-MINUTE
	 *	@param number
	 */
	public void setIp996011StartMinute(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip996011StartMinute = checkIp996011StartMinuteMaxLimit(number); 
		serializeIp996011StartMinute(ip996011StartMinute);
	}
	

	public void setIp996011StartMinute(long number) {
	    number = checkIp996011StartMinuteMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp996011StartMinute((int)number);
	}
	
	/**
	 * 	Update Ip996011StartMinute with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp996011StartMinute(char[] value) throws CFException {
		 ip996011StartMinute = serializeIp996011StartMinute(value);
	}
	/**
	 * 	Update Ip996011StartMinute with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp996011StartMinuteString(char[] value) throws CFException {
		 setIp996011StartMinute(value);
	}
	/**
	 *	Returns the value of ip996011Dot2
	 *	@return ip996011Dot2
	 */
   public char[] getIp996011Dot2() throws CFException{
     if (isIp996011Dot2Modified()) { 
        ip996011Dot2 = refreshIp996011Dot2();
     }
   		return ip996011Dot2;
   }

  
	/**
	*  set variable ip996011Dot2
	*  Corresponding COBOL Variable is IP996011-DOT-2
	*  @param value
	**/
   public void setIp996011Dot2(char[] value) {
      ip996011Dot2 = checkIp996011Dot2Constraints(value);
      serializeIp996011Dot2(ip996011Dot2);
   } 

     /**
	 * 	Update Ip996011Dot2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011Dot2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996011Dot2,ip996011Dot2.length);
   	
   }
   
   public void setIp996011Dot2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011Dot2,ip996011Dot2.length);
   	
   }
   
     /**
	 * 	Update Ip996011Dot2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011Dot2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011Dot2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996011Dot2 with another Field
	 *	@param value
	 */
   public void setIp996011Dot2(Field source) {
       replace(source,0,source.length(),beginIp996011Dot2,IP_996011_DOT_2_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996011Dot2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011Dot2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996011Dot2,IP_996011_DOT_2_LEN);
   	
   }
   
     /**
	 * 	Update Ip996011Dot2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011Dot2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011Dot2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip996011StartSecond
	 *	@return ip996011StartSecond
	 */
   public char[] getIp996011StartSecond() throws CFException{
     if (isIp996011StartSecondModified()) { 
        ip996011StartSecond = refreshIp996011StartSecond();
     }
   		return ip996011StartSecond;
   }

  
	/**
	*  set variable ip996011StartSecond
	*  Corresponding COBOL Variable is IP996011-START-SECOND
	*  @param value
	**/
   public void setIp996011StartSecond(char[] value) {
      ip996011StartSecond = checkIp996011StartSecondConstraints(value);
      serializeIp996011StartSecond(ip996011StartSecond);
   } 

     /**
	 * 	Update Ip996011StartSecond 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011StartSecond(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996011StartSecond,ip996011StartSecond.length);
   	
   }
   
   public void setIp996011StartSecond(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011StartSecond,ip996011StartSecond.length);
   	
   }
   
     /**
	 * 	Update Ip996011StartSecond 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011StartSecond(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011StartSecond+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996011StartSecond with another Field
	 *	@param value
	 */
   public void setIp996011StartSecond(Field source) {
       replace(source,0,source.length(),beginIp996011StartSecond,IP_996011_START_SECOND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996011StartSecond 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011StartSecond(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996011StartSecond,IP_996011_START_SECOND_LEN);
   	
   }
   
     /**
	 * 	Update Ip996011StartSecond 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011StartSecond(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011StartSecond+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip996011StartTimestamp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setIp996011StartMonth(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_33154069,"0".toCharArray()));
                    setIp996011StartDay(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_33154069,"0".toCharArray()));
                    setIp996011StartYear(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_33154658,"0".toCharArray()));
                     setIp996011StartHour(0);
         setIp996011Dot1(CONSTANTS.SPACE);
                     setIp996011StartMinute(0);
         setIp996011Dot2(CONSTANTS.SPACE);
                    setIp996011StartSecond(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1027795424,"0".toCharArray()));
   }

		public static int getIp996011StartTimestampFieldLength() {
			return IP_996011_START_TIMESTAMP_LENGTH;
		}

}
  
