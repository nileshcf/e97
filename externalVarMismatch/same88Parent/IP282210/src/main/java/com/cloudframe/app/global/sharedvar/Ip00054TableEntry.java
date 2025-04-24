package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00054TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Ip00054TableEntry extends Ip00054TableEntrySerialized { 
   
				private Ip00054Table5Key1 ip00054Table5Key1 = new Ip00054Table5Key1();

						private char[] ip00054ReloadDtTm = Field.fillLowValue(10);
	
	/**
	* Constructor for Ip00054TableEntry
	**/
    public Ip00054TableEntry() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip00054Table5Key1.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip00054Table5Key1
	 *	@return ip00054Table5Key1
	 */   
	 public Ip00054Table5Key1 getIp00054Table5Key1() {
   	return ip00054Table5Key1;
   }
   /**
	* 	Update Ip00054Table5Key1 with the passed value
	*   Corresponding COBOL Variable is IP00054-TABLE-5-KEY-1
	*	@param value
	*/
   public void setIp00054Table5Key1(char[] value) {
      ip00054Table5Key1.setString(value); 
   }   
    
     /**
	 * 	Update Ip00054Table5Key1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00054Table5Key1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00054Table5Key1.begin,ip00054Table5Key1.length());
   }
   
     /**
	 * 	Update Ip00054Table5Key1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00054Table5Key1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00054Table5Key1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00054Table5Key1 with another Field
	 *	@param value
	 */
   public void setIp00054Table5Key1(Field source) {
   	replace(source,0,source.length(),ip00054Table5Key1.begin,ip00054Table5Key1.length());
   }  
   
     /**
	 * 	Update Ip00054Table5Key1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00054Table5Key1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00054Table5Key1.begin,ip00054Table5Key1.length());
   }
   
     /**
	 * 	Update Ip00054Table5Key1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00054Table5Key1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00054Table5Key1.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00054ReloadDtTm
	 *	@return ip00054ReloadDtTm
	 */
   public char[] getIp00054ReloadDtTm() throws CFException{
     if (isIp00054ReloadDtTmModified()) { 
        ip00054ReloadDtTm = refreshIp00054ReloadDtTm();
     }
   		return ip00054ReloadDtTm;
   }

  
	/**
	*  set variable ip00054ReloadDtTm
	*  Corresponding COBOL Variable is IP00054-RELOAD-DT-TM
	*  @param value
	**/
   public void setIp00054ReloadDtTm(char[] value) {
      ip00054ReloadDtTm = checkIp00054ReloadDtTmConstraints(value);
      serializeIp00054ReloadDtTm(ip00054ReloadDtTm);
   } 

     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00054ReloadDtTm,ip00054ReloadDtTm.length);
   	
   }
   
   public void setIp00054ReloadDtTm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00054ReloadDtTm,ip00054ReloadDtTm.length);
   	
   }
   
     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00054ReloadDtTm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00054ReloadDtTm with another Field
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(Field source) {
       replace(source,0,source.length(),beginIp00054ReloadDtTm,IP_00054_RELOAD_DT_TM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00054ReloadDtTm,IP_00054_RELOAD_DT_TM_LEN);
   	
   }
   
     /**
	 * 	Update Ip00054ReloadDtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00054ReloadDtTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00054ReloadDtTm+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip00054TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip00054Table5Key1.initialize();
     
         setIp00054ReloadDtTm(CONSTANTS.SPACE_10);
   }

		public static int getIp00054TableEntryFieldLength() {
			return IP_00054_TABLE_ENTRY_LENGTH;
		}

}
  
