package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00174TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip00174TableEntry")

public class Ip00174TableEntry extends Ip00174TableEntrySerialized  implements InitializingBean {
   
				private Ip00174CurrCdKey ip00174CurrCdKey = new Ip00174CurrCdKey();

						private char[] ip00174AlphaCurCode = Field.fillLowValue(3);

								private int ip00174CurExpCode;
				private Ip00174CentralSiteFields ip00174CentralSiteFields = new Ip00174CentralSiteFields();

						private char[] ip00174Filler = Field.fillLowValue(5);
	
	/**
	* Constructor for Ip00174TableEntry
	**/
    public Ip00174TableEntry() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip00174CurrCdKey.setParent(this,getStartOffset() + 0);
	       			ip00174CentralSiteFields.setParent(this,getStartOffset() + 7);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip00174CurrCdKey
	 *	@return ip00174CurrCdKey
	 */   
	 public Ip00174CurrCdKey getIp00174CurrCdKey() {
   	return ip00174CurrCdKey;
   }
   /**
	* 	Update Ip00174CurrCdKey with the passed value
	*   Corresponding COBOL Variable is IP00174-CURR-CD-KEY
	*	@param value
	*/
   public void setIp00174CurrCdKey(char[] value) {
      ip00174CurrCdKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00174CurrCdKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00174CurrCdKey.begin,ip00174CurrCdKey.length());
   }
   
     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00174CurrCdKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00174CurrCdKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00174CurrCdKey with another Field
	 *	@param value
	 */
   public void setIp00174CurrCdKey(Field source) {
   	replace(source,0,source.length(),ip00174CurrCdKey.begin,ip00174CurrCdKey.length());
   }  
   
     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00174CurrCdKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00174CurrCdKey.begin,ip00174CurrCdKey.length());
   }
   
     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00174CurrCdKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00174CurrCdKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00174AlphaCurCode
	 *	@return ip00174AlphaCurCode
	 */
   public char[] getIp00174AlphaCurCode() throws CFException{
     if (isIp00174AlphaCurCodeModified()) { 
        ip00174AlphaCurCode = refreshIp00174AlphaCurCode();
     }
   		return ip00174AlphaCurCode;
   }

  
	/**
	*  set variable ip00174AlphaCurCode
	*  Corresponding COBOL Variable is IP00174-ALPHA-CUR-CODE
	*  @param value
	**/
   public void setIp00174AlphaCurCode(char[] value) {
      ip00174AlphaCurCode = checkIp00174AlphaCurCodeConstraints(value);
      serializeIp00174AlphaCurCode(ip00174AlphaCurCode);
   } 

     /**
	 * 	Update Ip00174AlphaCurCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00174AlphaCurCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00174AlphaCurCode,ip00174AlphaCurCode.length);
   	
   }
   
   public void setIp00174AlphaCurCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00174AlphaCurCode,ip00174AlphaCurCode.length);
   	
   }
   
     /**
	 * 	Update Ip00174AlphaCurCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00174AlphaCurCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00174AlphaCurCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00174AlphaCurCode with another Field
	 *	@param value
	 */
   public void setIp00174AlphaCurCode(Field source) {
       replace(source,0,source.length(),beginIp00174AlphaCurCode,IP_00174_ALPHA_CUR_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00174AlphaCurCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00174AlphaCurCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00174AlphaCurCode,IP_00174_ALPHA_CUR_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip00174AlphaCurCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00174AlphaCurCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00174AlphaCurCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public int getIp00174CurExpCode() throws CFException {
       if (isIp00174CurExpCodeModified()) { 
           ip00174CurExpCode = refreshIp00174CurExpCode();
        }
   		return ip00174CurExpCode;
	}
	

	
	   
	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *  Corresponding COBOL Variable is IP00174-CUR-EXP-CODE
	 *	@param number
	 */
	public void setIp00174CurExpCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00174CurExpCode = checkIp00174CurExpCodeMaxLimit(number); 
		serializeIp00174CurExpCode(ip00174CurExpCode);
	}
	

	public void setIp00174CurExpCode(long number) {
	    number = checkIp00174CurExpCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00174CurExpCode((int)number);
	}
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCode(char[] value) throws CFException {
		 ip00174CurExpCode = serializeIp00174CurExpCode(value);
	}
	/**
	 * 	Update Ip00174CurExpCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCodeString(char[] value) throws CFException {
		 setIp00174CurExpCode(value);
	}
	/**
	 *	Returns the value of ip00174CentralSiteFields
	 *	@return ip00174CentralSiteFields
	 */   
	 public Ip00174CentralSiteFields getIp00174CentralSiteFields() {
   	return ip00174CentralSiteFields;
   }
   /**
	* 	Update Ip00174CentralSiteFields with the passed value
	*   Corresponding COBOL Variable is IP00174-CENTRAL-SITE-FIELDS
	*	@param value
	*/
   public void setIp00174CentralSiteFields(char[] value) {
      ip00174CentralSiteFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip00174CentralSiteFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00174CentralSiteFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00174CentralSiteFields.begin,ip00174CentralSiteFields.length());
   }
   
     /**
	 * 	Update Ip00174CentralSiteFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00174CentralSiteFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00174CentralSiteFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00174CentralSiteFields with another Field
	 *	@param value
	 */
   public void setIp00174CentralSiteFields(Field source) {
   	replace(source,0,source.length(),ip00174CentralSiteFields.begin,ip00174CentralSiteFields.length());
   }  
   
     /**
	 * 	Update Ip00174CentralSiteFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00174CentralSiteFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00174CentralSiteFields.begin,ip00174CentralSiteFields.length());
   }
   
     /**
	 * 	Update Ip00174CentralSiteFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00174CentralSiteFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00174CentralSiteFields.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00174Filler
	 *	@return ip00174Filler
	 */
   public char[] getIp00174Filler() throws CFException{
     if (isIp00174FillerModified()) { 
        ip00174Filler = refreshIp00174Filler();
     }
   		return ip00174Filler;
   }

  
	/**
	*  set variable ip00174Filler
	*  Corresponding COBOL Variable is IP00174-FILLER
	*  @param value
	**/
   public void setIp00174Filler(char[] value) {
      ip00174Filler = checkIp00174FillerConstraints(value);
      serializeIp00174Filler(ip00174Filler);
   } 

     /**
	 * 	Update Ip00174Filler 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00174Filler(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00174Filler,ip00174Filler.length);
   	
   }
   
   public void setIp00174Filler(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00174Filler,ip00174Filler.length);
   	
   }
   
     /**
	 * 	Update Ip00174Filler 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00174Filler(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00174Filler+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00174Filler with another Field
	 *	@param value
	 */
   public void setIp00174Filler(Field source) {
       replace(source,0,source.length(),beginIp00174Filler,IP_00174_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00174Filler 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00174Filler(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00174Filler,IP_00174_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip00174Filler 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00174Filler(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00174Filler+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip00174TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip00174CurrCdKey.initialize();
     
         setIp00174AlphaCurCode(CONSTANTS.SPACE_3);
                     setIp00174CurExpCode(0);
          ip00174CentralSiteFields.initialize();
     
         setIp00174Filler(CONSTANTS.SPACE_5);
   }

		public static int getIp00174TableEntryFieldLength() {
			return IP_00174_TABLE_ENTRY_LENGTH;
		}

}
  
