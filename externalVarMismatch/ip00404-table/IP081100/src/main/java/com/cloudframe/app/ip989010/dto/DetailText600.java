package com.cloudframe.app.ip989010.dto;

/**
*  The class DetailText600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class DetailText600 extends DetailText600Serialized {
   

						private char[] panAlias600 = new char[36];


								private char[] donationLimt600 = new char[10];
							


								private char[] calcDonationAmt600 = new char[10];
							


								private char[] bultDonationAmt600 = new char[15];
							
	
	/**
	* Constructor for DetailText600
	**/
    public DetailText600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPanAlias600(fillSpace(36));
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 36
             ,5
             );
								setDonationLimt600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 51
             ,14
             );
								setCalcDonationAmt600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 75
             ,9
             );
								setBultDonationAmt600(CFUtil.cobolNumberFormatter("ZZZ,ZZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of panAlias600
	 *	@return panAlias600
	 */
   public char[] getPanAlias600() throws CFException{
     if (isPanAlias600Modified()) { 
        panAlias600 = refreshPanAlias600();
     }
   		return panAlias600;
   }

  
	/**
	*  set variable panAlias600
	*  Corresponding COBOL Variable is 600-PAN-ALIAS
	*  @param value
	**/
   public void setPanAlias600(char[] value) {
      panAlias600 = checkPanAlias600Constraints(value);
      serializePanAlias600(panAlias600);
   } 

     /**
	 * 	Update PanAlias600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPanAlias600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPanAlias600,panAlias600.length);
   	
   }
   
   public void setPanAlias600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPanAlias600,panAlias600.length);
   	
   }
   
     /**
	 * 	Update PanAlias600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPanAlias600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPanAlias600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PanAlias600 with another Field
	 *	@param value
	 */
   public void setPanAlias600(Field source) {
       replace(source,0,source.length(),beginPanAlias600,PAN_ALIAS_600_LEN);
   	
   }  
   
     /**
	 * 	Update PanAlias600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPanAlias600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPanAlias600,PAN_ALIAS_600_LEN);
   	
   }
   
     /**
	 * 	Update PanAlias600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPanAlias600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPanAlias600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of donationLimt600
	 *	@return donationLimt600
	 */
   public char[] getDonationLimt600() throws CFException{
     if (isDonationLimt600Modified()) { 
        donationLimt600 = refreshDonationLimt600();
     }
   		return donationLimt600;
   }

  
	/**
	*  set variable donationLimt600
	*  Corresponding COBOL Variable is 600-DONATION-LIMT
	*  @param value
	**/
   public void setDonationLimt600(char[] value) {
      donationLimt600 = checkDonationLimt600Constraints(value);
      serializeDonationLimt600(donationLimt600);
   } 

     /**
	 * 	Update DonationLimt600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDonationLimt600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDonationLimt600,donationLimt600.length);
   	
   }
   
   public void setDonationLimt600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDonationLimt600,donationLimt600.length);
   	
   }
   
     /**
	 * 	Update DonationLimt600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDonationLimt600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDonationLimt600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DonationLimt600 with another Field
	 *	@param value
	 */
   public void setDonationLimt600(Field source) {
       replace(source,0,source.length(),beginDonationLimt600,DONATION_LIMT_600_LEN);
   	
   }  
   
     /**
	 * 	Update DonationLimt600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDonationLimt600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDonationLimt600,DONATION_LIMT_600_LEN);
   	
   }
   
     /**
	 * 	Update DonationLimt600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDonationLimt600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDonationLimt600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of calcDonationAmt600
	 *	@return calcDonationAmt600
	 */
   public char[] getCalcDonationAmt600() throws CFException{
     if (isCalcDonationAmt600Modified()) { 
        calcDonationAmt600 = refreshCalcDonationAmt600();
     }
   		return calcDonationAmt600;
   }

  
	/**
	*  set variable calcDonationAmt600
	*  Corresponding COBOL Variable is 600-CALC-DONATION-AMT
	*  @param value
	**/
   public void setCalcDonationAmt600(char[] value) {
      calcDonationAmt600 = checkCalcDonationAmt600Constraints(value);
      serializeCalcDonationAmt600(calcDonationAmt600);
   } 

     /**
	 * 	Update CalcDonationAmt600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCalcDonationAmt600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCalcDonationAmt600,calcDonationAmt600.length);
   	
   }
   
   public void setCalcDonationAmt600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCalcDonationAmt600,calcDonationAmt600.length);
   	
   }
   
     /**
	 * 	Update CalcDonationAmt600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCalcDonationAmt600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCalcDonationAmt600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CalcDonationAmt600 with another Field
	 *	@param value
	 */
   public void setCalcDonationAmt600(Field source) {
       replace(source,0,source.length(),beginCalcDonationAmt600,CALC_DONATION_AMT_600_LEN);
   	
   }  
   
     /**
	 * 	Update CalcDonationAmt600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCalcDonationAmt600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCalcDonationAmt600,CALC_DONATION_AMT_600_LEN);
   	
   }
   
     /**
	 * 	Update CalcDonationAmt600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCalcDonationAmt600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCalcDonationAmt600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bultDonationAmt600
	 *	@return bultDonationAmt600
	 */
   public char[] getBultDonationAmt600() throws CFException{
     if (isBultDonationAmt600Modified()) { 
        bultDonationAmt600 = refreshBultDonationAmt600();
     }
   		return bultDonationAmt600;
   }

  
	/**
	*  set variable bultDonationAmt600
	*  Corresponding COBOL Variable is 600-BULT-DONATION-AMT
	*  @param value
	**/
   public void setBultDonationAmt600(char[] value) {
      bultDonationAmt600 = checkBultDonationAmt600Constraints(value);
      serializeBultDonationAmt600(bultDonationAmt600);
   } 

     /**
	 * 	Update BultDonationAmt600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBultDonationAmt600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBultDonationAmt600,bultDonationAmt600.length);
   	
   }
   
   public void setBultDonationAmt600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBultDonationAmt600,bultDonationAmt600.length);
   	
   }
   
     /**
	 * 	Update BultDonationAmt600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBultDonationAmt600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBultDonationAmt600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BultDonationAmt600 with another Field
	 *	@param value
	 */
   public void setBultDonationAmt600(Field source) {
       replace(source,0,source.length(),beginBultDonationAmt600,BULT_DONATION_AMT_600_LEN);
   	
   }  
   
     /**
	 * 	Update BultDonationAmt600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBultDonationAmt600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBultDonationAmt600,BULT_DONATION_AMT_600_LEN);
   	
   }
   
     /**
	 * 	Update BultDonationAmt600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBultDonationAmt600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBultDonationAmt600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDetailText600FieldLength() {
			return DETAIL_TEXT_600_LENGTH;
		}

}
  
