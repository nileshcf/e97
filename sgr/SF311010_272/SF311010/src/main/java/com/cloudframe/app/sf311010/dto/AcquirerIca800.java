package com.cloudframe.app.sf311010.dto;

/**
*  The class AcquirerIca800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AcquirerIca800 extends AcquirerIca800Serialized {
   
				private AcquirerIcaOnly5800 acquirerIcaOnly5800 = new AcquirerIcaOnly5800();

						private char[] acqFiller2800 = Field.fillLowValue(1);
	
	/**
	* Constructor for AcquirerIca800
	**/
    public AcquirerIca800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			acquirerIcaOnly5800.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of acquirerIcaOnly5800
	 *	@return acquirerIcaOnly5800
	 */   
	 public AcquirerIcaOnly5800 getAcquirerIcaOnly5800() {
   	return acquirerIcaOnly5800;
   }
   /**
	* 	Update AcquirerIcaOnly5800 with the passed value
	*   Corresponding COBOL Variable is 800-ACQUIRER-ICA-ONLY5
	*	@param value
	*/
   public void setAcquirerIcaOnly5800(char[] value) {
      acquirerIcaOnly5800.setString(value); 
   }   
    
     /**
	 * 	Update AcquirerIcaOnly5800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAcquirerIcaOnly5800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,acquirerIcaOnly5800.begin,acquirerIcaOnly5800.length());
   }
   
     /**
	 * 	Update AcquirerIcaOnly5800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcquirerIcaOnly5800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,acquirerIcaOnly5800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AcquirerIcaOnly5800 with another Field
	 *	@param value
	 */
   public void setAcquirerIcaOnly5800(Field source) {
   	replace(source,0,source.length(),acquirerIcaOnly5800.begin,acquirerIcaOnly5800.length());
   }  
   
     /**
	 * 	Update AcquirerIcaOnly5800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAcquirerIcaOnly5800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,acquirerIcaOnly5800.begin,acquirerIcaOnly5800.length());
   }
   
     /**
	 * 	Update AcquirerIcaOnly5800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcquirerIcaOnly5800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,acquirerIcaOnly5800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of acqFiller2800
	 *	@return acqFiller2800
	 */
   public char[] getAcqFiller2800() throws CFException{
     if (isAcqFiller2800Modified()) { 
        acqFiller2800 = refreshAcqFiller2800();
     }
   		return acqFiller2800;
   }

  
	/**
	*  set variable acqFiller2800
	*  Corresponding COBOL Variable is 800-ACQ-FILLER-2
	*  @param value
	**/
   public void setAcqFiller2800(char[] value) {
      acqFiller2800 = checkAcqFiller2800Constraints(value);
      serializeAcqFiller2800(acqFiller2800);
   } 

     /**
	 * 	Update AcqFiller2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcqFiller2800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcqFiller2800,acqFiller2800.length);
   	
   }
   
   public void setAcqFiller2800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcqFiller2800,acqFiller2800.length);
   	
   }
   
     /**
	 * 	Update AcqFiller2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcqFiller2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcqFiller2800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcqFiller2800 with another Field
	 *	@param value
	 */
   public void setAcqFiller2800(Field source) {
       replace(source,0,source.length(),beginAcqFiller2800,ACQ_FILLER_2800_LEN);
   	
   }  
   
     /**
	 * 	Update AcqFiller2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcqFiller2800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcqFiller2800,ACQ_FILLER_2800_LEN);
   	
   }
   
     /**
	 * 	Update AcqFiller2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcqFiller2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcqFiller2800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAcquirerIca800FieldLength() {
			return ACQUIRER_ICA_800_LENGTH;
		}

}
  
