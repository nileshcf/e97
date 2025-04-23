package com.cloudframe.app.ip088030.dto;

/**
*  The class HoldVariables800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip088030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HoldVariables800 extends HoldVariables800Serialized {
   

						private char[] fundPan800 = new char[10];

						private char[] mccCode800 = new char[4];

						private char[] prodId800 = new char[3];

						private char[] fundProdId800 = new char[3];

						private char[] mccCodeX800 = new char[4];

						private char[] maid800 = new char[6];
	
	/**
	* Constructor for HoldVariables800
	**/
    public HoldVariables800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setFundPan800(fillSpace(10));
								setMccCode800(fillSpace(4));
								setProdId800(fillSpace(3));
								setFundProdId800(fillSpace(3));
								setMccCodeX800(fillSpace(4));
								setMaid800(fillSpace(6));
    }


 

	/**
	 *	Returns the value of fundPan800
	 *	@return fundPan800
	 */
   public char[] getFundPan800() throws CFException{
     if (isFundPan800Modified()) { 
        fundPan800 = refreshFundPan800();
     }
   		return fundPan800;
   }

  
	/**
	*  set variable fundPan800
	*  Corresponding COBOL Variable is 800-FUND-PAN
	*  @param value
	**/
   public void setFundPan800(char[] value) {
      fundPan800 = checkFundPan800Constraints(value);
      serializeFundPan800(fundPan800);
   } 

     /**
	 * 	Update FundPan800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFundPan800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFundPan800,fundPan800.length);
   	
   }
   
   public void setFundPan800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFundPan800,fundPan800.length);
   	
   }
   
     /**
	 * 	Update FundPan800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFundPan800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFundPan800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FundPan800 with another Field
	 *	@param value
	 */
   public void setFundPan800(Field source) {
       replace(source,0,source.length(),beginFundPan800,FUND_PAN_800_LEN);
   	
   }  
   
     /**
	 * 	Update FundPan800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFundPan800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFundPan800,FUND_PAN_800_LEN);
   	
   }
   
     /**
	 * 	Update FundPan800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFundPan800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFundPan800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mccCode800
	 *	@return mccCode800
	 */
   public char[] getMccCode800() throws CFException{
     if (isMccCode800Modified()) { 
        mccCode800 = refreshMccCode800();
     }
   		return mccCode800;
   }

  
	/**
	*  set variable mccCode800
	*  Corresponding COBOL Variable is 800-MCC-CODE
	*  @param value
	**/
   public void setMccCode800(char[] value) {
      mccCode800 = checkMccCode800Constraints(value);
      serializeMccCode800(mccCode800);
   } 

     /**
	 * 	Update MccCode800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMccCode800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMccCode800,mccCode800.length);
   	
   }
   
   public void setMccCode800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMccCode800,mccCode800.length);
   	
   }
   
     /**
	 * 	Update MccCode800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMccCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMccCode800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MccCode800 with another Field
	 *	@param value
	 */
   public void setMccCode800(Field source) {
       replace(source,0,source.length(),beginMccCode800,MCC_CODE_800_LEN);
   	
   }  
   
     /**
	 * 	Update MccCode800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMccCode800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMccCode800,MCC_CODE_800_LEN);
   	
   }
   
     /**
	 * 	Update MccCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMccCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMccCode800+targetIndex,targetLen);
    
   }
	char[] invalidMcc8880088Value = "9999".toCharArray();
	/**
	 *	Test condition "9999" for isInvalidMcc88800()
	 *	@return  Returns true if isInvalidMcc88800() is "9999"
	 */
   public boolean isInvalidMcc88800() throws CFException {
      return (  compareChars( getMccCode800() , invalidMcc8880088Value)  == 0  );
   }


	/**
	*  set values "9999"
	*/
   	public void setInvalidMcc88800True() {  			
    	setMccCode800( invalidMcc8880088Value);
   	}
	/**
	 *	Returns the value of prodId800
	 *	@return prodId800
	 */
   public char[] getProdId800() throws CFException{
     if (isProdId800Modified()) { 
        prodId800 = refreshProdId800();
     }
   		return prodId800;
   }

  
	/**
	*  set variable prodId800
	*  Corresponding COBOL Variable is 800-PROD-ID
	*  @param value
	**/
   public void setProdId800(char[] value) {
      prodId800 = checkProdId800Constraints(value);
      serializeProdId800(prodId800);
   } 

     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProdId800,prodId800.length);
   	
   }
   
   public void setProdId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProdId800,prodId800.length);
   	
   }
   
     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProdId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProdId800 with another Field
	 *	@param value
	 */
   public void setProdId800(Field source) {
       replace(source,0,source.length(),beginProdId800,PROD_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProdId800,PROD_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProdId800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fundProdId800
	 *	@return fundProdId800
	 */
   public char[] getFundProdId800() throws CFException{
     if (isFundProdId800Modified()) { 
        fundProdId800 = refreshFundProdId800();
     }
   		return fundProdId800;
   }

  
	/**
	*  set variable fundProdId800
	*  Corresponding COBOL Variable is 800-FUND-PROD-ID
	*  @param value
	**/
   public void setFundProdId800(char[] value) {
      fundProdId800 = checkFundProdId800Constraints(value);
      serializeFundProdId800(fundProdId800);
   } 

     /**
	 * 	Update FundProdId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFundProdId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFundProdId800,fundProdId800.length);
   	
   }
   
   public void setFundProdId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFundProdId800,fundProdId800.length);
   	
   }
   
     /**
	 * 	Update FundProdId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFundProdId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFundProdId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FundProdId800 with another Field
	 *	@param value
	 */
   public void setFundProdId800(Field source) {
       replace(source,0,source.length(),beginFundProdId800,FUND_PROD_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update FundProdId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFundProdId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFundProdId800,FUND_PROD_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update FundProdId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFundProdId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFundProdId800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mccCodeX800
	 *	@return mccCodeX800
	 */
   public char[] getMccCodeX800() throws CFException{
     if (isMccCodeX800Modified()) { 
        mccCodeX800 = refreshMccCodeX800();
     }
   		return mccCodeX800;
   }

  
	/**
	*  set variable mccCodeX800
	*  Corresponding COBOL Variable is 800-MCC-CODE-X
	*  @param value
	**/
   public void setMccCodeX800(char[] value) {
      mccCodeX800 = checkMccCodeX800Constraints(value);
      serializeMccCodeX800(mccCodeX800);
   } 

     /**
	 * 	Update MccCodeX800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMccCodeX800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMccCodeX800,mccCodeX800.length);
   	
   }
   
   public void setMccCodeX800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMccCodeX800,mccCodeX800.length);
   	
   }
   
     /**
	 * 	Update MccCodeX800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMccCodeX800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMccCodeX800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MccCodeX800 with another Field
	 *	@param value
	 */
   public void setMccCodeX800(Field source) {
       replace(source,0,source.length(),beginMccCodeX800,MCC_CODE_X_800_LEN);
   	
   }  
   
     /**
	 * 	Update MccCodeX800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMccCodeX800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMccCodeX800,MCC_CODE_X_800_LEN);
   	
   }
   
     /**
	 * 	Update MccCodeX800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMccCodeX800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMccCodeX800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of maid800
	 *	@return maid800
	 */
   public char[] getMaid800() throws CFException{
     if (isMaid800Modified()) { 
        maid800 = refreshMaid800();
     }
   		return maid800;
   }

  
	/**
	*  set variable maid800
	*  Corresponding COBOL Variable is 800-MAID
	*  @param value
	**/
   public void setMaid800(char[] value) {
      maid800 = checkMaid800Constraints(value);
      serializeMaid800(maid800);
   } 

     /**
	 * 	Update Maid800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaid800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMaid800,maid800.length);
   	
   }
   
   public void setMaid800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMaid800,maid800.length);
   	
   }
   
     /**
	 * 	Update Maid800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaid800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMaid800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Maid800 with another Field
	 *	@param value
	 */
   public void setMaid800(Field source) {
       replace(source,0,source.length(),beginMaid800,MAID_800_LEN);
   	
   }  
   
     /**
	 * 	Update Maid800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaid800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMaid800,MAID_800_LEN);
   	
   }
   
     /**
	 * 	Update Maid800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaid800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMaid800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHoldVariables800FieldLength() {
			return HOLD_VARIABLES_800_LENGTH;
		}

}
  
