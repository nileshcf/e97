package com.cloudframe.app.init1.dto;

/**
*  The class KeyM2mPromo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class KeyM2mPromo extends KeyM2mPromoSerialized { 
   

								private int m2mCustIdNo;

								private int m2mAcctNo;
				private M2mMtn m2mMtn = new M2mMtn();
	
	/**
	* Constructor for KeyM2mPromo
	**/
    public KeyM2mPromo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyM2mPromo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyM2mPromo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			m2mMtn.setParent(this,getStartOffset() + 8);
								setM2mCustIdNo(0);
								setM2mAcctNo(0);
    } 

	/**
	 *	Returns the value of m2mCustIdNo
	 *	@return m2mCustIdNo
	 */
	public int getM2mCustIdNo() throws CFException {
        if (isM2mCustIdNoModified()) { 
           m2mCustIdNo = refreshM2mCustIdNo();
        }
   		return m2mCustIdNo;
	}
	
	/**
	 * 	Update M2mCustIdNo with the passed value
	 *  Corresponding COBOL Variable is WS-M2M-CUST-ID-NO
	 *	@param number
	 */
	public void setM2mCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    m2mCustIdNo = checkM2mCustIdNoMaxLimit(number); 
		serializeM2mCustIdNo(m2mCustIdNo);
	}


	public void setM2mCustIdNo(long number) {
	    number = checkM2mCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setM2mCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of m2mAcctNo
	 *	@return m2mAcctNo
	 */
	public int getM2mAcctNo() throws CFException {
        if (isM2mAcctNoModified()) { 
           m2mAcctNo = refreshM2mAcctNo();
        }
   		return m2mAcctNo;
	}
	
	/**
	 * 	Update M2mAcctNo with the passed value
	 *  Corresponding COBOL Variable is WS-M2M-ACCT-NO
	 *	@param number
	 */
	public void setM2mAcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    m2mAcctNo = checkM2mAcctNoMaxLimit(number); 
		serializeM2mAcctNo(m2mAcctNo);
	}


	public void setM2mAcctNo(long number) {
	    number = checkM2mAcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setM2mAcctNo((int)number);
	}
	
	/**
	 *	Returns the value of m2mMtn
	 *	@return m2mMtn
	 */   
	 public M2mMtn getM2mMtn() {
   	return m2mMtn;
   }
   /**
	* 	Update M2mMtn with the passed value
	*   Corresponding COBOL Variable is WS-M2M-MTN
	*	@param value
	*/
   public void setM2mMtn(char[] value) {
      m2mMtn.setString(value); 
   }   
    
     /**
	 * 	Update M2mMtn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setM2mMtn(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,m2mMtn.begin,m2mMtn.length());
   }
   
     /**
	 * 	Update M2mMtn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setM2mMtn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,m2mMtn.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update M2mMtn with another Field
	 *	@param value
	 */
   public void setM2mMtn(Field source) {
   	replace(source,0,source.length(),m2mMtn.begin,m2mMtn.length());
   }  
   
     /**
	 * 	Update M2mMtn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setM2mMtn(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,m2mMtn.begin,m2mMtn.length());
   }
   
     /**
	 * 	Update M2mMtn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setM2mMtn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,m2mMtn.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes KeyM2mPromo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setM2mCustIdNo(0);
                     setM2mAcctNo(0);
          m2mMtn.initialize();
     
   }

		public static int getKeyM2mPromoFieldLength() {
			return KEY_M_2M_PROMO_LENGTH;
		}

}
  
