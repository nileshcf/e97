package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504SelElemEntriesAll is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import java.util.List;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Ip65504SelElemEntriesAll extends Ip65504SelElemEntriesAllSerialized { 
   
      private List<char[]> ip65504SelElemEnt; 

	
	/**
	* Constructor for Ip65504SelElemEntriesAll
	**/
    public Ip65504SelElemEntriesAll() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of ip65504SelElemEnt
	 *  Corresponding COBOL Variable is IP65504-SEL-ELEM-ENT
	 *	@return ip65504SelElemEnt
	 */
	public List<char[]> getIp65504SelElemEnt() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IP_65504_SEL_ELEM_ENT_SIZE;index++) {
        	list.add( getIp65504SelElemEnt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ip65504SelElemEnt
	 */
	public char[] getIp65504SelElemEnt(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIp65504SelElemEnt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IP_65504_SEL_ELEM_ENT_SIZE) {
             	index = IP_65504_SEL_ELEM_ENT_SIZE -1; // can't exceed max array size
             	logger.trace("ip65504SelElemEnt - Array index exceeded max Size {}, resetting it to max allowed",IP_65504_SEL_ELEM_ENT_SIZE); 
	    }
   	      return getCharArray( (beginIp65504SelElemEnt + index*IP_65504_SEL_ELEM_ENT_LEN) , IP_65504_SEL_ELEM_ENT_LEN );
    }
    
    
   public int  ip65504SelElemEntFieldLength() {
   	return IP_65504_SEL_ELEM_ENT_LEN;
   }
   
	

  
  	/**
	 *	Update Ip65504SelElemEnt with the passed value at a given index
	 *  Corresponding COBOL Variable is IP65504-SEL-ELEM-ENT
	 *  @param index
	 *	@param value
	 */
  public void setIp65504SelElemEnt(int index,char[] value) {
   	setIp65504SelElemEnt(index,value,true);
   }
   
   
   /**
	 *	Update Ip65504SelElemEnt with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setIp65504SelElemEnt(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIp65504SelElemEnt(int,String,boolean), reset it to 0",index);
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
		serializeIp65504SelElemEnt(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes Ip65504SelElemEntriesAll
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < IP_65504_SEL_ELEM_ENT_SIZE;index++) {
             setIp65504SelElemEnt(index, CONSTANTS.SPACE);
         }
   }

		public static int getIp65504SelElemEntriesAllFieldLength() {
			return IP_65504_SEL_ELEM_ENTRIES_ALL_LENGTH;
		}

}
  
