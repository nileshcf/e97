package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip996011ProgramStartMessage is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip996011ProgramStartMessage")

public class Ip996011ProgramStartMessage extends Ip996011ProgramStartMessageSerialized  implements InitializingBean {
   

						private char[] ip996011PgmId = Field.fillLowValue(8);

						private char[] ip996011Dash = Field.fillLowValue(1);

						private char[] ip996011PgmVersion = Field.fillLowValue(7);

						private char[] ip996011StartedText = Field.fillLowValue(8);
				private Ip996011StartTimestamp ip996011StartTimestamp = new Ip996011StartTimestamp();

						private char[] ip996011CompiledText = Field.fillLowValue(9);

						private char[] ip996011WhenCompiled = Field.fillLowValue(17);
	
	/**
	* Constructor for Ip996011ProgramStartMessage
	**/
    public Ip996011ProgramStartMessage() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip996011StartTimestamp.setParent(this,getStartOffset() + 24);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip996011PgmId
	 *	@return ip996011PgmId
	 */
   public char[] getIp996011PgmId() throws CFException{
     if (isIp996011PgmIdModified()) { 
        ip996011PgmId = refreshIp996011PgmId();
     }
   		return ip996011PgmId;
   }

  
	/**
	*  set variable ip996011PgmId
	*  Corresponding COBOL Variable is IP996011-PGM-ID
	*  @param value
	**/
   public void setIp996011PgmId(char[] value) {
      ip996011PgmId = checkIp996011PgmIdConstraints(value);
      serializeIp996011PgmId(ip996011PgmId);
   } 

