package com.cloudframe.app.db2func.dto;

/**
*  The class MsdOtherExchange is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class MsdOtherExchange extends MsdOtherExchangeSerialized { 
   
      private List<char[]> msdOthExch; 

	
	/**
	* Constructor for MsdOtherExchange
	**/
    public MsdOtherExchange() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdOtherExchange. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdOtherExchange(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of msdOthExch
	 *  Corresponding COBOL Variable is MSD-OTH-EXCH
	 *	@return msdOthExch
	 */
	public List<char[]> getMsdOthExch() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < MSD_OTH_EXCH_SIZE;index++) {
        	list.add( getMsdOthExch( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return msdOthExch
	 */
	public char[] getMsdOthExch(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getMsdOthExch(), resetting it to 0",index);
		    index = 0;
        } else if (index >= MSD_OTH_EXCH_SIZE) {
             	index = MSD_OTH_EXCH_SIZE -1; // can't exceed max array size
             	logger.trace("msdOthExch - Array index exceeded max Size {}, resetting it to max allowed",MSD_OTH_EXCH_SIZE); 
	    }
   	      return getCharArray( (beginMsdOthExch + index*MSD_OTH_EXCH_LEN) , MSD_OTH_EXCH_LEN );
    }
    
    
   public int  msdOthExchFieldLength() {
   	return MSD_OTH_EXCH_LEN;
   }
   
	

  
  	/**
	 *	Update MsdOthExch with the passed value at a given index
	 *  Corresponding COBOL Variable is MSD-OTH-EXCH
	 *  @param index
	 *	@param value
	 */
  public void setMsdOthExch(int index,char[] value) {
   	setMsdOthExch(index,value,true);
   }
   
   
   /**
	 *	Update MsdOthExch with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setMsdOthExch(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setMsdOthExch(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeMsdOthExch(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes MsdOtherExchange
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < MSD_OTH_EXCH_SIZE;index++) {
             setMsdOthExch(index, CONSTANTS.SPACE);
         }
   }

		public static int getMsdOtherExchangeFieldLength() {
			return MSD_OTHER_EXCHANGE_LENGTH;
		}

}
  
