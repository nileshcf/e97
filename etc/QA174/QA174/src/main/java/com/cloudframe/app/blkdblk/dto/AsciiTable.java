package com.cloudframe.app.blkdblk.dto;

/**
*  The class AsciiTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:46. using version 5.0.0.254
**/


import com.cloudframe.app.blkdblk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class AsciiTable extends AsciiTableSerialized { 
   
				private MapAsciiTbl mapAsciiTbl = new MapAsciiTbl();
      private List<char[]> asciiToEbcdic; 

	
	/**
	* Constructor for AsciiTable
	**/
    public AsciiTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			mapAsciiTbl.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of mapAsciiTbl
	 *	@return mapAsciiTbl
	 */   
	 public MapAsciiTbl getMapAsciiTbl() {
   	return mapAsciiTbl;
   }
   /**
	* 	Update MapAsciiTbl with the passed value
	*   Corresponding COBOL Variable is MAP-ASCII-TBL
	*	@param value
	*/
   public void setMapAsciiTbl(char[] value) {
      mapAsciiTbl.setString(value); 
   }   
    
     /**
	 * 	Update MapAsciiTbl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMapAsciiTbl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mapAsciiTbl.begin,mapAsciiTbl.length());
   }
   
     /**
	 * 	Update MapAsciiTbl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMapAsciiTbl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mapAsciiTbl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MapAsciiTbl with another Field
	 *	@param value
	 */
   public void setMapAsciiTbl(Field source) {
   	replace(source,0,source.length(),mapAsciiTbl.begin,mapAsciiTbl.length());
   }  
   
     /**
	 * 	Update MapAsciiTbl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMapAsciiTbl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mapAsciiTbl.begin,mapAsciiTbl.length());
   }
   
     /**
	 * 	Update MapAsciiTbl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMapAsciiTbl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mapAsciiTbl.begin+targetIndex,targetLen);
   }
    /**
	 *	Returns the value of asciiToEbcdic
	 *  Corresponding COBOL Variable is ASCII-TO-EBCDIC
	 *	@return asciiToEbcdic
	 */
	public List<char[]> getAsciiToEbcdic() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < ASCII_TO_EBCDIC_SIZE;index++) {
        	list.add( getAsciiToEbcdic( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return asciiToEbcdic
	 */
	public char[] getAsciiToEbcdic(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getAsciiToEbcdic(), resetting it to 0",index);
		    index = 0;
        } else if (index >= ASCII_TO_EBCDIC_SIZE) {
             	index = ASCII_TO_EBCDIC_SIZE -1; // can't exceed max array size
             	logger.trace("asciiToEbcdic - Array index exceeded max Size {}, resetting it to max allowed",ASCII_TO_EBCDIC_SIZE); 
	    }
   	      return getCharArray( (beginAsciiToEbcdic + index*ASCII_TO_EBCDIC_LEN) , ASCII_TO_EBCDIC_LEN );
    }
    
    
   public int  asciiToEbcdicFieldLength() {
   	return ASCII_TO_EBCDIC_LEN;
   }
   
	

  
  	/**
	 *	Update AsciiToEbcdic with the passed value at a given index
	 *  Corresponding COBOL Variable is ASCII-TO-EBCDIC
	 *  @param index
	 *	@param value
	 */
  public void setAsciiToEbcdic(int index,char[] value) {
   	setAsciiToEbcdic(index,value,true);
   }
   
   
   /**
	 *	Update AsciiToEbcdic with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setAsciiToEbcdic(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setAsciiToEbcdic(int,String,boolean), reset it to 0",index);
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
		serializeAsciiToEbcdic(index,value);		
       }
   }
   

	
	
	

		public static int getAsciiTableFieldLength() {
			return ASCII_TABLE_LENGTH;
		}

}
  