     /**
	 * 	Update Ip996011PgmId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011PgmId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996011PgmId,ip996011PgmId.length);
   	
   }
   
   public void setIp996011PgmId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011PgmId,ip996011PgmId.length);
   	
   }
   
     /**
	 * 	Update Ip996011PgmId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011PgmId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996011PgmId with another Field
	 *	@param value
	 */
   public void setIp996011PgmId(Field source) {
       replace(source,0,source.length(),beginIp996011PgmId,IP_996011_PGM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996011PgmId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011PgmId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996011PgmId,IP_996011_PGM_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip996011PgmId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011PgmId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip996011Dash
	 *	@return ip996011Dash
	 */
   public char[] getIp996011Dash() throws CFException{
     if (isIp996011DashModified()) { 
        ip996011Dash = refreshIp996011Dash();
     }
   		return ip996011Dash;
   }

  
	/**
	*  set variable ip996011Dash
	*  Corresponding COBOL Variable is IP996011-DASH
	*  @param value
	**/
   public void setIp996011Dash(char[] value) {
      ip996011Dash = checkIp996011DashConstraints(value);
      serializeIp996011Dash(ip996011Dash);
   } 

     /**
	 * 	Update Ip996011Dash 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011Dash(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996011Dash,ip996011Dash.length);
   	
   }
   
   public void setIp996011Dash(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011Dash,ip996011Dash.length);
   	
   }
   
     /**
	 * 	Update Ip996011Dash 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011Dash(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011Dash+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996011Dash with another Field
	 *	@param value
	 */
   public void setIp996011Dash(Field source) {
       replace(source,0,source.length(),beginIp996011Dash,IP_996011_DASH_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996011Dash 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011Dash(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996011Dash,IP_996011_DASH_LEN);
   	
   }
   
     /**
	 * 	Update Ip996011Dash 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011Dash(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011Dash+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip996011PgmVersion
	 *	@return ip996011PgmVersion
	 */
   public char[] getIp996011PgmVersion() throws CFException{
     if (isIp996011PgmVersionModified()) { 
        ip996011PgmVersion = refreshIp996011PgmVersion();
     }
   		return ip996011PgmVersion;
   }

  
	/**
	*  set variable ip996011PgmVersion
	*  Corresponding COBOL Variable is IP996011-PGM-VERSION
	*  @param value
	**/
   public void setIp996011PgmVersion(char[] value) {
      ip996011PgmVersion = checkIp996011PgmVersionConstraints(value);
      serializeIp996011PgmVersion(ip996011PgmVersion);
   } 

     /**
	 * 	Update Ip996011PgmVersion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011PgmVersion(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996011PgmVersion,ip996011PgmVersion.length);
   	
   }
   
   public void setIp996011PgmVersion(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011PgmVersion,ip996011PgmVersion.length);
   	
   }
   
     /**
	 * 	Update Ip996011PgmVersion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmVersion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011PgmVersion+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996011PgmVersion with another Field
	 *	@param value
	 */
   public void setIp996011PgmVersion(Field source) {
       replace(source,0,source.length(),beginIp996011PgmVersion,IP_996011_PGM_VERSION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996011PgmVersion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011PgmVersion(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996011PgmVersion,IP_996011_PGM_VERSION_LEN);
   	
   }
   
     /**
	 * 	Update Ip996011PgmVersion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmVersion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011PgmVersion+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip996011StartedText
	 *	@return ip996011StartedText
	 */
   public char[] getIp996011StartedText() throws CFException{
     if (isIp996011StartedTextModified()) { 
        ip996011StartedText = refreshIp996011StartedText();
     }
   		return ip996011StartedText;
   }

  
	/**
	*  set variable ip996011StartedText
	*  Corresponding COBOL Variable is IP996011-STARTED-TEXT
	*  @param value
	**/
   public void setIp996011StartedText(char[] value) {
      ip996011StartedText = checkIp996011StartedTextConstraints(value);
      serializeIp996011StartedText(ip996011StartedText);
   } 

     /**
	 * 	Update Ip996011StartedText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011StartedText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996011StartedText,ip996011StartedText.length);
   	
   }
   
   public void setIp996011StartedText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011StartedText,ip996011StartedText.length);
   	
   }
   
     /**
	 * 	Update Ip996011StartedText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011StartedText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011StartedText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996011StartedText with another Field
	 *	@param value
	 */
   public void setIp996011StartedText(Field source) {
       replace(source,0,source.length(),beginIp996011StartedText,IP_996011_STARTED_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996011StartedText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011StartedText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996011StartedText,IP_996011_STARTED_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update Ip996011StartedText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011StartedText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011StartedText+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip996011StartTimestamp
	 *	@return ip996011StartTimestamp
	 */   
	 public Ip996011StartTimestamp getIp996011StartTimestamp() {
   	return ip996011StartTimestamp;
   }
   /**
	* 	Update Ip996011StartTimestamp with the passed value
	*   Corresponding COBOL Variable is IP996011-START-TIMESTAMP
	*	@param value
	*/
   public void setIp996011StartTimestamp(char[] value) {
      ip996011StartTimestamp.setString(value); 
   }   
    
     /**
	 * 	Update Ip996011StartTimestamp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp996011StartTimestamp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip996011StartTimestamp.begin,ip996011StartTimestamp.length());
   }
   
     /**
	 * 	Update Ip996011StartTimestamp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011StartTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip996011StartTimestamp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip996011StartTimestamp with another Field
	 *	@param value
	 */
   public void setIp996011StartTimestamp(Field source) {
   	replace(source,0,source.length(),ip996011StartTimestamp.begin,ip996011StartTimestamp.length());
   }  
   
     /**
	 * 	Update Ip996011StartTimestamp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp996011StartTimestamp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip996011StartTimestamp.begin,ip996011StartTimestamp.length());
   }
   
     /**
	 * 	Update Ip996011StartTimestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011StartTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip996011StartTimestamp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip996011CompiledText
	 *	@return ip996011CompiledText
	 */
   public char[] getIp996011CompiledText() throws CFException{
     if (isIp996011CompiledTextModified()) { 
        ip996011CompiledText = refreshIp996011CompiledText();
     }
   		return ip996011CompiledText;
   }

  
	/**
	*  set variable ip996011CompiledText
	*  Corresponding COBOL Variable is IP996011-COMPILED-TEXT
	*  @param value
	**/
   public void setIp996011CompiledText(char[] value) {
      ip996011CompiledText = checkIp996011CompiledTextConstraints(value);
      serializeIp996011CompiledText(ip996011CompiledText);
   } 

     /**
	 * 	Update Ip996011CompiledText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011CompiledText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996011CompiledText,ip996011CompiledText.length);
   	
   }
   
   public void setIp996011CompiledText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011CompiledText,ip996011CompiledText.length);
   	
   }
   
     /**
	 * 	Update Ip996011CompiledText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011CompiledText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011CompiledText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996011CompiledText with another Field
	 *	@param value
	 */
   public void setIp996011CompiledText(Field source) {
       replace(source,0,source.length(),beginIp996011CompiledText,IP_996011_COMPILED_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996011CompiledText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011CompiledText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996011CompiledText,IP_996011_COMPILED_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update Ip996011CompiledText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011CompiledText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011CompiledText+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip996011WhenCompiled
	 *	@return ip996011WhenCompiled
	 */
   public char[] getIp996011WhenCompiled() throws CFException{
     if (isIp996011WhenCompiledModified()) { 
        ip996011WhenCompiled = refreshIp996011WhenCompiled();
     }
   		return ip996011WhenCompiled;
   }

  
	/**
	*  set variable ip996011WhenCompiled
	*  Corresponding COBOL Variable is IP996011-WHEN-COMPILED
	*  @param value
	**/
   public void setIp996011WhenCompiled(char[] value) {
      ip996011WhenCompiled = checkIp996011WhenCompiledConstraints(value);
      serializeIp996011WhenCompiled(ip996011WhenCompiled);
   } 

     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011WhenCompiled(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996011WhenCompiled,ip996011WhenCompiled.length);
   	
   }
   
   public void setIp996011WhenCompiled(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011WhenCompiled,ip996011WhenCompiled.length);
   	
   }
   
     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011WhenCompiled(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011WhenCompiled+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996011WhenCompiled with another Field
	 *	@param value
	 */
   public void setIp996011WhenCompiled(Field source) {
       replace(source,0,source.length(),beginIp996011WhenCompiled,IP_996011_WHEN_COMPILED_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011WhenCompiled(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996011WhenCompiled,IP_996011_WHEN_COMPILED_LEN);
   	
   }
   
     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011WhenCompiled(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996011WhenCompiled+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip996011ProgramStartMessage
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp996011PgmId(CONSTANTS.SPACE_8);
         setIp996011Dash(CONSTANTS.SPACE);
         setIp996011PgmVersion(CONSTANTS.SPACE_7);
         setIp996011StartedText(CONSTANTS.SPACE_8);
          ip996011StartTimestamp.initialize();
     
         setIp996011CompiledText(CONSTANTS.SPACE_9);
         setIp996011WhenCompiled(CONSTANTS.SPACE_17);
   }

		public static int getIp996011ProgramStartMessageFieldLength() {
			return IP_996011_PROGRAM_START_MESSAGE_LENGTH;
		}

}
  
