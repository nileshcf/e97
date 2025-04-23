package com.cloudframe.app.ar640010.dto;

/**
*  The class CyclNum1000Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CyclNum1000Redefined extends CyclNum1000RedefinedSerialized { 
   

							private char[] requestParms1000ConditionGroup2 = fillLowValue(1);

						private char[] cyclNumFtssSeq1000 = Field.fillLowValue(2);
	
	/**
	* Constructor for CyclNum1000Redefined
	**/
    public CyclNum1000Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CyclNum1000Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CyclNum1000Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of requestParms1000ConditionGroup2
	 *	@return requestParms1000ConditionGroup2
	 */
   public char[] getRequestParms1000ConditionGroup2() throws CFException{
     if (isRequestParms1000ConditionGroup2Modified()) { 
        requestParms1000ConditionGroup2 = refreshRequestParms1000ConditionGroup2();
     }
   		return requestParms1000ConditionGroup2;
   }

  
	/**
	*  set variable requestParms1000ConditionGroup2
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setRequestParms1000ConditionGroup2(char[] value) {
      requestParms1000ConditionGroup2 = checkRequestParms1000ConditionGroup2Constraints(value);
      serializeRequestParms1000ConditionGroup2(requestParms1000ConditionGroup2);
   } 

     /**
	 * 	Update RequestParms1000ConditionGroup2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRequestParms1000ConditionGroup2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRequestParms1000ConditionGroup2,requestParms1000ConditionGroup2.length);
   	
   }
   
   public void setRequestParms1000ConditionGroup2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRequestParms1000ConditionGroup2,requestParms1000ConditionGroup2.length);
   	
   }
   
     /**
	 * 	Update RequestParms1000ConditionGroup2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRequestParms1000ConditionGroup2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRequestParms1000ConditionGroup2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RequestParms1000ConditionGroup2 with another Field
	 *	@param value
	 */
   public void setRequestParms1000ConditionGroup2(Field source) {
       replace(source,0,source.length(),beginRequestParms1000ConditionGroup2,REQUEST_PARMS_1000_CONDITION_GROUP_2_LEN);
   	
   }  
   
     /**
	 * 	Update RequestParms1000ConditionGroup2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRequestParms1000ConditionGroup2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRequestParms1000ConditionGroup2,REQUEST_PARMS_1000_CONDITION_GROUP_2_LEN);
   	
   }
   
     /**
	 * 	Update RequestParms1000ConditionGroup2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRequestParms1000ConditionGroup2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRequestParms1000ConditionGroup2+targetIndex,targetLen);
    
   }
	char[] cyclNumFtss88100088Value = "@".toCharArray();
	/**
	 *	Test condition "@" for isCyclNumFtss881000()
	 *	@return  Returns true if isCyclNumFtss881000() is "@"
	 */
   public boolean isCyclNumFtss881000() throws CFException {
      return (  compareChars( getRequestParms1000ConditionGroup2() , cyclNumFtss88100088Value)  == 0  );
   }


	/**
	*  set values "@"
	*/
   	public void setCyclNumFtss881000True() {  			
    	setRequestParms1000ConditionGroup2( cyclNumFtss88100088Value);
   	}
	/**
	 *	Returns the value of cyclNumFtssSeq1000
	 *	@return cyclNumFtssSeq1000
	 */
   public char[] getCyclNumFtssSeq1000() throws CFException{
     if (isCyclNumFtssSeq1000Modified()) { 
        cyclNumFtssSeq1000 = refreshCyclNumFtssSeq1000();
     }
   		return cyclNumFtssSeq1000;
   }

  
	/**
	*  set variable cyclNumFtssSeq1000
	*  Corresponding COBOL Variable is 1000-CYCL-NUM-FTSS-SEQ
	*  @param value
	**/
   public void setCyclNumFtssSeq1000(char[] value) {
      cyclNumFtssSeq1000 = checkCyclNumFtssSeq1000Constraints(value);
      serializeCyclNumFtssSeq1000(cyclNumFtssSeq1000);
   } 

     /**
	 * 	Update CyclNumFtssSeq1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCyclNumFtssSeq1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCyclNumFtssSeq1000,cyclNumFtssSeq1000.length);
   	
   }
   
   public void setCyclNumFtssSeq1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCyclNumFtssSeq1000,cyclNumFtssSeq1000.length);
   	
   }
   
     /**
	 * 	Update CyclNumFtssSeq1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCyclNumFtssSeq1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCyclNumFtssSeq1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CyclNumFtssSeq1000 with another Field
	 *	@param value
	 */
   public void setCyclNumFtssSeq1000(Field source) {
       replace(source,0,source.length(),beginCyclNumFtssSeq1000,CYCL_NUM_FTSS_SEQ_1000_LEN);
   	
   }  
   
     /**
	 * 	Update CyclNumFtssSeq1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCyclNumFtssSeq1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCyclNumFtssSeq1000,CYCL_NUM_FTSS_SEQ_1000_LEN);
   	
   }
   
     /**
	 * 	Update CyclNumFtssSeq1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCyclNumFtssSeq1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCyclNumFtssSeq1000+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCyclNum1000RedefinedFieldLength() {
			return CYCL_NUM_1000_REDEFINED_LENGTH;
		}

}
  
