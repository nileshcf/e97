package com.cloudframe.app.ip299010.dto;

/**
*  The class Ip00054wEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/


import com.cloudframe.app.ip299010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00054wEntry extends Ip00054wEntrySerialized { 
   
				private Ip00054wTable5Key1 ip00054wTable5Key1 = new Ip00054wTable5Key1();

						private char[] ip00054wReloadDtTm = Field.fillLowValue(10);
	
	/**
	* Constructor for Ip00054wEntry
	**/
    public Ip00054wEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00054wEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00054wEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip00054wTable5Key1.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip00054wTable5Key1
	 *	@return ip00054wTable5Key1
	 */   
	 public Ip00054wTable5Key1 getIp00054wTable5Key1() {
   	return ip00054wTable5Key1;
   }
   /**
	* 	Update Ip00054wTable5Key1 with the passed value
	*   Corresponding COBOL Variable is IP00054W-TABLE-5-KEY-1
	*	@param value
	*/
   public void setIp00054wTable5Key1(char[] value) {
      ip00054wTable5Key1.setString(value); 
   }   
    
     /**
	 * 	Update Ip00054wTable5Key1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00054wTable5Key1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00054wTable5Key1.begin,ip00054wTable5Key1.length());
   }
   
     /**
	 * 	Update Ip00054wTable5Key1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00054wTable5Key1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00054wTable5Key1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00054wTable5Key1 with another Field
	 *	@param value
	 */
   public void setIp00054wTable5Key1(Field source) {
   	replace(source,0,source.length(),ip00054wTable5Key1.begin,ip00054wTable5Key1.length());
   }  
   
     /**
	 * 	Update Ip00054wTable5Key1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00054wTable5Key1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00054wTable5Key1.begin,ip00054wTable5Key1.length());
   }
   
     /**
	 * 	Update Ip00054wTable5Key1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00054wTable5Key1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00054wTable5Key1.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00054wReloadDtTm
	 *	@return ip00054wReloadDtTm
	 */
   public char[] getIp00054wReloadDtTm() throws CFException{
     if (isIp00054wReloadDtTmModified()) { 
        ip00054wReloadDtTm = refreshIp00054wReloadDtTm();
     }
   		return ip00054wReloadDtTm;
   }

  
	/**
	*  set variable ip00054wReloadDtTm
	*  Corresponding COBOL Variable is IP00054W-RELOAD-DT-TM
	*  @param value
	**/
   public void setIp00054wReloadDtTm(char[] value) {
      ip00054wReloadDtTm = checkIp00054wReloadDtTmConstraints(value);
      serializeIp00054wReloadDtTm(ip00054wReloadDtTm);
   } 

     /**
	 * 	Update Ip00054wReloadDtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00054wReloadDtTm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00054wReloadDtTm,ip00054wReloadDtTm.length);
   	
   }
   
   public void setIp00054wReloadDtTm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00054wReloadDtTm,ip00054wReloadDtTm.length);
   	
   }
   
     /**
	 * 	Update Ip00054wReloadDtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00054wReloadDtTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00054wReloadDtTm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00054wReloadDtTm with another Field
	 *	@param value
	 */
   public void setIp00054wReloadDtTm(Field source) {
       replace(source,0,source.length(),beginIp00054wReloadDtTm,IP_00054W_RELOAD_DT_TM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00054wReloadDtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00054wReloadDtTm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00054wReloadDtTm,IP_00054W_RELOAD_DT_TM_LEN);
   	
   }
   
     /**
	 * 	Update Ip00054wReloadDtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00054wReloadDtTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00054wReloadDtTm+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp00054wEntryFieldLength() {
			return IP_00054W_ENTRY_LENGTH;
		}

}
  
