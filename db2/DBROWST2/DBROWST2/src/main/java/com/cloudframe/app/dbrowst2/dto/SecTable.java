package com.cloudframe.app.dbrowst2.dto;

/**
*  The class SecTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/


import com.cloudframe.app.dbrowst2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class SecTable extends SecTableSerialized { 
   
      private List<char[]> isin; 

      private List<char[]> sedol; 

      private List<char[]> ric; 

	
	/**
	* Constructor for SecTable
	**/
    public SecTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of isin
	 *  Corresponding COBOL Variable is WS-ISIN
	 *	@return isin
	 */
	public List<char[]> getIsin() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < ISIN_SIZE;index++) {
        	list.add( getIsin( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return isin
	 */
	public char[] getIsin(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIsin(), resetting it to 0",index);
		    index = 0;
        } else if (index >= ISIN_SIZE) {
             	index = ISIN_SIZE -1; // can't exceed max array size
             	logger.trace("isin - Array index exceeded max Size {}, resetting it to max allowed",ISIN_SIZE); 
	    }
   	      return getCharArray( (beginIsin + index*ISIN_LEN) , ISIN_LEN );
    }
    
    
   public int  isinFieldLength() {
   	return ISIN_LEN;
   }
   
	

  
  	/**
	 *	Update Isin with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-ISIN
	 *  @param index
	 *	@param value
	 */
  public void setIsin(int index,char[] value) {
   	setIsin(index,value,true);
   }
   
   
   /**
	 *	Update Isin with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setIsin(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIsin(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 12)  {     
		       value = substring(value,0,12);
           }  else if (value.length < 12) {
		       value = pad(12, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(12).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeIsin(index,value);		
       }
   }
   
    /**
	 *	Returns the value of sedol
	 *  Corresponding COBOL Variable is WS-SEDOL
	 *	@return sedol
	 */
	public List<char[]> getSedol() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < SEDOL_SIZE;index++) {
        	list.add( getSedol( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return sedol
	 */
	public char[] getSedol(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSedol(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SEDOL_SIZE) {
             	index = SEDOL_SIZE -1; // can't exceed max array size
             	logger.trace("sedol - Array index exceeded max Size {}, resetting it to max allowed",SEDOL_SIZE); 
	    }
   	      return getCharArray( (beginSedol + index*SEDOL_LEN) , SEDOL_LEN );
    }
    
    
   public int  sedolFieldLength() {
   	return SEDOL_LEN;
   }
   
	

  
  	/**
	 *	Update Sedol with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-SEDOL
	 *  @param index
	 *	@param value
	 */
  public void setSedol(int index,char[] value) {
   	setSedol(index,value,true);
   }
   
   
   /**
	 *	Update Sedol with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setSedol(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSedol(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 8)  {     
		       value = substring(value,0,8);
           }  else if (value.length < 8) {
		       value = pad(8, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(8).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeSedol(index,value);		
       }
   }
   
    /**
	 *	Returns the value of ric
	 *  Corresponding COBOL Variable is WS-RIC
	 *	@return ric
	 */
	public List<char[]> getRic() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < RIC_SIZE;index++) {
        	list.add( getRic( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ric
	 */
	public char[] getRic(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getRic(), resetting it to 0",index);
		    index = 0;
        } else if (index >= RIC_SIZE) {
             	index = RIC_SIZE -1; // can't exceed max array size
             	logger.trace("ric - Array index exceeded max Size {}, resetting it to max allowed",RIC_SIZE); 
	    }
   	      return getCharArray( (beginRic + index*RIC_LEN) , RIC_LEN );
    }
    
    
   public int  ricFieldLength() {
   	return RIC_LEN;
   }
   
	

  
  	/**
	 *	Update Ric with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-RIC
	 *  @param index
	 *	@param value
	 */
  public void setRic(int index,char[] value) {
   	setRic(index,value,true);
   }
   
   
   /**
	 *	Update Ric with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setRic(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setRic(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 10)  {     
		       value = substring(value,0,10);
           }  else if (value.length < 10) {
		       value = pad(10, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(10).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeRic(index,value);		
       }
   }
   

	
	
	

		public static int getSecTableFieldLength() {
			return SEC_TABLE_LENGTH;
		}

}
  
