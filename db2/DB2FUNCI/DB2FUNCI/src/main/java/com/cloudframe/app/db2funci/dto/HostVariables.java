package com.cloudframe.app.db2funci.dto;

/**
*  The class HostVariables is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HostVariables extends HostVariablesSerialized {
   

						private char[] positionFoundSw = new char[1];

						private char[] priceLoadedTodaySw = new char[1];

						private char[] retailPositionSw = new char[1];

						private char[] alternatePriceSw = new char[1];

						private char[] activeOverrideSw = new char[1];

						private char[] rapAppCdAllowedSw = new char[1];

						private char[] remAppCdAllowedSw = new char[1];

						private char[] rtlAppCdAllowedSw = new char[1];
	
	/**
	* Constructor for HostVariables
	**/
    public HostVariables() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPositionFoundSw(("N").toCharArray());
								setPriceLoadedTodaySw(("N").toCharArray());
								setRetailPositionSw(("N").toCharArray());
								setAlternatePriceSw(("N").toCharArray());
								setActiveOverrideSw(("N").toCharArray());
								setRapAppCdAllowedSw(("N").toCharArray());
								setRemAppCdAllowedSw(("N").toCharArray());
								setRtlAppCdAllowedSw(("N").toCharArray());
    }


 

	/**
	 *	Returns the value of positionFoundSw
	 *	@return positionFoundSw
	 */
   public char[] getPositionFoundSw() throws CFException{
     if (isPositionFoundSwModified()) { 
        positionFoundSw = refreshPositionFoundSw();
     }
   		return positionFoundSw;
   }

  
	/**
	*  set variable positionFoundSw
	*  Corresponding COBOL Variable is WS-POSITION-FOUND-SW
	*  @param value
	**/
   public void setPositionFoundSw(char[] value) {
      positionFoundSw = checkPositionFoundSwConstraints(value);
      serializePositionFoundSw(positionFoundSw);
   } 

     /**
	 * 	Update PositionFoundSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPositionFoundSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPositionFoundSw,positionFoundSw.length);
   	
   }
   
   public void setPositionFoundSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPositionFoundSw,positionFoundSw.length);
   	
   }
   
     /**
	 * 	Update PositionFoundSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPositionFoundSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPositionFoundSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PositionFoundSw with another Field
	 *	@param value
	 */
   public void setPositionFoundSw(Field source) {
       replace(source,0,source.length(),beginPositionFoundSw,POSITION_FOUND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update PositionFoundSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPositionFoundSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPositionFoundSw,POSITION_FOUND_SW_LEN);
   	
   }
   
     /**
	 * 	Update PositionFoundSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPositionFoundSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPositionFoundSw+targetIndex,targetLen);
    
   }
	char[] positionFoundNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isPositionFoundNo()
	 *	@return  Returns true if isPositionFoundNo() is "N"
	 */
   public boolean isPositionFoundNo() throws CFException {
      return (  compareChars( getPositionFoundSw() , positionFoundNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setPositionFoundNoTrue() {  			
    	setPositionFoundSw( positionFoundNo88Value);
   	}
	char[] positionFoundYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isPositionFoundYes()
	 *	@return  Returns true if isPositionFoundYes() is "Y"
	 */
   public boolean isPositionFoundYes() throws CFException {
      return (  compareChars( getPositionFoundSw() , positionFoundYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setPositionFoundYesTrue() {  			
    	setPositionFoundSw( positionFoundYes88Value);
   	}
	/**
	 *	Returns the value of priceLoadedTodaySw
	 *	@return priceLoadedTodaySw
	 */
   public char[] getPriceLoadedTodaySw() throws CFException{
     if (isPriceLoadedTodaySwModified()) { 
        priceLoadedTodaySw = refreshPriceLoadedTodaySw();
     }
   		return priceLoadedTodaySw;
   }

  
	/**
	*  set variable priceLoadedTodaySw
	*  Corresponding COBOL Variable is WS-PRICE-LOADED-TODAY-SW
	*  @param value
	**/
   public void setPriceLoadedTodaySw(char[] value) {
      priceLoadedTodaySw = checkPriceLoadedTodaySwConstraints(value);
      serializePriceLoadedTodaySw(priceLoadedTodaySw);
   } 

     /**
	 * 	Update PriceLoadedTodaySw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPriceLoadedTodaySw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPriceLoadedTodaySw,priceLoadedTodaySw.length);
   	
   }
   
   public void setPriceLoadedTodaySw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPriceLoadedTodaySw,priceLoadedTodaySw.length);
   	
   }
   
     /**
	 * 	Update PriceLoadedTodaySw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPriceLoadedTodaySw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPriceLoadedTodaySw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PriceLoadedTodaySw with another Field
	 *	@param value
	 */
   public void setPriceLoadedTodaySw(Field source) {
       replace(source,0,source.length(),beginPriceLoadedTodaySw,PRICE_LOADED_TODAY_SW_LEN);
   	
   }  
   
     /**
	 * 	Update PriceLoadedTodaySw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPriceLoadedTodaySw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPriceLoadedTodaySw,PRICE_LOADED_TODAY_SW_LEN);
   	
   }
   
     /**
	 * 	Update PriceLoadedTodaySw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPriceLoadedTodaySw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPriceLoadedTodaySw+targetIndex,targetLen);
    
   }
	char[] priceLoadedTodayNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isPriceLoadedTodayNo()
	 *	@return  Returns true if isPriceLoadedTodayNo() is "N"
	 */
   public boolean isPriceLoadedTodayNo() throws CFException {
      return (  compareChars( getPriceLoadedTodaySw() , priceLoadedTodayNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setPriceLoadedTodayNoTrue() {  			
    	setPriceLoadedTodaySw( priceLoadedTodayNo88Value);
   	}
	char[] priceLoadedTodayYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isPriceLoadedTodayYes()
	 *	@return  Returns true if isPriceLoadedTodayYes() is "Y"
	 */
   public boolean isPriceLoadedTodayYes() throws CFException {
      return (  compareChars( getPriceLoadedTodaySw() , priceLoadedTodayYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setPriceLoadedTodayYesTrue() {  			
    	setPriceLoadedTodaySw( priceLoadedTodayYes88Value);
   	}
	/**
	 *	Returns the value of retailPositionSw
	 *	@return retailPositionSw
	 */
   public char[] getRetailPositionSw() throws CFException{
     if (isRetailPositionSwModified()) { 
        retailPositionSw = refreshRetailPositionSw();
     }
   		return retailPositionSw;
   }

  
	/**
	*  set variable retailPositionSw
	*  Corresponding COBOL Variable is WS-RETAIL-POSITION-SW
	*  @param value
	**/
   public void setRetailPositionSw(char[] value) {
      retailPositionSw = checkRetailPositionSwConstraints(value);
      serializeRetailPositionSw(retailPositionSw);
   } 

     /**
	 * 	Update RetailPositionSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRetailPositionSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRetailPositionSw,retailPositionSw.length);
   	
   }
   
   public void setRetailPositionSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRetailPositionSw,retailPositionSw.length);
   	
   }
   
     /**
	 * 	Update RetailPositionSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRetailPositionSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRetailPositionSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RetailPositionSw with another Field
	 *	@param value
	 */
   public void setRetailPositionSw(Field source) {
       replace(source,0,source.length(),beginRetailPositionSw,RETAIL_POSITION_SW_LEN);
   	
   }  
   
     /**
	 * 	Update RetailPositionSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRetailPositionSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRetailPositionSw,RETAIL_POSITION_SW_LEN);
   	
   }
   
     /**
	 * 	Update RetailPositionSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRetailPositionSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRetailPositionSw+targetIndex,targetLen);
    
   }
	char[] retailPositionNtfnd88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isRetailPositionNtfnd()
	 *	@return  Returns true if isRetailPositionNtfnd() is "N"
	 */
   public boolean isRetailPositionNtfnd() throws CFException {
      return (  compareChars( getRetailPositionSw() , retailPositionNtfnd88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setRetailPositionNtfndTrue() {  			
    	setRetailPositionSw( retailPositionNtfnd88Value);
   	}
	char[] retailPositionFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isRetailPositionFound()
	 *	@return  Returns true if isRetailPositionFound() is "Y"
	 */
   public boolean isRetailPositionFound() throws CFException {
      return (  compareChars( getRetailPositionSw() , retailPositionFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setRetailPositionFoundTrue() {  			
    	setRetailPositionSw( retailPositionFound88Value);
   	}
	/**
	 *	Returns the value of alternatePriceSw
	 *	@return alternatePriceSw
	 */
   public char[] getAlternatePriceSw() throws CFException{
     if (isAlternatePriceSwModified()) { 
        alternatePriceSw = refreshAlternatePriceSw();
     }
   		return alternatePriceSw;
   }

  
	/**
	*  set variable alternatePriceSw
	*  Corresponding COBOL Variable is WS-ALTERNATE-PRICE-SW
	*  @param value
	**/
   public void setAlternatePriceSw(char[] value) {
      alternatePriceSw = checkAlternatePriceSwConstraints(value);
      serializeAlternatePriceSw(alternatePriceSw);
   } 

     /**
	 * 	Update AlternatePriceSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAlternatePriceSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAlternatePriceSw,alternatePriceSw.length);
   	
   }
   
   public void setAlternatePriceSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAlternatePriceSw,alternatePriceSw.length);
   	
   }
   
     /**
	 * 	Update AlternatePriceSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAlternatePriceSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAlternatePriceSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AlternatePriceSw with another Field
	 *	@param value
	 */
   public void setAlternatePriceSw(Field source) {
       replace(source,0,source.length(),beginAlternatePriceSw,ALTERNATE_PRICE_SW_LEN);
   	
   }  
   
     /**
	 * 	Update AlternatePriceSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAlternatePriceSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAlternatePriceSw,ALTERNATE_PRICE_SW_LEN);
   	
   }
   
     /**
	 * 	Update AlternatePriceSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAlternatePriceSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAlternatePriceSw+targetIndex,targetLen);
    
   }
	char[] alternatePriceNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isAlternatePriceNo()
	 *	@return  Returns true if isAlternatePriceNo() is "N"
	 */
   public boolean isAlternatePriceNo() throws CFException {
      return (  compareChars( getAlternatePriceSw() , alternatePriceNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setAlternatePriceNoTrue() {  			
    	setAlternatePriceSw( alternatePriceNo88Value);
   	}
	char[] alternatePriceYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isAlternatePriceYes()
	 *	@return  Returns true if isAlternatePriceYes() is "Y"
	 */
   public boolean isAlternatePriceYes() throws CFException {
      return (  compareChars( getAlternatePriceSw() , alternatePriceYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setAlternatePriceYesTrue() {  			
    	setAlternatePriceSw( alternatePriceYes88Value);
   	}
	/**
	 *	Returns the value of activeOverrideSw
	 *	@return activeOverrideSw
	 */
   public char[] getActiveOverrideSw() throws CFException{
     if (isActiveOverrideSwModified()) { 
        activeOverrideSw = refreshActiveOverrideSw();
     }
   		return activeOverrideSw;
   }

  
	/**
	*  set variable activeOverrideSw
	*  Corresponding COBOL Variable is WS-ACTIVE-OVERRIDE-SW
	*  @param value
	**/
   public void setActiveOverrideSw(char[] value) {
      activeOverrideSw = checkActiveOverrideSwConstraints(value);
      serializeActiveOverrideSw(activeOverrideSw);
   } 

     /**
	 * 	Update ActiveOverrideSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setActiveOverrideSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginActiveOverrideSw,activeOverrideSw.length);
   	
   }
   
   public void setActiveOverrideSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginActiveOverrideSw,activeOverrideSw.length);
   	
   }
   
     /**
	 * 	Update ActiveOverrideSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setActiveOverrideSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginActiveOverrideSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ActiveOverrideSw with another Field
	 *	@param value
	 */
   public void setActiveOverrideSw(Field source) {
       replace(source,0,source.length(),beginActiveOverrideSw,ACTIVE_OVERRIDE_SW_LEN);
   	
   }  
   
     /**
	 * 	Update ActiveOverrideSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setActiveOverrideSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginActiveOverrideSw,ACTIVE_OVERRIDE_SW_LEN);
   	
   }
   
     /**
	 * 	Update ActiveOverrideSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setActiveOverrideSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginActiveOverrideSw+targetIndex,targetLen);
    
   }
	char[] activeOverrideNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isActiveOverrideNo()
	 *	@return  Returns true if isActiveOverrideNo() is "N"
	 */
   public boolean isActiveOverrideNo() throws CFException {
      return (  compareChars( getActiveOverrideSw() , activeOverrideNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setActiveOverrideNoTrue() {  			
    	setActiveOverrideSw( activeOverrideNo88Value);
   	}
	char[] activeOverrideYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isActiveOverrideYes()
	 *	@return  Returns true if isActiveOverrideYes() is "Y"
	 */
   public boolean isActiveOverrideYes() throws CFException {
      return (  compareChars( getActiveOverrideSw() , activeOverrideYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setActiveOverrideYesTrue() {  			
    	setActiveOverrideSw( activeOverrideYes88Value);
   	}
	/**
	 *	Returns the value of rapAppCdAllowedSw
	 *	@return rapAppCdAllowedSw
	 */
   public char[] getRapAppCdAllowedSw() throws CFException{
     if (isRapAppCdAllowedSwModified()) { 
        rapAppCdAllowedSw = refreshRapAppCdAllowedSw();
     }
   		return rapAppCdAllowedSw;
   }

  
	/**
	*  set variable rapAppCdAllowedSw
	*  Corresponding COBOL Variable is WS-RAP-APP-CD-ALLOWED-SW
	*  @param value
	**/
   public void setRapAppCdAllowedSw(char[] value) {
      rapAppCdAllowedSw = checkRapAppCdAllowedSwConstraints(value);
      serializeRapAppCdAllowedSw(rapAppCdAllowedSw);
   } 

     /**
	 * 	Update RapAppCdAllowedSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRapAppCdAllowedSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRapAppCdAllowedSw,rapAppCdAllowedSw.length);
   	
   }
   
   public void setRapAppCdAllowedSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRapAppCdAllowedSw,rapAppCdAllowedSw.length);
   	
   }
   
     /**
	 * 	Update RapAppCdAllowedSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRapAppCdAllowedSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRapAppCdAllowedSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RapAppCdAllowedSw with another Field
	 *	@param value
	 */
   public void setRapAppCdAllowedSw(Field source) {
       replace(source,0,source.length(),beginRapAppCdAllowedSw,RAP_APP_CD_ALLOWED_SW_LEN);
   	
   }  
   
     /**
	 * 	Update RapAppCdAllowedSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRapAppCdAllowedSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRapAppCdAllowedSw,RAP_APP_CD_ALLOWED_SW_LEN);
   	
   }
   
     /**
	 * 	Update RapAppCdAllowedSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRapAppCdAllowedSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRapAppCdAllowedSw+targetIndex,targetLen);
    
   }
	char[] rapAppCdAllowedNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isRapAppCdAllowedNo()
	 *	@return  Returns true if isRapAppCdAllowedNo() is "N"
	 */
   public boolean isRapAppCdAllowedNo() throws CFException {
      return (  compareChars( getRapAppCdAllowedSw() , rapAppCdAllowedNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setRapAppCdAllowedNoTrue() {  			
    	setRapAppCdAllowedSw( rapAppCdAllowedNo88Value);
   	}
	char[] rapAppCdAllowedYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isRapAppCdAllowedYes()
	 *	@return  Returns true if isRapAppCdAllowedYes() is "Y"
	 */
   public boolean isRapAppCdAllowedYes() throws CFException {
      return (  compareChars( getRapAppCdAllowedSw() , rapAppCdAllowedYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setRapAppCdAllowedYesTrue() {  			
    	setRapAppCdAllowedSw( rapAppCdAllowedYes88Value);
   	}
	/**
	 *	Returns the value of remAppCdAllowedSw
	 *	@return remAppCdAllowedSw
	 */
   public char[] getRemAppCdAllowedSw() throws CFException{
     if (isRemAppCdAllowedSwModified()) { 
        remAppCdAllowedSw = refreshRemAppCdAllowedSw();
     }
   		return remAppCdAllowedSw;
   }

  
	/**
	*  set variable remAppCdAllowedSw
	*  Corresponding COBOL Variable is WS-REM-APP-CD-ALLOWED-SW
	*  @param value
	**/
   public void setRemAppCdAllowedSw(char[] value) {
      remAppCdAllowedSw = checkRemAppCdAllowedSwConstraints(value);
      serializeRemAppCdAllowedSw(remAppCdAllowedSw);
   } 

     /**
	 * 	Update RemAppCdAllowedSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRemAppCdAllowedSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRemAppCdAllowedSw,remAppCdAllowedSw.length);
   	
   }
   
   public void setRemAppCdAllowedSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRemAppCdAllowedSw,remAppCdAllowedSw.length);
   	
   }
   
     /**
	 * 	Update RemAppCdAllowedSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRemAppCdAllowedSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRemAppCdAllowedSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RemAppCdAllowedSw with another Field
	 *	@param value
	 */
   public void setRemAppCdAllowedSw(Field source) {
       replace(source,0,source.length(),beginRemAppCdAllowedSw,REM_APP_CD_ALLOWED_SW_LEN);
   	
   }  
   
     /**
	 * 	Update RemAppCdAllowedSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRemAppCdAllowedSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRemAppCdAllowedSw,REM_APP_CD_ALLOWED_SW_LEN);
   	
   }
   
     /**
	 * 	Update RemAppCdAllowedSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRemAppCdAllowedSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRemAppCdAllowedSw+targetIndex,targetLen);
    
   }
	char[] remAppCdAllowedNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isRemAppCdAllowedNo()
	 *	@return  Returns true if isRemAppCdAllowedNo() is "N"
	 */
   public boolean isRemAppCdAllowedNo() throws CFException {
      return (  compareChars( getRemAppCdAllowedSw() , remAppCdAllowedNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setRemAppCdAllowedNoTrue() {  			
    	setRemAppCdAllowedSw( remAppCdAllowedNo88Value);
   	}
	char[] remAppCdAllowedYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isRemAppCdAllowedYes()
	 *	@return  Returns true if isRemAppCdAllowedYes() is "Y"
	 */
   public boolean isRemAppCdAllowedYes() throws CFException {
      return (  compareChars( getRemAppCdAllowedSw() , remAppCdAllowedYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setRemAppCdAllowedYesTrue() {  			
    	setRemAppCdAllowedSw( remAppCdAllowedYes88Value);
   	}
	/**
	 *	Returns the value of rtlAppCdAllowedSw
	 *	@return rtlAppCdAllowedSw
	 */
   public char[] getRtlAppCdAllowedSw() throws CFException{
     if (isRtlAppCdAllowedSwModified()) { 
        rtlAppCdAllowedSw = refreshRtlAppCdAllowedSw();
     }
   		return rtlAppCdAllowedSw;
   }

  
	/**
	*  set variable rtlAppCdAllowedSw
	*  Corresponding COBOL Variable is WS-RTL-APP-CD-ALLOWED-SW
	*  @param value
	**/
   public void setRtlAppCdAllowedSw(char[] value) {
      rtlAppCdAllowedSw = checkRtlAppCdAllowedSwConstraints(value);
      serializeRtlAppCdAllowedSw(rtlAppCdAllowedSw);
   } 

     /**
	 * 	Update RtlAppCdAllowedSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRtlAppCdAllowedSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRtlAppCdAllowedSw,rtlAppCdAllowedSw.length);
   	
   }
   
   public void setRtlAppCdAllowedSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRtlAppCdAllowedSw,rtlAppCdAllowedSw.length);
   	
   }
   
     /**
	 * 	Update RtlAppCdAllowedSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRtlAppCdAllowedSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRtlAppCdAllowedSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RtlAppCdAllowedSw with another Field
	 *	@param value
	 */
   public void setRtlAppCdAllowedSw(Field source) {
       replace(source,0,source.length(),beginRtlAppCdAllowedSw,RTL_APP_CD_ALLOWED_SW_LEN);
   	
   }  
   
     /**
	 * 	Update RtlAppCdAllowedSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRtlAppCdAllowedSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRtlAppCdAllowedSw,RTL_APP_CD_ALLOWED_SW_LEN);
   	
   }
   
     /**
	 * 	Update RtlAppCdAllowedSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRtlAppCdAllowedSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRtlAppCdAllowedSw+targetIndex,targetLen);
    
   }
	char[] rtlAppCdAllowedNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isRtlAppCdAllowedNo()
	 *	@return  Returns true if isRtlAppCdAllowedNo() is "N"
	 */
   public boolean isRtlAppCdAllowedNo() throws CFException {
      return (  compareChars( getRtlAppCdAllowedSw() , rtlAppCdAllowedNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setRtlAppCdAllowedNoTrue() {  			
    	setRtlAppCdAllowedSw( rtlAppCdAllowedNo88Value);
   	}
	char[] rtlAppCdAllowedYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isRtlAppCdAllowedYes()
	 *	@return  Returns true if isRtlAppCdAllowedYes() is "Y"
	 */
   public boolean isRtlAppCdAllowedYes() throws CFException {
      return (  compareChars( getRtlAppCdAllowedSw() , rtlAppCdAllowedYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setRtlAppCdAllowedYesTrue() {  			
    	setRtlAppCdAllowedSw( rtlAppCdAllowedYes88Value);
   	}

	
	
	

		public static int getHostVariablesFieldLength() {
			return HOST_VARIABLES_LENGTH;
		}

}
  
