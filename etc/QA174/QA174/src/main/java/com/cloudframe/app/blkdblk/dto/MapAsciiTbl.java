package com.cloudframe.app.blkdblk.dto;

/**
*  The class MapAsciiTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/


import com.cloudframe.app.blkdblk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class MapAsciiTbl extends MapAsciiTblSerialized { 
   
      private List<char[]> mapAscii; 

	
	/**
	* Constructor for MapAsciiTbl
	**/
    public MapAsciiTbl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MapAsciiTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MapAsciiTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of mapAscii
	 *  Corresponding COBOL Variable is MAP-ASCII
	 *	@return mapAscii
	 */
	public List<char[]> getMapAscii() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < MAP_ASCII_SIZE;index++) {
        	list.add( getMapAscii( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return mapAscii
	 */
	public char[] getMapAscii(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getMapAscii(), resetting it to 0",index);
		    index = 0;
        } else if (index >= MAP_ASCII_SIZE) {
             	index = MAP_ASCII_SIZE -1; // can't exceed max array size
             	logger.trace("mapAscii - Array index exceeded max Size {}, resetting it to max allowed",MAP_ASCII_SIZE); 
	    }
   	      return getCharArray( (beginMapAscii + index*MAP_ASCII_LEN) , MAP_ASCII_LEN );
    }
    
    
   public int  mapAsciiFieldLength() {
   	return MAP_ASCII_LEN;
   }
   
	

  
  	/**
	 *	Update MapAscii with the passed value at a given index
	 *  Corresponding COBOL Variable is MAP-ASCII
	 *  @param index
	 *	@param value
	 */
  public void setMapAscii(int index,char[] value) {
   	setMapAscii(index,value,true);
   }
   
   
   /**
	 *	Update MapAscii with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setMapAscii(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setMapAscii(int,String,boolean), reset it to 0",index);
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
		serializeMapAscii(index,value);		
       }
   }
   

	
	
	

		public static int getMapAsciiTblFieldLength() {
			return MAP_ASCII_TBL_LENGTH;
		}

}
  
