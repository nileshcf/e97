package com.cloudframe.app.gp004760.dto;

/**
*  The class NspkExtractRec800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.gp004760.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class NspkExtractRec800 extends NspkExtractRec800Serialized {
   

								private int nspkCabCd800;

						private char[] nspkTcc800 = Field.fillLowValue(1);

	
	/**
	* Constructor for NspkExtractRec800
	**/
    public NspkExtractRec800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 5
             ,5
             );
    }


 

	/**
	 *	Returns the value of nspkCabCd800
	 *	@return nspkCabCd800
	 */
	public int getNspkCabCd800() throws CFException {
       if (isNspkCabCd800Modified()) { 
           nspkCabCd800 = refreshNspkCabCd800();
        }
   		return nspkCabCd800;
	}
	

	
	   
	/**
	 * 	Update NspkCabCd800 with the passed value
	 *  Corresponding COBOL Variable is 800-NSPK-CAB-CD
	 *	@param number
	 */
	public void setNspkCabCd800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    nspkCabCd800 = checkNspkCabCd800MaxLimit(number); 
		serializeNspkCabCd800(nspkCabCd800);
	}
	

	public void setNspkCabCd800(long number) {
	    number = checkNspkCabCd800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNspkCabCd800((int)number);
	}
	
	/**
	 * 	Update NspkCabCd800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNspkCabCd800(char[] value) throws CFException {
		 nspkCabCd800 = serializeNspkCabCd800(value);
	}
	/**
	 * 	Update NspkCabCd800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNspkCabCd800String(char[] value) throws CFException {
		 setNspkCabCd800(value);
	}
	/**
	 *	Returns the value of nspkTcc800
	 *	@return nspkTcc800
	 */
   public char[] getNspkTcc800() throws CFException{
     if (isNspkTcc800Modified()) { 
        nspkTcc800 = refreshNspkTcc800();
     }
   		return nspkTcc800;
   }

  
	/**
	*  set variable nspkTcc800
	*  Corresponding COBOL Variable is 800-NSPK-TCC
	*  @param value
	**/
   public void setNspkTcc800(char[] value) {
      nspkTcc800 = checkNspkTcc800Constraints(value);
      serializeNspkTcc800(nspkTcc800);
   } 

     /**
	 * 	Update NspkTcc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNspkTcc800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNspkTcc800,nspkTcc800.length);
   	
   }
   
   public void setNspkTcc800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNspkTcc800,nspkTcc800.length);
   	
   }
   
     /**
	 * 	Update NspkTcc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNspkTcc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNspkTcc800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NspkTcc800 with another Field
	 *	@param value
	 */
   public void setNspkTcc800(Field source) {
       replace(source,0,source.length(),beginNspkTcc800,NSPK_TCC_800_LEN);
   	
   }  
   
     /**
	 * 	Update NspkTcc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNspkTcc800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNspkTcc800,NSPK_TCC_800_LEN);
   	
   }
   
     /**
	 * 	Update NspkTcc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNspkTcc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNspkTcc800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getNspkExtractRec800FieldLength() {
			return NSPK_EXTRACT_REC_800_LENGTH;
		}

}
  
