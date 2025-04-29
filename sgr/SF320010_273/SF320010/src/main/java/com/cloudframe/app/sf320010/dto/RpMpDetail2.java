package com.cloudframe.app.sf320010.dto;

/**
*  The class RpMpDetail2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpMpDetail2 extends RpMpDetail2Serialized {
   

						private char[] rpMpCc2 = new char[1];


								private char[] rpMpIssFloorLim2Retail = Field.fillLowValue(4);


								private char[] rpMpIssFloorLim2Travel = Field.fillLowValue(4);


								private char[] rpMpIssFloorLim2Cash = Field.fillLowValue(4);


								private char[] rpMpPosRetailLimit = Field.fillLowValue(4);


								private char[] rpMpPosTravelLimit = Field.fillLowValue(4);


								private char[] rpMpPosCashLimit = Field.fillLowValue(4);


								private char[] rpMpXCodeLimit = Field.fillLowValue(4);
	
	/**
	* Constructor for RpMpDetail2
	**/
    public RpMpDetail2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRpMpCc2(fillSpace(1));
       replaceValue( // serialize and save the value
             ("RET LIM - ").toCharArray()
             , getStartOffset() + 1
             ,10
             );
       replaceValue( // serialize and save the value
             ("  T&E LIM - ").toCharArray()
             , getStartOffset() + 15
             ,12
             );
       replaceValue( // serialize and save the value
             ("    CASH LIM - ").toCharArray()
             , getStartOffset() + 31
             ,15
             );
       replaceValue( // serialize and save the value
             ("    POS RET LIM - ").toCharArray()
             , getStartOffset() + 50
             ,18
             );
       replaceValue( // serialize and save the value
             ("  POS T&E LIM - ").toCharArray()
             , getStartOffset() + 72
             ,16
             );
       replaceValue( // serialize and save the value
             ("  POS CASH LIM - ").toCharArray()
             , getStartOffset() + 92
             ,17
             );
       replaceValue( // serialize and save the value
             ("   X-CODE LIM - ").toCharArray()
             , getStartOffset() + 113
             ,16
             );
    }


 

	/**
	 *	Returns the value of rpMpCc2
	 *	@return rpMpCc2
	 */
   public char[] getRpMpCc2() throws CFException{
     if (isRpMpCc2Modified()) { 
        rpMpCc2 = refreshRpMpCc2();
     }
   		return rpMpCc2;
   }

  
	/**
	*  set variable rpMpCc2
	*  Corresponding COBOL Variable is RP-MP-CC-2
	*  @param value
	**/
   public void setRpMpCc2(char[] value) {
      rpMpCc2 = checkRpMpCc2Constraints(value);
      serializeRpMpCc2(rpMpCc2);
   } 

     /**
	 * 	Update RpMpCc2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpCc2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpCc2,rpMpCc2.length);
   	
   }
   
   public void setRpMpCc2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpCc2,rpMpCc2.length);
   	
   }
   
     /**
	 * 	Update RpMpCc2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpCc2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpCc2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpCc2 with another Field
	 *	@param value
	 */
   public void setRpMpCc2(Field source) {
       replace(source,0,source.length(),beginRpMpCc2,RP_MP_CC_2_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpCc2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpCc2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpCc2,RP_MP_CC_2_LEN);
   	
   }
   
     /**
	 * 	Update RpMpCc2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpCc2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpCc2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIssFloorLim2Retail
	 *	@return rpMpIssFloorLim2Retail
	 */
   public char[] getRpMpIssFloorLim2Retail() throws CFException{
     if (isRpMpIssFloorLim2RetailModified()) { 
        rpMpIssFloorLim2Retail = refreshRpMpIssFloorLim2Retail();
     }
   		return rpMpIssFloorLim2Retail;
   }

  
	/**
	*  set variable rpMpIssFloorLim2Retail
	*  Corresponding COBOL Variable is RP-MP-ISS-FLOOR-LIM2-RETAIL
	*  @param value
	**/
   public void setRpMpIssFloorLim2Retail(char[] value) {
      rpMpIssFloorLim2Retail = checkRpMpIssFloorLim2RetailConstraints(value);
      serializeRpMpIssFloorLim2Retail(rpMpIssFloorLim2Retail);
   } 

     /**
	 * 	Update RpMpIssFloorLim2Retail 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIssFloorLim2Retail(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIssFloorLim2Retail,rpMpIssFloorLim2Retail.length);
   	
   }
   
   public void setRpMpIssFloorLim2Retail(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIssFloorLim2Retail,rpMpIssFloorLim2Retail.length);
   	
   }
   
     /**
	 * 	Update RpMpIssFloorLim2Retail 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIssFloorLim2Retail(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIssFloorLim2Retail+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIssFloorLim2Retail with another Field
	 *	@param value
	 */
   public void setRpMpIssFloorLim2Retail(Field source) {
       replace(source,0,source.length(),beginRpMpIssFloorLim2Retail,RP_MP_ISS_FLOOR_LIM_2_RETAIL_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIssFloorLim2Retail 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIssFloorLim2Retail(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIssFloorLim2Retail,RP_MP_ISS_FLOOR_LIM_2_RETAIL_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIssFloorLim2Retail 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIssFloorLim2Retail(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIssFloorLim2Retail+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIssFloorLim2Travel
	 *	@return rpMpIssFloorLim2Travel
	 */
   public char[] getRpMpIssFloorLim2Travel() throws CFException{
     if (isRpMpIssFloorLim2TravelModified()) { 
        rpMpIssFloorLim2Travel = refreshRpMpIssFloorLim2Travel();
     }
   		return rpMpIssFloorLim2Travel;
   }

  
	/**
	*  set variable rpMpIssFloorLim2Travel
	*  Corresponding COBOL Variable is RP-MP-ISS-FLOOR-LIM2-TRAVEL
	*  @param value
	**/
   public void setRpMpIssFloorLim2Travel(char[] value) {
      rpMpIssFloorLim2Travel = checkRpMpIssFloorLim2TravelConstraints(value);
      serializeRpMpIssFloorLim2Travel(rpMpIssFloorLim2Travel);
   } 

     /**
	 * 	Update RpMpIssFloorLim2Travel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIssFloorLim2Travel(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIssFloorLim2Travel,rpMpIssFloorLim2Travel.length);
   	
   }
   
   public void setRpMpIssFloorLim2Travel(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIssFloorLim2Travel,rpMpIssFloorLim2Travel.length);
   	
   }
   
     /**
	 * 	Update RpMpIssFloorLim2Travel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIssFloorLim2Travel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIssFloorLim2Travel+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIssFloorLim2Travel with another Field
	 *	@param value
	 */
   public void setRpMpIssFloorLim2Travel(Field source) {
       replace(source,0,source.length(),beginRpMpIssFloorLim2Travel,RP_MP_ISS_FLOOR_LIM_2_TRAVEL_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIssFloorLim2Travel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIssFloorLim2Travel(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIssFloorLim2Travel,RP_MP_ISS_FLOOR_LIM_2_TRAVEL_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIssFloorLim2Travel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIssFloorLim2Travel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIssFloorLim2Travel+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIssFloorLim2Cash
	 *	@return rpMpIssFloorLim2Cash
	 */
   public char[] getRpMpIssFloorLim2Cash() throws CFException{
     if (isRpMpIssFloorLim2CashModified()) { 
        rpMpIssFloorLim2Cash = refreshRpMpIssFloorLim2Cash();
     }
   		return rpMpIssFloorLim2Cash;
   }

  
	/**
	*  set variable rpMpIssFloorLim2Cash
	*  Corresponding COBOL Variable is RP-MP-ISS-FLOOR-LIM2-CASH
	*  @param value
	**/
   public void setRpMpIssFloorLim2Cash(char[] value) {
      rpMpIssFloorLim2Cash = checkRpMpIssFloorLim2CashConstraints(value);
      serializeRpMpIssFloorLim2Cash(rpMpIssFloorLim2Cash);
   } 

     /**
	 * 	Update RpMpIssFloorLim2Cash 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIssFloorLim2Cash(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIssFloorLim2Cash,rpMpIssFloorLim2Cash.length);
   	
   }
   
   public void setRpMpIssFloorLim2Cash(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIssFloorLim2Cash,rpMpIssFloorLim2Cash.length);
   	
   }
   
     /**
	 * 	Update RpMpIssFloorLim2Cash 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIssFloorLim2Cash(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIssFloorLim2Cash+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIssFloorLim2Cash with another Field
	 *	@param value
	 */
   public void setRpMpIssFloorLim2Cash(Field source) {
       replace(source,0,source.length(),beginRpMpIssFloorLim2Cash,RP_MP_ISS_FLOOR_LIM_2_CASH_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIssFloorLim2Cash 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIssFloorLim2Cash(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIssFloorLim2Cash,RP_MP_ISS_FLOOR_LIM_2_CASH_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIssFloorLim2Cash 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIssFloorLim2Cash(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIssFloorLim2Cash+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpPosRetailLimit
	 *	@return rpMpPosRetailLimit
	 */
   public char[] getRpMpPosRetailLimit() throws CFException{
     if (isRpMpPosRetailLimitModified()) { 
        rpMpPosRetailLimit = refreshRpMpPosRetailLimit();
     }
   		return rpMpPosRetailLimit;
   }

  
	/**
	*  set variable rpMpPosRetailLimit
	*  Corresponding COBOL Variable is RP-MP-POS-RETAIL-LIMIT
	*  @param value
	**/
   public void setRpMpPosRetailLimit(char[] value) {
      rpMpPosRetailLimit = checkRpMpPosRetailLimitConstraints(value);
      serializeRpMpPosRetailLimit(rpMpPosRetailLimit);
   } 

     /**
	 * 	Update RpMpPosRetailLimit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpPosRetailLimit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpPosRetailLimit,rpMpPosRetailLimit.length);
   	
   }
   
   public void setRpMpPosRetailLimit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpPosRetailLimit,rpMpPosRetailLimit.length);
   	
   }
   
     /**
	 * 	Update RpMpPosRetailLimit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpPosRetailLimit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpPosRetailLimit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpPosRetailLimit with another Field
	 *	@param value
	 */
   public void setRpMpPosRetailLimit(Field source) {
       replace(source,0,source.length(),beginRpMpPosRetailLimit,RP_MP_POS_RETAIL_LIMIT_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpPosRetailLimit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpPosRetailLimit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpPosRetailLimit,RP_MP_POS_RETAIL_LIMIT_LEN);
   	
   }
   
     /**
	 * 	Update RpMpPosRetailLimit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpPosRetailLimit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpPosRetailLimit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpPosTravelLimit
	 *	@return rpMpPosTravelLimit
	 */
   public char[] getRpMpPosTravelLimit() throws CFException{
     if (isRpMpPosTravelLimitModified()) { 
        rpMpPosTravelLimit = refreshRpMpPosTravelLimit();
     }
   		return rpMpPosTravelLimit;
   }

  
	/**
	*  set variable rpMpPosTravelLimit
	*  Corresponding COBOL Variable is RP-MP-POS-TRAVEL-LIMIT
	*  @param value
	**/
   public void setRpMpPosTravelLimit(char[] value) {
      rpMpPosTravelLimit = checkRpMpPosTravelLimitConstraints(value);
      serializeRpMpPosTravelLimit(rpMpPosTravelLimit);
   } 

     /**
	 * 	Update RpMpPosTravelLimit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpPosTravelLimit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpPosTravelLimit,rpMpPosTravelLimit.length);
   	
   }
   
   public void setRpMpPosTravelLimit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpPosTravelLimit,rpMpPosTravelLimit.length);
   	
   }
   
     /**
	 * 	Update RpMpPosTravelLimit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpPosTravelLimit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpPosTravelLimit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpPosTravelLimit with another Field
	 *	@param value
	 */
   public void setRpMpPosTravelLimit(Field source) {
       replace(source,0,source.length(),beginRpMpPosTravelLimit,RP_MP_POS_TRAVEL_LIMIT_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpPosTravelLimit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpPosTravelLimit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpPosTravelLimit,RP_MP_POS_TRAVEL_LIMIT_LEN);
   	
   }
   
     /**
	 * 	Update RpMpPosTravelLimit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpPosTravelLimit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpPosTravelLimit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpPosCashLimit
	 *	@return rpMpPosCashLimit
	 */
   public char[] getRpMpPosCashLimit() throws CFException{
     if (isRpMpPosCashLimitModified()) { 
        rpMpPosCashLimit = refreshRpMpPosCashLimit();
     }
   		return rpMpPosCashLimit;
   }

  
	/**
	*  set variable rpMpPosCashLimit
	*  Corresponding COBOL Variable is RP-MP-POS-CASH-LIMIT
	*  @param value
	**/
   public void setRpMpPosCashLimit(char[] value) {
      rpMpPosCashLimit = checkRpMpPosCashLimitConstraints(value);
      serializeRpMpPosCashLimit(rpMpPosCashLimit);
   } 

     /**
	 * 	Update RpMpPosCashLimit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpPosCashLimit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpPosCashLimit,rpMpPosCashLimit.length);
   	
   }
   
   public void setRpMpPosCashLimit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpPosCashLimit,rpMpPosCashLimit.length);
   	
   }
   
     /**
	 * 	Update RpMpPosCashLimit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpPosCashLimit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpPosCashLimit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpPosCashLimit with another Field
	 *	@param value
	 */
   public void setRpMpPosCashLimit(Field source) {
       replace(source,0,source.length(),beginRpMpPosCashLimit,RP_MP_POS_CASH_LIMIT_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpPosCashLimit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpPosCashLimit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpPosCashLimit,RP_MP_POS_CASH_LIMIT_LEN);
   	
   }
   
     /**
	 * 	Update RpMpPosCashLimit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpPosCashLimit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpPosCashLimit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpXCodeLimit
	 *	@return rpMpXCodeLimit
	 */
   public char[] getRpMpXCodeLimit() throws CFException{
     if (isRpMpXCodeLimitModified()) { 
        rpMpXCodeLimit = refreshRpMpXCodeLimit();
     }
   		return rpMpXCodeLimit;
   }

  
	/**
	*  set variable rpMpXCodeLimit
	*  Corresponding COBOL Variable is RP-MP-X-CODE-LIMIT
	*  @param value
	**/
   public void setRpMpXCodeLimit(char[] value) {
      rpMpXCodeLimit = checkRpMpXCodeLimitConstraints(value);
      serializeRpMpXCodeLimit(rpMpXCodeLimit);
   } 

     /**
	 * 	Update RpMpXCodeLimit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpXCodeLimit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpXCodeLimit,rpMpXCodeLimit.length);
   	
   }
   
   public void setRpMpXCodeLimit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpXCodeLimit,rpMpXCodeLimit.length);
   	
   }
   
     /**
	 * 	Update RpMpXCodeLimit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpXCodeLimit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpXCodeLimit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpXCodeLimit with another Field
	 *	@param value
	 */
   public void setRpMpXCodeLimit(Field source) {
       replace(source,0,source.length(),beginRpMpXCodeLimit,RP_MP_XCODE_LIMIT_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpXCodeLimit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpXCodeLimit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpXCodeLimit,RP_MP_XCODE_LIMIT_LEN);
   	
   }
   
     /**
	 * 	Update RpMpXCodeLimit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpXCodeLimit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpXCodeLimit+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpMpDetail2FieldLength() {
			return RP_MP_DETAIL_2_LENGTH;
		}

}
  
