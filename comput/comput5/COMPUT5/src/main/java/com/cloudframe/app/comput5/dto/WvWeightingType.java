package com.cloudframe.app.comput5.dto;

/**
*  The class WvWeightingType is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.math.RoundingMode;


public class WvWeightingType extends WvWeightingTypeSerialized { 
   

						private char[] wvWeight = Field.fillLowValue(5);

								private BigDecimal wvFmse = BigDecimal.ZERO;

								private BigDecimal wvTotal = BigDecimal.ZERO;
      private List<BigDecimal> wvMonthlyExpo; 

	
	/**
	* Constructor for WvWeightingType
	**/
    public WvWeightingType() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvWeightingType. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvWeightingType(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvWeight
	 *	@return wvWeight
	 */
   public char[] getWvWeight() throws CFException{
     if (isWvWeightModified()) { 
        wvWeight = refreshWvWeight();
     }
   		return wvWeight;
   }

  
	/**
	*  set variable wvWeight
	*  Corresponding COBOL Variable is WV-WEIGHT
	*  @param value
	**/
   public void setWvWeight(char[] value) {
      wvWeight = checkWvWeightConstraints(value);
      serializeWvWeight(wvWeight);
   } 

     /**
	 * 	Update WvWeight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvWeight(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvWeight,wvWeight.length);
   	
   }
   
   public void setWvWeight(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvWeight,wvWeight.length);
   	
   }
   
     /**
	 * 	Update WvWeight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvWeight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvWeight+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvWeight with another Field
	 *	@param value
	 */
   public void setWvWeight(Field source) {
       replace(source,0,source.length(),beginWvWeight,WV_WEIGHT_LEN);
   	
   }  
   
     /**
	 * 	Update WvWeight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvWeight(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvWeight,WV_WEIGHT_LEN);
   	
   }
   
     /**
	 * 	Update WvWeight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvWeight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvWeight+targetIndex,targetLen);
    
   }
	public BigDecimal getWvFmse() throws CFException {
        if (isWvFmseModified()) { 
           wvFmse = refreshWvFmse();
        }
   		return wvFmse;
	}

    public char[] getWvFmseString() {
          return  wvFmseString();
    }
	
	/**
	 * 	Update WvFmse with the passed number
	 *  Corresponding COBOL Variable is WV-FMSE
	 *	@param number
	 */
	public void setWvFmse(BigDecimal number) {	
     wvFmse = checkWvFmseMaxLimit(number);
	    serializeWvFmse(wvFmse);
   }
	public BigDecimal getWvTotal() throws CFException {
        if (isWvTotalModified()) { 
           wvTotal = refreshWvTotal();
        }
   		return wvTotal;
	}

    public char[] getWvTotalString() {
          return  wvTotalString();
    }
	
	/**
	 * 	Update WvTotal with the passed number
	 *  Corresponding COBOL Variable is WV-TOTAL
	 *	@param number
	 */
	public void setWvTotal(BigDecimal number) {	
     wvTotal = checkWvTotalMaxLimit(number);
	    serializeWvTotal(wvTotal);
   }

    /**
	 *	Returns the value of wvMonthlyExpo
	 *  Corresponding COBOL Variable is WV-MONTHLY-EXPO
	 *	@return wvMonthlyExpo
	 */
	public List<BigDecimal> getWvMonthlyExpo() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < WV_MONTHLY_EXPO_SIZE;index++) {
        	list.add( getWvMonthlyExpo( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return wvMonthlyExpo
	 */
	public BigDecimal getWvMonthlyExpo(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getWvMonthlyExpo(), resetting it to 0",index);
		    index = 0;
        } else if (index >= WV_MONTHLY_EXPO_SIZE) {
             	index = WV_MONTHLY_EXPO_SIZE -1; // can't exceed max array size
             	logger.trace("wvMonthlyExpo - Array index exceeded max Size "+WV_MONTHLY_EXPO_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginWvMonthlyExpo+ index*WV_MONTHLY_EXPO_LEN ,
		WV_MONTHLY_EXPO_LEN, WV_MONTHLY_EXPO_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("wvMonthlyExpo", beginWvMonthlyExpo+ index*WV_MONTHLY_EXPO_LEN,WV_MONTHLY_EXPO_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean wvMonthlyExpoIsNumeric(int index) {
	    return decimalIsNumeric( beginWvMonthlyExpo+ index*WV_MONTHLY_EXPO_LEN ,WV_MONTHLY_EXPO_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WV-MONTHLY-EXPO
	 *  @param index
	 *	@param number
	 */
	public void setWvMonthlyExpo(int index,BigDecimal number) {	
		setWvMonthlyExpo(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setWvMonthlyExpo(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setWvMonthlyExpo(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= WV_MONTHLY_EXPO_SIZE) {
             	index = WV_MONTHLY_EXPO_SIZE -1; // can't exceed max array size
             	logger.trace("wvMonthlyExpo - Array index exceeded max Size {}, resetting it to max allowed",WV_MONTHLY_EXPO_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(4,RoundingMode.DOWN);
	    if (value.precision() > 13) value =   truncate(value,13) ;
		if (setModified) {
			serializeWvMonthlyExpo(index,value);
		}
   }


	
	
	

		public static int getWvWeightingTypeFieldLength() {
			return WV_WEIGHTING_TYPE_LENGTH;
		}

}
  
