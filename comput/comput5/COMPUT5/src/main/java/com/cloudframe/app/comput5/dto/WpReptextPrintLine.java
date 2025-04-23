package com.cloudframe.app.comput5.dto;

/**
*  The class WpReptextPrintLine is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.utility.CFUtil;


public class WpReptextPrintLine extends WpReptextPrintLineSerialized { 
   


						private char[] wpSettlDate = Field.fillLowValue(8);


						private char[] wpClient = Field.fillLowValue(9);


						private char[] wpParcel = Field.fillLowValue(10);


						private char[] wpSetlRef = Field.fillLowValue(10);


						private char[] wpOperator = Field.fillLowValue(8);


								private char[] wpSettlValue = Field.fillLowValue(15);


								private char[] wpDexValue = Field.fillLowValue(15);


						private char[] wpQuarter = Field.fillLowValue(4);
	
	/**
	* Constructor for WpReptextPrintLine
	**/
    public WpReptextPrintLine() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WpReptextPrintLine. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WpReptextPrintLine(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 0
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 18
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 31
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 43
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 55
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 64
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 83
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 100
             ,3
             );
    } 

	/**
	 *	Returns the value of wpSettlDate
	 *	@return wpSettlDate
	 */
   public char[] getWpSettlDate() throws CFException{
     if (isWpSettlDateModified()) { 
        wpSettlDate = refreshWpSettlDate();
     }
   		return wpSettlDate;
   }

  
	/**
	*  set variable wpSettlDate
	*  Corresponding COBOL Variable is WP-SETTL-DATE
	*  @param value
	**/
   public void setWpSettlDate(char[] value) {
      wpSettlDate = checkWpSettlDateConstraints(value);
      serializeWpSettlDate(wpSettlDate);
   } 

     /**
	 * 	Update WpSettlDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpSettlDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWpSettlDate,wpSettlDate.length);
   	
   }
   
   public void setWpSettlDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWpSettlDate,wpSettlDate.length);
   	
   }
   
     /**
	 * 	Update WpSettlDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpSettlDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpSettlDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WpSettlDate with another Field
	 *	@param value
	 */
   public void setWpSettlDate(Field source) {
       replace(source,0,source.length(),beginWpSettlDate,WP_SETTL_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update WpSettlDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpSettlDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWpSettlDate,WP_SETTL_DATE_LEN);
   	
   }
   
     /**
	 * 	Update WpSettlDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpSettlDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpSettlDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wpClient
	 *	@return wpClient
	 */
   public char[] getWpClient() throws CFException{
     if (isWpClientModified()) { 
        wpClient = refreshWpClient();
     }
   		return wpClient;
   }

  
	/**
	*  set variable wpClient
	*  Corresponding COBOL Variable is WP-CLIENT
	*  @param value
	**/
   public void setWpClient(char[] value) {
      wpClient = checkWpClientConstraints(value);
      serializeWpClient(wpClient);
   } 

     /**
	 * 	Update WpClient 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpClient(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWpClient,wpClient.length);
   	
   }
   
   public void setWpClient(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWpClient,wpClient.length);
   	
   }
   
     /**
	 * 	Update WpClient 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpClient(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpClient+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WpClient with another Field
	 *	@param value
	 */
   public void setWpClient(Field source) {
       replace(source,0,source.length(),beginWpClient,WP_CLIENT_LEN);
   	
   }  
   
     /**
	 * 	Update WpClient 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpClient(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWpClient,WP_CLIENT_LEN);
   	
   }
   
     /**
	 * 	Update WpClient 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpClient(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpClient+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wpParcel
	 *	@return wpParcel
	 */
   public char[] getWpParcel() throws CFException{
     if (isWpParcelModified()) { 
        wpParcel = refreshWpParcel();
     }
   		return wpParcel;
   }

  
	/**
	*  set variable wpParcel
	*  Corresponding COBOL Variable is WP-PARCEL
	*  @param value
	**/
   public void setWpParcel(char[] value) {
      wpParcel = checkWpParcelConstraints(value);
      serializeWpParcel(wpParcel);
   } 

     /**
	 * 	Update WpParcel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpParcel(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWpParcel,wpParcel.length);
   	
   }
   
   public void setWpParcel(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWpParcel,wpParcel.length);
   	
   }
   
     /**
	 * 	Update WpParcel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpParcel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpParcel+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WpParcel with another Field
	 *	@param value
	 */
   public void setWpParcel(Field source) {
       replace(source,0,source.length(),beginWpParcel,WP_PARCEL_LEN);
   	
   }  
   
     /**
	 * 	Update WpParcel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpParcel(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWpParcel,WP_PARCEL_LEN);
   	
   }
   
     /**
	 * 	Update WpParcel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpParcel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpParcel+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wpSetlRef
	 *	@return wpSetlRef
	 */
   public char[] getWpSetlRef() throws CFException{
     if (isWpSetlRefModified()) { 
        wpSetlRef = refreshWpSetlRef();
     }
   		return wpSetlRef;
   }

  
	/**
	*  set variable wpSetlRef
	*  Corresponding COBOL Variable is WP-SETL-REF
	*  @param value
	**/
   public void setWpSetlRef(char[] value) {
      wpSetlRef = checkWpSetlRefConstraints(value);
      serializeWpSetlRef(wpSetlRef);
   } 

     /**
	 * 	Update WpSetlRef 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpSetlRef(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWpSetlRef,wpSetlRef.length);
   	
   }
   
   public void setWpSetlRef(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWpSetlRef,wpSetlRef.length);
   	
   }
   
     /**
	 * 	Update WpSetlRef 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpSetlRef(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpSetlRef+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WpSetlRef with another Field
	 *	@param value
	 */
   public void setWpSetlRef(Field source) {
       replace(source,0,source.length(),beginWpSetlRef,WP_SETL_REF_LEN);
   	
   }  
   
     /**
	 * 	Update WpSetlRef 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpSetlRef(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWpSetlRef,WP_SETL_REF_LEN);
   	
   }
   
     /**
	 * 	Update WpSetlRef 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpSetlRef(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpSetlRef+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wpOperator
	 *	@return wpOperator
	 */
   public char[] getWpOperator() throws CFException{
     if (isWpOperatorModified()) { 
        wpOperator = refreshWpOperator();
     }
   		return wpOperator;
   }

  
	/**
	*  set variable wpOperator
	*  Corresponding COBOL Variable is WP-OPERATOR
	*  @param value
	**/
   public void setWpOperator(char[] value) {
      wpOperator = checkWpOperatorConstraints(value);
      serializeWpOperator(wpOperator);
   } 

     /**
	 * 	Update WpOperator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpOperator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWpOperator,wpOperator.length);
   	
   }
   
   public void setWpOperator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWpOperator,wpOperator.length);
   	
   }
   
     /**
	 * 	Update WpOperator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpOperator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpOperator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WpOperator with another Field
	 *	@param value
	 */
   public void setWpOperator(Field source) {
       replace(source,0,source.length(),beginWpOperator,WP_OPERATOR_LEN);
   	
   }  
   
     /**
	 * 	Update WpOperator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpOperator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWpOperator,WP_OPERATOR_LEN);
   	
   }
   
     /**
	 * 	Update WpOperator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpOperator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpOperator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wpSettlValue
	 *	@return wpSettlValue
	 */
   public char[] getWpSettlValue() throws CFException{
     if (isWpSettlValueModified()) { 
        wpSettlValue = refreshWpSettlValue();
     }
   		return wpSettlValue;
   }

  
	/**
	*  set variable wpSettlValue
	*  Corresponding COBOL Variable is WP-SETTL-VALUE
	*  @param value
	**/
   public void setWpSettlValue(char[] value) {
      wpSettlValue = checkWpSettlValueConstraints(value);
      serializeWpSettlValue(wpSettlValue);
   } 

     /**
	 * 	Update WpSettlValue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpSettlValue(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWpSettlValue,wpSettlValue.length);
   	
   }
   
   public void setWpSettlValue(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWpSettlValue,wpSettlValue.length);
   	
   }
   
     /**
	 * 	Update WpSettlValue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpSettlValue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpSettlValue+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WpSettlValue with another Field
	 *	@param value
	 */
   public void setWpSettlValue(Field source) {
       replace(source,0,source.length(),beginWpSettlValue,WP_SETTL_VALUE_LEN);
   	
   }  
   
     /**
	 * 	Update WpSettlValue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpSettlValue(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWpSettlValue,WP_SETTL_VALUE_LEN);
   	
   }
   
     /**
	 * 	Update WpSettlValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpSettlValue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpSettlValue+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wpDexValue
	 *	@return wpDexValue
	 */
   public char[] getWpDexValue() throws CFException{
     if (isWpDexValueModified()) { 
        wpDexValue = refreshWpDexValue();
     }
   		return wpDexValue;
   }

  
	/**
	*  set variable wpDexValue
	*  Corresponding COBOL Variable is WP-DEX-VALUE
	*  @param value
	**/
   public void setWpDexValue(char[] value) {
      wpDexValue = checkWpDexValueConstraints(value);
      serializeWpDexValue(wpDexValue);
   } 

     /**
	 * 	Update WpDexValue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpDexValue(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWpDexValue,wpDexValue.length);
   	
   }
   
   public void setWpDexValue(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWpDexValue,wpDexValue.length);
   	
   }
   
     /**
	 * 	Update WpDexValue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpDexValue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpDexValue+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WpDexValue with another Field
	 *	@param value
	 */
   public void setWpDexValue(Field source) {
       replace(source,0,source.length(),beginWpDexValue,WP_DEX_VALUE_LEN);
   	
   }  
   
     /**
	 * 	Update WpDexValue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpDexValue(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWpDexValue,WP_DEX_VALUE_LEN);
   	
   }
   
     /**
	 * 	Update WpDexValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpDexValue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpDexValue+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wpQuarter
	 *	@return wpQuarter
	 */
   public char[] getWpQuarter() throws CFException{
     if (isWpQuarterModified()) { 
        wpQuarter = refreshWpQuarter();
     }
   		return wpQuarter;
   }

  
	/**
	*  set variable wpQuarter
	*  Corresponding COBOL Variable is WP-QUARTER
	*  @param value
	**/
   public void setWpQuarter(char[] value) {
      wpQuarter = checkWpQuarterConstraints(value);
      serializeWpQuarter(wpQuarter);
   } 

     /**
	 * 	Update WpQuarter 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpQuarter(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWpQuarter,wpQuarter.length);
   	
   }
   
   public void setWpQuarter(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWpQuarter,wpQuarter.length);
   	
   }
   
     /**
	 * 	Update WpQuarter 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpQuarter(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpQuarter+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WpQuarter with another Field
	 *	@param value
	 */
   public void setWpQuarter(Field source) {
       replace(source,0,source.length(),beginWpQuarter,WP_QUARTER_LEN);
   	
   }  
   
     /**
	 * 	Update WpQuarter 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpQuarter(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWpQuarter,WP_QUARTER_LEN);
   	
   }
   
     /**
	 * 	Update WpQuarter 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpQuarter(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpQuarter+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WpReptextPrintLine
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWpSettlDate(CONSTANTS.SPACE_8);
         setWpClient(CONSTANTS.SPACE_9);
         setWpParcel(CONSTANTS.SPACE_10);
         setWpSetlRef(CONSTANTS.SPACE_10);
         setWpOperator(CONSTANTS.SPACE_8);
                    setWpSettlValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1073997384,"0".toCharArray()));
                    setWpDexValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1073997384,"0".toCharArray()));
         setWpQuarter(CONSTANTS.SPACE_4);
   }

		public static int getWpReptextPrintLineFieldLength() {
			return WP_REPTEXT_PRINT_LINE_LENGTH;
		}

}
  
