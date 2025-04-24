package com.cloudframe.app.dbissues.file.records;

/**
*  The class Fiz018iReg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/


import com.cloudframe.app.dbissues.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Fiz018iReg extends Fiz018iRegSerialized { 
   

								private long lngreg018i;
      private List<char[]> fiz018iRegArray1; 

	
	/**
	* Constructor for Fiz018iReg
	**/
    public Fiz018iReg() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lngreg018i
	 *	@return lngreg018i
	 */
	public long getLngreg018i() throws CFException {
       if (isLngreg018iModified()) { 
           lngreg018i = refreshLngreg018i();
        }
   		return lngreg018i;
	}
	

	
	   
	/**
	 * 	Update Lngreg018i with the passed value
	 *  Corresponding COBOL Variable is LNGREG-018I
	 *	@param number
	 */
	public void setLngreg018i(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    lngreg018i = checkLngreg018iMaxLimit(number); 
		serializeLngreg018i(lngreg018i);
	}
	

	/**
	 * 	Update Lngreg018i with the passed value
	 *	@param value (String or char[])
	 */
	public void setLngreg018i(char[] value) throws CFException {
		 lngreg018i = serializeLngreg018i(value);
	}
	/**
	 * 	Update Lngreg018i with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLngreg018iString(char[] value) throws CFException {
		 setLngreg018i(value);
	}
    /**
	 *	Returns the value of fiz018iRegArray1
	 *  Corresponding COBOL Variable is FILLER
	 *	@return fiz018iRegArray1
	 */
	public List<char[]> getFiz018iRegArray1() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < FIZ_018I_REG_ARRAY_1_SIZE;index++) {
        	list.add( getFiz018iRegArray1( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return fiz018iRegArray1
	 */
	public char[] getFiz018iRegArray1(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getFiz018iRegArray1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= FIZ_018I_REG_ARRAY_1_SIZE) {
             	index = FIZ_018I_REG_ARRAY_1_SIZE -1; // can't exceed max array size
             	logger.trace("fiz018iRegArray1 - Array index exceeded max Size {}, resetting it to max allowed",FIZ_018I_REG_ARRAY_1_SIZE); 
	    }
   	      return getCharArray( (beginFiz018iRegArray1 + index*FIZ_018I_REG_ARRAY_1_LEN) , FIZ_018I_REG_ARRAY_1_LEN );
    }
    
    
   public int  fiz018iRegArray1FieldLength() {
   	return FIZ_018I_REG_ARRAY_1_LEN;
   }
   
	

  
  	/**
	 *	Update Fiz018iRegArray1 with the passed value at a given index
	 *  Corresponding COBOL Variable is FILLER
	 *  @param index
	 *	@param value
	 */
  public void setFiz018iRegArray1(int index,char[] value) {
   	setFiz018iRegArray1(index,value,true);
   }
   
   
   /**
	 *	Update Fiz018iRegArray1 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setFiz018iRegArray1(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setFiz018iRegArray1(int,String,boolean), reset it to 0",index);
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
		serializeFiz018iRegArray1(index,value);		
       }
   }
   

	
	
	

		public static int getFiz018iRegFieldLength() {
			return FIZ_018I_REG_LENGTH;
		}

}
  
