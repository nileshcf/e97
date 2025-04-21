package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004ItemData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Cf20004ItemData extends Cf20004ItemDataSerialized { 
   

								private int cf20004ItemCount;

								private int cf20004SearchStringSt;

								private int cf20004ItemLength;

								private int cf20004SearchStringLt;

						private char[] cf20004ItemType = Field.fillLowValue(1);
	
	/**
	* Constructor for Cf20004ItemData
	**/
    public Cf20004ItemData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Cf20004ItemData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004ItemData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cf20004ItemCount
	 *	@return cf20004ItemCount
	 */
	public int getCf20004ItemCount() throws CFException {
        if (isCf20004ItemCountModified()) { 
           cf20004ItemCount = refreshCf20004ItemCount();
        }
   		return cf20004ItemCount;
	}
	
	/**
	 * 	Update Cf20004ItemCount with the passed value
	 *  Corresponding COBOL Variable is CF20004-ITEM-COUNT
	 *	@param number
	 */
	public void setCf20004ItemCount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cf20004ItemCount = checkCf20004ItemCountMaxLimit(number); 
		serializeCf20004ItemCount(cf20004ItemCount);
	}


	public void setCf20004ItemCount(long number) {
	    number = checkCf20004ItemCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCf20004ItemCount((int)number);
	}
	
	/**
	 *	Returns the value of cf20004SearchStringSt
	 *	@return cf20004SearchStringSt
	 */
	public int getCf20004SearchStringSt() throws CFException {
        if (isCf20004SearchStringStModified()) { 
           cf20004SearchStringSt = refreshCf20004SearchStringSt();
        }
   		return cf20004SearchStringSt;
	}
	
	/**
	 * 	Update Cf20004SearchStringSt with the passed value
	 *  Corresponding COBOL Variable is CF20004-SEARCH-STRING-ST
	 *	@param number
	 */
	public void setCf20004SearchStringSt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cf20004SearchStringSt = checkCf20004SearchStringStMaxLimit(number); 
		serializeCf20004SearchStringSt(cf20004SearchStringSt);
	}


	public void setCf20004SearchStringSt(long number) {
	    number = checkCf20004SearchStringStMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCf20004SearchStringSt((int)number);
	}
	
	/**
	 *	Returns the value of cf20004ItemLength
	 *	@return cf20004ItemLength
	 */
	public int getCf20004ItemLength() throws CFException {
        if (isCf20004ItemLengthModified()) { 
           cf20004ItemLength = refreshCf20004ItemLength();
        }
   		return cf20004ItemLength;
	}
	
	/**
	 * 	Update Cf20004ItemLength with the passed value
	 *  Corresponding COBOL Variable is CF20004-ITEM-LENGTH
	 *	@param number
	 */
	public void setCf20004ItemLength(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cf20004ItemLength = checkCf20004ItemLengthMaxLimit(number); 
		serializeCf20004ItemLength(cf20004ItemLength);
	}


	public void setCf20004ItemLength(long number) {
	    number = checkCf20004ItemLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCf20004ItemLength((int)number);
	}
	
	/**
	 *	Returns the value of cf20004SearchStringLt
	 *	@return cf20004SearchStringLt
	 */
	public int getCf20004SearchStringLt() throws CFException {
        if (isCf20004SearchStringLtModified()) { 
           cf20004SearchStringLt = refreshCf20004SearchStringLt();
        }
   		return cf20004SearchStringLt;
	}
	
	/**
	 * 	Update Cf20004SearchStringLt with the passed value
	 *  Corresponding COBOL Variable is CF20004-SEARCH-STRING-LT
	 *	@param number
	 */
	public void setCf20004SearchStringLt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cf20004SearchStringLt = checkCf20004SearchStringLtMaxLimit(number); 
		serializeCf20004SearchStringLt(cf20004SearchStringLt);
	}


	public void setCf20004SearchStringLt(long number) {
	    number = checkCf20004SearchStringLtMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCf20004SearchStringLt((int)number);
	}
	
	/**
	 *	Returns the value of cf20004ItemType
	 *	@return cf20004ItemType
	 */
   public char[] getCf20004ItemType() throws CFException{
     if (isCf20004ItemTypeModified()) { 
        cf20004ItemType = refreshCf20004ItemType();
     }
   		return cf20004ItemType;
   }

  
	/**
	*  set variable cf20004ItemType
	*  Corresponding COBOL Variable is CF20004-ITEM-TYPE
	*  @param value
	**/
   public void setCf20004ItemType(char[] value) {
      cf20004ItemType = checkCf20004ItemTypeConstraints(value);
      serializeCf20004ItemType(cf20004ItemType);
   } 

     /**
	 * 	Update Cf20004ItemType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCf20004ItemType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCf20004ItemType,cf20004ItemType.length);
   	
   }
   
   public void setCf20004ItemType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004ItemType,cf20004ItemType.length);
   	
   }
   
     /**
	 * 	Update Cf20004ItemType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf20004ItemType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004ItemType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Cf20004ItemType with another Field
	 *	@param value
	 */
   public void setCf20004ItemType(Field source) {
       replace(source,0,source.length(),beginCf20004ItemType,CF_20004_ITEM_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Cf20004ItemType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCf20004ItemType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCf20004ItemType,CF_20004_ITEM_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Cf20004ItemType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf20004ItemType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004ItemType+targetIndex,targetLen);
    
   }
	char[] cf20004ValueList8888Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isCf20004ValueList88()
	 *	@return  Returns true if isCf20004ValueList88() is "L"
	 */
   public boolean isCf20004ValueList88() throws CFException {
      return (  compareChars( getCf20004ItemType() , cf20004ValueList8888Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setCf20004ValueList88True() {  			
    	setCf20004ItemType( cf20004ValueList8888Value);
   	}
	char[] cf20004ValueRange8888Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isCf20004ValueRange88()
	 *	@return  Returns true if isCf20004ValueRange88() is "R"
	 */
   public boolean isCf20004ValueRange88() throws CFException {
      return (  compareChars( getCf20004ItemType() , cf20004ValueRange8888Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setCf20004ValueRange88True() {  			
    	setCf20004ItemType( cf20004ValueRange8888Value);
   	}

	
	
	
	/**
	 * 	initializes Cf20004ItemData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setCf20004ItemCount(0);
                     setCf20004ItemLength(0);
         setCf20004ItemType(CONSTANTS.SPACE);
   }

		public static int getCf20004ItemDataFieldLength() {
			return CF_20004_ITEM_DATA_LENGTH;
		}

}
  
