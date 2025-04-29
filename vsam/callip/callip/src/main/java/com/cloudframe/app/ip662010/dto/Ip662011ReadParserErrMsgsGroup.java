package com.cloudframe.app.ip662010.dto;

/**
*  The class Ip662011ReadParserErrMsgsGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip662011ReadParserErrMsgsGroup extends Ip662011ReadParserErrMsgsGroupSerialized {
   

						private char[] ip662011ReadParserErrMsgs = new char[600];
					private Ip662011ReadParserErrMsgsRedefined ip662011ReadParserErrMsgsRedefined = new Ip662011ReadParserErrMsgsRedefined();
	
	/**
	* Constructor for Ip662011ReadParserErrMsgsGroup
	**/
    public Ip662011ReadParserErrMsgsGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip662011ReadParserErrMsgsRedefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setIp662011ReadParserErrMsgs(pad(600,"UNPARSEABLE MESSAGE.  BITMAP 2 (DE1) NOT FOUND.             UNPARSEABLE MESSAGE.  NON-NUMERIC PDS ID.                   UNPARSEABLE MESSAGE.  DUPLICATE PDS FOUND.                  UNPARSEABLE MESSAGE.  INVALID TAG TYPE.                     UNPARSEABLE MESSAGE.  NON-NUMERIC OR ZERO LENGTH.           UNPARSEABLE MESSAGE.  TOO MANY TAGS FOR TAG TABLE.          UNPARSEABLE MESSAGE.  NO PDS DEFINED WITH THIS NUMBER.      UNPARSEABLE MESSAGE.  NO \"\\\" AT END OF SUBFIELD.            UNPARSEABLE MESSAGE.  CARRIER LENGTH LESS THAN 8.           UNPARSEABLE MESSAGE.  PARSED LENGTH NOT EQUAL TO RDW.       ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of ip662011ReadParserErrMsgs
	 *	@return ip662011ReadParserErrMsgs
	 */
   public char[] getIp662011ReadParserErrMsgs() throws CFException{
     if (isIp662011ReadParserErrMsgsModified()) { 
        ip662011ReadParserErrMsgs = refreshIp662011ReadParserErrMsgs();
     }
   		return ip662011ReadParserErrMsgs;
   }

  
	/**
	*  set variable ip662011ReadParserErrMsgs
	*  Corresponding COBOL Variable is IP662011-READ-PARSER-ERR-MSGS
	*  @param value
	**/
   public void setIp662011ReadParserErrMsgs(char[] value) {
      ip662011ReadParserErrMsgs = checkIp662011ReadParserErrMsgsConstraints(value);
      serializeIp662011ReadParserErrMsgs(ip662011ReadParserErrMsgs);
   } 

     /**
	 * 	Update Ip662011ReadParserErrMsgs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp662011ReadParserErrMsgs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp662011ReadParserErrMsgs,ip662011ReadParserErrMsgs.length);
   	
   }
   
   public void setIp662011ReadParserErrMsgs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp662011ReadParserErrMsgs,ip662011ReadParserErrMsgs.length);
   	
   }
   
     /**
	 * 	Update Ip662011ReadParserErrMsgs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp662011ReadParserErrMsgs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp662011ReadParserErrMsgs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip662011ReadParserErrMsgs with another Field
	 *	@param value
	 */
   public void setIp662011ReadParserErrMsgs(Field source) {
       replace(source,0,source.length(),beginIp662011ReadParserErrMsgs,IP_662011_READ_PARSER_ERR_MSGS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip662011ReadParserErrMsgs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp662011ReadParserErrMsgs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp662011ReadParserErrMsgs,IP_662011_READ_PARSER_ERR_MSGS_LEN);
   	
   }
   
     /**
	 * 	Update Ip662011ReadParserErrMsgs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp662011ReadParserErrMsgs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp662011ReadParserErrMsgs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip662011ReadParserErrMsgsRedefined
	 *	@return ip662011ReadParserErrMsgsRedefined
	 */   
	 public Ip662011ReadParserErrMsgsRedefined getIp662011ReadParserErrMsgsRedefined() {
   	return ip662011ReadParserErrMsgsRedefined;
   }
   /**
	* 	Update Ip662011ReadParserErrMsgsRedefined with the passed value
	*   Corresponding COBOL Variable is IP662011-READ-PARSER-ERR-MSGS-REDEFINED
	*	@param value
	*/
   public void setIp662011ReadParserErrMsgsRedefined(char[] value) {
      ip662011ReadParserErrMsgsRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Ip662011ReadParserErrMsgsRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp662011ReadParserErrMsgsRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip662011ReadParserErrMsgsRedefined.begin,ip662011ReadParserErrMsgsRedefined.length());
   }
   
     /**
	 * 	Update Ip662011ReadParserErrMsgsRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp662011ReadParserErrMsgsRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip662011ReadParserErrMsgsRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip662011ReadParserErrMsgsRedefined with another Field
	 *	@param value
	 */
   public void setIp662011ReadParserErrMsgsRedefined(Field source) {
   	replace(source,0,source.length(),ip662011ReadParserErrMsgsRedefined.begin,ip662011ReadParserErrMsgsRedefined.length());
   }  
   
     /**
	 * 	Update Ip662011ReadParserErrMsgsRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp662011ReadParserErrMsgsRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip662011ReadParserErrMsgsRedefined.begin,ip662011ReadParserErrMsgsRedefined.length());
   }
   
     /**
	 * 	Update Ip662011ReadParserErrMsgsRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp662011ReadParserErrMsgsRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip662011ReadParserErrMsgsRedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIp662011ReadParserErrMsgsGroupFieldLength() {
			return IP_662011_READ_PARSER_ERR_MSGS_GROUP_LENGTH;
		}

}
  
