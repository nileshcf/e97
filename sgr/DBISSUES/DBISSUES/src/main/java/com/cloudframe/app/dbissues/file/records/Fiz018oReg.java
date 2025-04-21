package com.cloudframe.app.dbissues.file.records;

/**
*  The class Fiz018oReg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:14. using version 5.0.0.256
**/


import com.cloudframe.app.dbissues.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Fiz018oReg extends Fiz018oRegSerialized {
   

								private long lngreg018o;
      private List<char[]> fiz018oRegArray1; 

	
	/**
	* Constructor for Fiz018oReg
	**/
    public Fiz018oReg() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lngreg018o
	 *	@return lngreg018o
	 */
	public long getLngreg018o() throws CFException {
       if (isLngreg018oModified()) { 
           lngreg018o = refreshLngreg018o();
        }
   		return lngreg018o;
	}
	

	
	   
	/**
	 * 	Update Lngreg018o with the passed value
	 *  Corresponding COBOL Variable is LNGREG-018O
	 *	@param number
	 */
	public void setLngreg018o(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    lngreg018o = checkLngreg018oMaxLimit(number); 
		serializeLngreg018o(lngreg018o);
	}
	

	/**
	 * 	Update Lngreg018o with the passed value
	 *	@param value (String or char[])
	 */
	public void setLngreg018o(char[] value) throws CFException {
		 lngreg018o = serializeLngreg018o(value);
	}
	/**
	 * 	Update Lngreg018o with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLngreg018oString(char[] value) throws CFException {
		 setLngreg018o(value);
	}
    /**
	 *	Returns the value of fiz018oRegArray1
	 *  Corresponding COBOL Variable is FILLER
	 *	@return fiz018oRegArray1
	 */
	public List<char[]> getFiz018oRegArray1() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < FIZ_018O_REG_ARRAY_1_SIZE;index++) {
        	list.add( getFiz018oRegArray1( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return fiz018oRegArray1
	 */
	public char[] getFiz018oRegArray1(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getFiz018oRegArray1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= FIZ_018O_REG_ARRAY_1_SIZE) {
             	index = FIZ_018O_REG_ARRAY_1_SIZE -1; // can't exceed max array size
             	logger.trace("fiz018oRegArray1 - Array index exceeded max Size {}, resetting it to max allowed",FIZ_018O_REG_ARRAY_1_SIZE); 
	    }
   	      return getCharArray( (beginFiz018oRegArray1 + index*FIZ_018O_REG_ARRAY_1_LEN) , FIZ_018O_REG_ARRAY_1_LEN );
    }
    
    
   public int  fiz018oRegArray1FieldLength() {
   	return FIZ_018O_REG_ARRAY_1_LEN;
   }
   
	

  
  	/**
	 *	Update Fiz018oRegArray1 with the passed value at a given index
	 *  Corresponding COBOL Variable is FILLER
	 *  @param index
	 *	@param value
	 */
  public void setFiz018oRegArray1(int index,char[] value) {
   	setFiz018oRegArray1(index,value,true);
   }
   
   
   /**
	 *	Update Fiz018oRegArray1 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setFiz018oRegArray1(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setFiz018oRegArray1(int,String,boolean), reset it to 0",index);
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
		serializeFiz018oRegArray1(index,value);		
       }
   }
   

	
	
	

		public static int getFiz018oRegFieldLength() {
			return FIZ_018O_REG_LENGTH;
		}

}
  
