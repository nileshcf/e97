package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501Header is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf501Header extends Sf501HeaderSerialized { 
   

						private char[] sf501BkntRefNo = Field.fillLowValue(6);
				private Sf501HdrTime sf501HdrTime = new Sf501HdrTime();
				private Sf501HdrDate sf501HdrDate = new Sf501HdrDate();

						private char[] sf501JResponseInd = Field.fillLowValue(1);

						private char[] sf501JDownOption = Field.fillLowValue(1);

						private char[] sf501JMotoOption = Field.fillLowValue(1);

						private char[] sf501JPosEntryPoint = Field.fillLowValue(2);
	
	/**
	* Constructor for Sf501Header
	**/
    public Sf501Header() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf501Header. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501Header(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sf501HdrTime.setParent(this,getStartOffset() + 9);
	       			sf501HdrDate.setParent(this,getStartOffset() + 12);
    } 

	/**
	 *	Returns the value of sf501BkntRefNo
	 *	@return sf501BkntRefNo
	 */
   public char[] getSf501BkntRefNo() throws CFException{
     if (isSf501BkntRefNoModified()) { 
        sf501BkntRefNo = refreshSf501BkntRefNo();
     }
   		return sf501BkntRefNo;
   }

  
	/**
	*  set variable sf501BkntRefNo
	*  Corresponding COBOL Variable is SF501-BKNT-REF-NO
	*  @param value
	**/
   public void setSf501BkntRefNo(char[] value) {
      sf501BkntRefNo = checkSf501BkntRefNoConstraints(value);
      serializeSf501BkntRefNo(sf501BkntRefNo);
   } 

     /**
	 * 	Update Sf501BkntRefNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501BkntRefNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501BkntRefNo,sf501BkntRefNo.length);
   	
   }
   
   public void setSf501BkntRefNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501BkntRefNo,sf501BkntRefNo.length);
   	
   }
   
     /**
	 * 	Update Sf501BkntRefNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501BkntRefNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501BkntRefNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501BkntRefNo with another Field
	 *	@param value
	 */
   public void setSf501BkntRefNo(Field source) {
       replace(source,0,source.length(),beginSf501BkntRefNo,SF_501_BKNT_REF_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501BkntRefNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501BkntRefNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501BkntRefNo,SF_501_BKNT_REF_NO_LEN);
   	
   }
   
     /**
	 * 	Update Sf501BkntRefNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501BkntRefNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501BkntRefNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf501HdrTime
	 *	@return sf501HdrTime
	 */   
	 public Sf501HdrTime getSf501HdrTime() {
   	return sf501HdrTime;
   }
   /**
	* 	Update Sf501HdrTime with the passed value
	*   Corresponding COBOL Variable is SF501-HDR-TIME
	*	@param value
	*/
   public void setSf501HdrTime(char[] value) {
      sf501HdrTime.setString(value); 
   }   
    
     /**
	 * 	Update Sf501HdrTime 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf501HdrTime(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501HdrTime.begin,sf501HdrTime.length());
   }
   
     /**
	 * 	Update Sf501HdrTime 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501HdrTime.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf501HdrTime with another Field
	 *	@param value
	 */
   public void setSf501HdrTime(Field source) {
   	replace(source,0,source.length(),sf501HdrTime.begin,sf501HdrTime.length());
   }  
   
     /**
	 * 	Update Sf501HdrTime 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf501HdrTime(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501HdrTime.begin,sf501HdrTime.length());
   }
   
     /**
	 * 	Update Sf501HdrTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501HdrTime.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf501HdrDate
	 *	@return sf501HdrDate
	 */   
	 public Sf501HdrDate getSf501HdrDate() {
   	return sf501HdrDate;
   }
   /**
	* 	Update Sf501HdrDate with the passed value
	*   Corresponding COBOL Variable is SF501-HDR-DATE
	*	@param value
	*/
   public void setSf501HdrDate(char[] value) {
      sf501HdrDate.setString(value); 
   }   
    
     /**
	 * 	Update Sf501HdrDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf501HdrDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501HdrDate.begin,sf501HdrDate.length());
   }
   
     /**
	 * 	Update Sf501HdrDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501HdrDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf501HdrDate with another Field
	 *	@param value
	 */
   public void setSf501HdrDate(Field source) {
   	replace(source,0,source.length(),sf501HdrDate.begin,sf501HdrDate.length());
   }  
   
     /**
	 * 	Update Sf501HdrDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf501HdrDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501HdrDate.begin,sf501HdrDate.length());
   }
   
     /**
	 * 	Update Sf501HdrDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501HdrDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf501JResponseInd
	 *	@return sf501JResponseInd
	 */
   public char[] getSf501JResponseInd() throws CFException{
     if (isSf501JResponseIndModified()) { 
        sf501JResponseInd = refreshSf501JResponseInd();
     }
   		return sf501JResponseInd;
   }

  
	/**
	*  set variable sf501JResponseInd
	*  Corresponding COBOL Variable is SF501-J-RESPONSE-IND
	*  @param value
	**/
   public void setSf501JResponseInd(char[] value) {
      sf501JResponseInd = checkSf501JResponseIndConstraints(value);
      serializeSf501JResponseInd(sf501JResponseInd);
   } 

     /**
	 * 	Update Sf501JResponseInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501JResponseInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501JResponseInd,sf501JResponseInd.length);
   	
   }
   
   public void setSf501JResponseInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JResponseInd,sf501JResponseInd.length);
   	
   }
   
     /**
	 * 	Update Sf501JResponseInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501JResponseInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JResponseInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501JResponseInd with another Field
	 *	@param value
	 */
   public void setSf501JResponseInd(Field source) {
       replace(source,0,source.length(),beginSf501JResponseInd,SF_501_JRESPONSE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501JResponseInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501JResponseInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501JResponseInd,SF_501_JRESPONSE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Sf501JResponseInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501JResponseInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JResponseInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf501JDownOption
	 *	@return sf501JDownOption
	 */
   public char[] getSf501JDownOption() throws CFException{
     if (isSf501JDownOptionModified()) { 
        sf501JDownOption = refreshSf501JDownOption();
     }
   		return sf501JDownOption;
   }

  
	/**
	*  set variable sf501JDownOption
	*  Corresponding COBOL Variable is SF501-J-DOWN-OPTION
	*  @param value
	**/
   public void setSf501JDownOption(char[] value) {
      sf501JDownOption = checkSf501JDownOptionConstraints(value);
      serializeSf501JDownOption(sf501JDownOption);
   } 

     /**
	 * 	Update Sf501JDownOption 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501JDownOption(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501JDownOption,sf501JDownOption.length);
   	
   }
   
   public void setSf501JDownOption(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JDownOption,sf501JDownOption.length);
   	
   }
   
     /**
	 * 	Update Sf501JDownOption 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501JDownOption(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JDownOption+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501JDownOption with another Field
	 *	@param value
	 */
   public void setSf501JDownOption(Field source) {
       replace(source,0,source.length(),beginSf501JDownOption,SF_501_JDOWN_OPTION_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501JDownOption 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501JDownOption(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501JDownOption,SF_501_JDOWN_OPTION_LEN);
   	
   }
   
     /**
	 * 	Update Sf501JDownOption 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501JDownOption(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JDownOption+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf501JMotoOption
	 *	@return sf501JMotoOption
	 */
   public char[] getSf501JMotoOption() throws CFException{
     if (isSf501JMotoOptionModified()) { 
        sf501JMotoOption = refreshSf501JMotoOption();
     }
   		return sf501JMotoOption;
   }

  
	/**
	*  set variable sf501JMotoOption
	*  Corresponding COBOL Variable is SF501-J-MOTO-OPTION
	*  @param value
	**/
   public void setSf501JMotoOption(char[] value) {
      sf501JMotoOption = checkSf501JMotoOptionConstraints(value);
      serializeSf501JMotoOption(sf501JMotoOption);
   } 

     /**
	 * 	Update Sf501JMotoOption 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501JMotoOption(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501JMotoOption,sf501JMotoOption.length);
   	
   }
   
   public void setSf501JMotoOption(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JMotoOption,sf501JMotoOption.length);
   	
   }
   
     /**
	 * 	Update Sf501JMotoOption 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501JMotoOption(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JMotoOption+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501JMotoOption with another Field
	 *	@param value
	 */
   public void setSf501JMotoOption(Field source) {
       replace(source,0,source.length(),beginSf501JMotoOption,SF_501_JMOTO_OPTION_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501JMotoOption 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501JMotoOption(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501JMotoOption,SF_501_JMOTO_OPTION_LEN);
   	
   }
   
     /**
	 * 	Update Sf501JMotoOption 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501JMotoOption(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JMotoOption+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf501JPosEntryPoint
	 *	@return sf501JPosEntryPoint
	 */
   public char[] getSf501JPosEntryPoint() throws CFException{
     if (isSf501JPosEntryPointModified()) { 
        sf501JPosEntryPoint = refreshSf501JPosEntryPoint();
     }
   		return sf501JPosEntryPoint;
   }

  
	/**
	*  set variable sf501JPosEntryPoint
	*  Corresponding COBOL Variable is SF501-J-POS-ENTRY-POINT
	*  @param value
	**/
   public void setSf501JPosEntryPoint(char[] value) {
      sf501JPosEntryPoint = checkSf501JPosEntryPointConstraints(value);
      serializeSf501JPosEntryPoint(sf501JPosEntryPoint);
   } 

     /**
	 * 	Update Sf501JPosEntryPoint 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501JPosEntryPoint(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501JPosEntryPoint,sf501JPosEntryPoint.length);
   	
   }
   
   public void setSf501JPosEntryPoint(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JPosEntryPoint,sf501JPosEntryPoint.length);
   	
   }
   
     /**
	 * 	Update Sf501JPosEntryPoint 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501JPosEntryPoint(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JPosEntryPoint+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501JPosEntryPoint with another Field
	 *	@param value
	 */
   public void setSf501JPosEntryPoint(Field source) {
       replace(source,0,source.length(),beginSf501JPosEntryPoint,SF_501_JPOS_ENTRY_POINT_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501JPosEntryPoint 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501JPosEntryPoint(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501JPosEntryPoint,SF_501_JPOS_ENTRY_POINT_LEN);
   	
   }
   
     /**
	 * 	Update Sf501JPosEntryPoint 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501JPosEntryPoint(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JPosEntryPoint+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf501HeaderFieldLength() {
			return SF_501_HEADER_LENGTH;
		}

}
  
