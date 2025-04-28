package com.cloudframe.app.ip809050.dto;

/**
*  The class UsdAmt1800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class UsdAmt1800 extends UsdAmt1800Serialized { 
   

						private char[] usdAmt800 = new char[10];


						private char[] usdAmtDec800 = new char[2];
	
	/**
	* Constructor for UsdAmt1800
	**/
    public UsdAmt1800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for UsdAmt1800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UsdAmt1800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setUsdAmt800("0000000000".toCharArray());
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 10
             ,1
             );
								setUsdAmtDec800("00".toCharArray());
    } 

	/**
	 *	Returns the value of usdAmt800
	 *	@return usdAmt800
	 */
   public char[] getUsdAmt800() throws CFException{
     if (isUsdAmt800Modified()) { 
        usdAmt800 = refreshUsdAmt800();
     }
   		return usdAmt800;
   }

  
	/**
	*  set variable usdAmt800
	*  Corresponding COBOL Variable is 800-USD-AMT
	*  @param value
	**/
   public void setUsdAmt800(char[] value) {
      usdAmt800 = checkUsdAmt800Constraints(value);
      serializeUsdAmt800(usdAmt800);
   } 

     /**
	 * 	Update UsdAmt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsdAmt800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUsdAmt800,usdAmt800.length);
   	
   }
   
   public void setUsdAmt800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUsdAmt800,usdAmt800.length);
   	
   }
   
     /**
	 * 	Update UsdAmt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsdAmt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsdAmt800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UsdAmt800 with another Field
	 *	@param value
	 */
   public void setUsdAmt800(Field source) {
       replace(source,0,source.length(),beginUsdAmt800,USD_AMT_800_LEN);
   	
   }  
   
     /**
	 * 	Update UsdAmt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsdAmt800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUsdAmt800,USD_AMT_800_LEN);
   	
   }
   
     /**
	 * 	Update UsdAmt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsdAmt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsdAmt800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of usdAmtDec800
	 *	@return usdAmtDec800
	 */
   public char[] getUsdAmtDec800() throws CFException{
     if (isUsdAmtDec800Modified()) { 
        usdAmtDec800 = refreshUsdAmtDec800();
     }
   		return usdAmtDec800;
   }

  
	/**
	*  set variable usdAmtDec800
	*  Corresponding COBOL Variable is 800-USD-AMT-DEC
	*  @param value
	**/
   public void setUsdAmtDec800(char[] value) {
      usdAmtDec800 = checkUsdAmtDec800Constraints(value);
      serializeUsdAmtDec800(usdAmtDec800);
   } 

     /**
	 * 	Update UsdAmtDec800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsdAmtDec800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUsdAmtDec800,usdAmtDec800.length);
   	
   }
   
   public void setUsdAmtDec800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUsdAmtDec800,usdAmtDec800.length);
   	
   }
   
     /**
	 * 	Update UsdAmtDec800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsdAmtDec800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsdAmtDec800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UsdAmtDec800 with another Field
	 *	@param value
	 */
   public void setUsdAmtDec800(Field source) {
       replace(source,0,source.length(),beginUsdAmtDec800,USD_AMT_DEC_800_LEN);
   	
   }  
   
     /**
	 * 	Update UsdAmtDec800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsdAmtDec800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUsdAmtDec800,USD_AMT_DEC_800_LEN);
   	
   }
   
     /**
	 * 	Update UsdAmtDec800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsdAmtDec800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsdAmtDec800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getUsdAmt1800FieldLength() {
			return USD_AMT_1800_LENGTH;
		}

}
  
