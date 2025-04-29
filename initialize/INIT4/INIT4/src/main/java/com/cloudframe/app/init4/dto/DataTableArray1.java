package com.cloudframe.app.init4.dto;

/**
*  The class DataTableArray1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class DataTableArray1 extends DataTableArray1Serialized { 
   

						private char[] charWs = Field.fillLowValue(10);

								private int dispNum;

								private int smallint;
	
	/**
	* Constructor for DataTableArray1
	**/
    public DataTableArray1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DataTableArray1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DataTableArray1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of charWs
	 *	@return charWs
	 */
   public char[] getCharWs() throws CFException{
     if (isCharWsModified()) { 
        charWs = refreshCharWs();
     }
   		return charWs;
   }

  
	/**
	*  set variable charWs
	*  Corresponding COBOL Variable is WS-CHAR
	*  @param value
	**/
   public void setCharWs(char[] value) {
      charWs = checkCharWsConstraints(value);
      serializeCharWs(charWs);
   } 

     /**
	 * 	Update CharWs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharWs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCharWs,charWs.length);
   	
   }
   
   public void setCharWs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCharWs,charWs.length);
   	
   }
   
     /**
	 * 	Update CharWs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharWs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharWs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CharWs with another Field
	 *	@param value
	 */
   public void setCharWs(Field source) {
       replace(source,0,source.length(),beginCharWs,CHAR_WS_LEN);
   	
   }  
   
     /**
	 * 	Update CharWs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharWs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCharWs,CHAR_WS_LEN);
   	
   }
   
     /**
	 * 	Update CharWs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharWs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharWs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dispNum
	 *	@return dispNum
	 */
	public int getDispNum() throws CFException {
       if (isDispNumModified()) { 
           dispNum = refreshDispNum();
        }
   		return dispNum;
	}
	

	
	   
	/**
	 * 	Update DispNum with the passed value
	 *  Corresponding COBOL Variable is WS-DISP-NUM
	 *	@param number
	 */
	public void setDispNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dispNum = checkDispNumMaxLimit(number); 
		serializeDispNum(dispNum);
	}
	

	public void setDispNum(long number) {
	    number = checkDispNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDispNum((int)number);
	}
	
	/**
	 * 	Update DispNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setDispNum(char[] value) throws CFException {
		 dispNum = serializeDispNum(value);
	}
	/**
	 * 	Update DispNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDispNumString(char[] value) throws CFException {
		 setDispNum(value);
	}
	/**
	 *	Returns the value of smallint
	 *	@return smallint
	 */
	public int getSmallint() throws CFException {
        if (isSmallintModified()) { 
           smallint = refreshSmallint();
        }
   		return smallint;
	}
	
	/**
	 * 	Update Smallint with the passed value
	 *  Corresponding COBOL Variable is WS-SMALLINT
	 *	@param number
	 */
	public void setSmallint(int number) {
	     // Truncate if the number is beyond +/- Max range
	    smallint = checkSmallintMaxLimit(number); 
		serializeSmallint(smallint);
	}


	public void setSmallint(long number) {
	    number = checkSmallintMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSmallint((int)number);
	}
	

	
	
	
	/**
	 * 	initializes DataTableArray1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCharWs(CONSTANTS.SPACE_10);
                     setDispNum(0);
                     setSmallint(0);
   }

		public static int getDataTableArray1FieldLength() {
			return DATA_TABLE_ARRAY_1_LENGTH;
		}

}
  
