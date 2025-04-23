package com.cloudframe.app.blkdblk.file.records;

/**
*  The class IpmEbcdicMessage is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.blkdblk.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class IpmEbcdicMessage extends IpmEbcdicMessageSerialized {
   
      private List<char[]> filler; 

	
	/**
	* Constructor for IpmEbcdicMessage
	**/
    public IpmEbcdicMessage() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of filler
	 *  Corresponding COBOL Variable is FILLER
	 *	@return filler
	 */
	public List<char[]> getFiller() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < FILLER_SIZE;index++) {
        	list.add( getFiller( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return filler
	 */
	public char[] getFiller(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getFiller(), resetting it to 0",index);
		    index = 0;
        } else if (index >= FILLER_SIZE) {
             	index = FILLER_SIZE -1; // can't exceed max array size
             	logger.trace("filler - Array index exceeded max Size {}, resetting it to max allowed",FILLER_SIZE); 
	    }
   	      return getCharArray( (beginFiller + index*FILLER_LEN) , FILLER_LEN );
    }
    
    
   public int  fillerFieldLength() {
   	return FILLER_LEN;
   }
   
	

  
  	/**
	 *	Update Filler with the passed value at a given index
	 *  Corresponding COBOL Variable is FILLER
	 *  @param index
	 *	@param value
	 */
  public void setFiller(int index,char[] value) {
   	setFiller(index,value,true);
   }
   
   
   /**
	 *	Update Filler with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setFiller(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setFiller(int,String,boolean), reset it to 0",index);
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
		serializeFiller(index,value);		
       }
   }
   

	
	
	

		public static int getIpmEbcdicMessageFieldLength() {
			return IPM_EBCDIC_MESSAGE_LENGTH;
		}

}
  
