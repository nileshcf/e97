package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip3oo8o1EditsPerfTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip3oo8o1EditsPerfTbl")

public class Ip3oo8o1EditsPerfTbl extends Ip3oo8o1EditsPerfTblSerialized  implements InitializingBean {
   

						private char[] ip3oo8o1EditsHolder = Field.fillLowValue(4000);
				private Ip3oo8o1EditsPerfEntry ip3oo8o1EditsPerfEntry = new Ip3oo8o1EditsPerfEntry();

						private char[] ip3oo8o1EditsInitStr = Field.fillLowValue(4000);
	
	/**
	* Constructor for Ip3oo8o1EditsPerfTbl
	**/
    public Ip3oo8o1EditsPerfTbl() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip3oo8o1EditsPerfEntry.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip3oo8o1EditsHolder
	 *	@return ip3oo8o1EditsHolder
	 */
   public char[] getIp3oo8o1EditsHolder() throws CFException{
     if (isIp3oo8o1EditsHolderModified()) { 
        ip3oo8o1EditsHolder = refreshIp3oo8o1EditsHolder();
     }
   		return ip3oo8o1EditsHolder;
   }

  
	/**
	*  set variable ip3oo8o1EditsHolder
	*  Corresponding COBOL Variable is IP3OO8O1-EDITS-HOLDER
	*  @param value
	**/
   public void setIp3oo8o1EditsHolder(char[] value) {
      ip3oo8o1EditsHolder = checkIp3oo8o1EditsHolderConstraints(value);
      serializeIp3oo8o1EditsHolder(ip3oo8o1EditsHolder);
   } 

     /**
	 * 	Update Ip3oo8o1EditsHolder 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp3oo8o1EditsHolder(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp3oo8o1EditsHolder,ip3oo8o1EditsHolder.length);
   	
   }
   
   public void setIp3oo8o1EditsHolder(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsHolder,ip3oo8o1EditsHolder.length);
   	
   }
   
     /**
	 * 	Update Ip3oo8o1EditsHolder 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp3oo8o1EditsHolder(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsHolder+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip3oo8o1EditsHolder with another Field
	 *	@param value
	 */
   public void setIp3oo8o1EditsHolder(Field source) {
       replace(source,0,source.length(),beginIp3oo8o1EditsHolder,IP_3OO_8O_1_EDITS_HOLDER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip3oo8o1EditsHolder 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp3oo8o1EditsHolder(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsHolder,IP_3OO_8O_1_EDITS_HOLDER_LEN);
   	
   }
   
     /**
	 * 	Update Ip3oo8o1EditsHolder 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp3oo8o1EditsHolder(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsHolder+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip3oo8o1EditsPerfEntry
	 *	@return ip3oo8o1EditsPerfEntry
	 */   
	 public Ip3oo8o1EditsPerfEntry getIp3oo8o1EditsPerfEntry() {
   	return ip3oo8o1EditsPerfEntry;
   }
   /**
	* 	Update Ip3oo8o1EditsPerfEntry with the passed value
	*   Corresponding COBOL Variable is IP3OO8O1-EDITS-PERF-ENTRY
	*	@param value
	*/
   public void setIp3oo8o1EditsPerfEntry(char[] value) {
      ip3oo8o1EditsPerfEntry.setString(value); 
   }   
    
     /**
	 * 	Update Ip3oo8o1EditsPerfEntry 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp3oo8o1EditsPerfEntry(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip3oo8o1EditsPerfEntry.begin,ip3oo8o1EditsPerfEntry.length());
   }
   
     /**
	 * 	Update Ip3oo8o1EditsPerfEntry 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp3oo8o1EditsPerfEntry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip3oo8o1EditsPerfEntry.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip3oo8o1EditsPerfEntry with another Field
	 *	@param value
	 */
   public void setIp3oo8o1EditsPerfEntry(Field source) {
   	replace(source,0,source.length(),ip3oo8o1EditsPerfEntry.begin,ip3oo8o1EditsPerfEntry.length());
   }  
   
     /**
	 * 	Update Ip3oo8o1EditsPerfEntry 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp3oo8o1EditsPerfEntry(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip3oo8o1EditsPerfEntry.begin,ip3oo8o1EditsPerfEntry.length());
   }
   
     /**
	 * 	Update Ip3oo8o1EditsPerfEntry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp3oo8o1EditsPerfEntry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip3oo8o1EditsPerfEntry.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip3oo8o1EditsInitStr
	 *	@return ip3oo8o1EditsInitStr
	 */
   public char[] getIp3oo8o1EditsInitStr() throws CFException{
     if (isIp3oo8o1EditsInitStrModified()) { 
        ip3oo8o1EditsInitStr = refreshIp3oo8o1EditsInitStr();
     }
   		return ip3oo8o1EditsInitStr;
   }

  
	/**
	*  set variable ip3oo8o1EditsInitStr
	*  Corresponding COBOL Variable is IP3OO8O1-EDITS-INIT-STR
	*  @param value
	**/
   public void setIp3oo8o1EditsInitStr(char[] value) {
      ip3oo8o1EditsInitStr = checkIp3oo8o1EditsInitStrConstraints(value);
      serializeIp3oo8o1EditsInitStr(ip3oo8o1EditsInitStr);
   } 

     /**
	 * 	Update Ip3oo8o1EditsInitStr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp3oo8o1EditsInitStr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp3oo8o1EditsInitStr,ip3oo8o1EditsInitStr.length);
   	
   }
   
   public void setIp3oo8o1EditsInitStr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsInitStr,ip3oo8o1EditsInitStr.length);
   	
   }
   
     /**
	 * 	Update Ip3oo8o1EditsInitStr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp3oo8o1EditsInitStr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsInitStr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip3oo8o1EditsInitStr with another Field
	 *	@param value
	 */
   public void setIp3oo8o1EditsInitStr(Field source) {
       replace(source,0,source.length(),beginIp3oo8o1EditsInitStr,IP_3OO_8O_1_EDITS_INIT_STR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip3oo8o1EditsInitStr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp3oo8o1EditsInitStr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsInitStr,IP_3OO_8O_1_EDITS_INIT_STR_LEN);
   	
   }
   
     /**
	 * 	Update Ip3oo8o1EditsInitStr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp3oo8o1EditsInitStr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp3oo8o1EditsInitStr+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip3oo8o1EditsPerfTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp3oo8o1EditsHolder(CONSTANTS.SPACE_4000);
         setIp3oo8o1EditsInitStr(CONSTANTS.SPACE_4000);
   }

		public static int getIp3oo8o1EditsPerfTblFieldLength() {
			return IP_3OO_8O_1_EDITS_PERF_TBL_LENGTH;
		}

}
  
