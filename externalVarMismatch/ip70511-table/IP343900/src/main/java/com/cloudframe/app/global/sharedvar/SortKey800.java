package com.cloudframe.app.global.sharedvar;

/**
*  The class SortKey800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_sortKey800")

public class SortKey800 extends SortKey800Serialized  implements InitializingBean {
   

								private long skEndpoint800;

						private char[] skFrmtInd800 = Field.fillLowValue(1);

								private long skDestId800;

						private char[] skDestIdx800 = Field.fillLowValue(11);

								private int skTxnSortCd800;

								private long skOrgnId800;

						private char[] skRevInd800 = Field.fillLowValue(1);

						private char[] skSettleInd800 = Field.fillLowValue(1);

								private int skCurrencyCd800;

								private int skMcc800;

						private char[] skMccInfo800 = Field.fillLowValue(96);

						private char[] skDelCyc800 = Field.fillLowValue(1);

						private char[] skTipabroInd800 = Field.fillLowValue(1);

						private char[] skInbndFrmtInd800 = Field.fillLowValue(1);

						private char[] skInfileId800 = Field.fillLowValue(25);

						private char[] skInfileRevCd800 = Field.fillLowValue(1);

								private long skMsgCount800;

						private char[] skOutfileId800 = Field.fillLowValue(25);

						private char[] skAb800 = Field.fillLowValue(3);

						private char[] skPurgeDt800 = Field.fillLowValue(6);

						private char[] skFlexRouteInd800 = Field.fillLowValue(1);
	
	/**
	* Constructor for SortKey800
	**/
    public SortKey800() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of skEndpoint800
	 *	@return skEndpoint800
	 */
	public long getSkEndpoint800() throws CFException {
       if (isSkEndpoint800Modified()) { 
           skEndpoint800 = refreshSkEndpoint800();
        }
   		return skEndpoint800;
	}
	

	
	   
	/**
	 * 	Update SkEndpoint800 with the passed value
	 *  Corresponding COBOL Variable is 800-SK-ENDPOINT
	 *	@param number
	 */
	public void setSkEndpoint800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    skEndpoint800 = checkSkEndpoint800MaxLimit(number); 
		serializeSkEndpoint800(skEndpoint800);
	}
	

	/**
	 * 	Update SkEndpoint800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSkEndpoint800(char[] value) throws CFException {
		 skEndpoint800 = serializeSkEndpoint800(value);
	}
	/**
	 * 	Update SkEndpoint800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSkEndpoint800String(char[] value) throws CFException {
		 setSkEndpoint800(value);
	}
	/**
	 *	Returns the value of skFrmtInd800
	 *	@return skFrmtInd800
	 */
   public char[] getSkFrmtInd800() throws CFException{
     if (isSkFrmtInd800Modified()) { 
        skFrmtInd800 = refreshSkFrmtInd800();
     }
   		return skFrmtInd800;
   }

  
	/**
	*  set variable skFrmtInd800
	*  Corresponding COBOL Variable is 800-SK-FRMT-IND
	*  @param value
	**/
   public void setSkFrmtInd800(char[] value) {
      skFrmtInd800 = checkSkFrmtInd800Constraints(value);
      serializeSkFrmtInd800(skFrmtInd800);
   } 

     /**
	 * 	Update SkFrmtInd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSkFrmtInd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSkFrmtInd800,skFrmtInd800.length);
   	
   }
   
   public void setSkFrmtInd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSkFrmtInd800,skFrmtInd800.length);
   	
   }
   
     /**
	 * 	Update SkFrmtInd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSkFrmtInd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkFrmtInd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SkFrmtInd800 with another Field
	 *	@param value
	 */
   public void setSkFrmtInd800(Field source) {
       replace(source,0,source.length(),beginSkFrmtInd800,SK_FRMT_IND_800_LEN);
   	
   }  
   
     /**
	 * 	Update SkFrmtInd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSkFrmtInd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSkFrmtInd800,SK_FRMT_IND_800_LEN);
   	
   }
   
     /**
	 * 	Update SkFrmtInd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSkFrmtInd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkFrmtInd800+targetIndex,targetLen);
    
   }
	char[] ipmFrmtInd8008888Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isIpmFrmtInd80088()
	 *	@return  Returns true if isIpmFrmtInd80088() is "2"
	 */
   public boolean isIpmFrmtInd80088() throws CFException {
      return (  compareChars( getSkFrmtInd800() , ipmFrmtInd8008888Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setIpmFrmtInd80088True() {  			
    	setSkFrmtInd800( ipmFrmtInd8008888Value);
   	}
	char[] mexFrmtInd8008888Value1 = "S".toCharArray();
char[] mexFrmtInd8008888Value2 = "P".toCharArray();
char[] mexFrmtInd8008888Value3 = "M".toCharArray();

	/**
	 *	Test condition "S" "P" "M" for isMexFrmtInd80088()
	 *	@return  Returns true if isMexFrmtInd80088() is "S" "P" "M"
	 */
   public boolean isMexFrmtInd80088() throws CFException {
      return (  compareChars( getSkFrmtInd800() , mexFrmtInd8008888Value1)  == 0  ||  compareChars( getSkFrmtInd800() , mexFrmtInd8008888Value2)  == 0  ||  compareChars( getSkFrmtInd800() , mexFrmtInd8008888Value3)  == 0  );
   }


	/**
	*  set values "S" "P" "M"
	*/
   	public void setMexFrmtInd80088True() {  			
    	setSkFrmtInd800( mexFrmtInd8008888Value1);
   	}
	char[] mexFrmtSale8008888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isMexFrmtSale80088()
	 *	@return  Returns true if isMexFrmtSale80088() is "S"
	 */
   public boolean isMexFrmtSale80088() throws CFException {
      return (  compareChars( getSkFrmtInd800() , mexFrmtSale8008888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setMexFrmtSale80088True() {  			
    	setSkFrmtInd800( mexFrmtSale8008888Value);
   	}
	char[] mexFrmtPymt8008888Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isMexFrmtPymt80088()
	 *	@return  Returns true if isMexFrmtPymt80088() is "P"
	 */
   public boolean isMexFrmtPymt80088() throws CFException {
      return (  compareChars( getSkFrmtInd800() , mexFrmtPymt8008888Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setMexFrmtPymt80088True() {  			
    	setSkFrmtInd800( mexFrmtPymt8008888Value);
   	}
	char[] jpnFrmtInd8008888Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isJpnFrmtInd80088()
	 *	@return  Returns true if isJpnFrmtInd80088() is "6"
	 */
   public boolean isJpnFrmtInd80088() throws CFException {
      return (  compareChars( getSkFrmtInd800() , jpnFrmtInd8008888Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setJpnFrmtInd80088True() {  			
    	setSkFrmtInd800( jpnFrmtInd8008888Value);
   	}
	/**
	 *	Returns the value of skDestId800
	 *	@return skDestId800
	 */
	public long getSkDestId800() throws CFException {
       if (isSkDestId800Modified()) { 
           skDestId800 = refreshSkDestId800();
        }
   		return skDestId800;
	}
	

	
	   
	/**
	 * 	Update SkDestId800 with the passed value
	 *  Corresponding COBOL Variable is 800-SK-DEST-ID
	 *	@param number
	 */
	public void setSkDestId800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    skDestId800 = checkSkDestId800MaxLimit(number); 
		serializeSkDestId800(skDestId800);
	}
	

	/**
	 * 	Update SkDestId800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSkDestId800(char[] value) throws CFException {
		 skDestId800 = serializeSkDestId800(value);
	}
	/**
	 * 	Update SkDestId800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSkDestId800String(char[] value) throws CFException {
		 setSkDestId800(value);
	}
	/**
	 *	Returns the value of skDestIdx800
	 *	@return skDestIdx800
	 */
   public char[] getSkDestIdx800() throws CFException{
     if (isSkDestIdx800Modified()) { 
        skDestIdx800 = refreshSkDestIdx800();
     }
   		return skDestIdx800;
   }

  
	/**
	*  set variable skDestIdx800
	*  Corresponding COBOL Variable is 800-SK-DEST-IDX
	*  @param value
	**/
   public void setSkDestIdx800(char[] value) {
      skDestIdx800 = checkSkDestIdx800Constraints(value);
      serializeSkDestIdx800(skDestIdx800);
   } 

     /**
	 * 	Update SkDestIdx800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSkDestIdx800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSkDestIdx800,skDestIdx800.length);
   	
   }
   
   public void setSkDestIdx800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSkDestIdx800,skDestIdx800.length);
   	
   }
   
     /**
	 * 	Update SkDestIdx800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSkDestIdx800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkDestIdx800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SkDestIdx800 with another Field
	 *	@param value
	 */
   public void setSkDestIdx800(Field source) {
       replace(source,0,source.length(),beginSkDestIdx800,SK_DEST_IDX_800_LEN);
   	
   }  
   
     /**
	 * 	Update SkDestIdx800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSkDestIdx800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSkDestIdx800,SK_DEST_IDX_800_LEN);
   	
   }
   
     /**
	 * 	Update SkDestIdx800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSkDestIdx800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkDestIdx800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of skTxnSortCd800
	 *	@return skTxnSortCd800
	 */
	public int getSkTxnSortCd800() throws CFException {
       if (isSkTxnSortCd800Modified()) { 
           skTxnSortCd800 = refreshSkTxnSortCd800();
        }
   		return skTxnSortCd800;
	}
	

	
	   
	/**
	 * 	Update SkTxnSortCd800 with the passed value
	 *  Corresponding COBOL Variable is 800-SK-TXN-SORT-CD
	 *	@param number
	 */
	public void setSkTxnSortCd800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    skTxnSortCd800 = checkSkTxnSortCd800MaxLimit(number); 
		serializeSkTxnSortCd800(skTxnSortCd800);
	}
	

	public void setSkTxnSortCd800(long number) {
	    number = checkSkTxnSortCd800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSkTxnSortCd800((int)number);
	}
	
	/**
	 * 	Update SkTxnSortCd800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSkTxnSortCd800(char[] value) throws CFException {
		 skTxnSortCd800 = serializeSkTxnSortCd800(value);
	}
	/**
	 * 	Update SkTxnSortCd800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSkTxnSortCd800String(char[] value) throws CFException {
		 setSkTxnSortCd800(value);
	}
	/**
	 *	Returns the value of skOrgnId800
	 *	@return skOrgnId800
	 */
	public long getSkOrgnId800() throws CFException {
       if (isSkOrgnId800Modified()) { 
           skOrgnId800 = refreshSkOrgnId800();
        }
   		return skOrgnId800;
	}
	

	
	   
	/**
	 * 	Update SkOrgnId800 with the passed value
	 *  Corresponding COBOL Variable is 800-SK-ORGN-ID
	 *	@param number
	 */
	public void setSkOrgnId800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    skOrgnId800 = checkSkOrgnId800MaxLimit(number); 
		serializeSkOrgnId800(skOrgnId800);
	}
	

	/**
	 * 	Update SkOrgnId800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSkOrgnId800(char[] value) throws CFException {
		 skOrgnId800 = serializeSkOrgnId800(value);
	}
	/**
	 * 	Update SkOrgnId800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSkOrgnId800String(char[] value) throws CFException {
		 setSkOrgnId800(value);
	}
	/**
	 *	Returns the value of skRevInd800
	 *	@return skRevInd800
	 */
   public char[] getSkRevInd800() throws CFException{
     if (isSkRevInd800Modified()) { 
        skRevInd800 = refreshSkRevInd800();
     }
   		return skRevInd800;
   }

  
	/**
	*  set variable skRevInd800
	*  Corresponding COBOL Variable is 800-SK-REV-IND
	*  @param value
	**/
   public void setSkRevInd800(char[] value) {
      skRevInd800 = checkSkRevInd800Constraints(value);
      serializeSkRevInd800(skRevInd800);
   } 

     /**
	 * 	Update SkRevInd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSkRevInd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSkRevInd800,skRevInd800.length);
   	
   }
   
   public void setSkRevInd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSkRevInd800,skRevInd800.length);
   	
   }
   
     /**
	 * 	Update SkRevInd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSkRevInd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkRevInd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SkRevInd800 with another Field
	 *	@param value
	 */
   public void setSkRevInd800(Field source) {
       replace(source,0,source.length(),beginSkRevInd800,SK_REV_IND_800_LEN);
   	
   }  
   
     /**
	 * 	Update SkRevInd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSkRevInd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSkRevInd800,SK_REV_IND_800_LEN);
   	
   }
   
     /**
	 * 	Update SkRevInd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSkRevInd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkRevInd800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of skSettleInd800
	 *	@return skSettleInd800
	 */
   public char[] getSkSettleInd800() throws CFException{
     if (isSkSettleInd800Modified()) { 
        skSettleInd800 = refreshSkSettleInd800();
     }
   		return skSettleInd800;
   }

  
	/**
	*  set variable skSettleInd800
	*  Corresponding COBOL Variable is 800-SK-SETTLE-IND
	*  @param value
	**/
   public void setSkSettleInd800(char[] value) {
      skSettleInd800 = checkSkSettleInd800Constraints(value);
      serializeSkSettleInd800(skSettleInd800);
   } 

     /**
	 * 	Update SkSettleInd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSkSettleInd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSkSettleInd800,skSettleInd800.length);
   	
   }
   
   public void setSkSettleInd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSkSettleInd800,skSettleInd800.length);
   	
   }
   
     /**
	 * 	Update SkSettleInd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSkSettleInd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkSettleInd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SkSettleInd800 with another Field
	 *	@param value
	 */
   public void setSkSettleInd800(Field source) {
       replace(source,0,source.length(),beginSkSettleInd800,SK_SETTLE_IND_800_LEN);
   	
   }  
   
     /**
	 * 	Update SkSettleInd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSkSettleInd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSkSettleInd800,SK_SETTLE_IND_800_LEN);
   	
   }
   
     /**
	 * 	Update SkSettleInd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSkSettleInd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkSettleInd800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of skCurrencyCd800
	 *	@return skCurrencyCd800
	 */
	public int getSkCurrencyCd800() throws CFException {
       if (isSkCurrencyCd800Modified()) { 
           skCurrencyCd800 = refreshSkCurrencyCd800();
        }
   		return skCurrencyCd800;
	}
	

	
	   
	/**
	 * 	Update SkCurrencyCd800 with the passed value
	 *  Corresponding COBOL Variable is 800-SK-CURRENCY-CD
	 *	@param number
	 */
	public void setSkCurrencyCd800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    skCurrencyCd800 = checkSkCurrencyCd800MaxLimit(number); 
		serializeSkCurrencyCd800(skCurrencyCd800);
	}
	

	public void setSkCurrencyCd800(long number) {
	    number = checkSkCurrencyCd800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSkCurrencyCd800((int)number);
	}
	
	/**
	 * 	Update SkCurrencyCd800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSkCurrencyCd800(char[] value) throws CFException {
		 skCurrencyCd800 = serializeSkCurrencyCd800(value);
	}
	/**
	 * 	Update SkCurrencyCd800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSkCurrencyCd800String(char[] value) throws CFException {
		 setSkCurrencyCd800(value);
	}
	/**
	 *	Returns the value of skMcc800
	 *	@return skMcc800
	 */
	public int getSkMcc800() throws CFException {
       if (isSkMcc800Modified()) { 
           skMcc800 = refreshSkMcc800();
        }
   		return skMcc800;
	}
	

	
	   
	/**
	 * 	Update SkMcc800 with the passed value
	 *  Corresponding COBOL Variable is 800-SK-MCC
	 *	@param number
	 */
	public void setSkMcc800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    skMcc800 = checkSkMcc800MaxLimit(number); 
		serializeSkMcc800(skMcc800);
	}
	

	public void setSkMcc800(long number) {
	    number = checkSkMcc800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSkMcc800((int)number);
	}
	
	/**
	 * 	Update SkMcc800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSkMcc800(char[] value) throws CFException {
		 skMcc800 = serializeSkMcc800(value);
	}
	/**
	 * 	Update SkMcc800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSkMcc800String(char[] value) throws CFException {
		 setSkMcc800(value);
	}
	/**
	 *	Returns the value of skMccInfo800
	 *	@return skMccInfo800
	 */
   public char[] getSkMccInfo800() throws CFException{
     if (isSkMccInfo800Modified()) { 
        skMccInfo800 = refreshSkMccInfo800();
     }
   		return skMccInfo800;
   }

  
	/**
	*  set variable skMccInfo800
	*  Corresponding COBOL Variable is 800-SK-MCC-INFO
	*  @param value
	**/
   public void setSkMccInfo800(char[] value) {
      skMccInfo800 = checkSkMccInfo800Constraints(value);
      serializeSkMccInfo800(skMccInfo800);
   } 

     /**
	 * 	Update SkMccInfo800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSkMccInfo800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSkMccInfo800,skMccInfo800.length);
   	
   }
   
   public void setSkMccInfo800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSkMccInfo800,skMccInfo800.length);
   	
   }
   
     /**
	 * 	Update SkMccInfo800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSkMccInfo800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkMccInfo800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SkMccInfo800 with another Field
	 *	@param value
	 */
   public void setSkMccInfo800(Field source) {
       replace(source,0,source.length(),beginSkMccInfo800,SK_MCC_INFO_800_LEN);
   	
   }  
   
     /**
	 * 	Update SkMccInfo800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSkMccInfo800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSkMccInfo800,SK_MCC_INFO_800_LEN);
   	
   }
   
     /**
	 * 	Update SkMccInfo800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSkMccInfo800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkMccInfo800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of skDelCyc800
	 *	@return skDelCyc800
	 */
   public char[] getSkDelCyc800() throws CFException{
     if (isSkDelCyc800Modified()) { 
        skDelCyc800 = refreshSkDelCyc800();
     }
   		return skDelCyc800;
   }

  
	/**
	*  set variable skDelCyc800
	*  Corresponding COBOL Variable is 800-SK-DEL-CYC
	*  @param value
	**/
   public void setSkDelCyc800(char[] value) {
      skDelCyc800 = checkSkDelCyc800Constraints(value);
      serializeSkDelCyc800(skDelCyc800);
   } 

     /**
	 * 	Update SkDelCyc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSkDelCyc800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSkDelCyc800,skDelCyc800.length);
   	
   }
   
   public void setSkDelCyc800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSkDelCyc800,skDelCyc800.length);
   	
   }
   
     /**
	 * 	Update SkDelCyc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSkDelCyc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkDelCyc800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SkDelCyc800 with another Field
	 *	@param value
	 */
   public void setSkDelCyc800(Field source) {
       replace(source,0,source.length(),beginSkDelCyc800,SK_DEL_CYC_800_LEN);
   	
   }  
   
     /**
	 * 	Update SkDelCyc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSkDelCyc800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSkDelCyc800,SK_DEL_CYC_800_LEN);
   	
   }
   
     /**
	 * 	Update SkDelCyc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSkDelCyc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkDelCyc800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of skTipabroInd800
	 *	@return skTipabroInd800
	 */
   public char[] getSkTipabroInd800() throws CFException{
     if (isSkTipabroInd800Modified()) { 
        skTipabroInd800 = refreshSkTipabroInd800();
     }
   		return skTipabroInd800;
   }

  
	/**
	*  set variable skTipabroInd800
	*  Corresponding COBOL Variable is 800-SK-TIPABRO-IND
	*  @param value
	**/
   public void setSkTipabroInd800(char[] value) {
      skTipabroInd800 = checkSkTipabroInd800Constraints(value);
      serializeSkTipabroInd800(skTipabroInd800);
   } 

     /**
	 * 	Update SkTipabroInd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSkTipabroInd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSkTipabroInd800,skTipabroInd800.length);
   	
   }
   
   public void setSkTipabroInd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSkTipabroInd800,skTipabroInd800.length);
   	
   }
   
     /**
	 * 	Update SkTipabroInd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSkTipabroInd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkTipabroInd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SkTipabroInd800 with another Field
	 *	@param value
	 */
   public void setSkTipabroInd800(Field source) {
       replace(source,0,source.length(),beginSkTipabroInd800,SK_TIPABRO_IND_800_LEN);
   	
   }  
   
     /**
	 * 	Update SkTipabroInd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSkTipabroInd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSkTipabroInd800,SK_TIPABRO_IND_800_LEN);
   	
   }
   
     /**
	 * 	Update SkTipabroInd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSkTipabroInd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkTipabroInd800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of skInbndFrmtInd800
	 *	@return skInbndFrmtInd800
	 */
   public char[] getSkInbndFrmtInd800() throws CFException{
     if (isSkInbndFrmtInd800Modified()) { 
        skInbndFrmtInd800 = refreshSkInbndFrmtInd800();
     }
   		return skInbndFrmtInd800;
   }

  
	/**
	*  set variable skInbndFrmtInd800
	*  Corresponding COBOL Variable is 800-SK-INBND-FRMT-IND
	*  @param value
	**/
   public void setSkInbndFrmtInd800(char[] value) {
      skInbndFrmtInd800 = checkSkInbndFrmtInd800Constraints(value);
      serializeSkInbndFrmtInd800(skInbndFrmtInd800);
   } 

     /**
	 * 	Update SkInbndFrmtInd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSkInbndFrmtInd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSkInbndFrmtInd800,skInbndFrmtInd800.length);
   	
   }
   
   public void setSkInbndFrmtInd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSkInbndFrmtInd800,skInbndFrmtInd800.length);
   	
   }
   
     /**
	 * 	Update SkInbndFrmtInd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSkInbndFrmtInd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkInbndFrmtInd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SkInbndFrmtInd800 with another Field
	 *	@param value
	 */
   public void setSkInbndFrmtInd800(Field source) {
       replace(source,0,source.length(),beginSkInbndFrmtInd800,SK_INBND_FRMT_IND_800_LEN);
   	
   }  
   
     /**
	 * 	Update SkInbndFrmtInd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSkInbndFrmtInd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSkInbndFrmtInd800,SK_INBND_FRMT_IND_800_LEN);
   	
   }
   
     /**
	 * 	Update SkInbndFrmtInd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSkInbndFrmtInd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkInbndFrmtInd800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of skInfileId800
	 *	@return skInfileId800
	 */
   public char[] getSkInfileId800() throws CFException{
     if (isSkInfileId800Modified()) { 
        skInfileId800 = refreshSkInfileId800();
     }
   		return skInfileId800;
   }

  
	/**
	*  set variable skInfileId800
	*  Corresponding COBOL Variable is 800-SK-INFILE-ID
	*  @param value
	**/
   public void setSkInfileId800(char[] value) {
      skInfileId800 = checkSkInfileId800Constraints(value);
      serializeSkInfileId800(skInfileId800);
   } 

     /**
	 * 	Update SkInfileId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSkInfileId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSkInfileId800,skInfileId800.length);
   	
   }
   
   public void setSkInfileId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSkInfileId800,skInfileId800.length);
   	
   }
   
     /**
	 * 	Update SkInfileId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSkInfileId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkInfileId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SkInfileId800 with another Field
	 *	@param value
	 */
   public void setSkInfileId800(Field source) {
       replace(source,0,source.length(),beginSkInfileId800,SK_INFILE_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update SkInfileId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSkInfileId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSkInfileId800,SK_INFILE_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update SkInfileId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSkInfileId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkInfileId800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of skInfileRevCd800
	 *	@return skInfileRevCd800
	 */
   public char[] getSkInfileRevCd800() throws CFException{
     if (isSkInfileRevCd800Modified()) { 
        skInfileRevCd800 = refreshSkInfileRevCd800();
     }
   		return skInfileRevCd800;
   }

  
	/**
	*  set variable skInfileRevCd800
	*  Corresponding COBOL Variable is 800-SK-INFILE-REV-CD
	*  @param value
	**/
   public void setSkInfileRevCd800(char[] value) {
      skInfileRevCd800 = checkSkInfileRevCd800Constraints(value);
      serializeSkInfileRevCd800(skInfileRevCd800);
   } 

     /**
	 * 	Update SkInfileRevCd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSkInfileRevCd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSkInfileRevCd800,skInfileRevCd800.length);
   	
   }
   
   public void setSkInfileRevCd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSkInfileRevCd800,skInfileRevCd800.length);
   	
   }
   
     /**
	 * 	Update SkInfileRevCd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSkInfileRevCd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkInfileRevCd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SkInfileRevCd800 with another Field
	 *	@param value
	 */
   public void setSkInfileRevCd800(Field source) {
       replace(source,0,source.length(),beginSkInfileRevCd800,SK_INFILE_REV_CD_800_LEN);
   	
   }  
   
     /**
	 * 	Update SkInfileRevCd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSkInfileRevCd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSkInfileRevCd800,SK_INFILE_REV_CD_800_LEN);
   	
   }
   
     /**
	 * 	Update SkInfileRevCd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSkInfileRevCd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkInfileRevCd800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of skMsgCount800
	 *	@return skMsgCount800
	 */
	public long getSkMsgCount800() throws CFException {
       if (isSkMsgCount800Modified()) { 
           skMsgCount800 = refreshSkMsgCount800();
        }
   		return skMsgCount800;
	}
	

	
	   
	/**
	 * 	Update SkMsgCount800 with the passed value
	 *  Corresponding COBOL Variable is 800-SK-MSG-COUNT
	 *	@param number
	 */
	public void setSkMsgCount800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    skMsgCount800 = checkSkMsgCount800MaxLimit(number); 
		serializeSkMsgCount800(skMsgCount800);
	}
	

	/**
	 * 	Update SkMsgCount800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSkMsgCount800(char[] value) throws CFException {
		 skMsgCount800 = serializeSkMsgCount800(value);
	}
	/**
	 * 	Update SkMsgCount800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSkMsgCount800String(char[] value) throws CFException {
		 setSkMsgCount800(value);
	}
	/**
	 *	Returns the value of skOutfileId800
	 *	@return skOutfileId800
	 */
   public char[] getSkOutfileId800() throws CFException{
     if (isSkOutfileId800Modified()) { 
        skOutfileId800 = refreshSkOutfileId800();
     }
   		return skOutfileId800;
   }

  
	/**
	*  set variable skOutfileId800
	*  Corresponding COBOL Variable is 800-SK-OUTFILE-ID
	*  @param value
	**/
   public void setSkOutfileId800(char[] value) {
      skOutfileId800 = checkSkOutfileId800Constraints(value);
      serializeSkOutfileId800(skOutfileId800);
   } 

     /**
	 * 	Update SkOutfileId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSkOutfileId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSkOutfileId800,skOutfileId800.length);
   	
   }
   
   public void setSkOutfileId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSkOutfileId800,skOutfileId800.length);
   	
   }
   
     /**
	 * 	Update SkOutfileId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSkOutfileId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkOutfileId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SkOutfileId800 with another Field
	 *	@param value
	 */
   public void setSkOutfileId800(Field source) {
       replace(source,0,source.length(),beginSkOutfileId800,SK_OUTFILE_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update SkOutfileId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSkOutfileId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSkOutfileId800,SK_OUTFILE_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update SkOutfileId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSkOutfileId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkOutfileId800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of skAb800
	 *	@return skAb800
	 */
   public char[] getSkAb800() throws CFException{
     if (isSkAb800Modified()) { 
        skAb800 = refreshSkAb800();
     }
   		return skAb800;
   }

  
	/**
	*  set variable skAb800
	*  Corresponding COBOL Variable is 800-SK-AB
	*  @param value
	**/
   public void setSkAb800(char[] value) {
      skAb800 = checkSkAb800Constraints(value);
      serializeSkAb800(skAb800);
   } 

     /**
	 * 	Update SkAb800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSkAb800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSkAb800,skAb800.length);
   	
   }
   
   public void setSkAb800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSkAb800,skAb800.length);
   	
   }
   
     /**
	 * 	Update SkAb800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSkAb800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkAb800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SkAb800 with another Field
	 *	@param value
	 */
   public void setSkAb800(Field source) {
       replace(source,0,source.length(),beginSkAb800,SK_AB_800_LEN);
   	
   }  
   
     /**
	 * 	Update SkAb800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSkAb800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSkAb800,SK_AB_800_LEN);
   	
   }
   
     /**
	 * 	Update SkAb800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSkAb800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkAb800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of skPurgeDt800
	 *	@return skPurgeDt800
	 */
   public char[] getSkPurgeDt800() throws CFException{
     if (isSkPurgeDt800Modified()) { 
        skPurgeDt800 = refreshSkPurgeDt800();
     }
   		return skPurgeDt800;
   }

  
	/**
	*  set variable skPurgeDt800
	*  Corresponding COBOL Variable is 800-SK-PURGE-DT
	*  @param value
	**/
   public void setSkPurgeDt800(char[] value) {
      skPurgeDt800 = checkSkPurgeDt800Constraints(value);
      serializeSkPurgeDt800(skPurgeDt800);
   } 

     /**
	 * 	Update SkPurgeDt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSkPurgeDt800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSkPurgeDt800,skPurgeDt800.length);
   	
   }
   
   public void setSkPurgeDt800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSkPurgeDt800,skPurgeDt800.length);
   	
   }
   
     /**
	 * 	Update SkPurgeDt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSkPurgeDt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkPurgeDt800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SkPurgeDt800 with another Field
	 *	@param value
	 */
   public void setSkPurgeDt800(Field source) {
       replace(source,0,source.length(),beginSkPurgeDt800,SK_PURGE_DT_800_LEN);
   	
   }  
   
     /**
	 * 	Update SkPurgeDt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSkPurgeDt800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSkPurgeDt800,SK_PURGE_DT_800_LEN);
   	
   }
   
     /**
	 * 	Update SkPurgeDt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSkPurgeDt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkPurgeDt800+targetIndex,targetLen);
    
   }
	char[] crsbrdrIndia8008888Value = "991231".toCharArray();
	/**
	 *	Test condition "991231" for isCrsbrdrIndia80088()
	 *	@return  Returns true if isCrsbrdrIndia80088() is "991231"
	 */
   public boolean isCrsbrdrIndia80088() throws CFException {
      return (  compareChars( getSkPurgeDt800() , crsbrdrIndia8008888Value)  == 0  );
   }


	/**
	*  set values "991231"
	*/
   	public void setCrsbrdrIndia80088True() {  			
    	setSkPurgeDt800( crsbrdrIndia8008888Value);
   	}
	/**
	 *	Returns the value of skFlexRouteInd800
	 *	@return skFlexRouteInd800
	 */
   public char[] getSkFlexRouteInd800() throws CFException{
     if (isSkFlexRouteInd800Modified()) { 
        skFlexRouteInd800 = refreshSkFlexRouteInd800();
     }
   		return skFlexRouteInd800;
   }

  
	/**
	*  set variable skFlexRouteInd800
	*  Corresponding COBOL Variable is 800-SK-FLEX-ROUTE-IND
	*  @param value
	**/
   public void setSkFlexRouteInd800(char[] value) {
      skFlexRouteInd800 = checkSkFlexRouteInd800Constraints(value);
      serializeSkFlexRouteInd800(skFlexRouteInd800);
   } 

     /**
	 * 	Update SkFlexRouteInd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSkFlexRouteInd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSkFlexRouteInd800,skFlexRouteInd800.length);
   	
   }
   
   public void setSkFlexRouteInd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSkFlexRouteInd800,skFlexRouteInd800.length);
   	
   }
   
     /**
	 * 	Update SkFlexRouteInd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSkFlexRouteInd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkFlexRouteInd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SkFlexRouteInd800 with another Field
	 *	@param value
	 */
   public void setSkFlexRouteInd800(Field source) {
       replace(source,0,source.length(),beginSkFlexRouteInd800,SK_FLEX_ROUTE_IND_800_LEN);
   	
   }  
   
     /**
	 * 	Update SkFlexRouteInd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSkFlexRouteInd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSkFlexRouteInd800,SK_FLEX_ROUTE_IND_800_LEN);
   	
   }
   
     /**
	 * 	Update SkFlexRouteInd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSkFlexRouteInd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSkFlexRouteInd800+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes SortKey800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setSkEndpoint800(0);
         setSkFrmtInd800(CONSTANTS.SPACE);
                     setSkDestId800(0);
                     setSkTxnSortCd800(0);
                     setSkOrgnId800(0);
         setSkRevInd800(CONSTANTS.SPACE);
         setSkSettleInd800(CONSTANTS.SPACE);
                     setSkCurrencyCd800(0);
                     setSkMcc800(0);
         setSkMccInfo800(CONSTANTS.SPACE_96);
         setSkDelCyc800(CONSTANTS.SPACE);
         setSkTipabroInd800(CONSTANTS.SPACE);
         setSkInbndFrmtInd800(CONSTANTS.SPACE);
         setSkInfileId800(CONSTANTS.SPACE_25);
         setSkInfileRevCd800(CONSTANTS.SPACE);
                     setSkMsgCount800(0);
         setSkOutfileId800(CONSTANTS.SPACE_25);
         setSkAb800(CONSTANTS.SPACE_3);
         setSkPurgeDt800(CONSTANTS.SPACE_6);
         setSkFlexRouteInd800(CONSTANTS.SPACE);
   }

		public static int getSortKey800FieldLength() {
			return SORT_KEY_800_LENGTH;
		}

}
  
