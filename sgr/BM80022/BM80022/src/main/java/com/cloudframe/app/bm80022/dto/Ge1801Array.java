package com.cloudframe.app.bm80022.dto;

/**
*  The class Ge1801Array is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.bm80022.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Ge1801Array extends Ge1801ArraySerialized {
   
      private List<char[]> ge1801ACodentid; 

      private List<char[]> ge1801ATipproduct; 

      private List<Long> ge1801ACodcontrat; 

      private List<Short> ge1801AOfigestora; 

      private List<char[]> ge1801AIdepsig; 

      private List<Integer> ge1801ANumpersona; 

      private List<Integer> ge1801ANumcartera; 

      private List<char[]> ge1801ACodcartera; 

      private List<char[]> ge1801AFechaalta; 

      private List<char[]> ge1801AFechabaja; 

      private List<char[]> ge1801ACodnodo; 

      private List<char[]> ge1801AResambito; 

      private List<Integer> ge1801ANumresamb; 

      private List<Integer> ge1801ANumpresamb; 

      private List<char[]> ge1801ACengescapt; 

      private List<Integer> ge1801ANumgescap; 

      private List<Integer> ge1801ANumpgescap; 

      private List<Integer> ge1801ANumpesprie; 

      private List<char[]> ge1801ACodcarrie; 

      private List<char[]> ge1801AFecciecurso; 

	
	/**
	* Constructor for Ge1801Array
	**/
    public Ge1801Array() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of ge1801ACodentid
	 *  Corresponding COBOL Variable is GE1801-A-CODENTID
	 *	@return ge1801ACodentid
	 */
	public List<char[]> getGe1801ACodentid() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_ACODENTID_SIZE;index++) {
        	list.add( getGe1801ACodentid( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ge1801ACodentid
	 */
	public char[] getGe1801ACodentid(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801ACodentid(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ACODENTID_SIZE) {
             	index = GE_1801_ACODENTID_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ACodentid - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ACODENTID_SIZE); 
	    }
   	      return getCharArray( (beginGe1801ACodentid + index*GE_1801_ACODENTID_LEN) , GE_1801_ACODENTID_LEN );
    }
    
    
   public int  ge1801ACodentidFieldLength() {
   	return GE_1801_ACODENTID_LEN;
   }
   
	

  
  	/**
	 *	Update Ge1801ACodentid with the passed value at a given index
	 *  Corresponding COBOL Variable is GE1801-A-CODENTID
	 *  @param index
	 *	@param value
	 */
  public void setGe1801ACodentid(int index,char[] value) {
   	setGe1801ACodentid(index,value,true);
   }
   
   
   /**
	 *	Update Ge1801ACodentid with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setGe1801ACodentid(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801ACodentid(int,String,boolean), reset it to 0",index);
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
		serializeGe1801ACodentid(index,value);		
       }
   }
   
    /**
	 *	Returns the value of ge1801ATipproduct
	 *  Corresponding COBOL Variable is GE1801-A-TIPPRODUCT
	 *	@return ge1801ATipproduct
	 */
	public List<char[]> getGe1801ATipproduct() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_ATIPPRODUCT_SIZE;index++) {
        	list.add( getGe1801ATipproduct( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ge1801ATipproduct
	 */
	public char[] getGe1801ATipproduct(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801ATipproduct(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ATIPPRODUCT_SIZE) {
             	index = GE_1801_ATIPPRODUCT_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ATipproduct - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ATIPPRODUCT_SIZE); 
	    }
   	      return getCharArray( (beginGe1801ATipproduct + index*GE_1801_ATIPPRODUCT_LEN) , GE_1801_ATIPPRODUCT_LEN );
    }
    
    
   public int  ge1801ATipproductFieldLength() {
   	return GE_1801_ATIPPRODUCT_LEN;
   }
   
	

  
  	/**
	 *	Update Ge1801ATipproduct with the passed value at a given index
	 *  Corresponding COBOL Variable is GE1801-A-TIPPRODUCT
	 *  @param index
	 *	@param value
	 */
  public void setGe1801ATipproduct(int index,char[] value) {
   	setGe1801ATipproduct(index,value,true);
   }
   
   
   /**
	 *	Update Ge1801ATipproduct with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setGe1801ATipproduct(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801ATipproduct(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 3)  {     
		       value = substring(value,0,3);
           }  else if (value.length < 3) {
		       value = pad(3, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(3).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeGe1801ATipproduct(index,value);		
       }
   }
   
    /**
	 *	Returns the value of ge1801ACodcontrat
	 *  Corresponding COBOL Variable is GE1801-A-CODCONTRAT
	 *	@return ge1801ACodcontrat
	 */
	public List<Long> getGe1801ACodcontrat() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_ACODCONTRAT_SIZE;index++) {
        	list.add( getGe1801ACodcontrat( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position from this list.
	 *  @param index
	 *	@return ge1801ACodcontrat
	 */
	public long getGe1801ACodcontrat(int index) throws CFException {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801ACodcontrat(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ACODCONTRAT_SIZE) {
             	index = GE_1801_ACODCONTRAT_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ACodcontrat - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ACODCONTRAT_SIZE); 
	    }
		try {
		return 
		getLongDecimal(
		 beginGe1801ACodcontrat+ index*GE_1801_ACODCONTRAT_LEN ,
		 GE_1801_ACODCONTRAT_LEN);
		} catch (Exception ex) {
			throw getSoc7ABend("ge1801ACodcontrat", beginGe1801ACodcontrat+ index*GE_1801_ACODCONTRAT_LEN ,GE_1801_ACODCONTRAT_LEN);
		}
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean ge1801ACodcontratIsNumeric(int index) {
	    return decimalIsNumeric( beginGe1801ACodcontrat+ index*GE_1801_ACODCONTRAT_LEN ,GE_1801_ACODCONTRAT_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is GE1801-A-CODCONTRAT
	 *  @param index
	 *	@param number
	 */
	public void setGe1801ACodcontrat(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_1P || number >= MAX_1P) ? truncate(number,MAX_1P) : number;
		setGe1801ACodcontrat(index,number, true);
	}
	
	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - use this if we want to serialize as string
	 */
	private void setGe1801ACodcontrat(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801ACodcontrat(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ACODCONTRAT_SIZE) {
             	index = GE_1801_ACODCONTRAT_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ACodcontrat - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ACODCONTRAT_SIZE); 
	    }
		if (setModified) {
			serializeGe1801ACodcontrat(index,value);
		}
   }

    /**
	 *	Returns the value of ge1801AOfigestora
	 *  Corresponding COBOL Variable is GE1801-A-OFIGESTORA
	 *	@return ge1801AOfigestora
	 */
	public List<Short> getGe1801AOfigestora() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_AOFIGESTORA_SIZE;index++) {
        	list.add( getGe1801AOfigestora( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position from this list.
	 *  @param index
	 *	@return ge1801AOfigestora
	 */
	public short getGe1801AOfigestora(int index) throws CFException {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801AOfigestora(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_AOFIGESTORA_SIZE) {
             	index = GE_1801_AOFIGESTORA_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801AOfigestora - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_AOFIGESTORA_SIZE); 
	    }
		try {
		return 
		getShortDecimal(
		 beginGe1801AOfigestora+ index*GE_1801_AOFIGESTORA_LEN ,
		 GE_1801_AOFIGESTORA_LEN);
		} catch (Exception ex) {
			throw getSoc7ABend("ge1801AOfigestora", beginGe1801AOfigestora+ index*GE_1801_AOFIGESTORA_LEN ,GE_1801_AOFIGESTORA_LEN);
		}
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean ge1801AOfigestoraIsNumeric(int index) {
	    return decimalIsNumeric( beginGe1801AOfigestora+ index*GE_1801_AOFIGESTORA_LEN ,GE_1801_AOFIGESTORA_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is GE1801-A-OFIGESTORA
	 *  @param index
	 *	@param number
	 */
	public void setGe1801AOfigestora(int index,short number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10K || number >= MAX_10K) ? truncate(number,MAX_10K) : number;
		setGe1801AOfigestora(index,number, true);
	}
	
	public void setGe1801AOfigestora(int index, int number) {
	    number = (number <= -MAX_10K || number >= MAX_10K) ? truncate(number,MAX_10K) : number;
		setGe1801AOfigestora(index,(short)number, true);
	}
	public void setGe1801AOfigestora(int index,long number) {
		    number = (number <= -MAX_10K || number >= MAX_10K) ? truncate(number,MAX_10K) : number;
			setGe1801AOfigestora(index,(short)number, true);
	}
	
	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - use this if we want to serialize as string
	 */
	private void setGe1801AOfigestora(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801AOfigestora(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_AOFIGESTORA_SIZE) {
             	index = GE_1801_AOFIGESTORA_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801AOfigestora - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_AOFIGESTORA_SIZE); 
	    }
		if (setModified) {
			serializeGe1801AOfigestora(index,value);
		}
   }

    /**
	 *	Returns the value of ge1801AIdepsig
	 *  Corresponding COBOL Variable is GE1801-A-IDEPSIG
	 *	@return ge1801AIdepsig
	 */
	public List<char[]> getGe1801AIdepsig() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_AIDEPSIG_SIZE;index++) {
        	list.add( getGe1801AIdepsig( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ge1801AIdepsig
	 */
	public char[] getGe1801AIdepsig(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801AIdepsig(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_AIDEPSIG_SIZE) {
             	index = GE_1801_AIDEPSIG_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801AIdepsig - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_AIDEPSIG_SIZE); 
	    }
   	      return getCharArray( (beginGe1801AIdepsig + index*GE_1801_AIDEPSIG_LEN) , GE_1801_AIDEPSIG_LEN );
    }
    
    
   public int  ge1801AIdepsigFieldLength() {
   	return GE_1801_AIDEPSIG_LEN;
   }
   
	

  
  	/**
	 *	Update Ge1801AIdepsig with the passed value at a given index
	 *  Corresponding COBOL Variable is GE1801-A-IDEPSIG
	 *  @param index
	 *	@param value
	 */
  public void setGe1801AIdepsig(int index,char[] value) {
   	setGe1801AIdepsig(index,value,true);
   }
   
   
   /**
	 *	Update Ge1801AIdepsig with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setGe1801AIdepsig(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801AIdepsig(int,String,boolean), reset it to 0",index);
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
		serializeGe1801AIdepsig(index,value);		
       }
   }
   
    /**
	 *	Returns the value of ge1801ANumpersona
	 *  Corresponding COBOL Variable is GE1801-A-NUMPERSONA
	 *	@return ge1801ANumpersona
	 */
	public List<Integer> getGe1801ANumpersona() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_ANUMPERSONA_SIZE;index++) {
        	list.add( getGe1801ANumpersona( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return ge1801ANumpersona
	 */
	public int getGe1801ANumpersona(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801ANumpersona(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ANUMPERSONA_SIZE) {
             	index = GE_1801_ANUMPERSONA_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ANumpersona - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ANUMPERSONA_SIZE); 
	    }   
		return getInt(beginGe1801ANumpersona+ index*GE_1801_ANUMPERSONA_LEN);
   }
	
	/**
	 *	Update Ge1801ANumpersona at index with the passed value
	 *  Corresponding COBOL Variable is GE1801-A-NUMPERSONA
	 *  @param index
	 *	@param number
	 */
	public void setGe1801ANumpersona(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setGe1801ANumpersona(index,number, true);
	}
	
	public void setGe1801ANumpersona(int index,long number) {
			setGe1801ANumpersona(index,(int)number, true);
	}
	
	/**
	 *	Update  Ge1801ANumpersona at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setGe1801ANumpersona(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801ANumpersona(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ANUMPERSONA_SIZE) {
             	index = GE_1801_ANUMPERSONA_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ANumpersona - Array index exceeded max Size "+GE_1801_ANUMPERSONA_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeGe1801ANumpersona(index,value);
		}
   }
    /**
	 *	Returns the value of ge1801ANumcartera
	 *  Corresponding COBOL Variable is GE1801-A-NUMCARTERA
	 *	@return ge1801ANumcartera
	 */
	public List<Integer> getGe1801ANumcartera() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_ANUMCARTERA_SIZE;index++) {
        	list.add( getGe1801ANumcartera( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position from this list.
	 *  @param index
	 *	@return ge1801ANumcartera
	 */
	public int getGe1801ANumcartera(int index) throws CFException {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801ANumcartera(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ANUMCARTERA_SIZE) {
             	index = GE_1801_ANUMCARTERA_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ANumcartera - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ANUMCARTERA_SIZE); 
	    }
		try {
		return 
		getIntDecimal(
		 beginGe1801ANumcartera+ index*GE_1801_ANUMCARTERA_LEN ,
		 GE_1801_ANUMCARTERA_LEN);
		} catch (Exception ex) {
			throw getSoc7ABend("ge1801ANumcartera", beginGe1801ANumcartera+ index*GE_1801_ANUMCARTERA_LEN ,GE_1801_ANUMCARTERA_LEN);
		}
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean ge1801ANumcarteraIsNumeric(int index) {
	    return decimalIsNumeric( beginGe1801ANumcartera+ index*GE_1801_ANUMCARTERA_LEN ,GE_1801_ANUMCARTERA_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is GE1801-A-NUMCARTERA
	 *  @param index
	 *	@param number
	 */
	public void setGe1801ANumcartera(int index,int number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_100M || number >= MAX_100M) ? truncate(number,MAX_100M) : number;
		setGe1801ANumcartera(index,number, true);
	}
	
	public void setGe1801ANumcartera(int index,long number) {
		    number = (number <= -MAX_100M || number >= MAX_100M) ? truncate(number,MAX_100M) : number;
			setGe1801ANumcartera(index,(int)number, true);
	}
	
	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - use this if we want to serialize as string
	 */
	private void setGe1801ANumcartera(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801ANumcartera(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ANUMCARTERA_SIZE) {
             	index = GE_1801_ANUMCARTERA_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ANumcartera - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ANUMCARTERA_SIZE); 
	    }
		if (setModified) {
			serializeGe1801ANumcartera(index,value);
		}
   }

    /**
	 *	Returns the value of ge1801ACodcartera
	 *  Corresponding COBOL Variable is GE1801-A-CODCARTERA
	 *	@return ge1801ACodcartera
	 */
	public List<char[]> getGe1801ACodcartera() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_ACODCARTERA_SIZE;index++) {
        	list.add( getGe1801ACodcartera( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ge1801ACodcartera
	 */
	public char[] getGe1801ACodcartera(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801ACodcartera(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ACODCARTERA_SIZE) {
             	index = GE_1801_ACODCARTERA_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ACodcartera - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ACODCARTERA_SIZE); 
	    }
   	      return getCharArray( (beginGe1801ACodcartera + index*GE_1801_ACODCARTERA_LEN) , GE_1801_ACODCARTERA_LEN );
    }
    
    
   public int  ge1801ACodcarteraFieldLength() {
   	return GE_1801_ACODCARTERA_LEN;
   }
   
	

  
  	/**
	 *	Update Ge1801ACodcartera with the passed value at a given index
	 *  Corresponding COBOL Variable is GE1801-A-CODCARTERA
	 *  @param index
	 *	@param value
	 */
  public void setGe1801ACodcartera(int index,char[] value) {
   	setGe1801ACodcartera(index,value,true);
   }
   
   
   /**
	 *	Update Ge1801ACodcartera with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setGe1801ACodcartera(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801ACodcartera(int,String,boolean), reset it to 0",index);
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
		serializeGe1801ACodcartera(index,value);		
       }
   }
   
    /**
	 *	Returns the value of ge1801AFechaalta
	 *  Corresponding COBOL Variable is GE1801-A-FECHAALTA
	 *	@return ge1801AFechaalta
	 */
	public List<char[]> getGe1801AFechaalta() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_AFECHAALTA_SIZE;index++) {
        	list.add( getGe1801AFechaalta( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ge1801AFechaalta
	 */
	public char[] getGe1801AFechaalta(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801AFechaalta(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_AFECHAALTA_SIZE) {
             	index = GE_1801_AFECHAALTA_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801AFechaalta - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_AFECHAALTA_SIZE); 
	    }
   	      return getCharArray( (beginGe1801AFechaalta + index*GE_1801_AFECHAALTA_LEN) , GE_1801_AFECHAALTA_LEN );
    }
    
    
   public int  ge1801AFechaaltaFieldLength() {
   	return GE_1801_AFECHAALTA_LEN;
   }
   
	

  
  	/**
	 *	Update Ge1801AFechaalta with the passed value at a given index
	 *  Corresponding COBOL Variable is GE1801-A-FECHAALTA
	 *  @param index
	 *	@param value
	 */
  public void setGe1801AFechaalta(int index,char[] value) {
   	setGe1801AFechaalta(index,value,true);
   }
   
   
   /**
	 *	Update Ge1801AFechaalta with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setGe1801AFechaalta(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801AFechaalta(int,String,boolean), reset it to 0",index);
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
		serializeGe1801AFechaalta(index,value);		
       }
   }
   
    /**
	 *	Returns the value of ge1801AFechabaja
	 *  Corresponding COBOL Variable is GE1801-A-FECHABAJA
	 *	@return ge1801AFechabaja
	 */
	public List<char[]> getGe1801AFechabaja() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_AFECHABAJA_SIZE;index++) {
        	list.add( getGe1801AFechabaja( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ge1801AFechabaja
	 */
	public char[] getGe1801AFechabaja(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801AFechabaja(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_AFECHABAJA_SIZE) {
             	index = GE_1801_AFECHABAJA_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801AFechabaja - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_AFECHABAJA_SIZE); 
	    }
   	      return getCharArray( (beginGe1801AFechabaja + index*GE_1801_AFECHABAJA_LEN) , GE_1801_AFECHABAJA_LEN );
    }
    
    
   public int  ge1801AFechabajaFieldLength() {
   	return GE_1801_AFECHABAJA_LEN;
   }
   
	

  
  	/**
	 *	Update Ge1801AFechabaja with the passed value at a given index
	 *  Corresponding COBOL Variable is GE1801-A-FECHABAJA
	 *  @param index
	 *	@param value
	 */
  public void setGe1801AFechabaja(int index,char[] value) {
   	setGe1801AFechabaja(index,value,true);
   }
   
   
   /**
	 *	Update Ge1801AFechabaja with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setGe1801AFechabaja(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801AFechabaja(int,String,boolean), reset it to 0",index);
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
		serializeGe1801AFechabaja(index,value);		
       }
   }
   
    /**
	 *	Returns the value of ge1801ACodnodo
	 *  Corresponding COBOL Variable is GE1801-A-CODNODO
	 *	@return ge1801ACodnodo
	 */
	public List<char[]> getGe1801ACodnodo() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_ACODNODO_SIZE;index++) {
        	list.add( getGe1801ACodnodo( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ge1801ACodnodo
	 */
	public char[] getGe1801ACodnodo(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801ACodnodo(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ACODNODO_SIZE) {
             	index = GE_1801_ACODNODO_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ACodnodo - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ACODNODO_SIZE); 
	    }
   	      return getCharArray( (beginGe1801ACodnodo + index*GE_1801_ACODNODO_LEN) , GE_1801_ACODNODO_LEN );
    }
    
    
   public int  ge1801ACodnodoFieldLength() {
   	return GE_1801_ACODNODO_LEN;
   }
   
	

  
  	/**
	 *	Update Ge1801ACodnodo with the passed value at a given index
	 *  Corresponding COBOL Variable is GE1801-A-CODNODO
	 *  @param index
	 *	@param value
	 */
  public void setGe1801ACodnodo(int index,char[] value) {
   	setGe1801ACodnodo(index,value,true);
   }
   
   
   /**
	 *	Update Ge1801ACodnodo with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setGe1801ACodnodo(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801ACodnodo(int,String,boolean), reset it to 0",index);
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
		serializeGe1801ACodnodo(index,value);		
       }
   }
   
    /**
	 *	Returns the value of ge1801AResambito
	 *  Corresponding COBOL Variable is GE1801-A-RESAMBITO
	 *	@return ge1801AResambito
	 */
	public List<char[]> getGe1801AResambito() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_ARESAMBITO_SIZE;index++) {
        	list.add( getGe1801AResambito( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ge1801AResambito
	 */
	public char[] getGe1801AResambito(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801AResambito(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ARESAMBITO_SIZE) {
             	index = GE_1801_ARESAMBITO_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801AResambito - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ARESAMBITO_SIZE); 
	    }
   	      return getCharArray( (beginGe1801AResambito + index*GE_1801_ARESAMBITO_LEN) , GE_1801_ARESAMBITO_LEN );
    }
    
    
   public int  ge1801AResambitoFieldLength() {
   	return GE_1801_ARESAMBITO_LEN;
   }
   
	

  
  	/**
	 *	Update Ge1801AResambito with the passed value at a given index
	 *  Corresponding COBOL Variable is GE1801-A-RESAMBITO
	 *  @param index
	 *	@param value
	 */
  public void setGe1801AResambito(int index,char[] value) {
   	setGe1801AResambito(index,value,true);
   }
   
   
   /**
	 *	Update Ge1801AResambito with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setGe1801AResambito(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801AResambito(int,String,boolean), reset it to 0",index);
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
		serializeGe1801AResambito(index,value);		
       }
   }
   
    /**
	 *	Returns the value of ge1801ANumresamb
	 *  Corresponding COBOL Variable is GE1801-A-NUMRESAMB
	 *	@return ge1801ANumresamb
	 */
	public List<Integer> getGe1801ANumresamb() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_ANUMRESAMB_SIZE;index++) {
        	list.add( getGe1801ANumresamb( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return ge1801ANumresamb
	 */
	public int getGe1801ANumresamb(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801ANumresamb(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ANUMRESAMB_SIZE) {
             	index = GE_1801_ANUMRESAMB_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ANumresamb - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ANUMRESAMB_SIZE); 
	    }   
		return getInt(beginGe1801ANumresamb+ index*GE_1801_ANUMRESAMB_LEN);
   }
	
	/**
	 *	Update Ge1801ANumresamb at index with the passed value
	 *  Corresponding COBOL Variable is GE1801-A-NUMRESAMB
	 *  @param index
	 *	@param number
	 */
	public void setGe1801ANumresamb(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setGe1801ANumresamb(index,number, true);
	}
	
	public void setGe1801ANumresamb(int index,long number) {
			setGe1801ANumresamb(index,(int)number, true);
	}
	
	/**
	 *	Update  Ge1801ANumresamb at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setGe1801ANumresamb(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801ANumresamb(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ANUMRESAMB_SIZE) {
             	index = GE_1801_ANUMRESAMB_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ANumresamb - Array index exceeded max Size "+GE_1801_ANUMRESAMB_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeGe1801ANumresamb(index,value);
		}
   }
    /**
	 *	Returns the value of ge1801ANumpresamb
	 *  Corresponding COBOL Variable is GE1801-A-NUMPRESAMB
	 *	@return ge1801ANumpresamb
	 */
	public List<Integer> getGe1801ANumpresamb() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_ANUMPRESAMB_SIZE;index++) {
        	list.add( getGe1801ANumpresamb( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return ge1801ANumpresamb
	 */
	public int getGe1801ANumpresamb(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801ANumpresamb(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ANUMPRESAMB_SIZE) {
             	index = GE_1801_ANUMPRESAMB_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ANumpresamb - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ANUMPRESAMB_SIZE); 
	    }   
		return getInt(beginGe1801ANumpresamb+ index*GE_1801_ANUMPRESAMB_LEN);
   }
	
	/**
	 *	Update Ge1801ANumpresamb at index with the passed value
	 *  Corresponding COBOL Variable is GE1801-A-NUMPRESAMB
	 *  @param index
	 *	@param number
	 */
	public void setGe1801ANumpresamb(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setGe1801ANumpresamb(index,number, true);
	}
	
	public void setGe1801ANumpresamb(int index,long number) {
			setGe1801ANumpresamb(index,(int)number, true);
	}
	
	/**
	 *	Update  Ge1801ANumpresamb at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setGe1801ANumpresamb(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801ANumpresamb(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ANUMPRESAMB_SIZE) {
             	index = GE_1801_ANUMPRESAMB_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ANumpresamb - Array index exceeded max Size "+GE_1801_ANUMPRESAMB_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeGe1801ANumpresamb(index,value);
		}
   }
    /**
	 *	Returns the value of ge1801ACengescapt
	 *  Corresponding COBOL Variable is GE1801-A-CENGESCAPT
	 *	@return ge1801ACengescapt
	 */
	public List<char[]> getGe1801ACengescapt() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_ACENGESCAPT_SIZE;index++) {
        	list.add( getGe1801ACengescapt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ge1801ACengescapt
	 */
	public char[] getGe1801ACengescapt(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801ACengescapt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ACENGESCAPT_SIZE) {
             	index = GE_1801_ACENGESCAPT_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ACengescapt - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ACENGESCAPT_SIZE); 
	    }
   	      return getCharArray( (beginGe1801ACengescapt + index*GE_1801_ACENGESCAPT_LEN) , GE_1801_ACENGESCAPT_LEN );
    }
    
    
   public int  ge1801ACengescaptFieldLength() {
   	return GE_1801_ACENGESCAPT_LEN;
   }
   
	

  
  	/**
	 *	Update Ge1801ACengescapt with the passed value at a given index
	 *  Corresponding COBOL Variable is GE1801-A-CENGESCAPT
	 *  @param index
	 *	@param value
	 */
  public void setGe1801ACengescapt(int index,char[] value) {
   	setGe1801ACengescapt(index,value,true);
   }
   
   
   /**
	 *	Update Ge1801ACengescapt with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setGe1801ACengescapt(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801ACengescapt(int,String,boolean), reset it to 0",index);
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
		serializeGe1801ACengescapt(index,value);		
       }
   }
   
    /**
	 *	Returns the value of ge1801ANumgescap
	 *  Corresponding COBOL Variable is GE1801-A-NUMGESCAP
	 *	@return ge1801ANumgescap
	 */
	public List<Integer> getGe1801ANumgescap() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_ANUMGESCAP_SIZE;index++) {
        	list.add( getGe1801ANumgescap( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return ge1801ANumgescap
	 */
	public int getGe1801ANumgescap(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801ANumgescap(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ANUMGESCAP_SIZE) {
             	index = GE_1801_ANUMGESCAP_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ANumgescap - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ANUMGESCAP_SIZE); 
	    }   
		return getInt(beginGe1801ANumgescap+ index*GE_1801_ANUMGESCAP_LEN);
   }
	
	/**
	 *	Update Ge1801ANumgescap at index with the passed value
	 *  Corresponding COBOL Variable is GE1801-A-NUMGESCAP
	 *  @param index
	 *	@param number
	 */
	public void setGe1801ANumgescap(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setGe1801ANumgescap(index,number, true);
	}
	
	public void setGe1801ANumgescap(int index,long number) {
			setGe1801ANumgescap(index,(int)number, true);
	}
	
	/**
	 *	Update  Ge1801ANumgescap at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setGe1801ANumgescap(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801ANumgescap(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ANUMGESCAP_SIZE) {
             	index = GE_1801_ANUMGESCAP_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ANumgescap - Array index exceeded max Size "+GE_1801_ANUMGESCAP_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeGe1801ANumgescap(index,value);
		}
   }
    /**
	 *	Returns the value of ge1801ANumpgescap
	 *  Corresponding COBOL Variable is GE1801-A-NUMPGESCAP
	 *	@return ge1801ANumpgescap
	 */
	public List<Integer> getGe1801ANumpgescap() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_ANUMPGESCAP_SIZE;index++) {
        	list.add( getGe1801ANumpgescap( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return ge1801ANumpgescap
	 */
	public int getGe1801ANumpgescap(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801ANumpgescap(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ANUMPGESCAP_SIZE) {
             	index = GE_1801_ANUMPGESCAP_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ANumpgescap - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ANUMPGESCAP_SIZE); 
	    }   
		return getInt(beginGe1801ANumpgescap+ index*GE_1801_ANUMPGESCAP_LEN);
   }
	
	/**
	 *	Update Ge1801ANumpgescap at index with the passed value
	 *  Corresponding COBOL Variable is GE1801-A-NUMPGESCAP
	 *  @param index
	 *	@param number
	 */
	public void setGe1801ANumpgescap(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setGe1801ANumpgescap(index,number, true);
	}
	
	public void setGe1801ANumpgescap(int index,long number) {
			setGe1801ANumpgescap(index,(int)number, true);
	}
	
	/**
	 *	Update  Ge1801ANumpgescap at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setGe1801ANumpgescap(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801ANumpgescap(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ANUMPGESCAP_SIZE) {
             	index = GE_1801_ANUMPGESCAP_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ANumpgescap - Array index exceeded max Size "+GE_1801_ANUMPGESCAP_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeGe1801ANumpgescap(index,value);
		}
   }
    /**
	 *	Returns the value of ge1801ANumpesprie
	 *  Corresponding COBOL Variable is GE1801-A-NUMPESPRIE
	 *	@return ge1801ANumpesprie
	 */
	public List<Integer> getGe1801ANumpesprie() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_ANUMPESPRIE_SIZE;index++) {
        	list.add( getGe1801ANumpesprie( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return ge1801ANumpesprie
	 */
	public int getGe1801ANumpesprie(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801ANumpesprie(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ANUMPESPRIE_SIZE) {
             	index = GE_1801_ANUMPESPRIE_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ANumpesprie - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ANUMPESPRIE_SIZE); 
	    }   
		return getInt(beginGe1801ANumpesprie+ index*GE_1801_ANUMPESPRIE_LEN);
   }
	
	/**
	 *	Update Ge1801ANumpesprie at index with the passed value
	 *  Corresponding COBOL Variable is GE1801-A-NUMPESPRIE
	 *  @param index
	 *	@param number
	 */
	public void setGe1801ANumpesprie(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setGe1801ANumpesprie(index,number, true);
	}
	
	public void setGe1801ANumpesprie(int index,long number) {
			setGe1801ANumpesprie(index,(int)number, true);
	}
	
	/**
	 *	Update  Ge1801ANumpesprie at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setGe1801ANumpesprie(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801ANumpesprie(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ANUMPESPRIE_SIZE) {
             	index = GE_1801_ANUMPESPRIE_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ANumpesprie - Array index exceeded max Size "+GE_1801_ANUMPESPRIE_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeGe1801ANumpesprie(index,value);
		}
   }
    /**
	 *	Returns the value of ge1801ACodcarrie
	 *  Corresponding COBOL Variable is GE1801-A-CODCARRIE
	 *	@return ge1801ACodcarrie
	 */
	public List<char[]> getGe1801ACodcarrie() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_ACODCARRIE_SIZE;index++) {
        	list.add( getGe1801ACodcarrie( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ge1801ACodcarrie
	 */
	public char[] getGe1801ACodcarrie(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801ACodcarrie(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_ACODCARRIE_SIZE) {
             	index = GE_1801_ACODCARRIE_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801ACodcarrie - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_ACODCARRIE_SIZE); 
	    }
   	      return getCharArray( (beginGe1801ACodcarrie + index*GE_1801_ACODCARRIE_LEN) , GE_1801_ACODCARRIE_LEN );
    }
    
    
   public int  ge1801ACodcarrieFieldLength() {
   	return GE_1801_ACODCARRIE_LEN;
   }
   
	

  
  	/**
	 *	Update Ge1801ACodcarrie with the passed value at a given index
	 *  Corresponding COBOL Variable is GE1801-A-CODCARRIE
	 *  @param index
	 *	@param value
	 */
  public void setGe1801ACodcarrie(int index,char[] value) {
   	setGe1801ACodcarrie(index,value,true);
   }
   
   
   /**
	 *	Update Ge1801ACodcarrie with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setGe1801ACodcarrie(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801ACodcarrie(int,String,boolean), reset it to 0",index);
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
		serializeGe1801ACodcarrie(index,value);		
       }
   }
   
    /**
	 *	Returns the value of ge1801AFecciecurso
	 *  Corresponding COBOL Variable is GE1801-A-FECCIECURSO
	 *	@return ge1801AFecciecurso
	 */
	public List<char[]> getGe1801AFecciecurso() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < GE_1801_AFECCIECURSO_SIZE;index++) {
        	list.add( getGe1801AFecciecurso( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ge1801AFecciecurso
	 */
	public char[] getGe1801AFecciecurso(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGe1801AFecciecurso(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GE_1801_AFECCIECURSO_SIZE) {
             	index = GE_1801_AFECCIECURSO_SIZE -1; // can't exceed max array size
             	logger.trace("ge1801AFecciecurso - Array index exceeded max Size {}, resetting it to max allowed",GE_1801_AFECCIECURSO_SIZE); 
	    }
   	      return getCharArray( (beginGe1801AFecciecurso + index*GE_1801_AFECCIECURSO_LEN) , GE_1801_AFECCIECURSO_LEN );
    }
    
    
   public int  ge1801AFecciecursoFieldLength() {
   	return GE_1801_AFECCIECURSO_LEN;
   }
   
	

  
  	/**
	 *	Update Ge1801AFecciecurso with the passed value at a given index
	 *  Corresponding COBOL Variable is GE1801-A-FECCIECURSO
	 *  @param index
	 *	@param value
	 */
  public void setGe1801AFecciecurso(int index,char[] value) {
   	setGe1801AFecciecurso(index,value,true);
   }
   
   
   /**
	 *	Update Ge1801AFecciecurso with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setGe1801AFecciecurso(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGe1801AFecciecurso(int,String,boolean), reset it to 0",index);
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
		serializeGe1801AFecciecurso(index,value);		
       }
   }
   

	
	
	

		public static int getGe1801ArrayFieldLength() {
			return GE_1801_ARRAY_LENGTH;
		}

}
  
