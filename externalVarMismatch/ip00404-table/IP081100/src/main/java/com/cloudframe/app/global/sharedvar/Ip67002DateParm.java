package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002DateParm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip67002DateParm")

public class Ip67002DateParm extends Ip67002DateParmSerialized  implements InitializingBean {
   

						private char[] ip67002Cntl = Field.fillLowValue(1);

								private long ip67002Date;
				private Ip67002DateRedefined ip67002DateRedefined = new Ip67002DateRedefined();
				private Ip67002DateRedefined01 ip67002DateRedefined01 = new Ip67002DateRedefined01();
				private Ip67002DateRedefined02 ip67002DateRedefined02 = new Ip67002DateRedefined02();

								private long ip67002Date2;
				private Ip67002Date2Redefined ip67002Date2Redefined = new Ip67002Date2Redefined();
				private Ip67002Date2Redefined01 ip67002Date2Redefined01 = new Ip67002Date2Redefined01();

								private int ip67002DayOfWeek;

						private char[] ip67002UtcOffsetSign = Field.fillLowValue(1);

								private short ip67002JulianDaysSpan;
	
	/**
	* Constructor for Ip67002DateParm
	**/
    public Ip67002DateParm() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip67002DateRedefined.setParent(this,getStartOffset() + 1);
	       			ip67002DateRedefined01.setParent(this,getStartOffset() + 1);
	       			ip67002DateRedefined02.setParent(this,getStartOffset() + 1);
	       			ip67002Date2Redefined.setParent(this,getStartOffset() + 9);
	       			ip67002Date2Redefined01.setParent(this,getStartOffset() + 9);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip67002Cntl
	 *	@return ip67002Cntl
	 */
   public char[] getIp67002Cntl() throws CFException{
     if (isIp67002CntlModified()) { 
        ip67002Cntl = refreshIp67002Cntl();
     }
   		return ip67002Cntl;
   }

  
	/**
	*  set variable ip67002Cntl
	*  Corresponding COBOL Variable is IP67002-CNTL
	*  @param value
	**/
   public void setIp67002Cntl(char[] value) {
      ip67002Cntl = checkIp67002CntlConstraints(value);
      serializeIp67002Cntl(ip67002Cntl);
   } 

     /**
	 * 	Update Ip67002Cntl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp67002Cntl(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp67002Cntl,ip67002Cntl.length);
   	
   }
   
   public void setIp67002Cntl(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp67002Cntl,ip67002Cntl.length);
   	
   }
   
     /**
	 * 	Update Ip67002Cntl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Cntl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp67002Cntl+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip67002Cntl with another Field
	 *	@param value
	 */
   public void setIp67002Cntl(Field source) {
       replace(source,0,source.length(),beginIp67002Cntl,IP_67002_CNTL_LEN);
   	
   }  
   
     /**
	 * 	Update Ip67002Cntl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp67002Cntl(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp67002Cntl,IP_67002_CNTL_LEN);
   	
   }
   
     /**
	 * 	Update Ip67002Cntl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Cntl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp67002Cntl+targetIndex,targetLen);
    
   }
	char[] ip67002ValidateDate8888Value = "V".toCharArray();
	/**
	 *	Test condition "V" for isIp67002ValidateDate88()
	 *	@return  Returns true if isIp67002ValidateDate88() is "V"
	 */
   public boolean isIp67002ValidateDate88() throws CFException {
      return (  compareChars( getIp67002Cntl() , ip67002ValidateDate8888Value)  == 0  );
   }


