package com.cloudframe.app.vsammon7.file.records;

/**
*  The class MonPriKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/


import com.cloudframe.app.vsammon7.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MonPriKey extends MonPriKeySerialized { 
   

						private char[] monXcdtProgNm = Field.fillLowValue(8);
	
	/**
	* Constructor for MonPriKey
	**/
    public MonPriKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MonPriKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MonPriKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of monXcdtProgNm
	 *	@return monXcdtProgNm
	 */
   public char[] getMonXcdtProgNm() throws CFException{
     if (isMonXcdtProgNmModified()) { 
        monXcdtProgNm = refreshMonXcdtProgNm();
     }
   		return monXcdtProgNm;
   }

  
	/**
	*  set variable monXcdtProgNm
	*  Corresponding COBOL Variable is MON-XCDT-PROG-NM
	*  @param value
	**/
   public void setMonXcdtProgNm(char[] value) {
      monXcdtProgNm = checkMonXcdtProgNmConstraints(value);
      serializeMonXcdtProgNm(monXcdtProgNm);
   } 

     /**
	 * 	Update MonXcdtProgNm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtProgNm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMonXcdtProgNm,monXcdtProgNm.length);
   	
   }
   
   public void setMonXcdtProgNm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtProgNm,monXcdtProgNm.length);
   	
   }
   
     /**
	 * 	Update MonXcdtProgNm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtProgNm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtProgNm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MonXcdtProgNm with another Field
	 *	@param value
	 */
   public void setMonXcdtProgNm(Field source) {
       replace(source,0,source.length(),beginMonXcdtProgNm,MON_XCDT_PROG_NM_LEN);
   	
   }  
   
     /**
	 * 	Update MonXcdtProgNm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtProgNm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMonXcdtProgNm,MON_XCDT_PROG_NM_LEN);
   	
   }
   
     /**
	 * 	Update MonXcdtProgNm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtProgNm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtProgNm+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMonPriKeyFieldLength() {
			return MON_PRI_KEY_LENGTH;
		}

}
  
