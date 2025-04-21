package com.cloudframe.app.sf305120.dto;

/**
*  The class Sf539Sf305020ControlBlock is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;


public class Sf539Sf305020ControlBlock extends Sf539Sf305020ControlBlockSerialized {
   

						private char[] sf539SubprogamId = Field.fillLowValue(8);

						private char[] sf539CallingProgram = Field.fillLowValue(8);

								private int sf539ZlogRecordPtr;

								private int sf539ZlogRecordAddr;

								private int sf539ZlogRecordLnth;

								private int sf539ZlogElapsedTime;

								private short sf539Sr1Length;

								private short sf539Sr2Length;
			private List<Sf539ServiceTable> sf539ServiceTable = new ArrayList<>();
    	

						private char[] sf539HeaderSpec = Field.fillLowValue(16);

								private short sf539IsoMsgOffset;

								private short sf539IsoMsgLnth;

								private short sf539Trailer1Offset;

								private short sf539Trailer1Lnth;

								private short sf539IsoMsg2Offset;

								private short sf539IsoMsg2Lnth;

								private short sf539Trailer2Offset;

								private short sf539Trailer2Lnth;

								private short sf539IsoMsg3Offset;

								private short sf539IsoMsg3Lnth;

						private char[] sf539FillerExpansion = Field.fillLowValue(60);
	
	/**
	* Constructor for Sf539Sf305020ControlBlock
	**/
    public Sf539Sf305020ControlBlock() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SF_539_SERVICE_TABLE_SIZE;arrayIndex++) {
						sf539ServiceTable.add(new Sf539ServiceTable(this, beginSf539ServiceTable + 
						arrayIndex * Sf539ServiceTable.getSf539ServiceTableFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sf539SubprogamId
	 *	@return sf539SubprogamId
	 */
   public char[] getSf539SubprogamId() throws CFException{
     if (isSf539SubprogamIdModified()) { 
        sf539SubprogamId = refreshSf539SubprogamId();
     }
   		return sf539SubprogamId;
   }

  
	/**
	*  set variable sf539SubprogamId
	*  Corresponding COBOL Variable is SF539-SUBPROGAM-ID
	*  @param value
	**/
   public void setSf539SubprogamId(char[] value) {
      sf539SubprogamId = checkSf539SubprogamIdConstraints(value);
      serializeSf539SubprogamId(sf539SubprogamId);
   } 

     /**
	 * 	Update Sf539SubprogamId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539SubprogamId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf539SubprogamId,sf539SubprogamId.length);
   	
   }
   
   public void setSf539SubprogamId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf539SubprogamId,sf539SubprogamId.length);
   	
   }
   
     /**
	 * 	Update Sf539SubprogamId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539SubprogamId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539SubprogamId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf539SubprogamId with another Field
	 *	@param value
	 */
   public void setSf539SubprogamId(Field source) {
       replace(source,0,source.length(),beginSf539SubprogamId,SF_539_SUBPROGAM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Sf539SubprogamId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539SubprogamId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf539SubprogamId,SF_539_SUBPROGAM_ID_LEN);
   	
   }
   
     /**
	 * 	Update Sf539SubprogamId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539SubprogamId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539SubprogamId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf539CallingProgram
	 *	@return sf539CallingProgram
	 */
   public char[] getSf539CallingProgram() throws CFException{
     if (isSf539CallingProgramModified()) { 
        sf539CallingProgram = refreshSf539CallingProgram();
     }
   		return sf539CallingProgram;
   }

  
	/**
	*  set variable sf539CallingProgram
	*  Corresponding COBOL Variable is SF539-CALLING-PROGRAM
	*  @param value
	**/
   public void setSf539CallingProgram(char[] value) {
      sf539CallingProgram = checkSf539CallingProgramConstraints(value);
      serializeSf539CallingProgram(sf539CallingProgram);
   } 

     /**
	 * 	Update Sf539CallingProgram 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539CallingProgram(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf539CallingProgram,sf539CallingProgram.length);
   	
   }
   
   public void setSf539CallingProgram(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf539CallingProgram,sf539CallingProgram.length);
   	
   }
   
     /**
	 * 	Update Sf539CallingProgram 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539CallingProgram(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539CallingProgram+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf539CallingProgram with another Field
	 *	@param value
	 */
   public void setSf539CallingProgram(Field source) {
       replace(source,0,source.length(),beginSf539CallingProgram,SF_539_CALLING_PROGRAM_LEN);
   	
   }  
   
     /**
	 * 	Update Sf539CallingProgram 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539CallingProgram(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf539CallingProgram,SF_539_CALLING_PROGRAM_LEN);
   	
   }
   
     /**
	 * 	Update Sf539CallingProgram 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539CallingProgram(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539CallingProgram+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf539ZlogRecordPtr
	 *	@return sf539ZlogRecordPtr
	 */
	public int getSf539ZlogRecordPtr() throws CFException {
        if (isSf539ZlogRecordPtrModified()) { 
           sf539ZlogRecordPtr = refreshSf539ZlogRecordPtr();
        }
   		return sf539ZlogRecordPtr;
	}
	
	/**
	 * 	Update Sf539ZlogRecordPtr with the passed value
	 *  Corresponding COBOL Variable is SF539-ZLOG-RECORD-PTR
	 *	@param number
	 */
	public void setSf539ZlogRecordPtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539ZlogRecordPtr = checkSf539ZlogRecordPtrMaxLimit(number); 
		serializeSf539ZlogRecordPtr(sf539ZlogRecordPtr);
	}


	public void setSf539ZlogRecordPtr(long number) {
	    number = checkSf539ZlogRecordPtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf539ZlogRecordPtr((int)number);
	}
	
	/**
	 *	Returns the value of sf539ZlogRecordAddr
	 *	@return sf539ZlogRecordAddr
	 */
	public int getSf539ZlogRecordAddr() throws CFException {
        if (isSf539ZlogRecordAddrModified()) { 
           sf539ZlogRecordAddr = refreshSf539ZlogRecordAddr();
        }
   		return sf539ZlogRecordAddr;
	}
	
	/**
	 * 	Update Sf539ZlogRecordAddr with the passed value
	 *  Corresponding COBOL Variable is SF539-ZLOG-RECORD-ADDR
	 *	@param number
	 */
	public void setSf539ZlogRecordAddr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539ZlogRecordAddr = checkSf539ZlogRecordAddrMaxLimit(number); 
		serializeSf539ZlogRecordAddr(sf539ZlogRecordAddr);
	}


	public void setSf539ZlogRecordAddr(long number) {
	    number = checkSf539ZlogRecordAddrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf539ZlogRecordAddr((int)number);
	}
	
	/**
	 *	Returns the value of sf539ZlogRecordLnth
	 *	@return sf539ZlogRecordLnth
	 */
	public int getSf539ZlogRecordLnth() throws CFException {
        if (isSf539ZlogRecordLnthModified()) { 
           sf539ZlogRecordLnth = refreshSf539ZlogRecordLnth();
        }
   		return sf539ZlogRecordLnth;
	}
	
	/**
	 * 	Update Sf539ZlogRecordLnth with the passed value
	 *  Corresponding COBOL Variable is SF539-ZLOG-RECORD-LNTH
	 *	@param number
	 */
	public void setSf539ZlogRecordLnth(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539ZlogRecordLnth = checkSf539ZlogRecordLnthMaxLimit(number); 
		serializeSf539ZlogRecordLnth(sf539ZlogRecordLnth);
	}


	public void setSf539ZlogRecordLnth(long number) {
	    number = checkSf539ZlogRecordLnthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf539ZlogRecordLnth((int)number);
	}
	
	/**
	 *	Returns the value of sf539ZlogElapsedTime
	 *	@return sf539ZlogElapsedTime
	 */
	public int getSf539ZlogElapsedTime() throws CFException {
        if (isSf539ZlogElapsedTimeModified()) { 
           sf539ZlogElapsedTime = refreshSf539ZlogElapsedTime();
        }
   		return sf539ZlogElapsedTime;
	}
	
	/**
	 * 	Update Sf539ZlogElapsedTime with the passed value
	 *  Corresponding COBOL Variable is SF539-ZLOG-ELAPSED-TIME
	 *	@param number
	 */
	public void setSf539ZlogElapsedTime(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539ZlogElapsedTime = checkSf539ZlogElapsedTimeMaxLimit(number); 
		serializeSf539ZlogElapsedTime(sf539ZlogElapsedTime);
	}


	public void setSf539ZlogElapsedTime(long number) {
	    number = checkSf539ZlogElapsedTimeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf539ZlogElapsedTime((int)number);
	}
	
	/**
	 *	Returns the value of sf539Sr1Length
	 *	@return sf539Sr1Length
	 */
	public short getSf539Sr1Length() throws CFException {
        if (isSf539Sr1LengthModified()) { 
           sf539Sr1Length = refreshSf539Sr1Length();
        }
   		return sf539Sr1Length;
	}
	
	/**
	 * 	Update Sf539Sr1Length with the passed value
	 *  Corresponding COBOL Variable is SF539-SR1-LENGTH
	 *	@param number
	 */
	public void setSf539Sr1Length(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539Sr1Length = checkSf539Sr1LengthMaxLimit(number); 
		serializeSf539Sr1Length(sf539Sr1Length);
	}

	public void setSf539Sr1Length(int number) {
	    number = checkSf539Sr1LengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539Sr1Length((short)number);
	}
	public void setSf539Sr1Length(long number) {
	    number = checkSf539Sr1LengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539Sr1Length((short)number);
	}
	

	/**
	 *	Returns the value of sf539Sr2Length
	 *	@return sf539Sr2Length
	 */
	public short getSf539Sr2Length() throws CFException {
        if (isSf539Sr2LengthModified()) { 
           sf539Sr2Length = refreshSf539Sr2Length();
        }
   		return sf539Sr2Length;
	}
	
	/**
	 * 	Update Sf539Sr2Length with the passed value
	 *  Corresponding COBOL Variable is SF539-SR2-LENGTH
	 *	@param number
	 */
	public void setSf539Sr2Length(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539Sr2Length = checkSf539Sr2LengthMaxLimit(number); 
		serializeSf539Sr2Length(sf539Sr2Length);
	}

	public void setSf539Sr2Length(int number) {
	    number = checkSf539Sr2LengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539Sr2Length((short)number);
	}
	public void setSf539Sr2Length(long number) {
	    number = checkSf539Sr2LengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539Sr2Length((short)number);
	}
	

	/**
	 *	Returns the  value of sf539ServiceTable
	 *  Corresponding COBOL Variable is SF539-SERVICE-TABLE
	 *	@return sf539ServiceTable
	 */
   public List<Sf539ServiceTable> getSf539ServiceTable() {
       return sf539ServiceTable;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return sf539ServiceTable
	 */
	public Sf539ServiceTable getSf539ServiceTable(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSf539ServiceTable(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SF_539_SERVICE_TABLE_SIZE) {
             	index = SF_539_SERVICE_TABLE_SIZE -1; // can't exceed max array size
             	logger.trace("sf539ServiceTable - Array index exceeded max Size {}, resetting it to max allowed",SF_539_SERVICE_TABLE_SIZE); 
	    }
		if (index >= sf539ServiceTable.size()) {
       		for (int fillIndex =  sf539ServiceTable.size() -1; fillIndex < index;fillIndex++) {
		       sf539ServiceTable.add(null);
		    }
			sf539ServiceTable.set(index,
			   	   	new Sf539ServiceTable(this,beginSf539ServiceTable + index * Sf539ServiceTable.getSf539ServiceTableFieldLength()) 
				                        ); 	
		} 
   	   Sf539ServiceTable value = sf539ServiceTable.get(index);
   	   if (value == null) {
   	      sf539ServiceTable.set(index,
			   	   	new Sf539ServiceTable(this,beginSf539ServiceTable + index * Sf539ServiceTable.getSf539ServiceTableFieldLength()) 
				                        ); 
		  value = sf539ServiceTable.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Sf539ServiceTable at index with the passed value
	 *  Corresponding COBOL Variable is SF539-SERVICE-TABLE
	 *  @param index
	 *	@param value
	 */
  public void setSf539ServiceTable(int index,char[] value) {
   	getSf539ServiceTable(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of sf539HeaderSpec
	 *	@return sf539HeaderSpec
	 */
   public char[] getSf539HeaderSpec() throws CFException{
     if (isSf539HeaderSpecModified()) { 
        sf539HeaderSpec = refreshSf539HeaderSpec();
     }
   		return sf539HeaderSpec;
   }

  
	/**
	*  set variable sf539HeaderSpec
	*  Corresponding COBOL Variable is SF539-HEADER-SPEC
	*  @param value
	**/
   public void setSf539HeaderSpec(char[] value) {
      sf539HeaderSpec = checkSf539HeaderSpecConstraints(value);
      serializeSf539HeaderSpec(sf539HeaderSpec);
   } 

     /**
	 * 	Update Sf539HeaderSpec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539HeaderSpec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf539HeaderSpec,sf539HeaderSpec.length);
   	
   }
   
   public void setSf539HeaderSpec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf539HeaderSpec,sf539HeaderSpec.length);
   	
   }
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539HeaderSpec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539HeaderSpec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf539HeaderSpec with another Field
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source) {
       replace(source,0,source.length(),beginSf539HeaderSpec,SF_539_HEADER_SPEC_LEN);
   	
   }  
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf539HeaderSpec,SF_539_HEADER_SPEC_LEN);
   	
   }
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539HeaderSpec+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf539IsoMsgOffset
	 *	@return sf539IsoMsgOffset
	 */
	public short getSf539IsoMsgOffset() throws CFException {
        if (isSf539IsoMsgOffsetModified()) { 
           sf539IsoMsgOffset = refreshSf539IsoMsgOffset();
        }
   		return sf539IsoMsgOffset;
	}
	
	/**
	 * 	Update Sf539IsoMsgOffset with the passed value
	 *  Corresponding COBOL Variable is SF539-ISO-MSG-OFFSET
	 *	@param number
	 */
	public void setSf539IsoMsgOffset(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539IsoMsgOffset = checkSf539IsoMsgOffsetMaxLimit(number); 
		serializeSf539IsoMsgOffset(sf539IsoMsgOffset);
	}

	public void setSf539IsoMsgOffset(int number) {
	    number = checkSf539IsoMsgOffsetMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539IsoMsgOffset((short)number);
	}
	public void setSf539IsoMsgOffset(long number) {
	    number = checkSf539IsoMsgOffsetMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539IsoMsgOffset((short)number);
	}
	

	/**
	 *	Returns the value of sf539IsoMsgLnth
	 *	@return sf539IsoMsgLnth
	 */
	public short getSf539IsoMsgLnth() throws CFException {
        if (isSf539IsoMsgLnthModified()) { 
           sf539IsoMsgLnth = refreshSf539IsoMsgLnth();
        }
   		return sf539IsoMsgLnth;
	}
	
	/**
	 * 	Update Sf539IsoMsgLnth with the passed value
	 *  Corresponding COBOL Variable is SF539-ISO-MSG-LNTH
	 *	@param number
	 */
	public void setSf539IsoMsgLnth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539IsoMsgLnth = checkSf539IsoMsgLnthMaxLimit(number); 
		serializeSf539IsoMsgLnth(sf539IsoMsgLnth);
	}

	public void setSf539IsoMsgLnth(int number) {
	    number = checkSf539IsoMsgLnthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539IsoMsgLnth((short)number);
	}
	public void setSf539IsoMsgLnth(long number) {
	    number = checkSf539IsoMsgLnthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539IsoMsgLnth((short)number);
	}
	

	/**
	 *	Returns the value of sf539Trailer1Offset
	 *	@return sf539Trailer1Offset
	 */
	public short getSf539Trailer1Offset() throws CFException {
        if (isSf539Trailer1OffsetModified()) { 
           sf539Trailer1Offset = refreshSf539Trailer1Offset();
        }
   		return sf539Trailer1Offset;
	}
	
	/**
	 * 	Update Sf539Trailer1Offset with the passed value
	 *  Corresponding COBOL Variable is SF539-TRAILER-1-OFFSET
	 *	@param number
	 */
	public void setSf539Trailer1Offset(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539Trailer1Offset = checkSf539Trailer1OffsetMaxLimit(number); 
		serializeSf539Trailer1Offset(sf539Trailer1Offset);
	}

	public void setSf539Trailer1Offset(int number) {
	    number = checkSf539Trailer1OffsetMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539Trailer1Offset((short)number);
	}
	public void setSf539Trailer1Offset(long number) {
	    number = checkSf539Trailer1OffsetMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539Trailer1Offset((short)number);
	}
	

	/**
	 *	Returns the value of sf539Trailer1Lnth
	 *	@return sf539Trailer1Lnth
	 */
	public short getSf539Trailer1Lnth() throws CFException {
        if (isSf539Trailer1LnthModified()) { 
           sf539Trailer1Lnth = refreshSf539Trailer1Lnth();
        }
   		return sf539Trailer1Lnth;
	}
	
	/**
	 * 	Update Sf539Trailer1Lnth with the passed value
	 *  Corresponding COBOL Variable is SF539-TRAILER-1-LNTH
	 *	@param number
	 */
	public void setSf539Trailer1Lnth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539Trailer1Lnth = checkSf539Trailer1LnthMaxLimit(number); 
		serializeSf539Trailer1Lnth(sf539Trailer1Lnth);
	}

	public void setSf539Trailer1Lnth(int number) {
	    number = checkSf539Trailer1LnthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539Trailer1Lnth((short)number);
	}
	public void setSf539Trailer1Lnth(long number) {
	    number = checkSf539Trailer1LnthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539Trailer1Lnth((short)number);
	}
	

	/**
	 *	Returns the value of sf539IsoMsg2Offset
	 *	@return sf539IsoMsg2Offset
	 */
	public short getSf539IsoMsg2Offset() throws CFException {
        if (isSf539IsoMsg2OffsetModified()) { 
           sf539IsoMsg2Offset = refreshSf539IsoMsg2Offset();
        }
   		return sf539IsoMsg2Offset;
	}
	
	/**
	 * 	Update Sf539IsoMsg2Offset with the passed value
	 *  Corresponding COBOL Variable is SF539-ISO-MSG-2-OFFSET
	 *	@param number
	 */
	public void setSf539IsoMsg2Offset(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539IsoMsg2Offset = checkSf539IsoMsg2OffsetMaxLimit(number); 
		serializeSf539IsoMsg2Offset(sf539IsoMsg2Offset);
	}

	public void setSf539IsoMsg2Offset(int number) {
	    number = checkSf539IsoMsg2OffsetMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539IsoMsg2Offset((short)number);
	}
	public void setSf539IsoMsg2Offset(long number) {
	    number = checkSf539IsoMsg2OffsetMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539IsoMsg2Offset((short)number);
	}
	

	/**
	 *	Returns the value of sf539IsoMsg2Lnth
	 *	@return sf539IsoMsg2Lnth
	 */
	public short getSf539IsoMsg2Lnth() throws CFException {
        if (isSf539IsoMsg2LnthModified()) { 
           sf539IsoMsg2Lnth = refreshSf539IsoMsg2Lnth();
        }
   		return sf539IsoMsg2Lnth;
	}
	
	/**
	 * 	Update Sf539IsoMsg2Lnth with the passed value
	 *  Corresponding COBOL Variable is SF539-ISO-MSG-2-LNTH
	 *	@param number
	 */
	public void setSf539IsoMsg2Lnth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539IsoMsg2Lnth = checkSf539IsoMsg2LnthMaxLimit(number); 
		serializeSf539IsoMsg2Lnth(sf539IsoMsg2Lnth);
	}

	public void setSf539IsoMsg2Lnth(int number) {
	    number = checkSf539IsoMsg2LnthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539IsoMsg2Lnth((short)number);
	}
	public void setSf539IsoMsg2Lnth(long number) {
	    number = checkSf539IsoMsg2LnthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539IsoMsg2Lnth((short)number);
	}
	

	/**
	 *	Returns the value of sf539Trailer2Offset
	 *	@return sf539Trailer2Offset
	 */
	public short getSf539Trailer2Offset() throws CFException {
        if (isSf539Trailer2OffsetModified()) { 
           sf539Trailer2Offset = refreshSf539Trailer2Offset();
        }
   		return sf539Trailer2Offset;
	}
	
	/**
	 * 	Update Sf539Trailer2Offset with the passed value
	 *  Corresponding COBOL Variable is SF539-TRAILER-2-OFFSET
	 *	@param number
	 */
	public void setSf539Trailer2Offset(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539Trailer2Offset = checkSf539Trailer2OffsetMaxLimit(number); 
		serializeSf539Trailer2Offset(sf539Trailer2Offset);
	}

	public void setSf539Trailer2Offset(int number) {
	    number = checkSf539Trailer2OffsetMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539Trailer2Offset((short)number);
	}
	public void setSf539Trailer2Offset(long number) {
	    number = checkSf539Trailer2OffsetMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539Trailer2Offset((short)number);
	}
	

	/**
	 *	Returns the value of sf539Trailer2Lnth
	 *	@return sf539Trailer2Lnth
	 */
	public short getSf539Trailer2Lnth() throws CFException {
        if (isSf539Trailer2LnthModified()) { 
           sf539Trailer2Lnth = refreshSf539Trailer2Lnth();
        }
   		return sf539Trailer2Lnth;
	}
	
	/**
	 * 	Update Sf539Trailer2Lnth with the passed value
	 *  Corresponding COBOL Variable is SF539-TRAILER-2-LNTH
	 *	@param number
	 */
	public void setSf539Trailer2Lnth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539Trailer2Lnth = checkSf539Trailer2LnthMaxLimit(number); 
		serializeSf539Trailer2Lnth(sf539Trailer2Lnth);
	}

	public void setSf539Trailer2Lnth(int number) {
	    number = checkSf539Trailer2LnthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539Trailer2Lnth((short)number);
	}
	public void setSf539Trailer2Lnth(long number) {
	    number = checkSf539Trailer2LnthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539Trailer2Lnth((short)number);
	}
	

	/**
	 *	Returns the value of sf539IsoMsg3Offset
	 *	@return sf539IsoMsg3Offset
	 */
	public short getSf539IsoMsg3Offset() throws CFException {
        if (isSf539IsoMsg3OffsetModified()) { 
           sf539IsoMsg3Offset = refreshSf539IsoMsg3Offset();
        }
   		return sf539IsoMsg3Offset;
	}
	
	/**
	 * 	Update Sf539IsoMsg3Offset with the passed value
	 *  Corresponding COBOL Variable is SF539-ISO-MSG-3-OFFSET
	 *	@param number
	 */
	public void setSf539IsoMsg3Offset(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539IsoMsg3Offset = checkSf539IsoMsg3OffsetMaxLimit(number); 
		serializeSf539IsoMsg3Offset(sf539IsoMsg3Offset);
	}

	public void setSf539IsoMsg3Offset(int number) {
	    number = checkSf539IsoMsg3OffsetMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539IsoMsg3Offset((short)number);
	}
	public void setSf539IsoMsg3Offset(long number) {
	    number = checkSf539IsoMsg3OffsetMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539IsoMsg3Offset((short)number);
	}
	

	/**
	 *	Returns the value of sf539IsoMsg3Lnth
	 *	@return sf539IsoMsg3Lnth
	 */
	public short getSf539IsoMsg3Lnth() throws CFException {
        if (isSf539IsoMsg3LnthModified()) { 
           sf539IsoMsg3Lnth = refreshSf539IsoMsg3Lnth();
        }
   		return sf539IsoMsg3Lnth;
	}
	
	/**
	 * 	Update Sf539IsoMsg3Lnth with the passed value
	 *  Corresponding COBOL Variable is SF539-ISO-MSG-3-LNTH
	 *	@param number
	 */
	public void setSf539IsoMsg3Lnth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sf539IsoMsg3Lnth = checkSf539IsoMsg3LnthMaxLimit(number); 
		serializeSf539IsoMsg3Lnth(sf539IsoMsg3Lnth);
	}

	public void setSf539IsoMsg3Lnth(int number) {
	    number = checkSf539IsoMsg3LnthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539IsoMsg3Lnth((short)number);
	}
	public void setSf539IsoMsg3Lnth(long number) {
	    number = checkSf539IsoMsg3LnthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSf539IsoMsg3Lnth((short)number);
	}
	

	/**
	 *	Returns the value of sf539FillerExpansion
	 *	@return sf539FillerExpansion
	 */
   public char[] getSf539FillerExpansion() throws CFException{
     if (isSf539FillerExpansionModified()) { 
        sf539FillerExpansion = refreshSf539FillerExpansion();
     }
   		return sf539FillerExpansion;
   }

  
	/**
	*  set variable sf539FillerExpansion
	*  Corresponding COBOL Variable is SF539-FILLER-EXPANSION
	*  @param value
	**/
   public void setSf539FillerExpansion(char[] value) {
      sf539FillerExpansion = checkSf539FillerExpansionConstraints(value);
      serializeSf539FillerExpansion(sf539FillerExpansion);
   } 

     /**
	 * 	Update Sf539FillerExpansion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539FillerExpansion(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf539FillerExpansion,sf539FillerExpansion.length);
   	
   }
   
   public void setSf539FillerExpansion(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf539FillerExpansion,sf539FillerExpansion.length);
   	
   }
   
     /**
	 * 	Update Sf539FillerExpansion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539FillerExpansion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539FillerExpansion+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf539FillerExpansion with another Field
	 *	@param value
	 */
   public void setSf539FillerExpansion(Field source) {
       replace(source,0,source.length(),beginSf539FillerExpansion,SF_539_FILLER_EXPANSION_LEN);
   	
   }  
   
     /**
	 * 	Update Sf539FillerExpansion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539FillerExpansion(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf539FillerExpansion,SF_539_FILLER_EXPANSION_LEN);
   	
   }
   
     /**
	 * 	Update Sf539FillerExpansion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539FillerExpansion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf539FillerExpansion+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf539Sf305020ControlBlockFieldLength() {
			return SF_539_SF_305020_CONTROL_BLOCK_LENGTH;
		}

}
  
