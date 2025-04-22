package com.cloudframe.app.sf305120.dto;

/**
*  The class ClassCLogRecord260 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ClassCLogRecord260 extends ClassCLogRecord260Serialized {
   


								private short logcMiplogLength260;

						private char[] logcClassType260 = new char[2];

						private char[] logcMiplogRefNum260 = new char[6];

						private char[] logcMiplogBoxId260 = new char[3];

						private char[] logcMiplogTime260 = new char[3];

						private char[] logcMiplogDate260 = new char[3];
				private AdditionalRuc260 additionalRuc260 = new AdditionalRuc260();
				private AdditionalRuc260Redefined additionalRuc260Redefined = new AdditionalRuc260Redefined();

						private char[] logcServiceType260 = new char[4];

						private char[] logcApplRefNo260 = new char[6];


						private char[] accountNo260 = new char[16];


						private char[] logcAcqMipId260 = new char[3];

						private char[] logcIssMipId260 = new char[3];


						private char[] logcIsoMessage260 = new char[8000];
	
	/**
	* Constructor for ClassCLogRecord260
	**/
    public ClassCLogRecord260() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			additionalRuc260.setParent(this,getStartOffset() + 32);
	       			additionalRuc260Redefined.setParent(this,getStartOffset() + 32);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 0
             ,13
             );
								setLogcMiplogLength260((short)0);
								setLogcClassType260(fillSpace(2));
								setLogcMiplogRefNum260(fillSpace(6));
								setLogcMiplogBoxId260(fillSpace(3));
								setLogcMiplogTime260(fillSpace(3));
								setLogcMiplogDate260(fillSpace(3));
								setLogcServiceType260(fillSpace(4));
								setLogcApplRefNo260(fillSpace(6));
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 123
             ,7
             );
								setAccountNo260(fillSpace(16));
       replaceValue( // serialize and save the value
             pad(98," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 146
             ,98
             );
								setLogcAcqMipId260(fillSpace(3));
								setLogcIssMipId260(fillSpace(3));
       replaceValue( // serialize and save the value
             fillSpace(23)
             , getStartOffset() + 250
             ,23
             );
								setLogcIsoMessage260(pad(8000," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of logcMiplogLength260
	 *	@return logcMiplogLength260
	 */
	public short getLogcMiplogLength260() throws CFException {
        if (isLogcMiplogLength260Modified()) { 
           logcMiplogLength260 = refreshLogcMiplogLength260();
        }
   		return logcMiplogLength260;
	}
	
	/**
	 * 	Update LogcMiplogLength260 with the passed value
	 *  Corresponding COBOL Variable is 260-LOGC-MIPLOG-LENGTH
	 *	@param number
	 */
	public void setLogcMiplogLength260(short number) {
	     // Truncate if the number is beyond +/- Max range
	    logcMiplogLength260 = checkLogcMiplogLength260MaxLimit(number); 
		serializeLogcMiplogLength260(logcMiplogLength260);
	}

	public void setLogcMiplogLength260(int number) {
	    number = checkLogcMiplogLength260MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLogcMiplogLength260((short)number);
	}
	public void setLogcMiplogLength260(long number) {
	    number = checkLogcMiplogLength260MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLogcMiplogLength260((short)number);
	}
	

	/**
	 *	Returns the value of logcClassType260
	 *	@return logcClassType260
	 */
   public char[] getLogcClassType260() throws CFException{
     if (isLogcClassType260Modified()) { 
        logcClassType260 = refreshLogcClassType260();
     }
   		return logcClassType260;
   }

  
	/**
	*  set variable logcClassType260
	*  Corresponding COBOL Variable is 260-LOGC-CLASS-TYPE
	*  @param value
	**/
   public void setLogcClassType260(char[] value) {
      logcClassType260 = checkLogcClassType260Constraints(value);
      serializeLogcClassType260(logcClassType260);
   } 

     /**
	 * 	Update LogcClassType260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcClassType260(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogcClassType260,logcClassType260.length);
   	
   }
   
   public void setLogcClassType260(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogcClassType260,logcClassType260.length);
   	
   }
   
     /**
	 * 	Update LogcClassType260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcClassType260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcClassType260+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogcClassType260 with another Field
	 *	@param value
	 */
   public void setLogcClassType260(Field source) {
       replace(source,0,source.length(),beginLogcClassType260,LOGC_CLASS_TYPE_260_LEN);
   	
   }  
   
     /**
	 * 	Update LogcClassType260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcClassType260(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogcClassType260,LOGC_CLASS_TYPE_260_LEN);
   	
   }
   
     /**
	 * 	Update LogcClassType260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcClassType260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcClassType260+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of logcMiplogRefNum260
	 *	@return logcMiplogRefNum260
	 */
   public char[] getLogcMiplogRefNum260() throws CFException{
     if (isLogcMiplogRefNum260Modified()) { 
        logcMiplogRefNum260 = refreshLogcMiplogRefNum260();
     }
   		return logcMiplogRefNum260;
   }

  
	/**
	*  set variable logcMiplogRefNum260
	*  Corresponding COBOL Variable is 260-LOGC-MIPLOG-REF-NUM
	*  @param value
	**/
   public void setLogcMiplogRefNum260(char[] value) {
      logcMiplogRefNum260 = checkLogcMiplogRefNum260Constraints(value);
      serializeLogcMiplogRefNum260(logcMiplogRefNum260);
   } 

     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogcMiplogRefNum260,logcMiplogRefNum260.length);
   	
   }
   
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogcMiplogRefNum260,logcMiplogRefNum260.length);
   	
   }
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcMiplogRefNum260+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogcMiplogRefNum260 with another Field
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source) {
       replace(source,0,source.length(),beginLogcMiplogRefNum260,LOGC_MIPLOG_REF_NUM_260_LEN);
   	
   }  
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogcMiplogRefNum260,LOGC_MIPLOG_REF_NUM_260_LEN);
   	
   }
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcMiplogRefNum260+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of logcMiplogBoxId260
	 *	@return logcMiplogBoxId260
	 */
   public char[] getLogcMiplogBoxId260() throws CFException{
     if (isLogcMiplogBoxId260Modified()) { 
        logcMiplogBoxId260 = refreshLogcMiplogBoxId260();
     }
   		return logcMiplogBoxId260;
   }

  
	/**
	*  set variable logcMiplogBoxId260
	*  Corresponding COBOL Variable is 260-LOGC-MIPLOG-BOX-ID
	*  @param value
	**/
   public void setLogcMiplogBoxId260(char[] value) {
      logcMiplogBoxId260 = checkLogcMiplogBoxId260Constraints(value);
      serializeLogcMiplogBoxId260(logcMiplogBoxId260);
   } 

     /**
	 * 	Update LogcMiplogBoxId260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcMiplogBoxId260(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogcMiplogBoxId260,logcMiplogBoxId260.length);
   	
   }
   
   public void setLogcMiplogBoxId260(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogcMiplogBoxId260,logcMiplogBoxId260.length);
   	
   }
   
     /**
	 * 	Update LogcMiplogBoxId260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogBoxId260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcMiplogBoxId260+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogcMiplogBoxId260 with another Field
	 *	@param value
	 */
   public void setLogcMiplogBoxId260(Field source) {
       replace(source,0,source.length(),beginLogcMiplogBoxId260,LOGC_MIPLOG_BOX_ID_260_LEN);
   	
   }  
   
     /**
	 * 	Update LogcMiplogBoxId260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcMiplogBoxId260(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogcMiplogBoxId260,LOGC_MIPLOG_BOX_ID_260_LEN);
   	
   }
   
     /**
	 * 	Update LogcMiplogBoxId260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogBoxId260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcMiplogBoxId260+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of logcMiplogTime260
	 *	@return logcMiplogTime260
	 */
   public char[] getLogcMiplogTime260() throws CFException{
     if (isLogcMiplogTime260Modified()) { 
        logcMiplogTime260 = refreshLogcMiplogTime260();
     }
   		return logcMiplogTime260;
   }

  
	/**
	*  set variable logcMiplogTime260
	*  Corresponding COBOL Variable is 260-LOGC-MIPLOG-TIME
	*  @param value
	**/
   public void setLogcMiplogTime260(char[] value) {
      logcMiplogTime260 = checkLogcMiplogTime260Constraints(value);
      serializeLogcMiplogTime260(logcMiplogTime260);
   } 

     /**
	 * 	Update LogcMiplogTime260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcMiplogTime260(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogcMiplogTime260,logcMiplogTime260.length);
   	
   }
   
   public void setLogcMiplogTime260(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogcMiplogTime260,logcMiplogTime260.length);
   	
   }
   
     /**
	 * 	Update LogcMiplogTime260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogTime260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcMiplogTime260+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogcMiplogTime260 with another Field
	 *	@param value
	 */
   public void setLogcMiplogTime260(Field source) {
       replace(source,0,source.length(),beginLogcMiplogTime260,LOGC_MIPLOG_TIME_260_LEN);
   	
   }  
   
     /**
	 * 	Update LogcMiplogTime260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcMiplogTime260(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogcMiplogTime260,LOGC_MIPLOG_TIME_260_LEN);
   	
   }
   
     /**
	 * 	Update LogcMiplogTime260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogTime260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcMiplogTime260+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of logcMiplogDate260
	 *	@return logcMiplogDate260
	 */
   public char[] getLogcMiplogDate260() throws CFException{
     if (isLogcMiplogDate260Modified()) { 
        logcMiplogDate260 = refreshLogcMiplogDate260();
     }
   		return logcMiplogDate260;
   }

  
	/**
	*  set variable logcMiplogDate260
	*  Corresponding COBOL Variable is 260-LOGC-MIPLOG-DATE
	*  @param value
	**/
   public void setLogcMiplogDate260(char[] value) {
      logcMiplogDate260 = checkLogcMiplogDate260Constraints(value);
      serializeLogcMiplogDate260(logcMiplogDate260);
   } 

     /**
	 * 	Update LogcMiplogDate260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcMiplogDate260(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogcMiplogDate260,logcMiplogDate260.length);
   	
   }
   
   public void setLogcMiplogDate260(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogcMiplogDate260,logcMiplogDate260.length);
   	
   }
   
     /**
	 * 	Update LogcMiplogDate260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogDate260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcMiplogDate260+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogcMiplogDate260 with another Field
	 *	@param value
	 */
   public void setLogcMiplogDate260(Field source) {
       replace(source,0,source.length(),beginLogcMiplogDate260,LOGC_MIPLOG_DATE_260_LEN);
   	
   }  
   
     /**
	 * 	Update LogcMiplogDate260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcMiplogDate260(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogcMiplogDate260,LOGC_MIPLOG_DATE_260_LEN);
   	
   }
   
     /**
	 * 	Update LogcMiplogDate260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogDate260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcMiplogDate260+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of additionalRuc260
	 *	@return additionalRuc260
	 */   
	 public AdditionalRuc260 getAdditionalRuc260() {
   	return additionalRuc260;
   }
   /**
	* 	Update AdditionalRuc260 with the passed value
	*   Corresponding COBOL Variable is 260-ADDITIONAL-RUC
	*	@param value
	*/
   public void setAdditionalRuc260(char[] value) {
      additionalRuc260.setString(value); 
   }   
    
     /**
	 * 	Update AdditionalRuc260 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAdditionalRuc260(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,additionalRuc260.begin,additionalRuc260.length());
   }
   
     /**
	 * 	Update AdditionalRuc260 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdditionalRuc260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,additionalRuc260.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AdditionalRuc260 with another Field
	 *	@param value
	 */
   public void setAdditionalRuc260(Field source) {
   	replace(source,0,source.length(),additionalRuc260.begin,additionalRuc260.length());
   }  
   
     /**
	 * 	Update AdditionalRuc260 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAdditionalRuc260(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,additionalRuc260.begin,additionalRuc260.length());
   }
   
     /**
	 * 	Update AdditionalRuc260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdditionalRuc260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,additionalRuc260.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of additionalRuc260Redefined
	 *	@return additionalRuc260Redefined
	 */   
	 public AdditionalRuc260Redefined getAdditionalRuc260Redefined() {
   	return additionalRuc260Redefined;
   }
   /**
	* 	Update AdditionalRuc260Redefined with the passed value
	*   Corresponding COBOL Variable is 260-ADDITIONAL-RUC-REDEFINED
	*	@param value
	*/
   public void setAdditionalRuc260Redefined(char[] value) {
      additionalRuc260Redefined.setString(value); 
   }   
    
     /**
	 * 	Update AdditionalRuc260Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAdditionalRuc260Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,additionalRuc260Redefined.begin,additionalRuc260Redefined.length());
   }
   
     /**
	 * 	Update AdditionalRuc260Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdditionalRuc260Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,additionalRuc260Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AdditionalRuc260Redefined with another Field
	 *	@param value
	 */
   public void setAdditionalRuc260Redefined(Field source) {
   	replace(source,0,source.length(),additionalRuc260Redefined.begin,additionalRuc260Redefined.length());
   }  
   
     /**
	 * 	Update AdditionalRuc260Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAdditionalRuc260Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,additionalRuc260Redefined.begin,additionalRuc260Redefined.length());
   }
   
     /**
	 * 	Update AdditionalRuc260Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdditionalRuc260Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,additionalRuc260Redefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of logcServiceType260
	 *	@return logcServiceType260
	 */
   public char[] getLogcServiceType260() throws CFException{
     if (isLogcServiceType260Modified()) { 
        logcServiceType260 = refreshLogcServiceType260();
     }
   		return logcServiceType260;
   }

  
	/**
	*  set variable logcServiceType260
	*  Corresponding COBOL Variable is 260-LOGC-SERVICE-TYPE
	*  @param value
	**/
   public void setLogcServiceType260(char[] value) {
      logcServiceType260 = checkLogcServiceType260Constraints(value);
      serializeLogcServiceType260(logcServiceType260);
   } 

     /**
	 * 	Update LogcServiceType260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcServiceType260(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogcServiceType260,logcServiceType260.length);
   	
   }
   
   public void setLogcServiceType260(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogcServiceType260,logcServiceType260.length);
   	
   }
   
     /**
	 * 	Update LogcServiceType260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcServiceType260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcServiceType260+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogcServiceType260 with another Field
	 *	@param value
	 */
   public void setLogcServiceType260(Field source) {
       replace(source,0,source.length(),beginLogcServiceType260,LOGC_SERVICE_TYPE_260_LEN);
   	
   }  
   
     /**
	 * 	Update LogcServiceType260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcServiceType260(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogcServiceType260,LOGC_SERVICE_TYPE_260_LEN);
   	
   }
   
     /**
	 * 	Update LogcServiceType260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcServiceType260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcServiceType260+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of logcApplRefNo260
	 *	@return logcApplRefNo260
	 */
   public char[] getLogcApplRefNo260() throws CFException{
     if (isLogcApplRefNo260Modified()) { 
        logcApplRefNo260 = refreshLogcApplRefNo260();
     }
   		return logcApplRefNo260;
   }

  
	/**
	*  set variable logcApplRefNo260
	*  Corresponding COBOL Variable is 260-LOGC-APPL-REF-NO
	*  @param value
	**/
   public void setLogcApplRefNo260(char[] value) {
      logcApplRefNo260 = checkLogcApplRefNo260Constraints(value);
      serializeLogcApplRefNo260(logcApplRefNo260);
   } 

     /**
	 * 	Update LogcApplRefNo260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcApplRefNo260(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogcApplRefNo260,logcApplRefNo260.length);
   	
   }
   
   public void setLogcApplRefNo260(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogcApplRefNo260,logcApplRefNo260.length);
   	
   }
   
     /**
	 * 	Update LogcApplRefNo260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcApplRefNo260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcApplRefNo260+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogcApplRefNo260 with another Field
	 *	@param value
	 */
   public void setLogcApplRefNo260(Field source) {
       replace(source,0,source.length(),beginLogcApplRefNo260,LOGC_APPL_REF_NO_260_LEN);
   	
   }  
   
     /**
	 * 	Update LogcApplRefNo260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcApplRefNo260(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogcApplRefNo260,LOGC_APPL_REF_NO_260_LEN);
   	
   }
   
     /**
	 * 	Update LogcApplRefNo260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcApplRefNo260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcApplRefNo260+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of accountNo260
	 *	@return accountNo260
	 */
   public char[] getAccountNo260() throws CFException{
     if (isAccountNo260Modified()) { 
        accountNo260 = refreshAccountNo260();
     }
   		return accountNo260;
   }

  
	/**
	*  set variable accountNo260
	*  Corresponding COBOL Variable is 260-ACCOUNT-NO
	*  @param value
	**/
   public void setAccountNo260(char[] value) {
      accountNo260 = checkAccountNo260Constraints(value);
      serializeAccountNo260(accountNo260);
   } 

     /**
	 * 	Update AccountNo260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAccountNo260(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAccountNo260,accountNo260.length);
   	
   }
   
   public void setAccountNo260(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAccountNo260,accountNo260.length);
   	
   }
   
     /**
	 * 	Update AccountNo260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAccountNo260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAccountNo260+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AccountNo260 with another Field
	 *	@param value
	 */
   public void setAccountNo260(Field source) {
       replace(source,0,source.length(),beginAccountNo260,ACCOUNT_NO_260_LEN);
   	
   }  
   
     /**
	 * 	Update AccountNo260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAccountNo260(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAccountNo260,ACCOUNT_NO_260_LEN);
   	
   }
   
     /**
	 * 	Update AccountNo260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAccountNo260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAccountNo260+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of logcAcqMipId260
	 *	@return logcAcqMipId260
	 */
   public char[] getLogcAcqMipId260() throws CFException{
     if (isLogcAcqMipId260Modified()) { 
        logcAcqMipId260 = refreshLogcAcqMipId260();
     }
   		return logcAcqMipId260;
   }

  
	/**
	*  set variable logcAcqMipId260
	*  Corresponding COBOL Variable is 260-LOGC-ACQ-MIP-ID
	*  @param value
	**/
   public void setLogcAcqMipId260(char[] value) {
      logcAcqMipId260 = checkLogcAcqMipId260Constraints(value);
      serializeLogcAcqMipId260(logcAcqMipId260);
   } 

     /**
	 * 	Update LogcAcqMipId260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcAcqMipId260(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogcAcqMipId260,logcAcqMipId260.length);
   	
   }
   
   public void setLogcAcqMipId260(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogcAcqMipId260,logcAcqMipId260.length);
   	
   }
   
     /**
	 * 	Update LogcAcqMipId260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcAcqMipId260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcAcqMipId260+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogcAcqMipId260 with another Field
	 *	@param value
	 */
   public void setLogcAcqMipId260(Field source) {
       replace(source,0,source.length(),beginLogcAcqMipId260,LOGC_ACQ_MIP_ID_260_LEN);
   	
   }  
   
     /**
	 * 	Update LogcAcqMipId260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcAcqMipId260(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogcAcqMipId260,LOGC_ACQ_MIP_ID_260_LEN);
   	
   }
   
     /**
	 * 	Update LogcAcqMipId260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcAcqMipId260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcAcqMipId260+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of logcIssMipId260
	 *	@return logcIssMipId260
	 */
   public char[] getLogcIssMipId260() throws CFException{
     if (isLogcIssMipId260Modified()) { 
        logcIssMipId260 = refreshLogcIssMipId260();
     }
   		return logcIssMipId260;
   }

  
	/**
	*  set variable logcIssMipId260
	*  Corresponding COBOL Variable is 260-LOGC-ISS-MIP-ID
	*  @param value
	**/
   public void setLogcIssMipId260(char[] value) {
      logcIssMipId260 = checkLogcIssMipId260Constraints(value);
      serializeLogcIssMipId260(logcIssMipId260);
   } 

     /**
	 * 	Update LogcIssMipId260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcIssMipId260(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogcIssMipId260,logcIssMipId260.length);
   	
   }
   
   public void setLogcIssMipId260(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogcIssMipId260,logcIssMipId260.length);
   	
   }
   
     /**
	 * 	Update LogcIssMipId260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcIssMipId260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcIssMipId260+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogcIssMipId260 with another Field
	 *	@param value
	 */
   public void setLogcIssMipId260(Field source) {
       replace(source,0,source.length(),beginLogcIssMipId260,LOGC_ISS_MIP_ID_260_LEN);
   	
   }  
   
     /**
	 * 	Update LogcIssMipId260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcIssMipId260(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogcIssMipId260,LOGC_ISS_MIP_ID_260_LEN);
   	
   }
   
     /**
	 * 	Update LogcIssMipId260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcIssMipId260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcIssMipId260+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of logcIsoMessage260
	 *	@return logcIsoMessage260
	 */
   public char[] getLogcIsoMessage260() throws CFException{
     if (isLogcIsoMessage260Modified()) { 
        logcIsoMessage260 = refreshLogcIsoMessage260();
     }
   		return logcIsoMessage260;
   }

  
	/**
	*  set variable logcIsoMessage260
	*  Corresponding COBOL Variable is 260-LOGC-ISO-MESSAGE
	*  @param value
	**/
   public void setLogcIsoMessage260(char[] value) {
      logcIsoMessage260 = checkLogcIsoMessage260Constraints(value);
      serializeLogcIsoMessage260(logcIsoMessage260);
   } 

     /**
	 * 	Update LogcIsoMessage260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcIsoMessage260(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogcIsoMessage260,logcIsoMessage260.length);
   	
   }
   
   public void setLogcIsoMessage260(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogcIsoMessage260,logcIsoMessage260.length);
   	
   }
   
     /**
	 * 	Update LogcIsoMessage260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcIsoMessage260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcIsoMessage260+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogcIsoMessage260 with another Field
	 *	@param value
	 */
   public void setLogcIsoMessage260(Field source) {
       replace(source,0,source.length(),beginLogcIsoMessage260,LOGC_ISO_MESSAGE_260_LEN);
   	
   }  
   
     /**
	 * 	Update LogcIsoMessage260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcIsoMessage260(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogcIsoMessage260,LOGC_ISO_MESSAGE_260_LEN);
   	
   }
   
     /**
	 * 	Update LogcIsoMessage260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcIsoMessage260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogcIsoMessage260+targetIndex,targetLen);
    
   }

	
	
	

		public static int getClassCLogRecord260FieldLength() {
			return CLASS_CLOG_RECORD_260_LENGTH;
		}

}
  
