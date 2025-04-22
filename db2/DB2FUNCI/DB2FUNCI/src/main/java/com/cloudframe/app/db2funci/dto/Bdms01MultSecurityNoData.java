package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01MultSecurityNoData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01MultSecurityNoData extends Bdms01MultSecurityNoDataSerialized { 
   

								private int bdms01MultSecNoQty;
      private List<char[]> bdms01MultSecNo; 

      private List<char[]> bdms01MultSecType; 

	
	/**
	* Constructor for Bdms01MultSecurityNoData
	**/
    public Bdms01MultSecurityNoData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01MultSecurityNoData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01MultSecurityNoData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01MultSecNoQty
	 *	@return bdms01MultSecNoQty
	 */
	public int getBdms01MultSecNoQty() throws CFException {
       if (isBdms01MultSecNoQtyModified()) { 
           bdms01MultSecNoQty = refreshBdms01MultSecNoQty();
        }
   		return bdms01MultSecNoQty;
	}
	

	
	   
	/**
	 * 	Update Bdms01MultSecNoQty with the passed value
	 *  Corresponding COBOL Variable is BDMS01-MULT-SEC-NO-QTY
	 *	@param number
	 */
	public void setBdms01MultSecNoQty(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01MultSecNoQty = checkBdms01MultSecNoQtyMaxLimit(number); 
		serializeBdms01MultSecNoQty(bdms01MultSecNoQty);
	}
	

	public void setBdms01MultSecNoQty(long number) {
	    number = checkBdms01MultSecNoQtyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01MultSecNoQty((int)number);
	}
	
	/**
	 * 	Update Bdms01MultSecNoQty with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01MultSecNoQty(char[] value) throws CFException {
		 bdms01MultSecNoQty = serializeBdms01MultSecNoQty(value);
	}
	/**
	 * 	Update Bdms01MultSecNoQty with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01MultSecNoQtyString(char[] value) throws CFException {
		 setBdms01MultSecNoQty(value);
	}
    /**
	 *	Returns the value of bdms01MultSecNo
	 *  Corresponding COBOL Variable is BDMS01-MULT-SEC-NO
	 *	@return bdms01MultSecNo
	 */
	public List<char[]> getBdms01MultSecNo() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < BDMS_01_MULT_SEC_NO_SIZE;index++) {
        	list.add( getBdms01MultSecNo( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return bdms01MultSecNo
	 */
	public char[] getBdms01MultSecNo(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getBdms01MultSecNo(), resetting it to 0",index);
		    index = 0;
        } else if (index >= BDMS_01_MULT_SEC_NO_SIZE) {
             	index = BDMS_01_MULT_SEC_NO_SIZE -1; // can't exceed max array size
             	logger.trace("bdms01MultSecNo - Array index exceeded max Size {}, resetting it to max allowed",BDMS_01_MULT_SEC_NO_SIZE); 
	    }
   	      return getCharArray( (beginBdms01MultSecNo + index*BDMS_01_MULT_SEC_NO_LEN) , BDMS_01_MULT_SEC_NO_LEN );
    }
    
    
   public int  bdms01MultSecNoFieldLength() {
   	return BDMS_01_MULT_SEC_NO_LEN;
   }
   
	

  
  	/**
	 *	Update Bdms01MultSecNo with the passed value at a given index
	 *  Corresponding COBOL Variable is BDMS01-MULT-SEC-NO
	 *  @param index
	 *	@param value
	 */
  public void setBdms01MultSecNo(int index,char[] value) {
   	setBdms01MultSecNo(index,value,true);
   }
   
   
   /**
	 *	Update Bdms01MultSecNo with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setBdms01MultSecNo(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setBdms01MultSecNo(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 7)  {     
		       value = substring(value,0,7);
           }  else if (value.length < 7) {
		       value = pad(7, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(7).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeBdms01MultSecNo(index,value);		
       }
   }
   
    /**
	 *	Returns the value of bdms01MultSecType
	 *  Corresponding COBOL Variable is BDMS01-MULT-SEC-TYPE
	 *	@return bdms01MultSecType
	 */
	public List<char[]> getBdms01MultSecType() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < BDMS_01_MULT_SEC_TYPE_SIZE;index++) {
        	list.add( getBdms01MultSecType( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return bdms01MultSecType
	 */
	public char[] getBdms01MultSecType(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getBdms01MultSecType(), resetting it to 0",index);
		    index = 0;
        } else if (index >= BDMS_01_MULT_SEC_TYPE_SIZE) {
             	index = BDMS_01_MULT_SEC_TYPE_SIZE -1; // can't exceed max array size
             	logger.trace("bdms01MultSecType - Array index exceeded max Size {}, resetting it to max allowed",BDMS_01_MULT_SEC_TYPE_SIZE); 
	    }
   	      return getCharArray( (beginBdms01MultSecType + index*BDMS_01_MULT_SEC_TYPE_LEN) , BDMS_01_MULT_SEC_TYPE_LEN );
    }
    
    
   public int  bdms01MultSecTypeFieldLength() {
   	return BDMS_01_MULT_SEC_TYPE_LEN;
   }
   
	

  
  	/**
	 *	Update Bdms01MultSecType with the passed value at a given index
	 *  Corresponding COBOL Variable is BDMS01-MULT-SEC-TYPE
	 *  @param index
	 *	@param value
	 */
  public void setBdms01MultSecType(int index,char[] value) {
   	setBdms01MultSecType(index,value,true);
   }
   
   
   /**
	 *	Update Bdms01MultSecType with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setBdms01MultSecType(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setBdms01MultSecType(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 2)  {     
		       value = substring(value,0,2);
           }  else if (value.length < 2) {
		       value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(2).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeBdms01MultSecType(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes Bdms01MultSecurityNoData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01MultSecNoQty(0);
         for (int index =0; index < BDMS_01_MULT_SEC_NO_SIZE;index++) {
             setBdms01MultSecNo(index, CONSTANTS.SPACE_7);
         }
         for (int index =0; index < BDMS_01_MULT_SEC_TYPE_SIZE;index++) {
             setBdms01MultSecType(index, CONSTANTS.SPACE_2);
         }
   }

		public static int getBdms01MultSecurityNoDataFieldLength() {
			return BDMS_01_MULT_SECURITY_NO_DATA_LENGTH;
		}

}
  
