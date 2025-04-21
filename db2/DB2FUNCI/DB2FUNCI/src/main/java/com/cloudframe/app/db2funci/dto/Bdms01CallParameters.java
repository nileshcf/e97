package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01CallParameters is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:56. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Bdms01CallParameters extends Bdms01CallParametersSerialized {
   
				private Bdms01InputData bdms01InputData = new Bdms01InputData();
				private Bdms01ReturnData bdms01ReturnData = new Bdms01ReturnData();
	
	/**
	* Constructor for Bdms01CallParameters
	**/
    public Bdms01CallParameters() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bdms01InputData.setParent(this,getStartOffset() + 0);
	       			bdms01ReturnData.setParent(this,getStartOffset() + 100);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bdms01InputData
	 *	@return bdms01InputData
	 */   
	 public Bdms01InputData getBdms01InputData() {
   	return bdms01InputData;
   }
   /**
	* 	Update Bdms01InputData with the passed value
	*   Corresponding COBOL Variable is BDMS01-INPUT-DATA
	*	@param value
	*/
   public void setBdms01InputData(char[] value) {
      bdms01InputData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01InputData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01InputData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01InputData.begin,bdms01InputData.length());
   }
   
     /**
	 * 	Update Bdms01InputData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01InputData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01InputData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01InputData with another Field
	 *	@param value
	 */
   public void setBdms01InputData(Field source) {
   	replace(source,0,source.length(),bdms01InputData.begin,bdms01InputData.length());
   }  
   
     /**
	 * 	Update Bdms01InputData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01InputData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01InputData.begin,bdms01InputData.length());
   }
   
     /**
	 * 	Update Bdms01InputData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01InputData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01InputData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01ReturnData
	 *	@return bdms01ReturnData
	 */   
	 public Bdms01ReturnData getBdms01ReturnData() {
   	return bdms01ReturnData;
   }
   /**
	* 	Update Bdms01ReturnData with the passed value
	*   Corresponding COBOL Variable is BDMS01-RETURN-DATA
	*	@param value
	*/
   public void setBdms01ReturnData(char[] value) {
      bdms01ReturnData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01ReturnData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01ReturnData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01ReturnData.begin,bdms01ReturnData.length());
   }
   
     /**
	 * 	Update Bdms01ReturnData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ReturnData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01ReturnData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01ReturnData with another Field
	 *	@param value
	 */
   public void setBdms01ReturnData(Field source) {
   	replace(source,0,source.length(),bdms01ReturnData.begin,bdms01ReturnData.length());
   }  
   
     /**
	 * 	Update Bdms01ReturnData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01ReturnData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01ReturnData.begin,bdms01ReturnData.length());
   }
   
     /**
	 * 	Update Bdms01ReturnData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ReturnData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01ReturnData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Bdms01CallParameters
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          bdms01InputData.initialize();
     
          bdms01ReturnData.initialize();
     
   }

		public static int getBdms01CallParametersFieldLength() {
			return BDMS_01_CALL_PARAMETERS_LENGTH;
		}

}
  
