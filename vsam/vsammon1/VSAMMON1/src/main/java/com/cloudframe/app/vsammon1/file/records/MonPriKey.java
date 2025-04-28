package com.cloudframe.app.vsammon1.file.records;

/**
*  The class MonPriKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:56. using version 5.0.0.256
**/


import com.cloudframe.app.vsammon1.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class MonPriKey extends MonPriKeySerialized { 
   
				private MonXcdtTskStrtDt monXcdtTskStrtDt = new MonXcdtTskStrtDt();

						private char[] monXcdtTskStrtTm = Field.fillLowValue(8);

						private char[] monXcdtProgNm = Field.fillLowValue(8);

						private char[] monXcdtMthdNm = Field.fillLowValue(35);

								private int monXctorTskNo;
	
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
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			monXcdtTskStrtDt.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of monXcdtTskStrtDt
	 *	@return monXcdtTskStrtDt
	 */   
	 public MonXcdtTskStrtDt getMonXcdtTskStrtDt() {
   	return monXcdtTskStrtDt;
   }
   /**
	* 	Update MonXcdtTskStrtDt with the passed value
	*   Corresponding COBOL Variable is MON-XCDT-TSK-STRT-DT
	*	@param value
	*/
   public void setMonXcdtTskStrtDt(char[] value) {
      monXcdtTskStrtDt.setString(value); 
   }   
    
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,monXcdtTskStrtDt.begin,monXcdtTskStrtDt.length());
   }
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,monXcdtTskStrtDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MonXcdtTskStrtDt with another Field
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source) {
   	replace(source,0,source.length(),monXcdtTskStrtDt.begin,monXcdtTskStrtDt.length());
   }  
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,monXcdtTskStrtDt.begin,monXcdtTskStrtDt.length());
   }
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,monXcdtTskStrtDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of monXcdtTskStrtTm
	 *	@return monXcdtTskStrtTm
	 */
   public char[] getMonXcdtTskStrtTm() throws CFException{
     if (isMonXcdtTskStrtTmModified()) { 
        monXcdtTskStrtTm = refreshMonXcdtTskStrtTm();
     }
   		return monXcdtTskStrtTm;
   }

  
	/**
	*  set variable monXcdtTskStrtTm
	*  Corresponding COBOL Variable is MON-XCDT-TSK-STRT-TM
	*  @param value
	**/
   public void setMonXcdtTskStrtTm(char[] value) {
      monXcdtTskStrtTm = checkMonXcdtTskStrtTmConstraints(value);
      serializeMonXcdtTskStrtTm(monXcdtTskStrtTm);
   } 

     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMonXcdtTskStrtTm,monXcdtTskStrtTm.length);
   	
   }
   
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtTm,monXcdtTskStrtTm.length);
   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtTm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MonXcdtTskStrtTm with another Field
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source) {
       replace(source,0,source.length(),beginMonXcdtTskStrtTm,MON_XCDT_TSK_STRT_TM_LEN);
   	
   }  
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtTm,MON_XCDT_TSK_STRT_TM_LEN);
   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtTskStrtTm+targetIndex,targetLen);
    
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
	/**
	 *	Returns the value of monXcdtMthdNm
	 *	@return monXcdtMthdNm
	 */
   public char[] getMonXcdtMthdNm() throws CFException{
     if (isMonXcdtMthdNmModified()) { 
        monXcdtMthdNm = refreshMonXcdtMthdNm();
     }
   		return monXcdtMthdNm;
   }

  
	/**
	*  set variable monXcdtMthdNm
	*  Corresponding COBOL Variable is MON-XCDT-MTHD-NM
	*  @param value
	**/
   public void setMonXcdtMthdNm(char[] value) {
      monXcdtMthdNm = checkMonXcdtMthdNmConstraints(value);
      serializeMonXcdtMthdNm(monXcdtMthdNm);
   } 

     /**
	 * 	Update MonXcdtMthdNm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtMthdNm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMonXcdtMthdNm,monXcdtMthdNm.length);
   	
   }
   
   public void setMonXcdtMthdNm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtMthdNm,monXcdtMthdNm.length);
   	
   }
   
     /**
	 * 	Update MonXcdtMthdNm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtMthdNm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtMthdNm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MonXcdtMthdNm with another Field
	 *	@param value
	 */
   public void setMonXcdtMthdNm(Field source) {
       replace(source,0,source.length(),beginMonXcdtMthdNm,MON_XCDT_MTHD_NM_LEN);
   	
   }  
   
     /**
	 * 	Update MonXcdtMthdNm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtMthdNm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMonXcdtMthdNm,MON_XCDT_MTHD_NM_LEN);
   	
   }
   
     /**
	 * 	Update MonXcdtMthdNm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtMthdNm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtMthdNm+targetIndex,targetLen);
    
   }
	public int getMonXctorTskNo() throws CFException {
        if (isMonXctorTskNoModified()) { 
           monXctorTskNo = refreshMonXctorTskNo();
        }
   		return monXctorTskNo;
	}
	
	/**
	 * 	Update MonXctorTskNo with the passed value
	 *  Corresponding COBOL Variable is MON-XCTOR-TSK-NO
	 *	@param number
	 */
	public void setMonXctorTskNo(int number) {
			monXctorTskNo = checkMonXctorTskNoMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeMonXctorTskNo(monXctorTskNo);
	}


	public void setMonXctorTskNo(long number) {
	    number = checkMonXctorTskNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMonXctorTskNo((int)number);
	}
	

	
	
	
	/**
	 * 	initializes MonPriKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          monXcdtTskStrtDt.initialize();
     
         setMonXcdtTskStrtTm(CONSTANTS.SPACE_8);
         setMonXcdtProgNm(CONSTANTS.SPACE_8);
         setMonXcdtMthdNm(CONSTANTS.SPACE_35);
                     setMonXctorTskNo(0);
   }

		public static int getMonPriKeyFieldLength() {
			return MON_PRI_KEY_LENGTH;
		}

}
  
