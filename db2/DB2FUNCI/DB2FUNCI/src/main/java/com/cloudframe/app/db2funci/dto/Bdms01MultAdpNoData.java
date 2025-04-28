package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01MultAdpNoData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01MultAdpNoData extends Bdms01MultAdpNoDataSerialized { 
   

								private int bdms01MultAdpNoQty;
      private List<char[]> bdms01MultAdpNo; 

      private List<char[]> bdms01MultCountry; 

	
	/**
	* Constructor for Bdms01MultAdpNoData
	**/
    public Bdms01MultAdpNoData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01MultAdpNoData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01MultAdpNoData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01MultAdpNoQty
	 *	@return bdms01MultAdpNoQty
	 */
	public int getBdms01MultAdpNoQty() throws CFException {
       if (isBdms01MultAdpNoQtyModified()) { 
           bdms01MultAdpNoQty = refreshBdms01MultAdpNoQty();
        }
   		return bdms01MultAdpNoQty;
	}
	

	
	   
	/**
	 * 	Update Bdms01MultAdpNoQty with the passed value
	 *  Corresponding COBOL Variable is BDMS01-MULT-ADP-NO-QTY
	 *	@param number
	 */
	public void setBdms01MultAdpNoQty(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01MultAdpNoQty = checkBdms01MultAdpNoQtyMaxLimit(number); 
		serializeBdms01MultAdpNoQty(bdms01MultAdpNoQty);
	}
	

	public void setBdms01MultAdpNoQty(long number) {
	    number = checkBdms01MultAdpNoQtyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01MultAdpNoQty((int)number);
	}
	
	/**
	 * 	Update Bdms01MultAdpNoQty with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01MultAdpNoQty(char[] value) throws CFException {
		 bdms01MultAdpNoQty = serializeBdms01MultAdpNoQty(value);
	}
	/**
	 * 	Update Bdms01MultAdpNoQty with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01MultAdpNoQtyString(char[] value) throws CFException {
		 setBdms01MultAdpNoQty(value);
	}
    /**
	 *	Returns the value of bdms01MultAdpNo
	 *  Corresponding COBOL Variable is BDMS01-MULT-ADP-NO
	 *	@return bdms01MultAdpNo
	 */
	public List<char[]> getBdms01MultAdpNo() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < BDMS_01_MULT_ADP_NO_SIZE;index++) {
        	list.add( getBdms01MultAdpNo( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return bdms01MultAdpNo
	 */
	public char[] getBdms01MultAdpNo(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getBdms01MultAdpNo(), resetting it to 0",index);
		    index = 0;
        } else if (index >= BDMS_01_MULT_ADP_NO_SIZE) {
             	index = BDMS_01_MULT_ADP_NO_SIZE -1; // can't exceed max array size
             	logger.trace("bdms01MultAdpNo - Array index exceeded max Size {}, resetting it to max allowed",BDMS_01_MULT_ADP_NO_SIZE); 
	    }
   	      return getCharArray( (beginBdms01MultAdpNo + index*BDMS_01_MULT_ADP_NO_LEN) , BDMS_01_MULT_ADP_NO_LEN );
    }
    
    
   public int  bdms01MultAdpNoFieldLength() {
   	return BDMS_01_MULT_ADP_NO_LEN;
   }
   
	

  
  	/**
	 *	Update Bdms01MultAdpNo with the passed value at a given index
	 *  Corresponding COBOL Variable is BDMS01-MULT-ADP-NO
	 *  @param index
	 *	@param value
	 */
  public void setBdms01MultAdpNo(int index,char[] value) {
   	setBdms01MultAdpNo(index,value,true);
   }
   
   
   /**
	 *	Update Bdms01MultAdpNo with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setBdms01MultAdpNo(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setBdms01MultAdpNo(int,String,boolean), reset it to 0",index);
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
		serializeBdms01MultAdpNo(index,value);		
       }
   }
   
    /**
	 *	Returns the value of bdms01MultCountry
	 *  Corresponding COBOL Variable is BDMS01-MULT-COUNTRY
	 *	@return bdms01MultCountry
	 */
	public List<char[]> getBdms01MultCountry() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < BDMS_01_MULT_COUNTRY_SIZE;index++) {
        	list.add( getBdms01MultCountry( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return bdms01MultCountry
	 */
	public char[] getBdms01MultCountry(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getBdms01MultCountry(), resetting it to 0",index);
		    index = 0;
        } else if (index >= BDMS_01_MULT_COUNTRY_SIZE) {
             	index = BDMS_01_MULT_COUNTRY_SIZE -1; // can't exceed max array size
             	logger.trace("bdms01MultCountry - Array index exceeded max Size {}, resetting it to max allowed",BDMS_01_MULT_COUNTRY_SIZE); 
	    }
   	      return getCharArray( (beginBdms01MultCountry + index*BDMS_01_MULT_COUNTRY_LEN) , BDMS_01_MULT_COUNTRY_LEN );
    }
    
    
   public int  bdms01MultCountryFieldLength() {
   	return BDMS_01_MULT_COUNTRY_LEN;
   }
   
	

  
  	/**
	 *	Update Bdms01MultCountry with the passed value at a given index
	 *  Corresponding COBOL Variable is BDMS01-MULT-COUNTRY
	 *  @param index
	 *	@param value
	 */
  public void setBdms01MultCountry(int index,char[] value) {
   	setBdms01MultCountry(index,value,true);
   }
   
   
   /**
	 *	Update Bdms01MultCountry with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setBdms01MultCountry(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setBdms01MultCountry(int,String,boolean), reset it to 0",index);
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
		serializeBdms01MultCountry(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes Bdms01MultAdpNoData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01MultAdpNoQty(0);
         for (int index =0; index < BDMS_01_MULT_ADP_NO_SIZE;index++) {
             setBdms01MultAdpNo(index, CONSTANTS.SPACE_7);
         }
         for (int index =0; index < BDMS_01_MULT_COUNTRY_SIZE;index++) {
             setBdms01MultCountry(index, CONSTANTS.SPACE_2);
         }
   }

		public static int getBdms01MultAdpNoDataFieldLength() {
			return BDMS_01_MULT_ADP_NO_DATA_LENGTH;
		}

}
  