	/**
	*  set values "V"
	*/
   	public void setIp67002ValidateDate88True() {  			
    	setIp67002Cntl( ip67002ValidateDate8888Value);
   	}
	char[] ip67002ConvertToJulian8888Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isIp67002ConvertToJulian88()
	 *	@return  Returns true if isIp67002ConvertToJulian88() is "G"
	 */
   public boolean isIp67002ConvertToJulian88() throws CFException {
      return (  compareChars( getIp67002Cntl() , ip67002ConvertToJulian8888Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setIp67002ConvertToJulian88True() {  			
    	setIp67002Cntl( ip67002ConvertToJulian8888Value);
   	}
	char[] ip67002GetCalendarDow8888Value = "W".toCharArray();
	/**
	 *	Test condition "W" for isIp67002GetCalendarDow88()
	 *	@return  Returns true if isIp67002GetCalendarDow88() is "W"
	 */
   public boolean isIp67002GetCalendarDow88() throws CFException {
      return (  compareChars( getIp67002Cntl() , ip67002GetCalendarDow8888Value)  == 0  );
   }


	/**
	*  set values "W"
	*/
   	public void setIp67002GetCalendarDow88True() {  			
    	setIp67002Cntl( ip67002GetCalendarDow8888Value);
   	}
	char[] ip67002ConvertFromJulian8888Value = "J".toCharArray();
	/**
	 *	Test condition "J" for isIp67002ConvertFromJulian88()
	 *	@return  Returns true if isIp67002ConvertFromJulian88() is "J"
	 */
   public boolean isIp67002ConvertFromJulian88() throws CFException {
      return (  compareChars( getIp67002Cntl() , ip67002ConvertFromJulian8888Value)  == 0  );
   }


	/**
	*  set values "J"
	*/
   	public void setIp67002ConvertFromJulian88True() {  			
    	setIp67002Cntl( ip67002ConvertFromJulian8888Value);
   	}
	char[] ip67002JulianDatesSpan8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp67002JulianDatesSpan88()
	 *	@return  Returns true if isIp67002JulianDatesSpan88() is "C"
	 */
   public boolean isIp67002JulianDatesSpan88() throws CFException {
      return (  compareChars( getIp67002Cntl() , ip67002JulianDatesSpan8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp67002JulianDatesSpan88True() {  			
    	setIp67002Cntl( ip67002JulianDatesSpan8888Value);
   	}
	char[] ip67002GetDtBeforeSpan8888Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isIp67002GetDtBeforeSpan88()
	 *	@return  Returns true if isIp67002GetDtBeforeSpan88() is "B"
	 */
   public boolean isIp67002GetDtBeforeSpan88() throws CFException {
      return (  compareChars( getIp67002Cntl() , ip67002GetDtBeforeSpan8888Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setIp67002GetDtBeforeSpan88True() {  			
    	setIp67002Cntl( ip67002GetDtBeforeSpan8888Value);
   	}
	char[] ip67002GetAbsOfGregDt8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isIp67002GetAbsOfGregDt88()
	 *	@return  Returns true if isIp67002GetAbsOfGregDt88() is "A"
	 */
   public boolean isIp67002GetAbsOfGregDt88() throws CFException {
      return (  compareChars( getIp67002Cntl() , ip67002GetAbsOfGregDt8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setIp67002GetAbsOfGregDt88True() {  			
    	setIp67002Cntl( ip67002GetAbsOfGregDt8888Value);
   	}
	char[] ip67002GetAbsOfJulDt8888Value = "Z".toCharArray();
	/**
	 *	Test condition "Z" for isIp67002GetAbsOfJulDt88()
	 *	@return  Returns true if isIp67002GetAbsOfJulDt88() is "Z"
	 */
   public boolean isIp67002GetAbsOfJulDt88() throws CFException {
      return (  compareChars( getIp67002Cntl() , ip67002GetAbsOfJulDt8888Value)  == 0  );
   }


	/**
	*  set values "Z"
	*/
   	public void setIp67002GetAbsOfJulDt88True() {  			
    	setIp67002Cntl( ip67002GetAbsOfJulDt8888Value);
   	}
	char[] ip67002GetGregOfAbsDt8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp67002GetGregOfAbsDt88()
	 *	@return  Returns true if isIp67002GetGregOfAbsDt88() is "D"
	 */
   public boolean isIp67002GetGregOfAbsDt88() throws CFException {
      return (  compareChars( getIp67002Cntl() , ip67002GetGregOfAbsDt8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp67002GetGregOfAbsDt88True() {  			
    	setIp67002Cntl( ip67002GetGregOfAbsDt8888Value);
   	}
	char[] ip67002GetJulOfAbsDt8888Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isIp67002GetJulOfAbsDt88()
	 *	@return  Returns true if isIp67002GetJulOfAbsDt88() is "E"
	 */
   public boolean isIp67002GetJulOfAbsDt88() throws CFException {
      return (  compareChars( getIp67002Cntl() , ip67002GetJulOfAbsDt8888Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setIp67002GetJulOfAbsDt88True() {  			
    	setIp67002Cntl( ip67002GetJulOfAbsDt8888Value);
   	}
	char[] ip67002GetUtcDtTm8888Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isIp67002GetUtcDtTm88()
	 *	@return  Returns true if isIp67002GetUtcDtTm88() is "U"
	 */
   public boolean isIp67002GetUtcDtTm88() throws CFException {
      return (  compareChars( getIp67002Cntl() , ip67002GetUtcDtTm8888Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setIp67002GetUtcDtTm88True() {  			
    	setIp67002Cntl( ip67002GetUtcDtTm8888Value);
   	}
	char[] ip67002AddonGregJulDow8888Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isIp67002AddonGregJulDow88()
	 *	@return  Returns true if isIp67002AddonGregJulDow88() is "O"
	 */
   public boolean isIp67002AddonGregJulDow88() throws CFException {
      return (  compareChars( getIp67002Cntl() , ip67002AddonGregJulDow8888Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setIp67002AddonGregJulDow88True() {  			
    	setIp67002Cntl( ip67002AddonGregJulDow8888Value);
   	}
	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
       if (isIp67002DateModified()) { 
           ip67002Date = refreshIp67002Date();
        }
   		return ip67002Date;
	}
	

	
	   
	/**
	 * 	Update Ip67002Date with the passed value
	 *  Corresponding COBOL Variable is IP67002-DATE
	 *	@param number
	 */
	public void setIp67002Date(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002Date = checkIp67002DateMaxLimit(number); 
		serializeIp67002Date(ip67002Date);
	}
	

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value) throws CFException {
		 ip67002Date = serializeIp67002Date(value);
	}
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value) throws CFException {
		 setIp67002Date(value);
	}
	/**
	 *	Returns the value of ip67002DateRedefined
	 *	@return ip67002DateRedefined
	 */   
	 public Ip67002DateRedefined getIp67002DateRedefined() {
   	return ip67002DateRedefined;
   }
   /**
	* 	Update Ip67002DateRedefined with the passed value
	*   Corresponding COBOL Variable is IP67002-DATE-REDEFINED
	*	@param value
	*/
   public void setIp67002DateRedefined(char[] value) {
      ip67002DateRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Ip67002DateRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002DateRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002DateRedefined.begin,ip67002DateRedefined.length());
   }
   
     /**
	 * 	Update Ip67002DateRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002DateRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002DateRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip67002DateRedefined with another Field
	 *	@param value
	 */
   public void setIp67002DateRedefined(Field source) {
   	replace(source,0,source.length(),ip67002DateRedefined.begin,ip67002DateRedefined.length());
   }  
   
     /**
	 * 	Update Ip67002DateRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002DateRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002DateRedefined.begin,ip67002DateRedefined.length());
   }
   
     /**
	 * 	Update Ip67002DateRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002DateRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002DateRedefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip67002DateRedefined01
	 *	@return ip67002DateRedefined01
	 */   
	 public Ip67002DateRedefined01 getIp67002DateRedefined01() {
   	return ip67002DateRedefined01;
   }
   /**
	* 	Update Ip67002DateRedefined01 with the passed value
	*   Corresponding COBOL Variable is IP67002-DATE-REDEFINED
	*	@param value
	*/
   public void setIp67002DateRedefined01(char[] value) {
      ip67002DateRedefined01.setString(value); 
   }   
    
     /**
	 * 	Update Ip67002DateRedefined01 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002DateRedefined01(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002DateRedefined01.begin,ip67002DateRedefined01.length());
   }
   
     /**
	 * 	Update Ip67002DateRedefined01 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002DateRedefined01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002DateRedefined01.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip67002DateRedefined01 with another Field
	 *	@param value
	 */
   public void setIp67002DateRedefined01(Field source) {
   	replace(source,0,source.length(),ip67002DateRedefined01.begin,ip67002DateRedefined01.length());
   }  
   
     /**
	 * 	Update Ip67002DateRedefined01 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002DateRedefined01(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002DateRedefined01.begin,ip67002DateRedefined01.length());
   }
   
     /**
	 * 	Update Ip67002DateRedefined01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002DateRedefined01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002DateRedefined01.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip67002DateRedefined02
	 *	@return ip67002DateRedefined02
	 */   
	 public Ip67002DateRedefined02 getIp67002DateRedefined02() {
   	return ip67002DateRedefined02;
   }
   /**
	* 	Update Ip67002DateRedefined02 with the passed value
	*   Corresponding COBOL Variable is IP67002-DATE-REDEFINED
	*	@param value
	*/
   public void setIp67002DateRedefined02(char[] value) {
      ip67002DateRedefined02.setString(value); 
   }   
    
     /**
	 * 	Update Ip67002DateRedefined02 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002DateRedefined02(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002DateRedefined02.begin,ip67002DateRedefined02.length());
   }
   
     /**
	 * 	Update Ip67002DateRedefined02 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002DateRedefined02(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002DateRedefined02.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip67002DateRedefined02 with another Field
	 *	@param value
	 */
   public void setIp67002DateRedefined02(Field source) {
   	replace(source,0,source.length(),ip67002DateRedefined02.begin,ip67002DateRedefined02.length());
   }  
   
     /**
	 * 	Update Ip67002DateRedefined02 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002DateRedefined02(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002DateRedefined02.begin,ip67002DateRedefined02.length());
   }
   
     /**
	 * 	Update Ip67002DateRedefined02 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002DateRedefined02(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002DateRedefined02.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip67002Date2
	 *	@return ip67002Date2
	 */
	public long getIp67002Date2() throws CFException {
       if (isIp67002Date2Modified()) { 
           ip67002Date2 = refreshIp67002Date2();
        }
   		return ip67002Date2;
	}
	

	
	   
	/**
	 * 	Update Ip67002Date2 with the passed value
	 *  Corresponding COBOL Variable is IP67002-DATE-2
	 *	@param number
	 */
	public void setIp67002Date2(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002Date2 = checkIp67002Date2MaxLimit(number); 
		serializeIp67002Date2(ip67002Date2);
	}
	

	/**
	 * 	Update Ip67002Date2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date2(char[] value) throws CFException {
		 ip67002Date2 = serializeIp67002Date2(value);
	}
	/**
	 * 	Update Ip67002Date2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002Date2String(char[] value) throws CFException {
		 setIp67002Date2(value);
	}
	/**
	 *	Returns the value of ip67002Date2Redefined
	 *	@return ip67002Date2Redefined
	 */   
	 public Ip67002Date2Redefined getIp67002Date2Redefined() {
   	return ip67002Date2Redefined;
   }
   /**
	* 	Update Ip67002Date2Redefined with the passed value
	*   Corresponding COBOL Variable is IP67002-DATE-2-REDEFINED
	*	@param value
	*/
   public void setIp67002Date2Redefined(char[] value) {
      ip67002Date2Redefined.setString(value); 
   }   
    
     /**
	 * 	Update Ip67002Date2Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002Date2Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Date2Redefined.begin,ip67002Date2Redefined.length());
   }
   
     /**
	 * 	Update Ip67002Date2Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Date2Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Date2Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip67002Date2Redefined with another Field
	 *	@param value
	 */
   public void setIp67002Date2Redefined(Field source) {
   	replace(source,0,source.length(),ip67002Date2Redefined.begin,ip67002Date2Redefined.length());
   }  
   
     /**
	 * 	Update Ip67002Date2Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002Date2Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Date2Redefined.begin,ip67002Date2Redefined.length());
   }
   
     /**
	 * 	Update Ip67002Date2Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Date2Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Date2Redefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip67002Date2Redefined01
	 *	@return ip67002Date2Redefined01
	 */   
	 public Ip67002Date2Redefined01 getIp67002Date2Redefined01() {
   	return ip67002Date2Redefined01;
   }
   /**
	* 	Update Ip67002Date2Redefined01 with the passed value
	*   Corresponding COBOL Variable is IP67002-DATE-2-REDEFINED
	*	@param value
	*/
   public void setIp67002Date2Redefined01(char[] value) {
      ip67002Date2Redefined01.setString(value); 
   }   
    
     /**
	 * 	Update Ip67002Date2Redefined01 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002Date2Redefined01(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Date2Redefined01.begin,ip67002Date2Redefined01.length());
   }
   
     /**
	 * 	Update Ip67002Date2Redefined01 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Date2Redefined01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Date2Redefined01.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip67002Date2Redefined01 with another Field
	 *	@param value
	 */
   public void setIp67002Date2Redefined01(Field source) {
   	replace(source,0,source.length(),ip67002Date2Redefined01.begin,ip67002Date2Redefined01.length());
   }  
   
     /**
	 * 	Update Ip67002Date2Redefined01 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002Date2Redefined01(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Date2Redefined01.begin,ip67002Date2Redefined01.length());
   }
   
     /**
	 * 	Update Ip67002Date2Redefined01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Date2Redefined01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Date2Redefined01.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip67002DayOfWeek
	 *	@return ip67002DayOfWeek
	 */
	public int getIp67002DayOfWeek() throws CFException {
       if (isIp67002DayOfWeekModified()) { 
           ip67002DayOfWeek = refreshIp67002DayOfWeek();
        }
   		return ip67002DayOfWeek;
	}
	

	
	   
	/**
	 * 	Update Ip67002DayOfWeek with the passed value
	 *  Corresponding COBOL Variable is IP67002-DAY-OF-WEEK
	 *	@param number
	 */
	public void setIp67002DayOfWeek(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002DayOfWeek = checkIp67002DayOfWeekMaxLimit(number); 
		serializeIp67002DayOfWeek(ip67002DayOfWeek);
	}
	

	public void setIp67002DayOfWeek(long number) {
	    number = checkIp67002DayOfWeekMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002DayOfWeek((int)number);
	}
	
	/**
	 * 	Update Ip67002DayOfWeek with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002DayOfWeek(char[] value) throws CFException {
		 ip67002DayOfWeek = serializeIp67002DayOfWeek(value);
	}
	/**
	 * 	Update Ip67002DayOfWeek with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DayOfWeekString(char[] value) throws CFException {
		 setIp67002DayOfWeek(value);
	}
	/**
	 *	Returns the value of ip67002UtcOffsetSign
	 *	@return ip67002UtcOffsetSign
	 */
   public char[] getIp67002UtcOffsetSign() throws CFException{
     if (isIp67002UtcOffsetSignModified()) { 
        ip67002UtcOffsetSign = refreshIp67002UtcOffsetSign();
     }
   		return ip67002UtcOffsetSign;
   }

  
	/**
	*  set variable ip67002UtcOffsetSign
	*  Corresponding COBOL Variable is IP67002-UTC-OFFSET-SIGN
	*  @param value
	**/
   public void setIp67002UtcOffsetSign(char[] value) {
      ip67002UtcOffsetSign = checkIp67002UtcOffsetSignConstraints(value);
      serializeIp67002UtcOffsetSign(ip67002UtcOffsetSign);
   } 

     /**
	 * 	Update Ip67002UtcOffsetSign 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp67002UtcOffsetSign(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp67002UtcOffsetSign,ip67002UtcOffsetSign.length);
   	
   }
   
   public void setIp67002UtcOffsetSign(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp67002UtcOffsetSign,ip67002UtcOffsetSign.length);
   	
   }
   
     /**
	 * 	Update Ip67002UtcOffsetSign 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002UtcOffsetSign(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp67002UtcOffsetSign+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip67002UtcOffsetSign with another Field
	 *	@param value
	 */
   public void setIp67002UtcOffsetSign(Field source) {
       replace(source,0,source.length(),beginIp67002UtcOffsetSign,IP_67002_UTC_OFFSET_SIGN_LEN);
   	
   }  
   
     /**
	 * 	Update Ip67002UtcOffsetSign 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp67002UtcOffsetSign(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp67002UtcOffsetSign,IP_67002_UTC_OFFSET_SIGN_LEN);
   	
   }
   
     /**
	 * 	Update Ip67002UtcOffsetSign 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002UtcOffsetSign(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp67002UtcOffsetSign+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip67002JulianDaysSpan
	 *	@return ip67002JulianDaysSpan
	 */
	public short getIp67002JulianDaysSpan() throws CFException {
        if (isIp67002JulianDaysSpanModified()) { 
           ip67002JulianDaysSpan = refreshIp67002JulianDaysSpan();
        }
   		return ip67002JulianDaysSpan;
	}
	
	/**
	 * 	Update Ip67002JulianDaysSpan with the passed value
	 *  Corresponding COBOL Variable is IP67002-JULIAN-DAYS-SPAN
	 *	@param number
	 */
	public void setIp67002JulianDaysSpan(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip67002JulianDaysSpan = checkIp67002JulianDaysSpanMaxLimit(number); 
		serializeIp67002JulianDaysSpan(ip67002JulianDaysSpan);
	}

	public void setIp67002JulianDaysSpan(int number) {
	    number = checkIp67002JulianDaysSpanMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp67002JulianDaysSpan((short)number);
	}
	public void setIp67002JulianDaysSpan(long number) {
	    number = checkIp67002JulianDaysSpanMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp67002JulianDaysSpan((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip67002DateParm
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp67002Cntl(CONSTANTS.SPACE);
                     setIp67002Date(0);
                     setIp67002Date2(0);
                     setIp67002DayOfWeek(0);
         	setIp67002JulianDaysSpan((short)0);
   }

		public static int getIp67002DateParmFieldLength() {
			return IP_67002_DATE_PARM_LENGTH;
		}

}
  
