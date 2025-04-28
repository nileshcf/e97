package com.cloudframe.app.o529351u.dto;

/**
*  The class FeSpiAltPlanRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/


import com.cloudframe.app.o529351u.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FeSpiAltPlanRecord extends FeSpiAltPlanRecordSerialized { 
   
				private FesaKey fesaKey = new FesaKey();
				private FesaDateTimestamp fesaDateTimestamp = new FesaDateTimestamp();

								private int fesaCanDt;
	
	/**
	* Constructor for FeSpiAltPlanRecord
	**/
    public FeSpiAltPlanRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			fesaKey.setParent(this,getStartOffset() + 0);
	       			fesaDateTimestamp.setParent(this,getStartOffset() + 17);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fesaKey
	 *	@return fesaKey
	 */   
	 public FesaKey getFesaKey() {
   	return fesaKey;
   }
   /**
	* 	Update FesaKey with the passed value
	*   Corresponding COBOL Variable is FESA-KEY
	*	@param value
	*/
   public void setFesaKey(char[] value) {
      fesaKey.setString(value); 
   }   
    
     /**
	 * 	Update FesaKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFesaKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fesaKey.begin,fesaKey.length());
   }
   
     /**
	 * 	Update FesaKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesaKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fesaKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FesaKey with another Field
	 *	@param value
	 */
   public void setFesaKey(Field source) {
   	replace(source,0,source.length(),fesaKey.begin,fesaKey.length());
   }  
   
     /**
	 * 	Update FesaKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFesaKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fesaKey.begin,fesaKey.length());
   }
   
     /**
	 * 	Update FesaKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesaKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fesaKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of fesaDateTimestamp
	 *	@return fesaDateTimestamp
	 */   
	 public FesaDateTimestamp getFesaDateTimestamp() {
   	return fesaDateTimestamp;
   }
   /**
	* 	Update FesaDateTimestamp with the passed value
	*   Corresponding COBOL Variable is FESA-DATE-TIMESTAMP
	*	@param value
	*/
   public void setFesaDateTimestamp(char[] value) {
      fesaDateTimestamp.setString(value); 
   }   
    
     /**
	 * 	Update FesaDateTimestamp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFesaDateTimestamp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fesaDateTimestamp.begin,fesaDateTimestamp.length());
   }
   
     /**
	 * 	Update FesaDateTimestamp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesaDateTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fesaDateTimestamp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FesaDateTimestamp with another Field
	 *	@param value
	 */
   public void setFesaDateTimestamp(Field source) {
   	replace(source,0,source.length(),fesaDateTimestamp.begin,fesaDateTimestamp.length());
   }  
   
     /**
	 * 	Update FesaDateTimestamp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFesaDateTimestamp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fesaDateTimestamp.begin,fesaDateTimestamp.length());
   }
   
     /**
	 * 	Update FesaDateTimestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesaDateTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fesaDateTimestamp.begin+targetIndex,targetLen);
   }
	public int getFesaCanDt() throws CFException {
        if (isFesaCanDtModified()) { 
           fesaCanDt = refreshFesaCanDt();
        }
   		return fesaCanDt;
	}
	
	/**
	 * 	Update FesaCanDt with the passed value
	 *  Corresponding COBOL Variable is FESA-CAN-DT
	 *	@param number
	 */
	public void setFesaCanDt(int number) {
			fesaCanDt = checkFesaCanDtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFesaCanDt(fesaCanDt);
	}


	public void setFesaCanDt(long number) {
	    number = checkFesaCanDtMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesaCanDt((int)number);
	}
	

	
	
	

		public static int getFeSpiAltPlanRecordFieldLength() {
			return FE_SPI_ALT_PLAN_RECORD_LENGTH;
		}

}
  
