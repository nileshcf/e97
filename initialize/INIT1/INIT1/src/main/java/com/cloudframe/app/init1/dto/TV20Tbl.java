package com.cloudframe.app.init1.dto;

/**
*  The class TV20Tbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class TV20Tbl extends TV20TblSerialized { 
   

								private int tV20OffrTypId;

						private char[] tV20OffrTypCd = Field.fillLowValue(2);
	
	/**
	* Constructor for TV20Tbl
	**/
    public TV20Tbl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TV20Tbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TV20Tbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tV20OffrTypId
	 *	@return tV20OffrTypId
	 */
	public int getTV20OffrTypId() throws CFException {
        if (isTV20OffrTypIdModified()) { 
           tV20OffrTypId = refreshTV20OffrTypId();
        }
   		return tV20OffrTypId;
	}
	
	/**
	 * 	Update TV20OffrTypId with the passed value
	 *  Corresponding COBOL Variable is T-V20-OFFR-TYP-ID
	 *	@param number
	 */
	public void setTV20OffrTypId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tV20OffrTypId = checkTV20OffrTypIdMaxLimit(number); 
		serializeTV20OffrTypId(tV20OffrTypId);
	}


	public void setTV20OffrTypId(long number) {
	    number = checkTV20OffrTypIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTV20OffrTypId((int)number);
	}
	
	/**
	 *	Returns the value of tV20OffrTypCd
	 *	@return tV20OffrTypCd
	 */
   public char[] getTV20OffrTypCd() throws CFException{
     if (isTV20OffrTypCdModified()) { 
        tV20OffrTypCd = refreshTV20OffrTypCd();
     }
   		return tV20OffrTypCd;
   }

  
	/**
	*  set variable tV20OffrTypCd
	*  Corresponding COBOL Variable is T-V20-OFFR-TYP-CD
	*  @param value
	**/
   public void setTV20OffrTypCd(char[] value) {
      tV20OffrTypCd = checkTV20OffrTypCdConstraints(value);
      serializeTV20OffrTypCd(tV20OffrTypCd);
   } 

     /**
	 * 	Update TV20OffrTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTV20OffrTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTV20OffrTypCd,tV20OffrTypCd.length);
   	
   }
   
   public void setTV20OffrTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTV20OffrTypCd,tV20OffrTypCd.length);
   	
   }
   
     /**
	 * 	Update TV20OffrTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTV20OffrTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTV20OffrTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TV20OffrTypCd with another Field
	 *	@param value
	 */
   public void setTV20OffrTypCd(Field source) {
       replace(source,0,source.length(),beginTV20OffrTypCd,T_V_20_OFFR_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TV20OffrTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTV20OffrTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTV20OffrTypCd,T_V_20_OFFR_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update TV20OffrTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTV20OffrTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTV20OffrTypCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes TV20Tbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setTV20OffrTypId(0);
         setTV20OffrTypCd(CONSTANTS.SPACE_2);
   }

		public static int getTV20TblFieldLength() {
			return T_V_20_TBL_LENGTH;
		}

}
  
