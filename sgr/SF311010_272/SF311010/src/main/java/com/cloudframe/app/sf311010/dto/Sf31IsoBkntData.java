package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf31IsoBkntData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf31IsoBkntData extends Sf31IsoBkntDataSerialized { 
   
				private Sf31IsoBkntTraceData sf31IsoBkntTraceData = new Sf31IsoBkntTraceData();
	
	/**
	* Constructor for Sf31IsoBkntData
	**/
    public Sf31IsoBkntData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf31IsoBkntData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoBkntData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sf31IsoBkntTraceData.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of sf31IsoBkntTraceData
	 *	@return sf31IsoBkntTraceData
	 */   
	 public Sf31IsoBkntTraceData getSf31IsoBkntTraceData() {
   	return sf31IsoBkntTraceData;
   }
   /**
	* 	Update Sf31IsoBkntTraceData with the passed value
	*   Corresponding COBOL Variable is SF31-ISO-BKNT-TRACE-DATA
	*	@param value
	*/
   public void setSf31IsoBkntTraceData(char[] value) {
      sf31IsoBkntTraceData.setString(value); 
   }   
    
     /**
	 * 	Update Sf31IsoBkntTraceData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoBkntTraceData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoBkntTraceData.begin,sf31IsoBkntTraceData.length());
   }
   
     /**
	 * 	Update Sf31IsoBkntTraceData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoBkntTraceData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoBkntTraceData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf31IsoBkntTraceData with another Field
	 *	@param value
	 */
   public void setSf31IsoBkntTraceData(Field source) {
   	replace(source,0,source.length(),sf31IsoBkntTraceData.begin,sf31IsoBkntTraceData.length());
   }  
   
     /**
	 * 	Update Sf31IsoBkntTraceData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoBkntTraceData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoBkntTraceData.begin,sf31IsoBkntTraceData.length());
   }
   
     /**
	 * 	Update Sf31IsoBkntTraceData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoBkntTraceData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoBkntTraceData.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSf31IsoBkntDataFieldLength() {
			return SF_31_ISO_BKNT_DATA_LENGTH;
		}

}
  
